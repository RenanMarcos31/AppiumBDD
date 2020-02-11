#language:pt
#coding:utf-8

@PesquisaPelaTela
Funcionalidade: Pesquisar produto pela tela de inicio
  
  Contexto: aplicativo iniciado
  Dado que o  aplicativo é aberto

  @PesquisaTela1
  Cenario: Pesquisa pela tela com sucesso
    Quando clico em laptops 
    E clico no produto 
    Entao me abre  a tela do produto

  @PesquisaTela2
  Cenario: Quantidade de produtos no carrinho não permitido
    Quando logo no aolicativo
    E clico no menu laptops 
    E clico no produto desejado
    E adiciono no carrinho os produtos 
    Entao o aplicativo nao adiciona tudo  no carrinho
