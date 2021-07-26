<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <#include "/components/meta.ftl"/>
        <title>allPet - Perfil</title>
    </head>
    <body>
        <#include "/components/header.ftl"/>
        <#include "/components/user-space.ftl"/>

        <p>${usuario.nome}<p>

        <#if sucesso??>
            <#if sucesso>
                <p class="mensagem-sucesso">Usuário atualizado com sucesso</p>
            <#else>
                <p class="mensagem-erro">Ocorreu um erro na atualização do usuário</p>
            </#if>
        </#if>

        <#list anuncios as anuncio>
            <p>${anuncio.titulo}</p>
            <form action="/anuncio/delete" method="post">
                <input type="hidden" name="anuncioId" value="${anuncio.id}" />
                <input type="submit" />
            </form>
        </#list>
    </body>
</html>
