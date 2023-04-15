package Online_Examination;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class onlineexamination {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int x;
        login l= new login();
    do{ 
        System.out.println();
        System.out.println("Welcome to NMIT online exams");
        System.out.println();
        System.out.println("New here? Press 0 to get registered!\nAlready a user? Press 9 to Log In");
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

   public static String username="rnk";
   public static int password=1234;
   public static Scanner sc = new Scanner(System.in);

     void doregister() {
        
        System.out.print("Your name: ");
        username=sc.nextLine();
        System.out.print("Password:");
        password=sc.nextInt();

        System.out.println("Remember your credentials!");
        System.out.println("Username: "+username+"\nPassword: "+password);
    }

     void dologin() {
        String eusername; 
        int epassword;
        System.out.print("Username: ");
        eusername=sc.nextLine();
        System.out.print("Password: ");
        epassword=sc.nextInt();

        if(eusername.compareTo(username)==0 && password==epassword){
            System.out.println("Login Successful");
            System.out.println("What you want to do? \n1. Update Password \n2. Attend MCQ Test");
            int n=sc.nextInt();
            if(n==1){

              update u=new update();
              u.doupdatepassword(password);
             } else {
              mcqtest mc = new mcqtest();
              mc.test();
            }
        } else {
            System.out.println("Incorrect credentials.");
        }
    }

    
}

class update{
  Scanner sc= new Scanner(System.in);

  public void doupdatepassword(int password) {
    System.out.println("Current password: ");
    int uppassword=sc.nextInt();
    if(password==uppassword){
        System.out.println("New password: ");
        int newpassword=sc.nextInt();
        password=newpassword;
        System.out.println("New password updated.");
    } else {
        System.out.println("Incorrect credentials");
  }
    
}
}
class mcqtest{
  public static Scanner sc = new Scanner(System.in);

  public void starttest(String[] args) {
    Timer timer = new Timer();
    int delay = 1000; // Delay in milliseconds (1 second)
    int period = 1000; // Repeat interval in milliseconds (1 second)

    timer.scheduleAtFixedRate(new TimerTask() {
        public void run() {
            // Call your function here
            test();
        }
    }, delay, period);
  }



  public void test() {
    int marks=0;
    //while(i<=10){
       System.out.println();
       System.out.println("a. Who invented Java Programming?\n 1) Guido van Rossum\n 2) James Gosling\n 3) Dennis Ritchie\n 4) Bjarne Stroustrup");
       System.out.print("Your Answer: ");
       int ans1=sc.nextInt();
       if(ans1==2){ marks++ ;}
       System.out.println();

       System.out.println("b. Which statement is true about Java?\n 1) Java is a sequence-dependent programming language\n 2) Java is a code dependent programming language\n 3) Java is a platform-dependent programming language\n 4) Java is a platform-independent programming language");
       System.out.print("Your Answer: ");
       int ans2=sc.nextInt();
       if(ans2==4){ marks++;}
       System.out.println();

       System.out.println("c. Which component is used to compile, debug and execute the java programs?\n 1) JRE\n 2) JIT\n 3) JDK\n 4) JVM");
       System.out.print("Your Answer: ");
       int ans3=sc.nextInt();
       if(ans3==3){ marks++;}
       System.out.println();

       System.out.println("d. Which one of the following is not a Java feature?\n 1) Object-oriented\n 2) Use of pointers\n 3) Portable\n 4) Dynamic and Extensible");
       System.out.print("Your Answer: ");
       int ans4=sc.nextInt();
       if(ans4==2){ marks++;}
       System.out.println();

       System.out.println("e. Which of these cannot be used for a variable name in Java?\n 1) identifier & keyword\n 2) identifier\n 3) keyword\n 4) none of the mentioned");
       System.out.print("Your Answer: ");
       int ans5=sc.nextInt();
       if(ans5==3){ marks++;}
       System.out.println();

       System.out.println("f. What is the extension of java code files?\n 1) .js\n 2) .txt\n 3) .class\n 4) .java");
       System.out.print("Your Answer: ");
       int ans6=sc.nextInt();
       if(ans5==4){ marks++;}
       System.out.println();

       System.out.println("g. Which environment variable is used to set the java path?\n 1) MAVEN_Path\n 2) JavaPATH\n 3) JAVA\n 4) JAVA_HOME");
       System.out.print("Your Answer: ");
       int ans7=sc.nextInt();
       if(ans7==4){ marks++;}
       System.out.println();

       System.out.println("h. Which of the following is not an OOPS concept in Java?\n 1) Polymorphism\n 2) Inheritance\n 3) Compilation\n 4) Encapsulation");
       System.out.print("Your Answer: ");
       int ans8=sc.nextInt();
       if(ans8==3){ marks++;}
       System.out.println();

       System.out.println("i. What is not the use of “this” keyword in Java?\n 1) Referring to the instance variable when a local variable has the same name\n 2) Passing itself to the method of the same class\n 3) Passing itself to another method\n 4) Calling another constructor in constructor chaining");
       System.out.print("Your Answer: ");
       int ans9=sc.nextInt();
       if(ans9==2){ marks++;}
       System.out.println();

       System.out.println("j. Which of the following is a type of polymorphism in Java Programming?\n 1) Multiple polymorphism 2) Compile time polymorphism 3) Multilevel polymorphism\n 4) Execution time polymorphism");
       System.out.print("Your Answer: ");
       int ans10=sc.nextInt();
       if(ans10==2){ marks++;}
   // }
       System.out.println();
       System.out.println("You got "+marks+"/10");
  }
}