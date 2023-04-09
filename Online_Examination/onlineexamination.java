package Online_Examination;
import java.util.Scanner;

public class onlineexamination {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x;
        login l= new login();
    do{
        System.out.println("Welcome to NMIT online exams");
        System.out.println();
        System.out.println("New here? Press 0 to get registered! \n Already a user? Press 9 to Log In");
        int n = sc.nextInt();
        if(n==0){
          l.doregister();
         } else {
          l.dologin();
        }
        System.out.println("Press 0 to continue");
        x=sc.nextInt();
      }while(x==0);
    }
}

class login{

   public static String username, password, usn;
   public static Scanner sc = new Scanner(System.in);

     void doregister() {
        
        System.out.print("Your name: ");
        username=sc.nextLine();
        System.out.print("USN: ");
        usn=sc.nextLine();
        System.out.print("Password:");
        password=sc.nextLine();

        System.out.println("Remember your credentials!");
        System.out.println("Username: "+username+"\nPassword: "+password);
    }

     void dologin() {
        String eusername, epassword;
        System.out.print("Username: ");
        eusername=sc.nextLine();
        System.out.print("Password: ");
        epassword=sc.nextLine();

        if(eusername.compareTo(username)==0 && epassword.compareTo(password)==0){
            System.out.println("Login Successful");
            System.out.println("What you want to do? \n1. Update Password \n2. Attend MCQ Test");
            int n=sc.nextInt();
            if(n==1){
              doupdatepassword();
             } else {
              mcqtest mc = new mcqtest();
              mc.test();
            }
        } else {
            System.out.println("Incorrect credentials.");
        }
    }

     void doupdatepassword() {
        System.out.println("Your username: ");
        String upusername=sc.nextLine();
        System.out.println("Your USN: ");
        String upusn=sc.nextLine();
        System.out.println("Current password: ");
        String uppassword=sc.nextLine();
        if(upusername.compareTo(username)==0 && upusn.compareTo(usn)==0 && uppassword.compareTo(password)==0){
            System.out.println("New password: ");
            String newpassword=sc.nextLine();
            password=newpassword;
            System.out.println("New password updated.");
        } else {
            System.out.println("Incorrect credentials");
        }
        
    }
}

class mcqtest{
  public void test() {
    
  }
}