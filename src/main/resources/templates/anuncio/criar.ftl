<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <#include "/components/meta.ftl"/>
        <title>allPet - Criar anúncio</title>
    </head>
    <body class="preload">
        <#include "/components/header.ftl"/>
        <#include "/components/user-space.ftl"/>

        <main>
            <div id="main-content">
                <h2>Criar anúncio</h2>

                <#if sucesso?? && retorno??>
                    <#if sucesso>
                        <p class="mensagem-sucesso">${retorno}</p>
                        <a href="/anuncio/${anuncioId}"></a>
                    <#else>
                        <p class="mensagem-erro">${retorno}</p>
                    </#if>
                </#if>
                
                <form action="/anuncio/criar" method="post">

                    <label for="titulo">Título</label>
                    <input maxlength="60" type="text" name="titulo" />
                    
                    <label for="descricao">Descrição</label>
                    <textarea maxlength="1000" name="descricao" rows="3"></textarea>
                    
                    <label for="endereco">Endereço</label>
                    <input maxlength="120" type="text" name="endereco" />
                    
                    <label for="cidade">Cidade</label>
                    <input maxlength="100" type="text" name="cidade" value="${usuario.cidade}" />
                    
                    <label for="telefone">Telefone</label>
                    <input maxlength="30" type="tel" name="telefone" value="${usuario.telefone}"/>
                    
                    <label for="email">E-mail</label>
                    <input maxlength="64" type="email" name="email" value="${usuario.email}"/>
                    
                    <label for="animal">Animal</label>
                    <select name="animal">
                        <#list animais as animal>
                            <option value="${animal}">${animal?capitalize}</option>
                        </#list>
                    </select>
                    
                    <input type="submit" value="Criar anúncio"/>
                </form>
            </div>
        </main>
    </body>
</html>
