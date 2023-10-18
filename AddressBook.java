import java.util.Scanner;

public class AddressBook
{
  public   Contact []contacts;
    Scanner sc= new Scanner(System.in);

    int indexSize=0;
   public int nextIndex=0;//it will count use to know in which index data will add into array
    boolean ex=false; // it is to know exception is occurs in getContact(); it helps to stop adding false data in array

    public AddressBook()
    {
        System.out.println("enter value for data size means value for index");

        try {
            indexSize= sc.nextInt();

        }
        catch (Exception e)
        {
            System.out.println("wrong input default size of index is 5 ");
            indexSize=5;
        }


        contacts=new Contact[indexSize];

    }
public void addData()               //this is for adding data
{
    Contact contact=new Contact();


    try
    {
         contact =getContact();
         if(ex==true)
         {
             ex=false;
         }
         else {
             contacts[nextIndex] = contact;
             nextIndex++;
         }


    }
    catch (Exception e)
    {
        System.out.println(e+" addData");


    }

}

public void editByName(String name)
{
try {
     boolean check=false;
    for (int i = 0; i < contacts.length; i++) {
        if (contacts[i].firstName.isEmpty() == true)
        {
            if (contacts[i].firstName.equals(name) == true)
            {
                check = true;
                contacts[i] = getContact();
            }
        }
        else
        {
            check = false;
        }

        }
          if (check == false)
           {
            System.out.println("data not found");
            }
 }
         catch (Exception e)
               {
                   System.out.println("search completed");
                }
}

    public Contact getContact()      //it is for asking user to fill info which are required
    {
        Contact cont=new Contact();

        try {
            System.out.println("enter your name");
            cont.firstName=sc.next();
            System.out.println("enter your last name");
            cont.lastNames=sc.next();
            System.out.println("enter your city");
            cont.city=sc.next();
            System.out.println("enter your address");
            cont.address=sc.next();
            System.out.println("enter your Email");
            cont.email=sc.next();
            System.out.println("enter your Phone number");
            cont.phoneNumber=sc.next();
            System.out.println("enter your zip code");
            cont.zip=sc.nextInt();
            System.out.println("enter your state");
            cont.state=sc.next();
        }
        catch (Exception e)
        {
            ex=true;
        //   cont.zip=0;
            System.out.println("enter again and give numeric value to zip code ");
        }
        return cont;

    }
    public void show()      //to show all data present into array
    {
        try
        {
            for (Contact contact:contacts)
           {
                if(contact==null)
                { System.out.println("empty");}
                else {
                    System.out.println(contact.toString());
                }
           }
        }
        catch (Exception e)
        {
            System.out.println("no data available ");
        }

    }
}
