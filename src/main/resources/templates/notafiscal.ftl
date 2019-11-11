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
                </ul>
            </div>
        </nav>

        <div class="container">
            <div class="row">
                <div class="m-auto col-md-11" style="background-color: #fff; padding: 15px; box-shadow: -7px 2px 21px 8px rgba(0, 0, 0, 0.2)">
                        <div class="bg-success mb-3" style="height: 100px">
                            <br>
                            <h1 style="color: #fff; text-align: center">Nota Fiscal / Serviços de Software</h1>   
                        </div>
                            <div class="align-center">
                                <div class="col-md-6" style="float: left; text-align: end">
                                        <p>Nota Fiscal de</p>        
                                        <p>João Victor JVRC</p>
                                        <p>Rua Tapir, Numero 1285</p>
                                        
                                        <p>01962067309</p>
                                        <p>jvrc2000@outlook.com</p>
                                </div>
                                <div class="col-md-6" style="float: right">
                                        <p>Nota Fiscal para</p>        
                                        <p>${pedido.cliente.nome}</p>
                                        <p>${pedido.cliente.endereco}</p>
                                        <p>${pedido.cliente.telefone}</p>
                                        <p>jvrc2000@outlook.com</p>
                                </div>
                                <div class="text-center">
                                    <div class="col-md-4 bg-success" style="width: 200px;height: 100px; float: left; margin-right: 50px; color: white; margin-left: 15%">
                                            <p class="mt-3">
                                                Numero Nota Fiscal:
                                            </p>
                                            <p>
                                                ${pedido.id}
                                            </p>
                                    </div>
                                    <div class="col-md-4 bg-primary" style="width: 200px;height: 100px; float: left; margin-right: 50px; color: white">
                                            <p class="mt-3">
                                                Data:
                                            </p>
                                            <p>
                                                ${pedido.dataPedido}
                                            </p> 
                                    </div>
                                    <div class="col-md-4 bg-danger" style="width: 200px;height: 100px; float: left; margin-right: 50px; color: white">
                                        <p class="mt-3">Total:</p>
                                        <p>R$ ${pedido.valorTotal}</p>
                                    </div>
                                </div>
                    
                                <div>
                                    <table class="table">
                                        <thead>
                                            <tr>
                                                <th>#</th>
                                                <th>Produto</th>
                                                <th>Preço Unitário</th>
                                                <th>Quantidade</th>
                                                <th>Total</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                            <#list pedido.itensPedido as pedidoItem>
                                            <tr>
                                                <td></td>
                                                <td>${pedidoItem.produto.nomeProduto}</td>
                                                <td>${pedidoItem.produto.valorUnitario}</td>
                                                <td>${pedidoItem.quantidadeProdutos}</td>
                                                <td>${pedidoItem.valorTotal}</td>
                                            </tr>
                                            </#list>
                                        </tbody>
                                    </table>
                                </div>
                            </div>                    
                </div>
            </div>
        </div>    


        
            
    </body>
</html>      