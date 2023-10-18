public class Contact
{
    public String firstName;
    public String lastNames;
    public String address;
    public String city;
    public String state;
    public int zip;
    public String phoneNumber ;
    public String email;

    public String toString()
    {
        return ("{ Name      - " +firstName+
                "\nLast Name - " +lastNames+
                "\nAddress   - " +address+
                "\nCity      - " +city+
                "\nState     - " +state+
                "\nZip       - " +zip+
                "\nPhone     - " +phoneNumber+
                "\nEmail     - " +email)+" }\n";
    }

}
/*
create a Contacts in Address
Book with first and last names, address,
city, state, zip, phone number and
email...
 */