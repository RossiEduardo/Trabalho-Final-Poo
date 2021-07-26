<!DOCTYPE html>
<html lang="pt-br">
<head>
    <#include "/components/meta.ftl"/>
    <title>allPet - perfil!</title>
</head>
<body>
<#include "/components/header.ftl"/>
<#include "/components/user-space.ftl"/>

<#list anuncios as anuncio>
    <p>${anuncio.titulo}</p>
</#list>
</body>
</html>
