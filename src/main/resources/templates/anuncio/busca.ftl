<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<#include "/components/meta.ftl"/>
	    <title>allPet</title>
	</head>
	<body class="preload">
		<#include "/components/header.ftl"/>
		<#include "/components/user-space.ftl"/>
		<main>
            <div id="main-content">
				<h2>Início</h2>
				
				<#include "/components/filtro-de-anuncio.ftl"/>
				<#include "/components/lista-de-anuncios.ftl"/>
			</div>
		</main>
	</body>
</html>