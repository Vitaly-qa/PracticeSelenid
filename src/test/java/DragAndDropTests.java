package tests;

import com.codeborne.selenide.DragAndDropOptions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.DragAndDropOptions.to;
import static com.codeborne.selenide.Selenide.*;

public class DragAndDropTests {
    @Test

    void DragAndDropTests (){
    open("https://the-internet.herokuapp.com/drag_and_drop");
    $("#column-a").dragAndDrop(DragAndDropOptions.to("#column-b"));
    $("#column-a").shouldHave(text("B"));
    $("#column-b").shouldHave(text("A"));
    sleep(5000);
    }

}
