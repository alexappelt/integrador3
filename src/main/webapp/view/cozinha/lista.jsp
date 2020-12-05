<%@ taglib tagdir="/WEB-INF/tags/" prefix="tag"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>


<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript" src="//ajax.googleapis.com/ajax/libs/jqueryui/1.10.4/jquery-ui.min.js"></script>

<script src="/javascripts/jquery.growl.js" type="text/javascript"></script>
<link  src="/stylesheets/jquery.growl.css" rel="stylesheet" type="text/css">

<!DOCTYPE html>
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
    <div class="nav-header">
        <a href="/inicio"  class="brand-logo">
            <img class="logo-abbr" src="https://isd-soft.com/wp-content/uploads/2017/02/DCeCHa_logo.png" alt="">
            <div id="titulointegrador">
                <img class="brand-title" src="images/logo-text.png" alt="">
            </div>
        </a>

        <div class="nav-control " >
            <div class="hamburger" >
                <span class="line" ></span><span class="line" ></span><span class="line"></span>
            </div>
        </div>
    </div>

    <script>







    </script>
    <!--**********************************
        Nav header end
    ***********************************-->

    <!--**********************************
        Chat box start
    ***********************************-->

    <!--**********************************
        Chat box End
    ***********************************-->

    <!--**********************************
        Header start
    ***********************************-->


    <div class="header">
        <div class="header-content">
            <nav class="navbar navbar-expand">
                <div class="collapse navbar-collapse justify-content-between">
                    <div class="header-left">
                        <div class="search_bar dropdown show">
                            <div class="dropdown-menu p-0 m-0 show">

                            </div>

                        </div>
                    </div>

                    <ul class="navbar-nav header-right">
                        <li class="nav-item dropdown notification_dropdown">
                            <a class="nav-link dz-fullscreen primary" href="#">
                                <svg id="Capa_1" enable-background="new 0 0 482.239 482.239" height="22" viewBox="0 0 482.239 482.239" width="22" xmlns="http://www.w3.org/2000/svg"><path d="m0 17.223v120.56h34.446v-103.337h103.337v-34.446h-120.56c-9.52 0-17.223 7.703-17.223 17.223z" fill=""/><path d="m465.016 0h-120.56v34.446h103.337v103.337h34.446v-120.56c0-9.52-7.703-17.223-17.223-17.223z" fill=""/><path d="m447.793 447.793h-103.337v34.446h120.56c9.52 0 17.223-7.703 17.223-17.223v-120.56h-34.446z" fill="" /><path d="m34.446 344.456h-34.446v120.56c0 9.52 7.703 17.223 17.223 17.223h120.56v-34.446h-103.337z" fill=""/></svg>
                            </a>
                        </li>

                        <li class="nav-item dropdown notification_dropdown">
                            <a class="nav-link  ai-icon warning" href="#" role="button" data-toggle="dropdown">
                                <svg width="24" height="24" viewBox="0 0 26 26" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M21.75 14.8385V12.0463C21.7471 9.88552 20.9385 7.80353 19.4821 6.20735C18.0258 4.61116 16.0264 3.61555 13.875 3.41516V1.625C13.875 1.39294 13.7828 1.17038 13.6187 1.00628C13.4546 0.842187 13.2321 0.75 13 0.75C12.7679 0.75 12.5454 0.842187 12.3813 1.00628C12.2172 1.17038 12.125 1.39294 12.125 1.625V3.41534C9.97361 3.61572 7.97429 4.61131 6.51794 6.20746C5.06159 7.80361 4.25291 9.88555 4.25 12.0463V14.8383C3.26257 15.0412 2.37529 15.5784 1.73774 16.3593C1.10019 17.1401 0.751339 18.1169 0.75 19.125C0.750764 19.821 1.02757 20.4882 1.51969 20.9803C2.01181 21.4724 2.67904 21.7492 3.375 21.75H8.71346C8.91521 22.738 9.45205 23.6259 10.2331 24.2636C11.0142 24.9013 11.9916 25.2497 13 25.2497C14.0084 25.2497 14.9858 24.9013 15.7669 24.2636C16.548 23.6259 17.0848 22.738 17.2865 21.75H22.625C23.321 21.7492 23.9882 21.4724 24.4803 20.9803C24.9724 20.4882 25.2492 19.821 25.25 19.125C25.2486 18.117 24.8998 17.1402 24.2622 16.3594C23.6247 15.5786 22.7374 15.0414 21.75 14.8385ZM6 12.0463C6.00232 10.2113 6.73226 8.45223 8.02974 7.15474C9.32723 5.85726 11.0863 5.12732 12.9212 5.125H13.0788C14.9137 5.12732 16.6728 5.85726 17.9703 7.15474C19.2677 8.45223 19.9977 10.2113 20 12.0463V14.75H6V12.0463ZM13 23.5C12.4589 23.4983 11.9316 23.3292 11.4905 23.0159C11.0493 22.7026 10.716 22.2604 10.5363 21.75H15.4637C15.284 22.2604 14.9507 22.7026 14.5095 23.0159C14.0684 23.3292 13.5411 23.4983 13 23.5ZM22.625 20H3.375C3.14298 19.9999 2.9205 19.9076 2.75644 19.7436C2.59237 19.5795 2.50014 19.357 2.5 19.125C2.50076 18.429 2.77757 17.7618 3.26969 17.2697C3.76181 16.7776 4.42904 16.5008 5.125 16.5H20.875C21.571 16.5008 22.2382 16.7776 22.7303 17.2697C23.2224 17.7618 23.4992 18.429 23.5 19.125C23.4999 19.357 23.4076 19.5795 23.2436 19.7436C23.0795 19.9076 22.857 19.9999 22.625 20Z" fill="#000"/></svg>
                                <div class="pulse-css"></div>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right">
                                <div id="DZ_W_Notification1" class="widget-media dz-scroll p-3" style="height:380px;">
                                    <ul class="timeline">
                                        <c:forEach var="cards" items="${cardapios}">
                                        <li>
                                            <div class="timeline-panel">
                                                <div class="media mr-2">
                                                    <img alt="image" width="50" src="https://centraldecopiasbosch.yolasite.com/resources/SDFAFASD.png">
                                                </div>
                                                <div class="media-body">
                                                    <h6 class="mb-1">Novo Pedido!</h6>
                                                    <small class="d-block">Nr da Mesa: <c:out value="${cards.codigo}" /> </small>
                                                </div>
                                            </div>
                                        </li>
                                        </c:forEach>
                                    </ul>

                        </li>
                        <li class="nav-item dropdown header-profile">
                            <a class="nav-link" href="#" role="button" data-toggle="dropdown">
                                <div class="header-info">
                                    <span>Ola, <strong>Usuário</strong></span>
                                </div>
                                <img src="https://png.pngtree.com/png-vector/20191110/ourmid/pngtree-avatar-icon-profile-icon-member-login-vector-isolated-png-image_1978396.jpg" width="20" alt=""/>
                            </a>
                            <div class="dropdown-menu dropdown-menu-right">
                                <a href="/bloqueio" class="dropdown-item ai-icon">
                                    <i class="fad fa-user-lock text-primary" ></i>
                                    <span class="ml-2">Bloquear </span>
                                </a>
                                <a href="/erro" class="dropdown-item ai-icon">
                                    <svg id="icon-logout" xmlns="http://www.w3.org/2000/svg" class="text-danger" width="18" height="18" viewBox="0 0 24 24" fill="none" stroke="currentColor" stroke-width="2" stroke-linecap="round" stroke-linejoin="round"><path d="M9 21H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h4"></path><polyline points="16 17 21 12 16 7"></polyline><line x1="21" y1="12" x2="9" y2="12"></line></svg>
                                    <span class="ml-2">Sair </span>
                                </a>
                            </div>
                        </li>
                    </ul>
                </div>
            </nav>
        </div>
    </div>
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
            <h1>Central de Pedidos</h1>
            <div class="card-header">

                <button onclick="removebebidas()" class="btn btn-danger">Ocultar Bebidas <i class="fad fa-wine-bottle"></i></button>
                <button onclick="removecozinha()" class="btn btn-danger">Ocultar Itens Cozinha <i class="fad fa-cheeseburger"></i></button>
                <a class="btn btn-success" href="/cozinha">Listar todos os itens <i class="fas fa-redo"></i></a>


            </div>

            <div id="alerta" class="alert alert-success solid alert-dismissible fade ">
                <svg viewBox="0 0 24 24" width="24" height="24" stroke="currentColor" stroke-width="2" fill="none" stroke-linecap="round" stroke-linejoin="round" class="mr-2"><polyline points="9 11 12 14 22 4"></polyline><path d="M21 12v7a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h11"></path></svg>
                <strong>Filtros atualizados!</strong>
                <button type="button" class="close h-100" data-dismiss="alert" aria-label="Close"><span><i onclick="removealterta()" class="mdi mdi-close"></i></span>
                </button>
            </div>

            <div class="card-body">
                <div class="table-responsive">
                    <table class="table">
                        <thead>
                        <tr>


                            <c:forEach var="card" items="${cardapios}">


                                <table class="table table-hover">
                                    <thead>

                                    <tr>
                                        <th style="width:80px;"><strong>#</strong></th>
                                        <th><strong>Descrição</strong></th>
                                        <th><strong>Valor</strong></th>
                                        <th><strong>Imagem</strong></th>
                                        <th><strong>Status</strong></th>
                                        <th><strong>Editar</strong></th>
                                    </tr>

                                    </thead>


                                    <div class="p-3 mb-2 bg-info text-white">Mesa - <c:out value="${card.codigo}" />  </div>
                                    <c:forEach var="item" items="${card.itens}">



                                        <tbody>
                                        <tr class="<c:out value="${item.cozinha=='N'}" />">
                                        <td class="media-body codigoitens" > <c:out value="${item.codigo}" /> </td>
                                        <td class="media-body"> <c:out value="${item.descricao}" /></td>
                                        <td class="media-body valorsf" > <c:out value="${item.valor}" /></td>
                                        <td class="media-body"> <img class="img-fluid rounded mr-3" width="85" src="<c:out value="${item.imagem}" />" ></td>
                                        <td><span class="badge light badge-<c:out value="${item.bootstrap}" />"><c:out value="${item.status}" /></span></td>

                                       <td> <div class="dropdown">
                                           <button type="button" class="btn btn-success light sharp" data-toggle="dropdown">
                                               <svg width="20px" height="20px" viewBox="0 0 24 24" version="1.1"><g stroke="none" stroke-width="1" fill="none" fill-rule="evenodd"><rect x="0" y="0" width="24" height="24"></rect><circle fill="#000000" cx="5" cy="12" r="2"></circle><circle fill="#000000" cx="12" cy="12" r="2"></circle><circle fill="#000000" cx="19" cy="12" r="2"></circle></g></svg>
                                           </button>
                                           <div class="dropdown-menu situacoes" data-comanda="<c:out value="${card.codigo}" />">
                                               <a class="dropdown-item text-warning" href="#"><svg viewBox="0 0 24 24" width="24" height="24" stroke="currentColor" stroke-width="2" fill="none" stroke-linecap="round" stroke-linejoin="round" class="mr-2"><path d="M10.29 3.86L1.82 18a2 2 0 0 0 1.71 3h16.94a2 2 0 0 0 1.71-3L13.71 3.86a2 2 0 0 0-3.42 0z"></path><line x1="12" y1="9" x2="12" y2="13"></line><line x1="12" y1="17" x2="12.01" y2="17"></line></svg>Pendente</a>
                                               <a class="dropdown-item text-info" href="#"><svg viewBox="0 0 24 24" width="24" height="24" stroke="currentColor" stroke-width="2" fill="none" stroke-linecap="round" stroke-linejoin="round" class="mr-2"><circle cx="12" cy="12" r="10"></circle><path d="M8 14s1.5 2 4 2 4-2 4-2"></path><line x1="9" y1="9" x2="9.01" y2="9"></line><line x1="15" y1="9" x2="15.01" y2="9"></line></svg> Em preparo</a>
                                               <a class="dropdown-item text-success" href="#"> <svg viewBox="0 0 24 24" width="24" height="24" stroke="currentColor" stroke-width="2" fill="none" stroke-linecap="round" stroke-linejoin="round" class="mr-2"><polyline points="9 11 12 14 22 4"></polyline><path d="M21 12v7a2 2 0 0 1-2 2H5a2 2 0 0 1-2-2V5a2 2 0 0 1 2-2h11"></path></svg> Pronto</a>

                                           </div>
                                       </div>
                                       </td>
                                        </tr>
                                        </tbody>

                                    </c:forEach>
                                </table>

                            </c:forEach>


                            <th></th>
                        </tr>
                        </thead>
                        <tbody>



                        </tbody>
                    </table>
                </div>
            </div>

        </div>
    </div>
