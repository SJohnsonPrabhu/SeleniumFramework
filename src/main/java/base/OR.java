package base;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class OR {

	// Login Page Elements
	public static By username = By.xpath("//input[@type='email']");
	public static By password = By.xpath("//input[@type='password']");
	public static By login = By.className("submitbutton");

	// Home Page Elements
	public static By leads = By.xpath("//*[contains(text(),'Leads')]");
	public static By tasks = By.xpath("//*[contains(text(),'Tasks')]");
	public static By tasksShowMore = By.xpath("//*[contains(@class,'ace-icon ent-home-ace_more more_icon')]");
	public static By noMoreTasks = By.xpath("//*[contains(@class,'ace-icon ent-home-arrow-top more_icon')]");
	public static By firstTaskPersonIcon = By.xpath("//*[contains(@class,'ace-icon ent-home-applicant usericon')]");
	public static By enrollments = By.xpath("//*[contains(text(),'Enrollments')]");
	public static By profileImage = By.xpath("//*[contains(@class,'child-img')]");
	public static By logout = By.xpath("//*[contains(@class,'ace-icon ent-home-ace-logout usericon')]");
	public static By logoutConfirmation = By.xpath("//*[contains(text(),'YES')]");

	// Leads Page Elements
	public static By leadsSelectAll = By.xpath(
			"//*[@id=\"root\"]/div/div[2]/div/div[5]/div[2]/div[1]/div[2]/div/div[2]/div/div[1]/div[1]/div/input");
	public static By leadsExport = By.xpath("//*[contains(text(),'Export')]");
	public static By leadsExportToExcel = By
			.xpath("//*[contains(@class,'ace-icon ent-home-ace_excel export-icon excel-icon')]");
	public static By leadsExportToPdf = By
			.xpath("//*[contains(@class, 'ace-icon ent-home-ace_pdf export-icon pdf-icon')]");

	// Enrollments Page Elements
	public static By enrollStudentImage = By.xpath("//*[contains(@class,'enroll-profile-img')]");
	public static By enrollStudentName = By.xpath("//*[contains(@class,'student-name enrolled-student-name')]");
	public static By enrollDocuments = By
			.xpath("//*[contains(@class,'ace-icon ent-home-ace_documents sectionicon indicate-icon')]");
	public static By enrollUpload = By.xpath("//input[@class='upload-file']");

	// Keyboard Actions
	public static Keys escapeKey = Keys.ESCAPE;
	public static Keys altKey = Keys.ALT;
	public static Keys tabKey = Keys.TAB;
	public static Keys endKey = Keys.END;
	public static Keys controlKey = Keys.CONTROL;

	// public static By = By.;
	// public static Keys = Keys.;

}
