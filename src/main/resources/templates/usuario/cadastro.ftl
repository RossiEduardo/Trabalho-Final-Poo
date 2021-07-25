<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <#include "/components/meta.ftl"/>
        <title>allPet</title>
    </head>
    <body>
        <#include "/components/header.ftl"/>
        <#include "/components/user-space.ftl"/>

        <#if retorno??>
            <p class="${sucesso?then('mensagem-sucesso','mensagem-erro')}">${retorno}</p>
        </#if>
        <form action="cadastro" method="post">
            Nome: <input type="text" name="nome" />
            Cidade: <input type="text" name="cidade" />
            Cpf: <input type="text" name="cpf" />
            Telefone: <input type="tel" name="telefone" />
            E-mail: <input type="email" name="email" />
            Senha: <input type="password" name="senha" />
            <input type="submit" />
        </form>
    </body>
</html>
