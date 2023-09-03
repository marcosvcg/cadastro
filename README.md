# Programação Web - Trabalho AV1
Formulário em JSP com uma lógica backend em Java.


O formulário tem a função de mostrar uma lista de coordenadores para o usuário, sendo capaz de adicionar, remover ou alterar coordenadores.
O projeto contém três JSPs, três classes 'Controller' e três classes modelo em Java, além dos arquivos CSS para o estilo das páginas.

# Como executar o projeto:

1. Abra o Eclipse Web
2. Importe o projeto via "File" -> "Import" -> "Maven" -> "Existing Maven Projects" -> "Browse" -> Diretório onde se localiza a aplicação
3. Adicione o projeto ao servidor de sua máquina.
4. Inicie o servidor
5. Abra seu navegador e vá para "localhost:8080/cadastro/"
6. Pronto! De início você verá uma lista vazia, mas você pode clicar no botão "Adicionar Coordenador" para começar a adicionar informações.
7. (OPCIONAL) Caso você deseje remover ou alterar os dados de um Coordenador, os botões "Excluir" e "Atualizar" estarão prontos você. 


# Funcionalidades:

• JSP:

- "form.jsp" = responsável por salvar os dados do formulário e enviá-los para a classe "CadastrarController.java" via método POST.
- "lista.jsp" = mostra os dados reccebidos pelo "CadastrarController.java", possibilitando também o administrador atualizar ou excluir dados.
- "atualizar.jsp" = recebe os dados através do "AtualizarController.java" e preenche as caixas de texto no formulário para o administrador atualizá-los.

• Java:

- "Coordenador.java" = classe Coordenador, com seus respectivos atributos "String nome", "int id", "Curso curso" e "Periodo periodo".
- "Curso.java" = classe Curso que possui o atributo "String disciplina".
- "Periodo.java" = classe Periodo que possui os atributos "String dia, "String horarioInicial" e "String horarioFinal;"
- "CadastrarController.java" = classe responsável por criar a lista de coordenadores e adicionar os dados, via "request.getParameter()". Assim, caso os dados do nome, curso e do periodo não sejam nulos, essa classe instancia um novo coordenador e o adiciona a lista de coordenadores. Por fim, ela envia o usuário de volta para a página principal para mostrar os dados ao mesmo.
- "ExcluirController.java" = remove um coordenador da lista através do método GET que recebe o id do coordenador específico e o exclui da lista, posteriormente redirecionando o usuário de volta para a lista de coordenadores.
- "AtualizarController.java" = classe que atualiza os dados de um coordenador. Primeiro, ela receberá o id do coordenador que terá seus dados atualizados via método GET e enviará os dados para o JSP "atualizar.jsp". Esse JSP receberá as informações do coordenador, preencherá as caixas de inserção de texto com as informações prévias e após o administrador alterar os dados, eles serão enviados do "atualizar.jsp" de volta para a classe "AtualizarController.java" via método POST, possibilitando com que a classe salve os dados atualizados, redirecionando o usuário de volta à lista de coordenadores.
