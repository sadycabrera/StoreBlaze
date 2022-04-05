Feature: Agrega producto

  @agregaProducto
  Scenario Outline: Agrega producto
    Given El "Cliente" se encuentra en la pagina de la tienda online
    When Agrega el producto "<product>"
    Then Deberia agregarse el "<product>" y el "<precio>"

    Examples:
      | product           | precio |
      | Samsung galaxy s6 | 360    |