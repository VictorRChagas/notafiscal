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


        <header class="text-center mb-5">
            <h1>Cadastre-se para poder comprar</h1>
        </header>
        <div class="container">
            <div class="row">
                <div class="m-auto col-md-6" style="background-color: #fff; padding: 15px; box-shadow: -7px 2px 21px 8px rgba(0, 0, 0, 0.2)">
                    <div class="text-center">
                        <form action="cadastro-cliente" method="POST">
                            <input type="text" name="nome" class="mb-2 form-control" placeholder="Seu nome" required/>
                            <input type="text" name="telefone" class="mb-2 form-control" placeholder="Telefone (00) 99999-9999" required/>
                            <input type="text" name="endereco" id="valorUnitario" class="mb-2 form-control" placeholder="Endereco" required/>

                            <input class="btn btn-primary" type="submit" value="Cadastrar-se"></input>
                        </form>
                    </div>
                </div>
            </div>
        </div>    
    </body>
</html>      