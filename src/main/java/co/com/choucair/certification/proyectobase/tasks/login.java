package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairLoginPage;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.AnonymousTask;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class login implements Task {
    public static AnonymousTask onThePage() {
        return Task.where(login.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(ChoucairLoginPage.LOGIN_BUTTON));
        Enter.theValue(1144076171).into(ChoucairLoginPage.INPUT_USER);
        Enter.theValue("Choucair2021*").into(ChoucairLoginPage.INPUT_PASSWORD);
        Click.on((WebElementFacade) ChoucairLoginPage.ENTER_BUTTON);
        );
    }
}
