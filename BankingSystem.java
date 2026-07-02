// miniproject.java
import java.util.Scanner;
public class BankingSystem
{ 
  static int balance=500;
  static void deposit(int x){
   int obj1= 500+x;
   System.out.println("cash deposit successfully,your balance is "+obj1);
  }
  static void withdraw(int y){
   if(y<=500){
   int obj2= 500-y;
   System.out.println("cash withdraw successfully,your balance is "+obj2);
   }else{
   System.out.println("Oops...insuficient balance");
   }
   }
   public static void main(String[]args){
   Scanner scan = new Scanner(System.in);
   int num;
   do{
   System.out.println("****SIMPLE BANK****\nChoose an option:\n1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
   System.out.print("Enter your choice:");
    num= scan.nextInt();
     switch(num){
          case 1:
              System.out.print("Enter amount to deposit:");
              int x1=scan.nextInt();
              deposit(x1);
              break;
          case 2:
              System.out.print("Enter amount to withdraw:");
              int y1 = scan.nextInt();
              withdraw(y1);
              break;
          case 3:
             System.out.println("your balance is "+balance);
             break;
          default:
              System.out.println("Thank you!");
          }
       }while(num !=4);
       
      scan.close();
  }
}
