package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ShopHomePage;
import io.cucumber.java.en.*;

public class ShopSteps extends PageSteps{
    @Given ("el cliente se encuentra en la pagina de Home")
    public void elClienteEeEncuentraEnLaPaginaDeHome(){

    }

    @When("el cliente hace click en el botón(.*)")
    public void elClienteHaceClickEnElBotónSignIn() {
        Injector._page(ShopHomePage.class).go();
        Injector._page(ShopHomePage.class).verifyHome();
    }

    @Then("el cliente verifica que fue redireccionado a la pantalla de (.*)")
    public void elClienteVerificaQueFueRedireccionadoALaPantallaDeLogin(String pantalla) {
    }

    @When("el cliente ingresa su email: (.*)")
    public void elClienteIngresaSuEmailLuisjivillalbaGmailCom() {
    }

    @And("el cliente ingresa su password: (.*)")
    public void elClienteIngresaSuPasswordAsd(String arg0) {
    }
}
