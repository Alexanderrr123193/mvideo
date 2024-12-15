import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
//import pages.MvideoPage;
import pages.*;

public class MvideoTest extends TestBase {

    MvideoPage mvideoPage = new MvideoPage();
    HairStylingProductsPage hairStylingProductsPage = new HairStylingProductsPage();
    CartPage cartPage = new CartPage();
    ProfilePage profilePage = new ProfilePage();
    LoginPage loginPage = new LoginPage();

    @DisplayName("Check cart on main page")
    @Test
    public void testCart() {
        mvideoPage.openMainPage();
        mvideoPage.closeCityPopup();
        cartPage.openCart();
        cartPage.verifyEmptyCartMessage("Корзина пуста");
    }

    @DisplayName("Check visible number phone on main page")
    @Test
    public void testPhone() {
        mvideoPage.openMainPage();
        mvideoPage.closeCityPopup();
        mvideoPage.checkPhoneNumber();
    }

    @DisplayName("Check visible profile on main page")
    @Test
    public void testVisibleProfile() {
        mvideoPage.openMainPage();
        mvideoPage.closeCityPopup();
        profilePage.verifyProfileButton();
    }

    @DisplayName("Check the ability to log in to the site")
    @Test
    public void testVisibleProfileToLogInToTheSite() {
        mvideoPage.openMainPage();
        mvideoPage.closeCityPopup();
        profilePage.clickProfileButton();
        loginPage.verifyLoginFormHeader("Вход или регистрация");
    }

    @DisplayName("Checking the availability of the product category")
    @Test
    public void testCheckProductCategory() {
        mvideoPage.openMainPage();
        mvideoPage.closeCityPopup();
        mvideoPage.checkProductCategoryAvailability();
        hairStylingProductsPage.checkCategoryPageTitle("Товары для укладки волос");
    }
}