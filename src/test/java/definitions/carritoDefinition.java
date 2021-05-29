package definitions;

import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import pageobjects.menuPage;
import pageobjects.tarjetaPage;

public class carritoDefinition {
    menuPage menu;
    tarjetaPage tarjeta;

    public carritoDefinition() {
        menu = new menuPage();
        tarjeta = new tarjetaPage();
    }

    @Dado("que la web esta operativa")
    public void queLaWebEstaOperativa() {
        hooks.driver.get("http://demo.guru99.com/payment-gateway/purchasetoy.php");
    }

    @Cuando("generar el numero de tarjeta")
    public void generarElNumeroDeTarjeta() {
        menu.clickGenerarTarjeta();
        tarjeta.ventanaActiva();
        tarjeta.obtenerNroTarjeta();
        tarjeta.obtenerCvv();
        tarjeta.obtenerFecha();
        tarjeta.ventanaInicial();
    }
}
