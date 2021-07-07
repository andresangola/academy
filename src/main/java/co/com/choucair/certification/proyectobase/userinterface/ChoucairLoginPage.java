package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.annotations.findby.By;

import java.lang.annotation.Target;

public class ChoucairLoginPage extends pageObject{
    private static Object targetElementName;
    public static final Target LOGIN_BUTTON = Target.the(targetElementName "button that shows us the form to login")
            .located(By.xpath("//div[@class='d-one d-lg-block']//strong[contains(text(),'ingresar')]"));
    public static final Target INPUT_USER = Target.the(targetElementName "where do we write the user")
            .located(By.id("username"));
    public static final Target INPUT_PASSWORD = Target.the(targetElementName "PASSWORD")
            .located(By.id("PASSWORD"));
    public static final Target ENTER_BUTTON = Target.the(targetElementName "BOTTON CONFIG")
            .located(By.xpath("PASSWORD"));
}
