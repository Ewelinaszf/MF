package page.objects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class FormEditor extends HomePage{
    private HomePage homePage;
    private FormEditorNavBar formEditorNavBar;
    private FormEditorMainSection formEditorMainSection;
    private FormEditorRightSectionBar formEditorRightSectionBar;

    public FormEditor(WebDriver driver) {
        super(driver);
        this.formEditorMainSection = new FormEditorMainSection(driver);
        this.formEditorRightSectionBar = new FormEditorRightSectionBar(driver);
        this.formEditorNavBar = new FormEditorNavBar(driver, homePage);
        PageFactory.initElements(driver, this);
    }

    public FormEditorMainSection getFormEditorMainSection() {
        return this.formEditorMainSection;
    }

    public FormEditorNavBar getFormEditorNavBar() {
        return formEditorNavBar;
    }

    public FormEditorRightSectionBar getFormEditorRightSectionBar() {
        return formEditorRightSectionBar;
    }
}
