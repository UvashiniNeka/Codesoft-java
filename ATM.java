import java.util.Scanner;
class ATM{
    static int balance=10000, depamt, withamt, password;
    static int pin=1234;
    
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your pin : ");
        password=sc.nextInt();
        if(password==pin){
            ATM atm = new ATM();
            int ch;
            System.out.println("Enter the option:");
            System.out.println("1.withdraw \n 2.deposit \n 3.check balance\n");
            ch=sc.nextInt();
            switch(ch){
            case 1:
                atm.withdraw();
            case 2:
                atm.deposit();
            case 3:
                atm.checkBalance();
            }
        }
    }

    void deposit(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to deposit:");
        depamt=sc.nextInt();
        System.out.println("The total amount after depositing is "+ (depamt+balance));
    }

    void withdraw(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount to withdraw:");
        withamt=sc.nextInt();
        if(balance>withamt){
        System.out.println("The total amount after withdrawing is "+ (balance-withamt));
        }
        else{
            System.out.println("No sufficient balance.");
        }
        
    }

    void checkBalance(){
        System.out.println("The total balance is "+balance);
    }
}