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

				<h1>Painel Inicial</h1>
				<div class="row">
					<!-- **********INICIO TOTAL PEDIDOS  -->
					<div class="col-xl-3 col-xxl-3 col-lg-6 col-md-6 col-sm-6">
						<div class="widget-stat card">
							<div class="card-body p-4">
								<div class="media ai-icon">
									<span class="mr-3 bgl-primary text-primary">
										<!-- <i class="ti-user"></i> -->
										<svg width="36" height="28" viewBox="0 0 36 28" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M31.75 6.75H30.0064L30.2189 4.62238C30.2709 4.10111 30.2131 3.57473 30.0493 3.07716C29.8854 2.57959 29.6192 2.12186 29.2676 1.73348C28.9161 1.3451 28.4871 1.03468 28.0082 0.822231C27.5294 0.609781 27.0114 0.500013 26.4875 0.5H7.0125C6.48854 0.500041 5.9704 0.609864 5.49148 0.822391C5.01256 1.03492 4.58348 1.34543 4.23189 1.73392C3.88031 2.12241 3.61403 2.58026 3.45021 3.07795C3.28639 3.57564 3.22866 4.10214 3.28075 4.6235L5.2815 24.6224C5.31508 24.9222 5.38467 25.2168 5.48875 25.5H1.75C1.41848 25.5 1.10054 25.6317 0.866116 25.8661C0.631696 26.1005 0.5 26.4185 0.5 26.75C0.5 27.0815 0.631696 27.3995 0.866116 27.6339C1.10054 27.8683 1.41848 28 1.75 28H31.75C32.0815 28 32.3995 27.8683 32.6339 27.6339C32.8683 27.3995 33 27.0815 33 26.75C33 26.4185 32.8683 26.1005 32.6339 25.8661C32.3995 25.6317 32.0815 25.5 31.75 25.5H28.0115C28.1154 25.2172 28.1849 24.9229 28.2185 24.6235L28.881 18H31.75C32.7442 17.9989 33.6974 17.6035 34.4004 16.9004C35.1035 16.1974 35.4989 15.2442 35.5 14.25V10.5C35.4989 9.50577 35.1035 8.55258 34.4004 7.84956C33.6974 7.14653 32.7442 6.75109 31.75 6.75ZM9.0125 25.5C8.70243 25.501 8.40314 25.3862 8.17327 25.1782C7.9434 24.9701 7.79949 24.6836 7.76975 24.375L5.7685 4.37575C5.75109 4.20188 5.7703 4.0263 5.82488 3.86031C5.87946 3.69432 5.96821 3.5416 6.0854 3.412C6.2026 3.28239 6.34564 3.17877 6.50532 3.10781C6.665 3.03685 6.83777 3.00013 7.0125 3H26.4875C26.6622 3.00012 26.8349 3.03681 26.9945 3.10772C27.1541 3.17863 27.2972 3.28218 27.4143 3.4117C27.5315 3.54123 27.6203 3.69386 27.6749 3.85977C27.7295 4.02568 27.7488 4.20119 27.7315 4.375L25.7308 24.3762C25.7007 24.6848 25.5566 24.971 25.3267 25.1788C25.0967 25.3867 24.7975 25.5012 24.4875 25.5H9.0125ZM33 14.25C32.9998 14.5815 32.868 14.8993 32.6337 15.1337C32.3993 15.368 32.0815 15.4998 31.75 15.5H29.1311L29.7561 9.25H31.75C32.0815 9.2502 32.3993 9.38196 32.6337 9.61634C32.868 9.85071 32.9998 10.1685 33 10.5V14.25Z" fill="#2F4CDD"></path></svg>

									</span>
									<div class="media-body">
										<h3 class="mb-0 text-black"><span class="counter ml-0"> <h3><c:out value="${qntdpedidos}" /></h3></span></h3>
										<p class="mb-0">Total de Pedidos</p>
										<small>Dados Diários</small>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- **********FIM TOTAL PEDIDOS  -->
					<!-- **********INICIO TOTAL FATURAMENTO DIARIO  -->
					<div class="col-xl-3 col-xxl-3 col-lg-6 col-md-6 col-sm-6">
						<div class="widget-stat card">
							<div class="card-body p-4">
								<div class="media ai-icon">
									<span class="mr-3 bgl-primary text-primary">
										<!-- <i class="ti-user"></i> -->
										<svg width="20" height="36" viewBox="0 0 20 36" fill="none" xmlns="http://www.w3.org/2000/svg"><path d="M19.08 24.36C19.08 25.64 18.76 26.8667 18.12 28.04C17.48 29.1867 16.5333 30.1467 15.28 30.92C14.0533 31.6933 12.5733 32.1333 10.84 32.24V35.48H8.68V32.24C6.25333 32.0267 4.28 31.2533 2.76 29.92C1.24 28.56 0.466667 26.84 0.44 24.76H4.32C4.42667 25.88 4.84 26.8533 5.56 27.68C6.30667 28.5067 7.34667 29.0267 8.68 29.24V19.24C6.89333 18.7867 5.45333 18.32 4.36 17.84C3.26667 17.36 2.33333 16.6133 1.56 15.6C0.786667 14.5867 0.4 13.2267 0.4 11.52C0.4 9.36 1.14667 7.57333 2.64 6.16C4.16 4.74666 6.17333 3.96 8.68 3.8V0.479998H10.84V3.8C13.1067 3.98667 14.9333 4.72 16.32 6C17.7067 7.25333 18.5067 8.89333 18.72 10.92H14.84C14.7067 9.98667 14.2933 9.14667 13.6 8.4C12.9067 7.62667 11.9867 7.12 10.84 6.88V16.64C12.6 17.0933 14.0267 17.56 15.12 18.04C16.24 18.4933 17.1733 19.2267 17.92 20.24C18.6933 21.2533 19.08 22.6267 19.08 24.36ZM4.12 11.32C4.12 12.6267 4.50667 13.6267 5.28 14.32C6.05333 15.0133 7.18667 15.5867 8.68 16.04V6.8C7.29333 6.93333 6.18667 7.38667 5.36 8.16C4.53333 8.90667 4.12 9.96 4.12 11.32ZM10.84 29.28C12.28 29.12 13.4 28.6 14.2 27.72C15.0267 26.84 15.44 25.7867 15.44 24.56C15.44 23.2533 15.04 22.2533 14.24 21.56C13.44 20.84 12.3067 20.2667 10.84 19.84V29.28Z" fill="#2F4CDD"></path></svg>
									</span>
									<div class="media-body">
										<h3 class="mb-0 text-black"> <span> R$ </span> <span class="counter ml-0"> <c:out value="${faturamento}" /></span></h3>
										<p class="mb-0">Total de Faturamento</p>
										<small>Dados Diários</small>
									</div>
								</div>
							</div>
						</div>
					</div>
					<!-- **********FIM TOTAL FATURAMENTO DIARIO  -->

				</div>
				<div class="container-fluid">
					<div class="row">
						<div  class="col-xl-5">
							<div class="card">
								<div class="card-body p-4">

									<div class="bootstrap-carousel">
										<div id="carouselExampleIndicators2" class="carousel slide" data-ride="carousel">
											<ol class="carousel-indicators">
												<li data-target="#carouselExampleIndicators2" data-slide-to="0" class=""></li>
												<li data-target="#carouselExampleIndicators2" data-slide-to="1" class=""></li>
												<li data-target="#carouselExampleIndicators2" data-slide-to="2" class="active"></li>
											</ol>
											<div class="carousel-inner">
												<div class="carousel-item">
													<img class="d-block w-100" src="images/big/img4.jpg" alt="First slide">
												</div>
												<div class="carousel-item">
													<img class="d-block w-100" src="images/big/img5.jpg" alt="Second slide">
												</div>
												<div class="carousel-item active">
													<img class="d-block w-100" src="images/big/img6.jpg" alt="Third slide">
												</div>
											</div><a class="carousel-control-prev" href="#carouselExampleIndicators2" data-slide="prev"><span class="carousel-control-prev-icon"></span> <span class="sr-only">Previous</span> </a><a class="carousel-control-next" href="#carouselExampleIndicators2" data-slide="next"><span class="carousel-control-next-icon"></span>
											<span class="sr-only">Next</span></a>
										</div>
									</div>
								</div>
							</div>
						</div>


						<div  class="col-xl-5">
							<div class="card">
								<div class="card-body p-4">

									<div class="bootstrap-carousel">
										<div data-ride="carousel" class="carousel slide" id="carouselExampleCaptions">
											<ol class="carousel-indicators">
												<li class="active" data-slide-to="0" data-target="#carouselExampleCaptions">
												</li>
												<li data-slide-to="1" data-target="#carouselExampleCaptions" class=""></li>
												<li data-slide-to="2" data-target="#carouselExampleCaptions" class=""></li>
											</ol>
											<div class="carousel-inner">
												<div class="carousel-item active">
													<img class="d-block w-100" src="images/big/img5.jpg" alt="">
													<div class="carousel-caption d-none d-md-block">

													</div>
												</div>
												<div class="carousel-item">
													<img alt="" class="d-block w-100" src="images/big/img6.jpg">
													<div class="carousel-caption d-none d-md-block">

													</div>
												</div>
												<div class="carousel-item">
													<img alt="" class="d-block w-100" src="images/big/img7.jpg">
													<div class="carousel-caption d-none d-md-block">

														</p>
													</div>
												</div>
											</div><a data-slide="prev" href="#carouselExampleCaptions" class="carousel-control-prev"><span class="carousel-control-prev-icon"></span> <span class="sr-only">Previous</span>
										</a><a data-slide="next" href="#carouselExampleCaptions" class="carousel-control-next"><span class="carousel-control-next-icon"></span> <span class="sr-only">Next</span></a>
										</div>
									</div>
								</div>
							</div>
						</div>



					</div>
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
   <tag:scripts />
	

<script>



</script>

</body>

<!-- Mirrored from davur.dexignzone.com/xhtml/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 07 Nov 2020 14:41:37 GMT -->
</html>