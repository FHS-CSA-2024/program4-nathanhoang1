//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)

import java.util.Scanner;

public class program4 {
    public static void main(String [] args){
        int number1 = 0;
        int number2 = 0;
        int number3 = 0;
        int number4 = 0;
        double total = 0;
        double average = 0.0;
        
        Scanner numberCalc = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        number1=numberCalc.nextInt();
        
        System.out.println("Enter number 2: ");
        number2=numberCalc.nextInt();
        
        System.out.println("Enter number 3: ");
        number3=numberCalc.nextInt();
        
        System.out.println("Enter number 4: ");
        number4=numberCalc.nextInt();
        System.out.println();
        
        total = number1+number2+number3+number4;
        System.out.println("Sum is: "+total);
        System.out.println();
        average = total/4;
        System.out.println("Average is: "+average);
        
        
    }
}

//Paste console output below:
/*Enter number 1: 
475
Enter number 2: 
821
Enter number 3: 
369
Enter number 4: 
562

Sum is: 2227.0

Average is: 556.75
*/
