<article id="user-space">
    <a href="/perfil" class="user-space-perfil-link">
        <div class="user-space-perfil"><img src="/img/user-icon.png"/></div>
    </a>
    <a href="/anuncio/criar" class="user-space-anuncio-criar-link">
        <div class="user-space-anuncio-criar">Quero doar um Pet!</div>
    </a>
    <a href="/logout" class="user-space-logout-link">
        <#if username??>
            <p>${username}</p>
            <div class="user-space-logout">Logout &rarr;</div>
        <#else>
            <a href="/login">Login</a>
        </#if>
    </a>
</article>