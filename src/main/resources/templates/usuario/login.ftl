<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <#include "/components/meta.ftl"/>
        <title>allPet - Login</title>
    </head>
    <body>
        <#include "/components/header.ftl"/>
        <#include "/components/user-space.ftl"/>
        <#if error>
            <p class="error">Credenciais inválidas!</p>
        </#if>
        <#if logout>
            <p class="logout">Logout feito com sucesso!</p>
        </#if>
        <form action="login" method="post">
            E-mail: <input type="email" name="username" />
            Senha: <input type="password" name="password" />
            <input type="submit" />
        </form>
    </body>
</html>