<!DOCTYPE html>
<html lang="pt-br">
<head>
    <#include "/components/meta.ftl"/>
    <title>allPet - perfil!</title>
</head>
<body>
<#include "/components/header.ftl"/>
<#include "/components/user-space.ftl"/>

<p>${usuario.nome}<p>

<#if retorno??>
            <p class="${sucesso?then('mensagem-sucesso','mensagem-erro')}">${retorno}</p>
        </#if>
        <form action="perfil" method="post">
            DeletarAnuncio: <input type="text" name="idAnuncio" />
            <input type="submit" />
        </form>

<#list anuncios as anuncio>
    <p>${anuncio.titulo}</p>
</#list>
</body>
</html>
