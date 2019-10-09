package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.Fields;
import page.objects.HomePage;

import java.util.Arrays;

import static org.testng.Assert.assertTrue;

public class SaveForm extends BaseTest {

    @Test
    public void saveForm() throws InterruptedException {

        this.page = new HomePage(this.driver);

        this.page = ((HomePage) this.page).createNewForm("CIT-14")
                .getFormEditorMainSection().addField(Fields.wprowadzania)
        .getFormEditorNavBar()
        .openFillingField()
        .getFillingFieldButtonActions()
        .openSimplifiedPreview()

        ;


    }
}
