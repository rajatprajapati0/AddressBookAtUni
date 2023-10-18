public class Main
{
    static
    {
        System.out.println("Welcome in Address Book program");
    }
    public static void main(String[] args)
    {
        AddressBook addressBook=new AddressBook();
        addressBook.addData();
        addressBook.show();
        addressBook.editByName("rajat");
        addressBook.show();

    }


/*
Displaying
Welcome to Address Book
Program in
AddressBookMain class on
 */
}