#language:pt

@cadastro
Funcionalidade: Cadastro de usuario
  Eu como futuro usuario do sistema
  Quero me cadastrar
  Para finalizar compra no site

  @cadastro-nome-vazio
  Cenario: Nome do usuario vazio
    Dado que estou na tela de login
    Quando acesso a tela de cadastro de usuario
    E clico em cadastrar
    Entao vejo mensagem de campo nome nao preenchido