package co.com.choucair.certification.proyectobase.stepdefinitions;

import co.com.choucair.certification.proyectobase.tasks.OpenUp;
import co.com.choucair.certification.proyectobase.tasks.login;
import cucumber.api.PendingException;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.mockito.stubbing.Answer;

import static org.mockito.stubbing.Answer.*;


public class ChoucairAcademyStepDefinitions {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than brandon wants to learn automation at the academy choucair$")
    public void thanBrandondonwantstolearnautomationattheacademychoucair() {
        OnStage.theActorCalled("Brandon").wasAbleTo(OpenUp.thepage(), (login.onThePage()));

    }
@When("^he search for the course Recursos Automatización Bancolombia on the choucair academmy platform$")
    public void hesearchforthecourseRecursosAutomatizaciónBancolombiaonthechoucairacademmyplatform(String course){
        OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
}
@Then("^he find the course called resuorce Recusrsos Autometización Bancolombia$")
    public void hefindthecoursecalledresuorceRecusrsosAutometizaciónBancolombia$(String question ) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.registerNatives(question)));

}


}
