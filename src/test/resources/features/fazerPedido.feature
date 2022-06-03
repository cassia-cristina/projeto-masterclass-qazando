#language:pt

@pedido
Funcionalidade: Realizar pedido
  Eu como usuario do sistema
  Quero fazer um pedido
  Para comprar alguma coisa


  Contexto: Fazer login
    Dado que estou logado na aplicacao com user "email_user" e senha "password_user"

  @wip @pedido-sucesso
  Cenario: Fazer um pedido com sucesso
    Quando pesquiso pelo produto "V-Neck Dress"
    E clico no produto "V-Neck Dress"
    E adiciono o item ao carrinho
    Entao valido que o produto foi adicionado ao carrinho