</div>



<script>
    adicionaEventoSituacoes();
    fixPrices();


    function fixPrices(){
        document.querySelectorAll('.valorsf').forEach(item=>{
            console.log(eval(item.textContent).toFixed(2));
            item.textContent = "R$ " + eval(item.textContent).toFixed(2);
        })
    }

    function sendAjaxSituation(situation){
        $.ajax({
            type: "POST",
            data: situation,
            url: "/controlastatus",
            success: function(data) {
                document.location.href="/cozinha";
            },
        });

    }

function adicionaEventoSituacoes(){
    b = document.querySelectorAll('.codigoitens');



    b.forEach(div=>{
        console.log(div.parentElement.children[5].children[0].children[1] );
        div.parentElement.children[5].children[0].children[1].dataset.codigoitem = div.textContent;

    })

    c = document.querySelectorAll('.situacoes').forEach(data=>{
        console.log(data.children[0]);
        data.children[0].addEventListener('click', pendente=>{
            situation = {};
            situation.situacao = "0".trim();
            situation.comanda = data.dataset.comanda.trim();
            situation.item = data.dataset.codigoitem.trim();
            console.log(situation);
            sendAjaxSituation(situation);


        });
        data.children[1].addEventListener('click', pendente=>{
            situation = {};
            situation.situacao = "1".trim();
            situation.comanda = data.dataset.comanda.trim();
            situation.item = data.dataset.codigoitem.trim();
            console.log(situation);
            sendAjaxSituation(situation);

        });
        data.children[2].addEventListener('click', pendente=>{
            situation = {};
            situation.situacao = "3".trim();
            situation.comanda = data.dataset.comanda.trim();
            situation.item = data.dataset.codigoitem.trim();
            console.log(situation);
            sendAjaxSituation(situation);

        });


    })

}



</script>


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

<script>

   function removealterta(){
        d = document.querySelector("#alerta");
        d.classList.remove('show');
   }

     //Remove itens que não são da cozinha
     function alerta(){
         a = document.querySelector("#alerta");
         a.classList.add("show");
     }

     function removebebidas(){
         $('.true').remove() ;
         alerta();

     }


     function removecozinha(){
         $('.false').remove() ;
         alerta();
     }
     // $('.N').remove() ;

</script>

</body>

<!-- Mirrored from davur.dexignzone.com/xhtml/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 07 Nov 2020 14:41:37 GMT -->
</html>