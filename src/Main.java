import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        LinkedListImplementation list=new LinkedListImplementation();
        int choice=0;
        while(choice!=5){
            System.out.println("Welcome to DBC's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program ");
            choice=s.nextInt();
            switch (choice){
                case 1:list.add();
                    break;
                case 2:list.view();
                    break;
                case 3:list.search();
                    break;
                case 4:list.delete();
                    break;
                default:
                    System.out.println("Invalid Input");
                    choice=5;
            }
        }
    }
}

