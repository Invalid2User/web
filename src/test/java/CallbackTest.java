import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CallbackTest {

    @Test
    void shouldTestRight() {
        open("http://localhost:9999/");
//        SelenideElement form = $("[data-test-id=callback-form]");
        $("[data-test-id=name] input").setValue("Анастасия");
        $("[data-test-id=phone] input").setValue("+79819818181");
        $("[data-test-id=agreement]").click();
        $(".button").click();

        $("[data-test-id='order-success']").shouldHave(text("  Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время."));
    }
}
