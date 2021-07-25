<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<#include "/components/meta.ftl"/>
	    <title>allPet</title>
	</head>
	<body>
		<#include "/components/header.ftl"/>
		<#include "/components/user-space.ftl"/>

	    <ul>
	        <#list anuncios as anuncio>
			  	<li>
                    <h2>Anúncio ${anuncio.id}</p>
                    <p>Título: ${anuncio.titulo}</p>
                    <p>Descrição: ${anuncio.descricao}</p>
                    <p>Endereço: ${anuncio.endereco}</p>
                    <p>Cidade: ${anuncio.cidade}</p>
                    <p>Telefone: ${anuncio.telefone}</p>
                    <p>E-mail: ${anuncio.email}</p>
                    <p>Animal (0 cachorro; 1 gato): ${anuncio.animal}</p>
                    <p>ID do usuário: ${anuncio.usuario}</p>
                </li>
			</#list>
		</ul>
	</body>
</html>