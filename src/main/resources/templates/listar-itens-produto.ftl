<html>
    <head>
        <meta charset="utf-8">
        <title>Seja bem vindo</title>
        <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
        <link rel="stylesheet" href="css/style.css">
    </head>
    <body>
        <nav class="navbar navbar-expand-lg navbar-light bg-primary mb-3">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#textoNavbar" aria-controls="textoNavbar" aria-expanded="false" aria-label="Alterna navegação">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="textoNavbar">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="/cliente/cadastro-cliente">Cadastrar Cliente <span class="sr-only"></span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="/produto/cadastro-produto">Cadastrar Produto <span class="sr-only"></span></a>
                    </li>
                    <li class="nav-item active">
                        <a class="nav-link" href="/produto/lista-produtos">Listar Produtos <span class="sr-only"></span></a>
                    </li>
                </ul>
            </div>
        </nav>

        <div class="container">
            <div class="row">
                <div class="m-auto col-md-10" style="background-color: #fff; padding: 15px">
                    <form action="/pedido" method="POST">
                    <#list produtos as produto>
                    
                    <div class="text-center">
                            <div class="text-start">
                                <h3>${produto.nomeProduto}</h3>
                                <p>R$ ${produto.valorUnitario}</p>
                                <input type="checkbox" name="produto" value="${produto.id}">
                            </div>
                    </div>
                    </#list>
                        <br><br><br>
                    <div class="text-center m-auto">
                        <input class="m-auto btn btn-primary mt-3" type="submit" value="Finalizar e Mostrar a Nota Fiscal"></input>
                    </div>
                </div>
                </form>
            </div>
        </div>

    </body>
</html>      