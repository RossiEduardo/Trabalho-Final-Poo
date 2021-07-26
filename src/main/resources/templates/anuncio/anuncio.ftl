<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<#include "/components/meta.ftl"/>
        <#if anuncio??>
	        <title>allPet - Anúncio ${anuncio.id}</title>
        <#else>
            <title>allPet - Anúncio não encontrado</title>
        </#if>
	</head>
	<body>
		<#include "/components/header.ftl"/>
		<#include "/components/user-space.ftl"/>

        <#if anuncio??>
            <h2>Anúncio ${anuncio.id}</h2>
            <p>Título: ${anuncio.titulo}</p>
            <p>Descrição: ${anuncio.descricao}</p>
            <p>Endereço: ${anuncio.endereco}</p>
            <p>Cidade: ${anuncio.cidade}</p>
            <p>Telefone: ${anuncio.telefone}</p>
            <p>E-mail: ${anuncio.email}</p>
            <img src="/img/${anuncio.animal?lower_case}.png" alt="Foto de um ${anuncio.animal?lower_case}." />
            <p>ID do usuário: ${anuncio.usuario}</p>
        <#else>
            <h2>Não encontrado</h2>
        </#if>
	</body>
</html>