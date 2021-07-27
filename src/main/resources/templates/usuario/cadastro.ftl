<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <#include "/components/meta.ftl"/>
        <title>allPet - Cadastro</title>
        <style>


        </style>
    </head>
    <body>
        <#include "/components/header.ftl"/>
        <#include "/components/user-space.ftl"/>

        <main>
            <div id="main-content">
                <h2>Cadastro</h2>
                
                <#if sucesso?? && retorno??>
                    <p class="${sucesso?then('mensagem-sucesso','mensagem-erro')}">${retorno}</p>
                </#if>
                
                <form action="cadastro" method="post">
                    <label for="nome">Nome</label>
                    <input type="text" name="nome" placeholder="Fulano da Silva" />

                    <label for="cidade">Cidade</label>
                    <input type="text" name="cidade" placeholder="São Paulo" />
                    
                    <label for="cpf">CPF</label>
                    <input type="text" name="cpf" placeholder="xxx.xxx.xxx-xx" />

                    <label for="telefone">Telefone</label>
                    <input type="tel" name="telefone" placeholder="(xx) xxxxx-xxxx" />
                    
                    <label for="email">E-mail</label>
                    <input type="email" name="email" placeholder="meu@email.com" />

                    <label for="senha">Senha</label>
                    <input type="password" name="senha" placeholder="minhasenha" />
                    
                    <input type="submit" value="Finalizar cadastro" />
                </form>
            </div>
        </main>
    </body>
</html>
