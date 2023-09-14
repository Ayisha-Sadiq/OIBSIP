import java.util.*;
public class AtmInterface
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String transaction="";
        int password,choice,username,amount,atm_money=50000;
        int user_id[]={2015,2016,2012,1023,1222};
        int pin[]={2025,2026,2027,2023,2102};
        String[] transaction_history=new String[pin.length];
        System.out.println("enter your username");
        username=sc.nextInt();
        System.out.println("enter your password");
        password=sc.nextInt();
        for(int i=0;i<pin.length;i++)
        {
            if(username==user_id[i] && password==pin[i])
            {  do
                {
                System.out.println("1.transaction history 2.withdraw 3.deposit 4.transfer 5.quit");
                choice=sc.nextInt();
                switch(choice)
                {
                    case 1:
                        System.out.println("transaction history");
                        System.out.println(transaction_history[i]);
                        break;
                    case 2:
                        System.out.println("enter your amount to withdraw");
                        amount=sc.nextInt();
                        if(amount%100!=0)
                        {
                            System.out.println("enter the amount in multiples of 100");

                        }
                        else if(amount>atm_money)
                        {
                            System.out.println("atm does not have sufficient money");
                        }
                        else
                        {
                            atm_money=amount;
                            System.out.println("collect your cash");
                            Date d=new Date();
                            transaction=transaction+d+"withdraw amount";
                            transaction_history[i]=transaction;
                        }
                        break;
                    case 3:
                        System.out.println("enter your amount to deposit");
                        amount=sc.nextInt();
                        if(amount%100!=0)
                        {
                            System.out.println("enter the amount in multiples of 100");

                        }
                        else
                        {
                            System.out.println("deposited successfully");
                            atm_money+=amount;
                            Date d=new Date();
                            transaction=transaction+d+"withdraw amount";
                            transaction_history[i]=transaction;
                        }
                        break;
                    case 4:
                        System.out.println("enter pin to transfer");
                        password=sc.nextInt();
                        System.out.println("tranfered successfully");
                        Date d=new Date();
                        transaction=transaction+d+"tranfer amount password"+" ";
                        transaction_history[i]=transaction;
                        break;

                }
            }while(choice!=5);

        }
            else if(i==pin.length-1 && password!=pin[i])
            {
                System.out.println("you have entered wrong pin");
                break;
            }
        }
        sc.close();

        }
}