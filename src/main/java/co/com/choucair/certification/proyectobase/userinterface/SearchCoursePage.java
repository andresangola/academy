package co.com.choucair.certification.proyectobase.userinterface;

import net.serenitybdd.core.pages.PageObjects;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchCoursePage extends pageObject {
    public static final Target BUTTON_UC = Target.the("Universidad Choucair")
            .located(By.xpath());
    public static final Target INPUT_COURSE = Target.the("BUSCAR CURSO")
            .located(By.id("courseserchbox"));
    public static final Target BUTTON_GO = Target.the("Da Click para buscar el Curso")
            .located(By.id("//Button[@Class'btn btn']));
    public static final Target SELECT_COURSE = Target.the("Choucair")
            .located(By.xpath());
    public static  final Target NAME_COURSE;
}
