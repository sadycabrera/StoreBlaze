Feature: Login

  @login
  Scenario Outline: Login exitoso
    Given El "Cliente" se encuentra en la pagina de la tienda online
    When Se Loguea ingresando su "<user>" y "<pass>"
    Then Deberia ingresar con exito "<message>"

    Examples:
      | user           | pass  | message                |
      | pruebas02_0409 | 12345 | Welcome pruebas02_0409 |