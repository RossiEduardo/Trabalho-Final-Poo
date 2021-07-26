<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <#include "/components/meta.ftl"/>
        <title>allPet - Cadastro</title>
    </head>
    <body>
        <#include "/components/header.ftl"/>
        <#include "/components/user-space.ftl"/>

        <#if sucesso??>
            <#if sucesso>
                <p class="mensagem-sucesso">Usuário cadastrado com sucesso</p>
            <#else>
                <p class="mensagem-erro">Ocorreu um erro no cadastro</p>
            </#if>
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
