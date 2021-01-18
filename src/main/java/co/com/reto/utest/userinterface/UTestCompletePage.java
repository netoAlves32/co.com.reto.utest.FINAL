package co.com.reto.utest.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UTestCompletePage {
    public static final Target CHECKBOX_1= Target.the("Checkbox for confirm the agree with the uTest's Terms of Use ").located(By.id("termOfUse"));
    public static final Target CHECKBOX_2= Target.the("Checkbox for confirm the agree with the uTest's Privacy & Security Policy").located(By.id("privacySetting"));
    public static final Target COMPLETE_BUTTON = Target.the("button that shows us the successful creation message").located(By.xpath("//a[contains(@class,'btn btn-blue')]"));

}
