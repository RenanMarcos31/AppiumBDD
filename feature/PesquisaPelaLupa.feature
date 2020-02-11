#language:pt
#coding:utf-8

@PesquisaPelaLupa
Funcionalidade: Pesquisar produto pela lupa
  
  Contexto: Inicia o palicativo
  Dado que o aplicativo é iniciado

  @PesquisaLupa1
  Cenario: Pesquisa pela lupa com sucesso
    Quando pesquiso um produto pela barra 
    E clico nele 
    Entao abre  a tela do produto

  @PesquisaLupa2
  Cenario: Pesquisa produto inexistente
    Quando fasso a pesquisa do produto pela barra
    Então aparece a messangem produto não encontrado 

