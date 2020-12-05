<!DOCTYPE html>
<html lang="pt-br" class="h-100">


<!-- Mirrored from davur.dexignzone.com/xhtml/page-lock-screen.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 07 Nov 2020 14:44:10 GMT -->
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width,initial-scale=1">
    <title>Bloqueio</title>
    <!-- Favicon icon -->
    <link rel="icon" type="image/png" sizes="16x16" href="https://isd-soft.com/wp-content/uploads/2017/02/DCeCHa_logo.png">
    <link href="css/style.css" rel="stylesheet">
    <!-- JavaScript -->
    <script src="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/alertify.min.js"></script>

    <!-- CSS -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.min.css"/>
    <!-- Default theme -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/default.min.css"/>
    <!-- Semantic UI theme -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/semantic.min.css"/>
    <!-- Bootstrap theme -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/bootstrap.min.css"/>

    <!--
        RTL version
    -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/alertify.rtl.min.css"/>
    <!-- Default theme -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/default.rtl.min.css"/>
    <!-- Semantic UI theme -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/semantic.rtl.min.css"/>
    <!-- Bootstrap theme -->
    <link rel="stylesheet" href="//cdn.jsdelivr.net/npm/alertifyjs@1.13.1/build/css/themes/bootstrap.rtl.min.css"/>

</head>

<body class="h-100">
<div class="authincation h-100">
    <div class="container h-100">
        <div class="row justify-content-center h-100 align-items-center">
            <div class="col-md-6">
                <div class="authincation-content">
                    <div class="row no-gutters">
                        <div class="col-xl-12">
                            <div class="auth-form">
                                <h4 class="text-center mb-4">Conta Bloqueada</h4>
                                <form>
                                    <div class="form-group">
                                        <label><strong>Senha</strong></label>
                                        <input id="senha" type="password" class="form-control" value="">
                                    </div>
                                    <div class="text-center">
                                        <button type="button" class="btn btn-primary btn-block" onclick="validaSenha()" >Desbloquear</button>
                                    </div>
                                </form>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>
<!-- #/ container -->
<!-- Common JS -->
<script>
    function validaSenha (){
      campSenha = document.getElementById("senha");
      if (campSenha.value == "admin"){
          window.location.href="/inicio"
      }else
          alertify.error('Senha Incorreta');


    };


</script>

</body>


<!-- Mirrored from davur.dexignzone.com/xhtml/page-lock-screen.html by HTTrack Website Copier/3.x [XR&CO'2014], Sat, 07 Nov 2020 14:44:11 GMT -->
</html>