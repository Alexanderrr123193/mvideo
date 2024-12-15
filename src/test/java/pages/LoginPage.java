package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private final SelenideElement loginFormHeader = $("mvid-login-form-phone form h2");

    public void verifyLoginFormHeader(String expectedHeader) {
        loginFormHeader.shouldHave(Condition.text(expectedHeader));
    }
}