package Tests;

import org.testng.Assert;
import org.testng.annotations.Test;



public class LoginTests extends TestBase {

    @Test
    public void loginPositiveTest(){
        String email = "ade@fdg.com";
        String password = "$Abcde123456";
        app.getUser().openLoginRegistrationForm();
        app.getUser().fillLoginRegistrationForm(email, password);
        app.getUser().submitLogin();
        Assert.assertTrue(app.getUser().isLogged());
    }

    @Test
    public void loginNegativeTestWrongEmail(){
        String email = "abcdefdg.com";
        String password = "$Abcde123456";
        app.getUser().openLoginRegistrationForm();
        app.getUser().fillLoginRegistrationForm(email, password);
        app.getUser().submitLogin();
    }


}
