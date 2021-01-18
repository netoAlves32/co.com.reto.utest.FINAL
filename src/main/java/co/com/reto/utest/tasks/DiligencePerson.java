package co.com.reto.utest.tasks;


import co.com.reto.utest.userinterface.UTestDiligencePersonPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligencePerson implements Task {

    public static DiligencePerson onTheForm() {
        return Tasks.instrumented(DiligencePerson.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UTestDiligencePersonPage.JOIN_BUTTON),
                Enter.theValue("Luz").into(UTestDiligencePersonPage.INPUT_FIRST_NAME),
                Enter.theValue("Palacios").into(UTestDiligencePersonPage.INPUT_LAST_NAME),
                Enter.theValue("lo@gmail.com").into(UTestDiligencePersonPage.INPUT_EMAIL),
                Click.on(UTestDiligencePersonPage.SELECT_BIRTH_MONTH),
                Click.on(UTestDiligencePersonPage.SELECT_BIRTH_MONTH_2),
                Click.on(UTestDiligencePersonPage.SELECT_BIRTH_DAY),
                Click.on(UTestDiligencePersonPage.SELECT_BIRTH_DAY_2),
                Click.on(UTestDiligencePersonPage.SELECT_BIRTH_YEAR),
                Click.on(UTestDiligencePersonPage.SELECT_BIRTH_YEAR_2),
                Click.on(UTestDiligencePersonPage.NEXT_STEP_BUTTON)
                );
    }
}
