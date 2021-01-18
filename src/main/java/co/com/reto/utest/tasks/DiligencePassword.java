package co.com.reto.utest.tasks;


import co.com.reto.utest.userinterface.UTestDiligencePasswordPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class DiligencePassword implements Task {
    public static DiligencePassword onTheForm() {
        return Tasks.instrumented(DiligencePassword.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("THETESTISREADYthetestisready1234").into(UTestDiligencePasswordPage.INPUT_PASSWORD),
                Enter.theValue("THETESTISREADYthetestisready1234").into(UTestDiligencePasswordPage.CONFIRM_PASSWORD)
        );

    }
}
