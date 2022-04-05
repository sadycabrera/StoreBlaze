Feature: Registro

  @registro
  Scenario Outline: Registro exitoso
    Given El "Cliente" se encuentra en la pagina de la tienda online
    When Se registra ingresando su "<user>" y "<pass>"
    Then Deberia registrarse con exito "<message>"

    Examples:
      | user           | pass  | message             |
      | pruebas02_0409 | 12345 | Sign up successful. |