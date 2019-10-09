package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.objects.*;

import java.util.concurrent.TimeUnit;

public class CheckingAddingFields extends BaseTest {
    private int firstValue;
    private int secondValue;
    private int thirdValue;
    @Test
    public void addProgrammingRule() throws InterruptedException {


//        this.page = new HomePage(this.driver);
//
//        this.page = ((HomePage) this.page).createNewForm("CIT-14");
//
//        ((FormEditor) this.page)
//                .getFormEditorMainSection()
//                .addField(Fields.wprowadzania);
//        ((FormEditor) this.page)
//                .getFormEditorMainSection()
//                .addField(Fields.wprowadzania);
//        ((FormEditor) this.page)
//                .getFormEditorMainSection()
//                .addField(Fields.wprowadzania);
//
//
//        ((FormEditor) this.page).
//                getFormEditorMainSection()
//                .clickOnEnteringField(1);
//
//        ((FormEditor) this.page)
//                .getFormEditorRightSectionBar()
//                .changeTypeOfInputField(Types.Liczba);
//
//        ((FormEditor) this.page).
//                getFormEditorMainSection()
//                .clickOnEnteringField(2);
//
//        ((FormEditor) this.page)
//                .getFormEditorRightSectionBar()
//                .changeTypeOfInputField(Types.Liczba);
//
//        ((FormEditor) this.page).
//                getFormEditorMainSection()
//                .clickOnEnteringField(3);
//
//        ((FormEditor) this.page)
//                .getFormEditorRightSectionBar()
//                .changeTypeOfInputField(Types.Liczba);
//
//        ((FormEditor) this.page)
//                .getFormEditorRightSectionBar()
//                .setProgrammingRule("references(['PoleWprowadzania1', 'PoleWprowadzania2']),\n" +
//                                "calculated(({num}) => num['PoleWprowadzania1'] + num['PoleWprowadzania2'])\n");
//
//
//       Thread.sleep(5000);
//       firstValue= (((FormEditor) this.page))
//                .getFormEditorNavBar()
//                .openFillingField()
//                .getFillingFieldMainSection()
//                .enterValue(1);
//
//        secondValue =(((FormEditor) this.page))
//                .getFormEditorNavBar()
//                .openFillingField()
//                .getFillingFieldMainSection()
//                .enterValue(2);
//
//        thirdValue =
//                Integer.parseInt((((FormEditor) this.page))
//                .getFormEditorNavBar()
//                .openFillingField()
//                .getFillingFieldMainSection()
//                .findField(3).getAttribute("value"));
//
//        Assert.assertEquals(firstValue+secondValue, thirdValue);
//        Thread.sleep(5000);
    }
}