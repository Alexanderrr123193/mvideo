package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private final SelenideElement cartButton = $(".nav-tabs .nav-tab.tab-cart");
    private final SelenideElement emptyCartMessage = $(".cart-empty__title");
    @Step("Открыть корзину")
    public void openCart() {
        cartButton.click();
    }
    @Step("Проверить сообщение о пустой корзине: {expectedMessage}")
    public void verifyEmptyCartMessage(String expectedMessage) {
        emptyCartMessage.shouldHave(Condition.text(expectedMessage));
    }
}