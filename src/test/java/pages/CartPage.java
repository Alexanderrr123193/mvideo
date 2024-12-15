package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class CartPage {
    private final SelenideElement cartButton = $(".nav-tabs .nav-tab.tab-cart");
    private final SelenideElement emptyCartMessage = $(".cart-empty__title");

    public void openCart() {
        cartButton.click();
    }

    public void verifyEmptyCartMessage(String expectedMessage) {
        emptyCartMessage.shouldHave(Condition.text(expectedMessage));
    }
}