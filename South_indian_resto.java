import java.util.Scanner;
class restaurant   
{
    Scanner scnr=new Scanner(System.in);
    String name, dt, branch;
    double oder,gst,net;
    public void details()
    {
       System.out.print("Enter your name: ");
       name= scnr.nextLine();
       System.out.print("Enter date only DD/MM/YYYY: ");
       dt= scnr.next();
       scnr.nextLine();
       System.out.print("Enter the shop branch: ");
       branch = scnr.nextLine();
       System.out.println();
    }
    public void menu()
    {
        for(;;)
        {
        System.out.println("========================================================");
        System.out.println("\tMenu of the restaurant");
        System.out.println("========================================================");
        System.out.println("Sr.No\t items\t quatnity\t price");
        System.out.println("1\t idly\t 4\t\t 30rs");
        System.out.println("2\t wada\t 4\t\t 40rs");
        System.out.println("3\t Coffee\t 1\t\t 30rs");
        System.out.println("4\t tea \t 1\t\t 15rs");
        System.out.println("5\t exit");
        System.out.println();
        System.out.print("Enter your choice Sr.no from table: ");
        int choice = scnr.nextInt();
        System.out.println();
        switch(choice)
        {
            case 1: 
            case 3:
                oder=30;
                bill();
                break;
            case 2:
                oder=40;
                bill();
                break;
            case 4:
                oder=15;
                bill();
                break;
            case 5:
                System.out.println("Bye. Visit again.");
                System.exit(0);
            default:
                System.out.println("Invalid choice");
            } 
        }
    }
    public void bill()
    {
       System.out.println("-----------------Calculated bill-----------------------");
       System.out.println("Name: "+name);
       System.out.println("Branch: "+branch);
       System.out.println("Your Oder: "+oder);
       gst=oder*0.15;
       net=oder+gst;
       System.out.println("GST: "+gst);
       System.out.println("Net: "+net);
       System.out.println("========================================================");
       System.out.println("\t\tThank you, Visit us soon.");
       System.out.println("========================================================");
    }
}
public class South_indian_resto
{
    public static void main(String args[])
    {
        restaurant r = new restaurant();
        r.details();
        r.menu();
        r.bill();
    }
}











