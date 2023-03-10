package ru.stqa.pft.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import ru.stqa.pft.addressbook.model.ContactData;

public class ContactHelper extends ContactBase {

  public ContactHelper(WebDriver wd) {
    super(wd);
  }

  public void returnToContactPage() {
    click(By.linkText("home page"));
  }

  public void submitContactCreation() {
    click(By.xpath("//input[21]"));
  }

  public void fillContactForm(ContactData contactData) {
    type(By.name("firstname"), contactData.getFirstName());
    type(By.name("lastname"), contactData.getLastName());
    type(By.name("address"), contactData.getAddress());
    type(By.name("home"), contactData.getTelephoneHome());
    type(By.name("mobile"), contactData.getTelephoneMobile());
    type(By.name("email"), contactData.getEmail());
  }

  public void gotoNewCreationContactPage() {
    click(By.linkText("add new"));
  }

  public void DeleteContact() {
    click(By.xpath("//img[@alt='Edit']"));
    click(By.xpath("//div[@id='content']/form[2]/input[2]"));
  }

  public void selectContactModification() {
    click(By.xpath("//img[@alt='Edit']"));
  }

  public void updateContactModification() {
    click(By.xpath("//div[@id='content']/form/input[22]"));
  }

  public void createContact(ContactData contact) {
    fillContactForm(contact);
    submitContactCreation();
    returnToContactPage();
  }


  public boolean isThereAContact() {
    return isElementPresent(By.linkText("home page"));
  }

}
