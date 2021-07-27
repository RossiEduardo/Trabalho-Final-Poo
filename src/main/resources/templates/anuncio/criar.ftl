<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <#include "/components/meta.ftl"/>
        <title>allPet - Criar anúncio</title>
    </head>
    <body>
        <#include "/components/header.ftl"/>
        <#include "/components/user-space.ftl"/>

        <main>
            <div id="main-content">
                <#if sucesso?? && retorno??>
                    <#if sucesso>
                        <p class="mensagem-sucesso">${retorno}</p>
                        <a href="/anuncio/${anuncioId}"></a>
                    <#else>
                        <p class="mensagem-erro">${retorno}</p>
                    </#if>
                </#if>
                
                <form action="anuncio/criar" method="post">

                    <label for="titulo">Título</label>
                    <input type="text" name="titulo" />
                    
                    <label for="descricao">Descrição</label>
                    <textarea name="descricao" rows="3"></textarea>
                    
                    <label for="endereco">Endereço</label>
                    <input type="text" name="endereco" />
                    
                    <label for="cidade">Cidade</label>
                    <input type="text" name="cidade" />
                    
                    <label for="telefone">Telefone</label>
                    <input type="tel" name="telefone" />
                    
                    <label for="email">E-mail</label>
                    <input type="email" name="email" />
                    
                    <label for="animal">Animal</label>
                    <select name="animal">
                        <#list animais as animal>
                            <option>${animal?capitalize}</option>
                        </#list>
                    </select>
                    
                    <input type="submit" value="Criar anúncio"/>
                </form>
            </div>
        </main>
    </body>
</html>
