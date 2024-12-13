import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MvideoTest extends TestBase {
    @DisplayName("Check cart on site")
    @Test
    public void testCart() {
        Selenide.open("https://www.mvideo.ru");
        Selenide.$(".nav-tabs .nav-tab.tab-cart").click();


    }
}
