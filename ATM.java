import java.util.*;


public class ATM{
    public static void main(String a[]){
       AtmMachine obj= new AtmMachine();
       obj.checkPin();
    }
}

class AtmMachine{
    int pin =2323;
    float Balance ;
    Scanner sc=new Scanner(System.in);
    public void checkPin(){
        System.out.println("Enter PIN Number");
        int pinentered=sc.nextInt();
        if(pinentered==pin)
        {
            menu();
        }
        else{
            System.out.println("Enter valid pin number");
            menu();
        }
    }
    public void menu(){
        System.out.println("Enter your choice");
        System.out.println("1.Check Balance");
        System.out.println("2.Deposit Amount");
        System.out.println("3.Withdraw Amount");
        System.out.println("4.Exit");
        int choice=sc.nextInt();
        if(choice==1){
            checkBalance();
        }
        if(choice==2){
            depositAmount();
        }
        if(choice==3){
            withdrawAmount();
        }
        if(choice==4){
            System.exit(0);
            menu();
        }
    }
    public void checkBalance(){
        System.out.println("Balance = "+Balance);
        menu();
    }
    public void depositAmount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount");
        Balance=sc.nextFloat();
        System.out.println("Amount deposited successfully ");
        menu();
        sc.close();
    }
    public void withdrawAmount(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Amount");
        float amount=sc.nextFloat();
        if(Balance>amount){
        Balance =Balance-amount;
        System.out.println("Amount withdraw successfully");
        }
        else
            System.out.println("Insufficient Balance");
        menu();
        sc.close();
    }
    
}