<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<#include "/components/meta.ftl"/>
        <#if anuncio??>
	        <title>allPet - ${anuncio.titulo}</title>
        <#else>
            <title>allPet - Anúncio não encontrado</title>
        </#if>

        <style>
            .anuncio-details-container {
                margin: 5px 0;
            }

            .anuncio-imagem {
                width: 100%;
                height: 300px;
            }
        </style>
	</head>
	<body class="preload">
		<#include "/components/header.ftl"/>
		<#include "/components/user-space.ftl"/>

        <main>
            <div id="main-content">
                <#if anuncio??>
                    <h2>${anuncio.titulo}</h2>
                    
                    <img class="anuncio-imagem" src="${anuncio.imagem}" alt="Foto de um ${anuncio.animal?lower_case}." />
                    
                    <div class="anuncio-details-container"> 
                        <h3>Descrição</h3>
                        <p>${anuncio.descricao}</p>
                    </div>

                    <div class="anuncio-details-container">
                        <h3>Endereço</h3>
                        <p>${anuncio.endereco}, ${anuncio.cidade}</p>
                    </div>

                    <div class="anuncio-details-container">
                        <h3>Contato</h3>
                        <p>Telefone: ${anuncio.telefone}</p>
                        <p>E-mail: ${anuncio.email}</p>
                    </div>
                <#else>
                    <h2>Anúncio não encontrado</h2>
                </#if>
            </div>
        </main>
	</body>
</html>