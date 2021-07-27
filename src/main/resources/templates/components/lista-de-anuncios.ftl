<ul id="lista-de-anuncios">
    <#if anuncios?has_content>
        <#list anuncios as anuncio>
            <a href="/anuncio/${anuncio.id}">
                <li>
                    <img class="anuncio-post-imagem" src="${anuncio.imagem}" alt="Foto de um ${anuncio.animal?lower_case}." />

                    <div class="anuncio-post-container">
                        <h3>${anuncio.titulo}</h3>
                        <p class="anuncio-post-descricao">${anuncio.descricao}</p>
                        <p class="anuncio-post-endereco">${anuncio.endereco}, ${anuncio.cidade}</p>
                    </div>
                </li>
            </a>
        </#list>
    <#else>
        <h3 id="sem-anuncios">Não há anúncios cadastrados.</h3>
    </#if>
</ul>