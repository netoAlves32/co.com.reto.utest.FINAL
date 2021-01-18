package co.com.reto.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestDiligencePasswordPage {
    public static final Target INPUT_PASSWORD = Target.the("Where do we write the password").located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Where do we rewrite the password").located(By.id("confirmPassword"));
}
