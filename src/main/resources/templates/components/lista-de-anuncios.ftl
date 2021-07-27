<ul id="lista-de-anuncios">
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
</ul>