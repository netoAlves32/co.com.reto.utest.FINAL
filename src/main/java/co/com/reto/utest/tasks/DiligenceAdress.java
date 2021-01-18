package co.com.reto.utest.tasks;

import co.com.reto.utest.userinterface.UTestDiligenceAdressPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligenceAdress implements Task {

    public static DiligenceAdress onTheForm() {
        return Tasks.instrumented(DiligenceAdress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Quibdo").into(UTestDiligenceAdressPage.INPUT_CITY),
                Enter.theValue("270002").into(UTestDiligenceAdressPage.INPUT_POSTAL_CODE),
                Click.on(UTestDiligenceAdressPage.DEFINE_COUNTRY),
                Click.on(UTestDiligenceAdressPage.SELECT_COUNTRY),
                Click.on(UTestDiligenceAdressPage.NEXT_STEP_BUTTON)

        );
    }
}
