<%@ taglib tagdir="/WEB-INF/tags/" prefix="tag"%>
<%@ taglib uri="http://java.sun.com/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" %>

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
    <tag:headerstart />
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
                <h1>Cardápios</h1>
            <div class="card-header">

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
                                        <th>Imagem</th>
                                    </tr>

                                    </thead>


                                   <div class="p-3 mb-2 bg-info text-white"> <c:out value="${card.descricao}" />  </div>
                            <c:forEach var="item" items="${card.itens}">
                                    <tbody>
                                <td class="media-body"> <c:out value="${item.codigo}" /> </td>
                                <td class="media-body"> <c:out value="${item.descricao}" /></td>
                                <td class="media-body" > <c:out value="${item.valor}" /></td>
                                <td class="media-body"> <img class="img-fluid rounded mr-3" width="85" src="<c:out value="${item.imagem}" />" ></td>
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


</body>

<!-- Mirrored from davur.dexignzone.com/xhtml/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 07 Nov 2020 14:41:37 GMT -->
</html>