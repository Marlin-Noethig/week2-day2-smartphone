import model.BusinessContact;
import model.Contact;
import model.Friend;
import model.Smartphone;

public class AppMain {



    public static void main(String[] args) {
        Contact contact1 = new Friend("Peter", 12345);
        Contact contact2 = new Friend("Sigrid", 56789);
        Contact contact3 = new Friend("Markus", 50102);

        Contact[] contacts = {contact1, contact2, contact3};

        Contact bContact1 = new BusinessContact("Florian", 1337, "neuefische");

        Smartphone smartphone1 = new Smartphone("Galaxy S1000", "Samsung", contacts);

        System.out.println(smartphone1.toString());
        smartphone1.startRadio();
        smartphone1.stopRadio();
        System.out.println(smartphone1.getPosition());

        System.out.println(bContact1.toString());

        smartphone1.addContact(bContact1);
        System.out.println(smartphone1.toString());
        System.out.println(smartphone1.getContactById(2));
        System.out.println(smartphone1.getContactByName("Sigrid"));

        smartphone1.removeContactByIndex(1);
        System.out.println(smartphone1.toString());

        smartphone1.removeContactByName("Florian");
        System.out.println(smartphone1.toString());

    }
}
