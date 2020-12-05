<%@tag pageEncoding="UTF-8"%>
<div class="deznav">
    <div class="deznav-scroll">
        <ul class="metismenu" id="menu">
            <!-- INICIO ITEM DIRETO -->
            <li><a href="/inicio" class="ai-icon" aria-expanded="false">
                <i class="fas fa-home"></i>
                <span class="nav-text">Início</span>
            </a>
            </li>
            <!-- FIM ITEM DIRETO -->


            <li><a class="has-arrow ai-icon" href="javascript:void()" aria-expanded="false">
                <i class="fas fa-clipboard-list"></i>
                <span class="nav-text">Comandas</span>
            </a>
                <ul aria-expanded="false">
                    <li><a href="/comanda"><i class="far fa-plus text-success"></i> Nova Comanda</a></li>
                </ul>
            </li>


            <!-- PRODUTOS -->
            <li><a class="has-arrow ai-icon" href="javascript:void()" aria-expanded="false">
                <i class="fas fa-cheeseburger"></i>
                <span class="nav-text">Produtos</span>
            </a>
                <ul aria-expanded="false">
                    <li><a href="/produto"><i class="far fa-plus text-success"></i>Cadastro Produtos</a></li>
                    <li><a href="/listarprodutos"><i class="fad fa-list-ul text-info"></i>Lista de Produtos</a></li>
                </ul>
            </li>

            <!-- FIM PRODUTOS -->


            <!-- CARDAPIO -->
            <li><a class="has-arrow ai-icon" href="javascript:void()" aria-expanded="false">
                <i class="fas fa-bars"></i>
                <span class="nav-text">Cardápios</span>
            </a>
                <ul aria-expanded="false">
                    <li><a href="/cardapio"><i class="far fa-plus text-success"></i>Cadastro Cardápio</a></li>
                    <li><a href="/listarcardapio"><i class="fad fa-list-ul text-info"></i>Lista de Cardápios</a></li>
                </ul>
            </li>

            <!-- FIM CARDAPIO -->

            <!-- FILIAL -->

            <li><a class="has-arrow ai-icon" href="javascript:void()" aria-expanded="false">
                <i class="fas fa-chart-network"></i>
                <span class="nav-text">Filial</span>
            </a>
                <ul aria-expanded="false">
                    <li><a href="/filial"><i class="far fa-plus text-success"></i>Cadastro Filial</a></li>
                    <li><a href="/listarfilial"><i class="fad fa-list-ul text-info"></i>Lista de Filiais</a></li>
                </ul>
            </li>

            <!-- FIM FILIAL -->


            <!-- USUARIO -->

            <li><a class="has-arrow ai-icon" href="javascript:void()" aria-expanded="false">
                <i class="fad fa-users"></i>
                <span class="nav-text">Usuário</span>
            </a>
                <ul aria-expanded="false">
                    <li><a href="/usuario"><i class="far fa-plus text-success"></i>Cadastro Usuário</a></li>
                    <li><a href="/listarusuario"><i class="fad fa-list-ul text-info"></i>Lista de Usuários</a></li>
                </ul>
            </li>

            <!-- FIM USUARIO -->


            <!-- COZINHA -->

            <li><a class="has-arrow ai-icon" href="javascript:void()" aria-expanded="false">
                <i class="fad fa-sticky-note"></i>
                <span class="nav-text">Pedidos</span>
            </a>
                <ul aria-expanded="false">
                    <li><a href="/cozinha"><i class="fad fa-list-ul text-info" ></i>Central de Pedidos</a></li>
                </ul>
            </li>

            <!-- FIM COZINHA -->


        </ul>


    </div>
</div>