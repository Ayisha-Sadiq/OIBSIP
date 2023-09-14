import java.util.*;
class NumberGuess
{
   public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random random=new Random();
        int max=10;
        int n,num;
        boolean flag;
       
       do{
          flag=false;
            System.out.println("***Number Guessing game***");
            num=random.nextInt(1,100)+1;
            
        for(int i=1;i<=max;i++)
        {   System.out.print("attempt:"+i+"/"+max);
            System.out.println(" - guess the number between 1 to 100");
            n=sc.nextInt();
            if(n==num)
            {
                System.out.println("correct answer");
                break;
            }
           else if(n<num)
            {
                System.out.println("lesser than the number");
                
            }
            else
            {
                System.out.println("greater than the number");
                 
            }

            if(i<max)
            {
            System.out.println("Try again...");
            }
            else{
                System.out.println("out of attempts..correct number is : "+num);
            }
        }//for loop

            System.out.println("do you want to play again (yes/no)");
            String str=sc.next();
            if(str.equalsIgnoreCase("yes"))
            {
                flag=true;
            }
      
    }while(flag);
}
}