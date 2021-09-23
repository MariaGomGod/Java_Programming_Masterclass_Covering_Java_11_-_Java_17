import org.junit.Assert;
import org.junit.Test;

public class MobilePhoneTest {

    @Test
    public void givenAnEmptyContactList_whenAddNewContact_itIsAdded() {
        MobilePhone p = new MobilePhone(null);

        boolean result = p.addNewContact(new Contact("María", null));

        Assert.assertTrue(result);
    }

    @Test
    public void givenAContact_whenAddNewContact_itIsAdded() {
        MobilePhone p = new MobilePhone(null);
        p.addNewContact(new Contact("María", null));

        boolean result = p.addNewContact(new Contact("Pedro", null));

        Assert.assertTrue(result);
    }

    @Test
    public void givenAContact_whenAddAnExistingContact_itIsNotAdded() {
        MobilePhone p = new MobilePhone(null);
        p.addNewContact(new Contact("María", null));

        boolean result = p.addNewContact(new Contact("María", null));

        Assert.assertFalse(result);
    }

    @Test
    public void givenAContact_whenAddAnExistingContactWhichIsNotTheFirst_itIsNotAdded() {
        MobilePhone p = new MobilePhone(null);
        p.addNewContact(new Contact("Pedro", null));
        p.addNewContact(new Contact("María", null));

        boolean result = p.addNewContact(new Contact("María", null));

        Assert.assertFalse(result);
    }

    @Test
    public void givenAnEmptyContactList_whenRemoveContact_itIsNotRemoved() {
        MobilePhone p = new MobilePhone(null);

        boolean result = p.removeContact(new Contact("María", null));

        Assert.assertFalse(result);
    }

    @Test
    public void givenAContact_whenRemoveContact_itIsNotRemoved() {
        MobilePhone p = new MobilePhone(null);
        p.addNewContact(new Contact("María", null));

        boolean result = p.removeContact(new Contact("Pedro", null));

        Assert.assertFalse(result);
    }

    @Test
    public void givenAContact_whenRemoveAnExistingContact_itIsRemoved() {
        MobilePhone p = new MobilePhone(null);
        Contact contact = new Contact("María", null);
        p.addNewContact(contact);

        boolean result = p.removeContact(contact);

        Assert.assertTrue(result);
    }

    @Test
    public void givenAContact_whenRemoveAnExistingContactWhichIsNotTheFirst_itIsRemoved() {
        MobilePhone p = new MobilePhone(null);
        p.addNewContact(new Contact("Pedro", null));
        Contact contact = new Contact("María", null);
        p.addNewContact(contact);

        boolean result = p.removeContact(contact);

        Assert.assertTrue(result);
    }

    @Test
    public void givenAContact_whenRemoveAnExistingContactWithAnotherObject_itIsNotRemoved() {
        MobilePhone p = new MobilePhone(null);
        p.addNewContact(new Contact("María", null));

        boolean result = p.removeContact(new Contact("María", null));

        Assert.assertFalse(result);
    }

    @Test
    public void givenAContact_whenUpdateANonExistingContact_itIsNotUpdated(){
        MobilePhone p = new MobilePhone(null);

        boolean result = p.updateContact(new Contact("María", null), new Contact("María", null));

        Assert.assertFalse(result);
    }

    @Test
    public void givenAContact_whenUpdateTheOldAndNewContactThatExist_ItIsNotUpdated() {
        MobilePhone p = new MobilePhone(null);
        Contact contact = new Contact("María", null);
        p.addNewContact(contact);

        boolean result = p.updateContact(contact, new Contact("María", "1234"));

        Assert.assertFalse(result);
    }

    @Test
    public void givenAContact_whenUpdateTheContactThatExistsByANewOne_itIsUpdated() {
        MobilePhone p = new MobilePhone(null);
        Contact contact = new Contact("María", null);
        p.addNewContact(contact);

        boolean result = p.updateContact(contact, new Contact("Pedro", null));

        Assert.assertTrue(result);
    }
}
