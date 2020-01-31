
import com.codeborne.selenide.Configuration;
import io.qameta.allure.Allure;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;
public class vkTest {
    @Step
    @Test
    @DisplayName("Egor")
    public void OpenWindowsChrome() {
        open("http://172.16.1.61/tek/Login.aspx"); // Переходит по URL


    }
}
