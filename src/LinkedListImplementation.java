import java.util.ArrayList;
import java.util.Scanner;

public class LinkedListImplementation {

        public Person head=null;
        Scanner s=new Scanner(System.in);
        //
        //to add new element into list
        public boolean add(){
            boolean response=false;
            Person temp=new Person();
            int index=0;
            System.out.print("You have chosen to add a new contact: \n" +
                    "Please enter the name of the Person\n" +
                    "First Name: ");
            temp.setFname(s.next());
            System.out.print("Last Name: ");
            temp.setLname(s.next());
            System.out.print("Contact Number:");
            temp.phone[index++]=s.nextLong();
            System.out.print("Would you like to add another contact number? (y/n): ");
            char dec=s.next().charAt(0);
            while(dec!='n'&&dec=='y'){
                System.out.print("Contact Number:");
                temp.phone[index++]=s.nextLong();
                System.out.print("Would you like to add another contact number? (y/n): ");
                dec=s.next().charAt(0);
            }
            System.out.print("Would you like to add email address? (y/n): ");
            dec=s.next().charAt(0);
            if(dec=='y'){
                System.out.print("Email Address: ");
                temp.setMail(s.next());
            }
            if(head==null){
                head=temp;
            }
            else{
                Person p=head;
                while(p.next!=null){
                    p=p.next;
                }
                p.next=temp;
            }
            return response;
        }
        public void view(){
            System.out.print("---Here are all your contacts---\n" +
                    "-------- * -------- * -------- * --------\n");
            Person p=head;
            while (p.next!=null){
                System.out.println("First Name: "+p.getFname());
                System.out.println("Last Name:"+p.getLname());
                if(p.phone[1]!=0){
                    System.out.print("Contact Number(s): ");
                }
                else{
                    System.out.print("Contact Number: ");
                }
                int i=1;
                System.out.print(p.phone[0]);
                while(p.phone[i]!=0){
                    System.out.print(" , "+p.phone[i]);
                    i=i+1;
                }
                if(p.getMail()!=null) {
                    System.out.println("\nEmail address: " + p.getMail());
                }
                p=p.next;
                System.out.println("-------- * -------- * -------- * --------\n" +
                        "-------- * -------- * -------- * --------\n");
            }
            System.out.println("First Name: "+p.getFname());
            System.out.println("Last Name:"+p.getLname());
            if(p.phone[1]!=0){
                System.out.print("Contact Number(s): ");
            }
            else{
                System.out.print("Contact Number: ");
            }
            int i=1;
            System.out.print(p.phone[0]);
            while(p.phone[i]!=0){
                System.out.print(" , "+p.phone[i]);
                i=i+1;
            }
            if(p.getMail()!=null) {
                System.out.println("\nEmail address: " + p.getMail());
            }
            p=p.next;
            System.out.println("\n-------- * -------- * -------- * --------");
        }

        //
        //
        //to display all the profiles
        public void search(){
            System.out.println("You could search for a contact from their first names:");
            String fname=s.next().toString().strip();
            Person tem=head;
            ArrayList<Person> temp=new ArrayList<>(10);
            int count=0;
            int index=0;
            while(tem.next!=null){
                if(tem.getFname().equalsIgnoreCase(fname)){
                    temp.add(tem);
                    count=count+1;
                }
                tem=tem.next;
            }
            if(tem.getFname().equalsIgnoreCase(fname)){
                temp.add(tem);
                count=count+1;
            }
            if(count!=0) {
                System.out.println(count + " match found!");
                while(!temp.isEmpty()){
                    Person per=temp.remove(0);
                    System.out.println("-------- * -------- * -------- * --------");
                    System.out.println("First Name: "+per.getFname());
                    System.out.println("Last Name: "+per.getLname());
                    System.out.print("Contact Number(s): ");
                    int i=0;
                    while(per.phone[i]!=0){
                        System.out.print(per.phone[i]+",");
                        i=i+1;
                    }
                    System.out.println("\nEmail address: "+per.getMail());
                    per=per.next;
                    System.out.println("-------- * -------- * -------- * --------");
                    index++;
                }
            }
            else{
                System.out.println("NO RESULT FOUND!");
            }
        }
        public boolean delete(){
            boolean response=false;
            System.out.println("Here are all your contacts:");
            Person temp=head;
            int count=1;
            while(temp.next!=null){
                System.out.println(count+". "+temp.getFname()+" "+temp.getLname());
                temp=temp.next;
                count++;
            }
            System.out.println(count+". "+temp.getFname()+" "+temp.getLname());
            System.out.print("Press the number against the contact to delete it: ");
            int choice=s.nextInt();
            count=1;
            temp=head;
            if(choice==1){
                Person del=head;
                head=head.next;
                System.out.println(del.getFname()+" "+del.getLname()+"\'s contact deleted from list!");
            }
            else{
                choice=choice-1;
                while(count<choice){
                    temp=temp.next;
                    count++;
                }
                Person del=temp.next;
                temp.next=temp.next.next;
                System.out.println(del.getFname()+" "+del.getLname()+"\'s contact deleted from list!");
            }
            return response;

        }




}
