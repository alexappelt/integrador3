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

				<tag:maintemplate title="Cadastrar novo produto">
					<form name="cadProduto" action="/produto" method="post" >
						<div class="form-group">
						<tag:inputtext  label="Descricao" name="descricao"  />



							<div class="form-group row">
								<label class="col-sm-3 text-right" > Valor R$ </label>
								<input class="col-sm-9 form-control" name="valor" type="number" step="0.01"/>
							</div>

							<div class="form-group row">
								<label class="col-sm-3 text-right" > Link da imagem </label>
								<input class="col-sm-9 form-control" name="imagem" type="text" />
							</div>

							<tag:inputtext label="Estoque" name="qntdestoque" />

							<div class="form-group row">
								<label class="col-sm-3 text-right">Cozinha</label>
								<input type="checkbox" name="cozinha">

							</div>




						<div class="form-group col-sm-12 text-right">
							<button type="submit" class="btn btn-success">Cadastrar <span class="btn-icon-right"><i class="fa fa-check"></i></span>
							</button>
						</div>
						</div>
					</form>
				</tag:maintemplate>


			<div class="content-body" style="min-height: 1042px;">
			<!-- row -->
		<div class="container-fluid">



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