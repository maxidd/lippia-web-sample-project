Feature: Como cliente quiero ingresar las credenciales de mi cuenta, para ingresar al sitio de compras

  @Login
  Scenario: el cliente inica sesion en el sitio de compras
    Given el cliente se encuentra en la pagina de Home
    When el cliente hace click en el botón Sign in
    Then El cliente verifica que fue redireccionado a la pantalla de Login

    When el cliente ingresa su email: luisjivillalba@gmail.com
    And el cliente ingresa su password: asd123
    And el cliente hace click en el botón Sig in
    Then el cliente verifica que fue redireccionado a la pantalla de My Account