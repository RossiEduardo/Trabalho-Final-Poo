<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <#include "/components/meta.ftl"/>
        <title>allPet</title>
    </head>
    <body>
        <#include "/components/header.ftl"/>
        <#include "/components/user-space.ftl"/>

        <#if retorno??>
            <p class="${sucesso?then('mensagem-sucesso','mensagem-erro')}">${retorno}</p>
        </#if>
        <form action="anuncio/criar" method="post">
            Título: <input type="text" name="titulo" />
            Descrição: <textarea name="descricao"></textarea>
            Endereço: <input type="text" name="endereco" />
            Cidade: <input type="text" name="cidade" />
            Telefone: <input type="tel" name="telefone" />
            E-mail: <input type="email" name="email" />
            Animal:
            <select name="animal">
                <option>1</option>
                <option>2</option>
            </select>
            <input type="submit" />
        </form>
    </body>
</html>
