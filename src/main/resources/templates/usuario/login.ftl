<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <#include "/components/meta.ftl"/>
        <title>allPet - Login</title>
    </head>
    <body>
        <#include "/components/header.ftl"/>
        <#include "/components/user-space.ftl"/>

        <main>
            <div id="main-content">
                <#if sucesso?? && retorno??>
                    <p class="${sucesso?then('mensagem-sucesso','mensagem-erro')}">${retorno}</p>
                </#if>

                <form action="login" method="post">
                    E-mail: <input type="email" name="username" />
                    Senha: <input type="password" name="password" />
                    <input type="submit" />
                </form>
            </div>
        </main>
    </body>
</html>