package co.com.reto.utest.tasks;

import co.com.reto.utest.userinterface.UTestDiligenceDevicesPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class DiligenceDevices implements Task {
    public static DiligenceDevices onTheForm() {
        return Tasks.instrumented(DiligenceDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UTestDiligenceDevicesPage.DEFINE_SO_COMPUTER),
                Click.on(UTestDiligenceDevicesPage.SELECT_SO_COMPUTER),
                Click.on(UTestDiligenceDevicesPage.DEFINE_SO_VERSION),
                Click.on(UTestDiligenceDevicesPage.SELECT_SO_VERSION),
                Click.on(UTestDiligenceDevicesPage.DEFINE_SO_LANGUAGE),
                Click.on(UTestDiligenceDevicesPage.SELECT_SO_LANGUAGE),
                Click.on(UTestDiligenceDevicesPage.DEFINE_MARKER_DEVICE),
                Click.on(UTestDiligenceDevicesPage.SELECT_MARKER_DEVICE),
                Click.on(UTestDiligenceDevicesPage.DEFINE_MODEL_MAKER),
                Click.on(UTestDiligenceDevicesPage.SELECT_MODEL_MAKER),
                Click.on(UTestDiligenceDevicesPage.DEFINE_SO_DEVICE),
                Click.on(UTestDiligenceDevicesPage.SELECT_SO_DEVICE),
                Click.on(UTestDiligenceDevicesPage.NEXT_STEP_BUTTON)
        );
    }
}
