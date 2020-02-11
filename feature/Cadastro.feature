# language:pt
#coding:utf-8

@Cadastro
Funcionalidade: Fazer cadastro de usuario

Contexto: Iniciar o aplicativo
Dado que inicio o aplicativo

  @Cadastro1
  Cenario: Cadastra usuario com sucesso
    Quando clico no menu login
    E em cadastrar novo usuario
    E lanço os dados de usuario
    | usuario              | email                            | senha       | confirmaSenha | primeiroNome | sobrenome | telefone             | pais    | estado | endereço         | cidade       | cep               |
    | RenanMarcos4 | renan@rsinet.com.br | &Test123 | &Test123           | Renan               | Silva             | 11 990969492 | Brazil |  Sp        | R. Litoral, 297 | São Paulo | 03582-190 |
    Entao clico em registrar e cadastro usuario

  @Cadastro2
  Cenario: Falha no cadastro por email invalido
    Quando quando vou para o menu login 
    E clico cadastrar um novo usuario
    E preencho os dados de usuario
		| usuario              | email      | senha       | confirmaSenha | primeiroNome | sobrenome |
    | RenanMarcos4 | renan23 | &Test123 | &Test123           | Renan               | Silva             | 
    Entao recebo a mensagem de email invalido
    
     
    
