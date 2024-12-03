package tests;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byTagAndText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubTest {

    @Test

    void loadEnterprisesPageTest (){
        open("https://github.com");
        $(byTagAndText("button","Solutions")).hover();
        $(byTagAndText("a","Enterprises")).click();
        $("#hero-section-brand-heading").shouldHave(text("The AI-powered developer platform"));




    }




}
