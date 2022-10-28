# language: pt

  @cadastro
  Funcionalidade: Cadastro de usuário

    @cadastro_sucesso
    Cenario: Registrar novo usuario com sucesso
      Dado que estou na tela de login
      E acesso o cadastro de usuario
      Quando eu preencho o formulario de cadastro
      E clico em registrar
      Entao vejo cadastro realizado com sucesso