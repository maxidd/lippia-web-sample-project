Feature: Como cliente quiero ingresar las credenciales de mi cuenta, para ingresar al sitio de compras

  @Login
  Scenario: el cliente inica sesion en el sitio de compras
    Given el cliente se encuentra en la pagina de Home
    When el cliente hace click en el botón Sign in
    Then el cliente verifica que fue redireccionado a la pantalla de Login

    When el cliente ingresa su email: dminguez33@gmail.com
    And el cliente ingresa su password: password
    And el cliente hace click en el botón Sign in del login
    Then el cliente verifica que fue redireccionado a la pantalla de My Account