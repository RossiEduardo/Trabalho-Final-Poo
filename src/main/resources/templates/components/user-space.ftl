<article id="user-space">
    <#if username??>
        <a href="/perfil" class="perfil-link">
            <div class="perfil"><img src="/img/user-icon.png"/></div>
        </a>
        <a href="/anuncio/criar" class="anuncio-criar-link">
            <div class="anuncio-criar">Quero doar um Pet!</div>
        </a>
        <a href="/logout" class="logout-link">
            <div class="logout">Logout &rarr;</div>
        </a>
    <#else>
        <a href="/login" class="login-link">
            <div class="login">Fazer Login</div>
        </a>
    </#if>
</article>