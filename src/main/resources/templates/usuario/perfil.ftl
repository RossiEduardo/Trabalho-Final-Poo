<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <#include "/components/meta.ftl"/>
        <title>allPet - Perfil</title>

        <style>
            h3 {
                font-size: 24px;
                margin-bottom: 10px;
            }

            #form-atualizar-perfil {
                margin-bottom: 15px;
            }
            
            .form-excluir-anuncio input[type=submit] {
                margin: 0;
                
            }

            hr {
                margin: 18px 0 10px;
            }
        </style>
    </head>
    <body class="preload">
        <#include "/components/header.ftl"/>
        <#include "/components/user-space.ftl"/>

        <main>
            <div id="main-content">
                <h2>Perfil</h2>

                <#if sucesso?? && retorno??>
                    <p class="${sucesso?then('mensagem-sucesso','mensagem-erro')}">${retorno}</p>
                </#if>

                <h3>Meu usuário</h3>

                <form action="/perfil" method="post" id="form-atualizar-perfil">
                    <label for="nome">Nome</label>
                    <input maxlength="100" type="text" name="nome" value="${usuario.nome}" />

                    <label for="cidade">Cidade</label>
                    <input maxlength="100" type="text" name="cidade" value="${usuario.cidade}" />
                    
                    <label for="cpf">CPF</label>
                    <input maxlength="30" size="" type="text" name="cpf" value="${usuario.cpf}" />

                    <label for="telefone">Telefone</label>
                    <input maxlength="30" type="tel" name="telefone" value="${usuario.telefone}" />
                    
                    <label for="email">E-mail</label>
                    <input maxlength="64" type="email" name="email" value="${usuario.email}" />

                    <label for="senha">Senha</label>
                    <input maxlength="100" type="password" name="senha" />
                    
                    <input type="submit" value="Salvar" />
                </form>

                <h3>Minhas postagens</h3>

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
                        <form action="/anuncio/delete" method="post" class="form-excluir-anuncio">
                            <input type="hidden" name="idAnuncio" value="${anuncio.id}" />
                            <input type="submit" value="Excluir"/>
                        </form>
                        <hr/>
                    </#list>
                </ul>

            </div>
        </main>
    </body>
</html>
