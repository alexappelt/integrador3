<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ taglib tagdir="/WEB-INF/tags/" prefix="tag"%>
<%@ page contentType="text/html; charset=UTF-8" %>


<html lang="pt-BR">
<meta charset="utf-8">


<!-- Mirrored from davur.dexignzone.com/xhtml/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 07 Nov 2020 14:40:08 GMT -->
<tag:head />


<body>


<!--*******************
    Preloader start
********************-->
<div id="preloader">
    <div class="sk-three-bounce">
        <div class="sk-child sk-bounce1"></div>
        <div class="sk-child sk-bounce2"></div>
        <div class="sk-child sk-bounce3"></div>
    </div>
</div>


<!--*******************
    Preloader end
********************-->

<!--**********************************
    Main wrapper start
***********************************-->
<div id="main-wrapper">

    <!--**********************************
        Nav header start
    ***********************************-->
    <tag:headerstart />
    <!--**********************************
        Nav header end
    ***********************************-->

    <!--**********************************

    ***********************************-->

    <!--**********************************
        Header start
    ***********************************-->
    <tag:header title="" />
    <!--**********************************
        Header end ti-comment-alt
    ***********************************-->

    <!--**********************************
        Sidebar start
    ***********************************-->
    <tag:sidebar />
    <!--**********************************
        Sidebar end
    ***********************************-->

    <!--**********************************
        Content body start
    ***********************************-->

    <div class="content-body" style="min-height: 1042px;">
        <!-- row -->
        <div class="container-fluid">



            <div class="form-group">


                <form name="cadCardapio" action="/comanda" method="post" >

                    <div class="form-group row">
                        <label class="col-sm-3 text-right" > Número da Mesa </label>
                        <input class="col-sm-9 form-control" id="descricao" name="codigo" type="number"  min="1" max="10"  />
                    </div>
                    <div class="produtos">
                        <div class="form-group row item" >
                            <label class="col-sm-3 text-right" > Produto 1</label>
                            <input disabled class="col-sm-6 form-control itemelement" id="0" name="produto"  />
                            <button type="button" class="btn btn-primary add-item" id="0" style="display: inline;" data-toggle="modal" data-target=".bd-example-modal-lg">+</button>
                        </div>

                    </div>

                    <span class="btn btn-lg  btn-success">Total: R$<span id="totalcomanda">0,00</span></span>


                    <div class="form-group col-sm-12 text-right">
                        <button type="button" onclick="getItensCardapio()"  class="btn btn-rounded btn-success"><span class="btn-icon-left text-success"><i class="fa fa-check color-success"></i>
                                    </span>Cadastrar</button>

                        <button type="button" onclick="createItem(true)"  class="btn btn-rounded btn-primary novoitem"><span class="btn-icon-left text-primary"><i class="fa fa-plus color-info"></i>
                                    </span>Novo item</button>

                        <button type="button" onclick="createItem(false)"  class="btn btn-rounded btn-danger"><span class="btn-icon-left text-danger"><i class="fa fa-minus color-info"></i>
                                    </span>Remover item</button>
                    </div>


                </form>

                <div class="alert alert-success solid alert-dismissible fade show">
                    <svg viewBox="0 0 24 24" width="24" height="24" stroke="currentColor" stroke-width="2" fill="none" stroke-linecap="round" stroke-linejoin="round" class="mr-2"><polyline points="9 11 12 14 22 4"></polyline><path d="M21 12v7a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h11"></path></svg>
                    <strong>Sucesso!</strong> Cardapio Cadastrado com Sucesso!!
                    <button type="button" class="close h-100" data-dismiss="alert" aria-label="Close"><span><i class="mdi mdi-close"></i></span>
                    </button>
                </div>




                <!-- MODAL ITENS -->
                <div class="modal fade bd-example-modal-lg" tabindex="-1" role="dialog" aria-hidden="true" style="display: none;">
                    <div class="modal-dialog modal-lg">
                        <div class="modal-content">
                            <div class="modal-header">
                                <h5 class="modal-title">Itens</h5>
                                <button type="button" class="close" data-dismiss="modal"><span>-</span>
                                </button>
                            </div>
                            <div class="modal-body">
                                <table class="table table-responsive-md">
                                    <thead>
                                    <tr>
                                        <th><strong>Codigo</strong></th>
                                        <th><strong>Descricao</strong></th>
                                        <th><strong>Valor</strong></th>
                                        <th><strong>Imagem</strong></th>
                                        <th><strong>Quantidade</strong></th>
                                        <th><strong>Cozinha</strong></th>
                                        <th></th>
                                    </tr>
                                    </thead>
                                    <tbody>
                                    <c:forEach var="produto" items="${produtos}">
                                        <tr><td> <c:out value="${produto.codigo}"  /> </td>
                                            <td> <c:out value="${produto.descricao}"  /> </td>
                                            <td ><c:out value="${produto.valor}"  /></td>
                                            <td><img class="img-fluid rounded mr-3" width="85" src="<c:out value="${produto.imagem}"  />" alt="DexignZone"></td>
                                            <td><input class="form-control input-default " min="0" type="number"></td>
                                            <td><span class="badge light badge-primary"><c:out value="${produto.cozinha}"  /></span></td>
                                            <td> <button  type="button" class="btn btn-rounded btn-success cbi <c:out value="${produto.codigo}"  />">+</button></td>

                                        </tr>
                                    </c:forEach>
                                    </tbody>
                                </table>
                            </div>
                            <div class="modal-footer">
                                <button type="button"  class="btn btn-danger light" id="fechamodal" data-dismiss="modal">X</button>
                                <button type="button" hidden class="btn btn-primary">Save changes</button>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- FIM ITENS -->
                <script>

                    atual = 0 ;

                    adicionaEventoClick();
                    adicionaItemCardapio();

                    alerta = document.querySelector(".alert-success");
                    alerta.hidden = true;


                    function createItem(flag){
                        if(flag){
                            i=i+1;

                            produtos = document.querySelector(".produtos");
                            var node = document.createElement("div");

                            node.innerHTML = `<div class="form-group row item">
                        <label class="col-sm-3 text-right" > Produto ${produtos.childElementCount+1} </label>
                        <input disabled class="col-sm-6 form-control itemelement" name="produto" />
                        <button type="button" class="btn btn-primary add-item" style="display: inline;" data-toggle="modal" data-target=".bd-example-modal-lg">+</button>
                    </div>` ;


                            produtos.append(node.children[0]);

                        }
                        else{
                            i=i-1;
                            produtos.lastChild.remove();
                            calcTotal();
                        }

                        document.querySelectorAll(".itemelement")[document.querySelectorAll(".itemelement").length-1].id = i;
                        document.querySelectorAll(".add-item")[document.querySelectorAll(".itemelement").length-1].id =i;
                        adicionaEventoClick();
                    }

                    i = 0;

                    function getItensCardapio() {
                        mesa = document.querySelector("#descricao");


                        analisaItens();

                        comandaitens = {"itens": []}



                        a = document.querySelectorAll(".itemelement");
                        a.forEach(item => {
                            if(item != null){
                                item1 = {};
                                item1 = {
                                    codigo: item.dataset.codigoitem,
                                    descricao: item.dataset.nomeitem,
                                    valor: item.dataset.valoritem,
                                    imagem: item.dataset.imagem,
                                    quantidade: item.dataset.quantidade,
                                    valototal : eval(item.dataset.valoritem)*eval(item.dataset.quantidade),
                                    cozinha: item.dataset.cozinha[0],
                                    status: "0"
                                };
                                comandaitens.itens.push(item1);
                                i = i + 1;
                            }

                        });



                        console.log(JSON.stringify(comandaitens));

                        descricao = document.querySelector("#descricao").value;

                        $.ajax({
                            type: "POST",
                            data: {
                                itens:  JSON.stringify(comandaitens.itens),
                                codigo: descricao
                            },
                            url: "/comanda"
                        });

                        alerta.hidden = false;
                        sleep(1000).then(() => {
                            window.location.href = "/comanda";
                        });

                    }


                    function sleep (time) {
                        return new Promise((resolve) => setTimeout(resolve, time));
                    }

                    atual = '';

                    function adicionaEventoClick(){
                        botao1 = document.querySelectorAll(".add-item");

                        botao1.forEach(item=>{
                            item.addEventListener('click' , el=>{
                                console.log(el.target.id);
                                atual = el.target.id;
                            }  );
                        });


                    }

                    function showAtual(){
                        console.log(atual);
                    }


                    function adicionaItemCardapio(){


                        botaoitem = document.querySelectorAll(".cbi");
                        botaoitem.forEach(item=>{  item.addEventListener('click' , item=>{
                            elementoitem = document.getElementById(atual);
                            console.log(item.target.classList[4]);
                            elementoitem.dataset.nomeitem = item.target.parentElement.parentElement.children[1].textContent;
                            elementoitem.dataset.codigoitem = item.target.classList[4];
                            elementoitem.dataset.valoritem = item.target.parentElement.parentElement.children[2].textContent;
                            elementoitem.dataset.imagem = item.target.parentElement.parentElement.children[3].children[0].src;
                            elementoitem.dataset.quantidade = item.target.parentElement.parentElement.children[4].children[0].value;
                            if(eval(elementoitem.dataset.quantidade) < 0){
                                elementoitem.dataset.quantidade = eval(elementoitem.dataset.quantidade)*-1;
                            }
                            elementoitem.dataset.totalitem = elementoitem.dataset.quantidade * elementoitem.dataset.valoritem;
                            elementoitem.dataset.cozinha = item.target.parentElement.parentElement.children[5].children[0].textContent;
                            console.log(elementoitem.dataset.cozinha);

                            elementoitem.value = item.target.classList[4] + " - " + item.target.parentElement.parentElement.children[1].textContent + " - " +  elementoitem.dataset.totalitem;
                            modal = document.getElementById("fechamodal");
                            modal.click();
                            calcTotal()

                        })

                        })



                    }


                    function  calcTotal(){
                        elementoitens = document.querySelectorAll(".itemelement");
                        totalcomanda = document.querySelector("#totalcomanda");

                        total=0;
                        elementoitens.forEach(item=>{
                            total = total + eval(item.dataset.totalitem);
                        })
                        console.log(total);
                        totalcomanda.textContent = total.toFixed(2);
                    }

                    function exibeErro(mensagem){
                        alertify.error(mensagem);
                        return;
                    }

                    function exitFunction(){
                        return false;
                    }

                    function analisaItens(){


                        mesa = document.querySelector("#descricao");
                        if(mesa.value==""){
                            exibeErro("Preencha o numero da mesa!!")

                        }

                        itens = document.querySelectorAll(".itemelement");
                        itens.forEach(item=>{
                           if(item.value == ""){
                               exibeErro("Preencha todos os itens!!")
                           }
                        });


                    }

                </script>




            </div>

        </div>
    </div>

    <!--**********************************
        Content body end
    ***********************************-->

    <!--**********************************
        Footer start
    ***********************************-->
    <div class="footer">

    </div>
    <!--**********************************
        Footer end
    ***********************************-->

    <!--**********************************
       Support ticket button start
    ***********************************-->

    <!--**********************************
       Support ticket button end
    ***********************************-->


</div>
<!--**********************************
    Main wrapper end
***********************************-->

<!--**********************************
    Scripts
***********************************-->
<!-- Required vendors -->
<script src="vendor/global/global.min.js"></script>
<script src="vendor/bootstrap-select/dist/js/bootstrap-select.min.js"></script>
<script src="vendor/chart.js/Chart.bundle.min.js"></script>
<script src="js/custom.min.js"></script>
<script src="js/deznav-init.js"></script>

<!-- Counter Up -->
<script src="vendor/waypoints/jquery.waypoints.min.js"></script>
<script src="vendor/jquery.counterup/jquery.counterup.min.js"></script>

<!-- Apex Chart -->
<script src="vendor/apexchart/apexchart.js"></script>

<!-- Chart piety plugin files -->
<script src="vendor/peity/jquery.peity.min.js"></script>

<!-- Dashboard 1 -->
<script src="js/dashboard/dashboard-1.js"></script>


</body>

<!-- Mirrored from davur.dexignzone.com/xhtml/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 07 Nov 2020 14:41:37 GMT -->
</html>