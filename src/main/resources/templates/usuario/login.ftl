<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <#include "/components/meta.ftl"/>
        <title>allPet - Login</title>

        <style>
            a[href="/cadastro"] {
                color: darkgray;
                margin-top: 15px;
            }

            a[href="/cadastro"]:hover,
            a[href="/cadastro"]:focus {
                color: #e65100;
            }

            a[href="/cadastro"]:active {
                color: #ffcc80;
            }
        </style>
    </head>
    <body class="preload">
        <#include "/components/header.ftl"/>
        <#include "/components/user-space.ftl"/>

        <main>
            <div id="main-content">
                <h2>Login</h2>

                <#if sucesso?? && retorno??>
                    <p class="${sucesso?then('mensagem-sucesso','mensagem-erro')}">${retorno}</p>
                </#if>

                <form action="login" method="post">
                    <label for="username">E-mail</label>
                    <input type="email" name="username" placeholder="meu@email.com" />

                    <label for="password">Senha</label>
                    <input type="password" name="password" placeholder="minhasenha" />

                    <input type="submit" value="Login" />
                </form>
                <a href="/cadastro">Ainda não sou cadastrado</a>
            </div>
        </main>
    </body>
</html>