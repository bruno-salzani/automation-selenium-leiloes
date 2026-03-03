# 🚀 automation-selenium-leiloes

![Status](https://img.shields.io/badge/Status-Concluído-brightgreen)
![Framework](https://img.shields.io/badge/Framework-Selenium%20WebDriver-green)
![Stack](https://img.shields.io/badge/Stack-Java%20%7C%20JUnit%205%20%7C%20Maven-blue)

Automação de interface para a Plataforma de Leilões, garantindo qualidade e segurança das principais jornadas do usuário por meio de testes E2E estáveis, legíveis e fáceis de manter.

---

# 🎯 Objetivo do Projeto

Automatizar os cenários críticos do sistema de leilões, incluindo:

- Autenticação de usuários
- Acesso a áreas restritas
- Cadastro de leilões
- Validações de formulário e mensagens de erro

## Foco Principal

- Confiabilidade na regressão
- Padronização e reutilização de código
- Estabilidade contra variações de tempo de carregamento
- Facilidade de execução local e em CI

---

# 🧠 Estratégia de Automação

## Arquitetura da Solução

Camadas e responsabilidades:

1. Page Objects (Modelam as páginas e encapsulam seletores/ações)
2. Testes (Especificam o comportamento esperado)
3. Infra de teste (Classe base PageObject e configuração do WebDriver)
4. Aplicação SUT (Spring Boot com H2 em memória)
5. Relatórios JUnit gerados pelo Maven Surefire

Separação clara entre:

- Páginas (login, leilões, cadastro)
- Fluxos de teste (LoginTest, LeiloesTest)
- Configuração de WebDriver e esperas
- Build e reports (pom.xml / target/surefire-reports)

---

## Estratégia Técnica Aplicada

- Padrão Page Object para minimizar duplicação e aumentar legibilidade
- WebDriver do Chrome configurado centralmente em PageObject
- Espera implícita de 5s para sincronização com o DOM
- Validações após cada ação relevante
- Encerramento do navegador no teardown de cada teste

---

# 🔄 Fluxo de Automação

1. Inicia o servidor local da aplicação
2. Abre a tela de login e realiza autenticação
3. Navega para a lista de leilões
4. Carrega o formulário de novo leilão e envia os dados
5. Verifica presença do leilão criado ou mensagens de validação
6. Garante bloqueio de rotas quando não autenticado

---

# 📁 Estrutura do Projeto

```bash
automacao-selenium-leiloes/
├── pom.xml
├── drivers/
│   └── chromedriver.exe
├── src/
│   ├── main/
│   │   ├── java/br/com/alura/leilao/...
│   │   └── resources/application.properties
│   └── test/
│       └── java/br/com/alura/leilao/
│           ├── PageObject.java
│           ├── login/
│           │   ├── LoginPage.java
│           │   └── LoginTest.java
│           └── leiloes/
│               ├── LeiloesPage.java
│               ├── CadastroLeilaoPage.java
│               └── LeiloesTest.java
```

---

# ⚙️ Funcionalidades Automatizadas

## 🔐 Login

- Autenticação com credenciais válidas e inválidas
- Redirecionamento correto em rotas protegidas

---

## 📚 Leilões

- Cadastro de leilões com dados válidos
- Exibição de mensagens para campos inválidos
- Checagem da última linha da tabela para o item criado

---

## 🖥️ Sincronização e DOM

- Espera implícita configurada
- Seletores robustos (CSS/XPath) para elementos críticos

---

# 🧪 Boas Práticas Aplicadas

- Page Object para isolar detalhes de UI
- Testes curtos, descritivos e independentes
- Timeout controlado e encerramento limpo do browser
- Estrutura de pastas previsível e padronizada
- Build determinístico com Maven

---

# 📊 Gestão de Riscos

## Principais Riscos Mitigados

- Flakiness por carregamento/latência
- Acesso indevido a rotas sem autenticação
- Divergência de versão do ChromeDriver
- Dados voláteis entre execuções

## Estratégias de Mitigação

- Espera implícita e navegação dirigida por URLs
- Asserts após cada etapa relevante
- Driver versionado no diretório drivers/
- Banco H2 em memória, reinicializado a cada execução do servidor

---

# 📈 Resultados Alcançados

- Regressão funcional rápida e confiável
- Redução de esforço manual em validações repetitivas
- Aumento da previsibilidade de build e execução
- Base sólida para expansão de cenários

---

# 🛠️ Tecnologias Utilizadas

- Java 8+
- Maven
- Selenium WebDriver (Chrome)
- JUnit 5
- Spring Boot (SUT)
- H2 Database

---

# ▶️ Como Executar

## 1️⃣ Preparar ambiente

- JDK 8+ instalado
- Maven instalado
- Google Chrome instalado
- Baixar o ChromeDriver compatível com sua versão do Chrome e colocá-lo em `automacao-selenium-leiloes/drivers/chromedriver.exe`

## 2️⃣ Subir a aplicação

```bash
cd automacao-selenium-leiloes
mvn spring-boot:run
```

A aplicação sobe em `http://localhost:8080`.

## 3️⃣ Executar os testes

Interface/IDE (Eclipse/IntelliJ):

- Localize `src/test/java`
- Execute as classes `LoginTest` e `LeiloesTest` como JUnit

Linha de comando (Maven):

```bash
mvn -Dtest=*Test test
```

---

# 📄 Relatórios

Relatórios JUnit/Surefire disponíveis em:

- `automacao-selenium-leiloes/target/surefire-reports`

---

# 🚀 Diferenciais Técnicos

- Page Object centraliza seletores e ações
- Classe base unifica configuração do WebDriver
- Testes expressivos e estáveis
- Pronto para integração em pipelines de CI

---

# 🤝 Conclusão

Conjunto de testes E2E para a Plataforma de Leilões, priorizando clareza, estabilidade e manutenção simples. A estrutura facilita a expansão de cenários e a execução previsível em diferentes ambientes.
