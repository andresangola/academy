package co.com.choucair.certification.proyectobase.tasks;

import co.com.choucair.certification.proyectobase.userinterface.ChoucairAcademyPege;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.AnonymousTask;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task {
    private Object ChoucairAcademyPege;
    private ChoucairAcademyPege;
    public static AnonymousTask thePage(){
        return Task.where(OpenUp.class);
    }

    public static Performable thepage() {
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(ChoucairAcademyPege));
    }
}
