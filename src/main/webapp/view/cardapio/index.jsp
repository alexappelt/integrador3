<%@ taglib tagdir="/WEB-INF/tags/" prefix="tag"%>

<!DOCTYPE html>
<html lang="en">


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


                <form name="cadCardapio" action="/cardapio" method="post" >

                    <div class="form-group row">
                        <label class="col-sm-3 text-right" > Descricao </label>
                        <input class="col-sm-9 form-control" id="descricao" name="descricao" />
                    </div>
                <div class="produtos">
                    <div class="form-group row item">
                        <label class="col-sm-3 text-right" > Produto 1</label>
                        <input class="col-sm-9 form-control itemelement" name="produto" />
                    </div>

                </div>



                    <div class="form-group col-sm-12 text-right">
                        <button type="button" onclick="getItensCardapio()"  class="btn btn-rounded btn-success"><span class="btn-icon-left text-success"><i class="fa fa-check color-success"></i>
                                    </span>Cadastrar</button>

                        <button type="button" onclick="createItem(true)"  class="btn btn-rounded btn-primary"><span class="btn-icon-left text-primary"><i class="fa fa-plus color-info"></i>
                                    </span>Novo item</button>

                        <button type="button" onclick="createItem(false)"  class="btn btn-rounded btn-danger"><span class="btn-icon-left text-danger"><i class="fa fa-minus color-info"></i>
                                    </span>Remover item</button>
                    </div>





                </form>

    <script>

        function createItem(flag){
            if(flag){
        produtos = document.querySelector(".produtos");
        var node = document.createElement("div");

        node.innerHTML = `<div class="form-group row item">
                        <label class="col-sm-3 text-right" > Produto ${produtos.childElementCount+1} </label>
                        <input class="col-sm-9 form-control itemelement" name="produto" />
                    </div>` ;


        produtos.append(node.children[0]);
            }
            else{
                produtos.lastChild.remove();
            }
        }

        function getItensCardapio(){
            i=0;
            comandaitens = { "itens" : [] }
            a = document.querySelectorAll(".itemelement");
            a.forEach(item => {
                comandaitens.itens[i] = item.value;
                i = i + 1;

            }) ;

            console.log(JSON.stringify(comandaitens));

            descricao = document.querySelector("#descricao").value;

            $.ajax({
                type: "POST",
                data: {
                    itens : JSON.stringify(comandaitens.itens) ,
                    descricao : descricao},
                url: "/cardapio"
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