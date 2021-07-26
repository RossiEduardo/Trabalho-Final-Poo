<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<#include "/components/meta.ftl"/>
	    <title>allPet</title>
	</head>
	<body>
		<#include "/components/header.ftl"/>
		<#include "/components/user-space.ftl"/>

		<main>
            <div id="main-content">
				<ul>
					<#list anuncios as anuncio>
						<li>
							<h2>Anúncio ${anuncio.id}</h2>
							<p>Título: ${anuncio.titulo}</p>
							<p>Descrição: ${anuncio.descricao}</p>
							<p>Endereço: ${anuncio.endereco}</p>
							<p>Cidade: ${anuncio.cidade}</p>
							<p>Telefone: ${anuncio.telefone}</p>
							<p>E-mail: ${anuncio.email}</p>
							<img src="/img/${anuncio.animal?lower_case}.png" alt="Foto de um ${anuncio.animal?lower_case}." />
							<p>ID do usuário: ${anuncio.usuario}</p>
						</li>
					</#list>
				</ul>
			</div>
		</main>
	</body>
</html>