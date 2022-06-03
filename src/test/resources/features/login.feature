#language:pt

@login
Funcionalidade: Login
  Eu como usuario do sistema
  Quero fazer login
  Para fazer uma compra no site

  Contexto: Acessar aplicacao
    Dado que estou na tela de login

  @login-sucesso
  Cenario: Login com sucesso
    Quando preencho login "email_user" e senha "password_user"
    E clico em Login
    Entao sou logado na aplicacao

  @login-campos-vazios
  Esquema do Cenario: Login com dados vazios
    Quando preencho login "<user>" e senha "<password>" incorretamente
    E clico em Login
    Entao vejo a "<mensagem>" de campo nao preenchido
    Exemplos:
      | user            | password | mensagem         |
      |                 | teste    | E-mail inválido. |
      | teste@gmail.com |          | Senha inválida.  |
      |                 |          | E-mail inválido. |