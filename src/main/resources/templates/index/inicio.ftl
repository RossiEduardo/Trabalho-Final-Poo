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
                <form class="filtros" method="GET">
                    <p class="label">Filtros</p>

                    <label for="fname">Região</label>
                    <input type="text" />
                    <label for="fname">Animal</label>
                    <select>
                        <option disabled selected value>Selecione</option>
                        <option value="cachorro">Cachorro</option>
                        <option value="gato">Gato</option>
                    </select>
                    <input type="submit" value="Filtrar" />
                </form>
                <div class="postagens">
                    <div class="postagem">
                        <img src="cachorro1.jpeg" />
                    </div>
                </div>
            </div>
        </main>

	    <ul>
	        <#list usuarios as usuario>
			  	<li>${usuario.id} - ${usuario.nome}</li>
			</#list>
		</ul>
	</body>
</html>