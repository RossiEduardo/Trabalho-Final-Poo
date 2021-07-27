<form id="filtro-de-anuncio" action="/anuncio/busca" method="get">

    <label for="cidade">Cidade</label>
    <input type="text" name="cidade" placeholder="São Carlos" />
    
    <label for="animal">Animal</label>
    <select name="animal">
        <option selected value>Qualquer</option>
        <#list animais as animal>
            <option value="${animal}">${animal?capitalize}</option>
        </#list>
    </select>

    <input type="submit" value="Buscar" />
</form> 