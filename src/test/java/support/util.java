package support;
import definitions.hooks;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.Set;

public class util extends hooks {
    //variable wait de tiempo de espera wait o tiempo_espera
    public static WebDriverWait wait;

    //creamos un constructor que tiene que se igual al nombre de la clase
    public util() {
        //traemos la variable driver que esta en hook
        wait = new WebDriverWait(driver,30);
    }

    //posicionarnos en la ventana activa
    public void ventanaActiva(){
        //identificar todas las ventanas
        Set<String> identificadores = driver.getWindowHandles();

        //recorremos y guardamos el identificador de cada ventana
        for (String identificador:identificadores){
            driver.switchTo().window(identificador);
        }
    }

    //Regresamos a la pantalla principal
    public void ventanaInicial(){
        driver.close();
        driver.switchTo().window( "");
    }
}
