package co.com.reto.utest.tasks;
import co.com.reto.utest.userinterface.UTestCompletePage;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class Complete implements Task {
    public static Complete theRegister() {
        return Tasks.instrumented(Complete.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestCompletePage.CHECKBOX_1),
                Click.on(UTestCompletePage.CHECKBOX_2),
                Click.on(UTestCompletePage.COMPLETE_BUTTON)
        );

    }
}
