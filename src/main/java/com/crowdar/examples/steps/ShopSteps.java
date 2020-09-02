package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.GoogleHomePage;
import com.crowdar.examples.pages.GoogleSearchResultPage;
import io.cucumber.java.en.*;
import io.cucumber.java.*;
import org.testng.Assert;

public class ShopSteps extends PageSteps {

    @Given ("el cliente se encuentra en la pagina de Home")
    public void elClienteEeEncuentraEnLaPaginaDeHome(){}

    @When ("el cliente hace click en el boton (.*)")
    public void elClienteHaceClickEnElBoton(){}

    @Then ("El cliente verifica que fue redireccionado a la pantalla de (.*))")
    public void elClienteVerificaQueFueRedireccionadoALaPantallaDeLogin(){}

    @When ("el cliente ingresa su email: (.*)")
    public void elClienteIngresaSuEmail(String email){}

    @And ("el cliente ingresa su password: {int}")
    public void elClienteIngresaSuPassword(int arg0){}

    @And ("el cliente hace click en el botón (.*)")
    public void elClienteHaceClickEnElBoton(){}

    @Then ("el cliente verifica que fue redireccionado a la pantalla de My Account")
    public void elClienteVerificaQueFueRedireccionadoALaPantallaDeMyAccount(){}
}
