# Automação de Testes com Selenium (Plataforma de Leilões)

Este projeto utiliza o **Selenium com Java** para automatizar testes na **Plataforma de Leilões**, validando o comportamento esperado da aplicação e garantindo sua qualidade através de boas práticas como o padrão **Page Object**.

## Objetivo do Projeto

1. Validar o comportamento das principais funcionalidades da **Plataforma de Leilões**, como login e cadastro de leilões, garantindo que a aplicação atenda aos requisitos.
2. Aplicar boas práticas de automação, incluindo:
   - Uso do padrão **Page Object** para organização e reutilização de código.
   - Testes de telas dinâmicas com AJAX.
   - Automação do preenchimento de formulários e execução do navegador.

## Funcionalidades Testadas

- **Validação de Login**:
  - Teste de login com credenciais válidas e inválidas.
  - Verificação de redirecionamento para a página de login ao acessar áreas restritas sem autenticação.
  
- **Cadastro de Leilões**:
  - Criação de leilões com dados válidos.
  - Validação de mensagens de erro para campos obrigatórios ou preenchidos incorretamente.

- **Teste de Telas com AJAX**:
  - Garante que as interações em tempo real sejam validadas corretamente.

## Tecnologias Utilizadas

- **[Java](https://www.java.com/)**: Linguagem utilizada para desenvolvimento dos testes.
- **[Selenium WebDriver](https://www.selenium.dev/)**: Framework para automação de navegadores.
- **[JUnit 5](https://junit.org/junit5/)**: Framework para execução e organização dos testes.
- **[ChromeDriver](https://sites.google.com/chromium.org/driver/)**: Driver para automação no navegador Google Chrome.

## Vantagens do Selenium Aplicadas

- **Validação de comportamento esperado**: Automatização de testes que garantem a execução correta das funcionalidades.
- **Preenchimento de formulários automaticamente**: Simula interações reais com o usuário.
- **Teste de telas com AJAX**: Garante que atualizações dinâmicas sejam tratadas corretamente.
- **Navegador automatizado**: O Selenium gerencia o ciclo de vida do navegador automaticamente durante os testes.

## Como Executar

### Executar a Aplicação

1. Clone este repositório:
```
git clone https://github.com/seu-usuario/plataforma-leiloes-automation.git
```
2. Importe o projeto para o Eclipse ou a IDE de sua preferência.
3. Certifique-se de que a aplicação está configurada corretamente.
4. Inicie o servidor a partir do arquivo: **br.com.alura.leilao.LeilaoApplication.java** run as java application
5. Acesse a aplicação no navegador através de `http://localhost:8080`.

### Executar os Testes

1. No Eclipse, localize a pasta src/test/java no explorador de projetos.
2. Clique com o botão direito sobre a pasta.
3. Navegue até a opção Coverage As > JUnit Test.
Isso irá rodar os testes e exibir a cobertura de código no painel de cobertura da IDE.

se apresentar erro, pode ser que o driver do chrome esteja em uma versão diferente, neste caso
Configure os drivers necessários, como o chromedriver, no diretório drivers/. utilizando a mesma versão do navegador
