package com.crowdar.examples.steps;

import com.crowdar.core.Injector;
import com.crowdar.core.PageSteps;
import com.crowdar.examples.pages.ShopHomePage;
import com.crowdar.examples.pages.ShopLoginPage;
import io.cucumber.java.en.*;

public class ShopSteps extends PageSteps{
    @Given ("el cliente se encuentra en la pagina de Home")
    public void elClienteEeEncuentraEnLaPaginaDeHome(){
        Injector._page(ShopHomePage.class).go();
        Injector._page(ShopHomePage.class).verifyHome();
    }

    @When("el cliente hace click en el botón(.*)")
    public void elClienteHaceClickEnElBoton(String button) {
            Injector._page(ShopHomePage.class).clickSigninButton();
        }else{
            Injector._page(ShopLoginPage.class).clickButtonSignIn();
        }
    }

    @Then("el cliente verifica que fue redireccionado a la pantalla de (.*)")
    public void elClienteVerificaQueFueRedireccionadoALaPantallaDe(String pantalla) {
        Injector._page(ShopLoginPage.class).verifyPage(pantalla);

    }

    @When("el cliente ingresa su email: (.*)")
    public void elClienteIngresaSuEmail(String email) {
        Injector._page(ShopLoginPage.class).completeEmail(email);
    }

    @And("el cliente ingresa su password: (.*)")
    public void elClienteIngresaSuPassword(String pass) {
        Injector._page(ShopLoginPage.class).completePassword(pass);
    }
}
