package definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class hooks {
    public static WebDriver driver;

    @Before
    public static void setUp(){
        //Vamos a decirle donde esta ubicado nuestro driver
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver");
        //Inicializamos la variable driver
        driver = new ChromeDriver();
        //Maximizamos la ventana del navegador
        driver.manage().window().maximize();
    }
    @After
    public  static void tearDown(){
        //para borrar todas las cookies cada vez que se termine las pruebas
        driver.manage().deleteAllCookies();
        //cerramos el navegador
        driver.close();
    }

}
