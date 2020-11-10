<div class="nav-header">
    <a href="/inicio"  class="brand-logo">
        <img class="logo-abbr" src="https://isd-soft.com/wp-content/uploads/2017/02/DCeCHa_logo.png" alt="">
        <div id="titulointegrador">
        <h1 >Integrador</h1>
</div>
    </a>

    <div class="nav-control " >
        <div class="hamburger" onclick="hidetitle()">
            <span class="line" ></span><span class="line" ></span><span class="line"></span>
        </div>
    </div>
</div>

<script>

    function hidetitle(){
      titulo =  document.querySelector("#titulointegrador");

      if (titulo.hidden){
          titulo.hidden = false;
      }else{
          titulo.hidden = true;
      }




    }





</script>