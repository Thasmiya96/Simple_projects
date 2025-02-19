import java.util.*;
public class Customer_Support_Chatbot {
    
public static void main(String aaa[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name :");
    String name =sc.next();
    repose(name);
    sc.nextLine();
    System.out.println("Enter your Issue");
    String issue=sc.nextLine();
    repose(name,issue);
    System.out.println("Enter you urgency");
    String urgency=sc.nextLine();
    repose(name,issue,urgency);
    sc.close();
}
public static void repose(String name){
    System.out.println("Hello " + name + "! How can i help you today?");
}
public static void repose(String name,String issue){
    System.out.println(name+" i will assit you with your " + issue + ".");
}
public static void repose(String name,String issue,String urgency){
    System.out.println(name + " i will provide you help on "+ issue +" i understand you urgency is " + urgency +".");
}
}
