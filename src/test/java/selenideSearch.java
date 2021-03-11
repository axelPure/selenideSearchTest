import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class selenideSearch {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void selenideSearch(){
        //todo открыть страницу гит
            open("https://github.com/");
        //todo вбить в поиск selenide и отправить запрос
            $("[name=q]").setValue("selenide").pressEnter();
        //todo открыть первый из списка
            $$("ul.repo-list li").first().$("a").click();
        //todo проверить в заголовке selenide / selenide
            $("h1").shouldHave(Condition.text("selenide / selenide"));
        //todo перейти на страницу wiki
            $("[data-tab-item=i4wiki-tab").click();
        //todo проверить что в Pages есть SoftAssertions
            $("#wiki-pages-box").shouldHave(Condition.text("SoftAssertions"));
        //todo открыть SoftAssertions
            $(byText("SoftAssertions")).click();
        //todo проверить что внутри есть пример кода для JUnit5
            $(".markdown-body").shouldHave(Condition.text("Using JUnit5"));
    }


}
