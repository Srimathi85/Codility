import java.util.Scanner;

/*
* 5. Write a program to read monetary amount in cents and print the smallest possible number of coins
* equaling the amount. Example: monetary amount in cents=288 2 Dollar 3 quarter 1 dime 3 pennies
* So smallest possible number of coins equaling the amount 283====9 coins
 */
public class Q5 {

    public static int  calculateCoinCount(int iAmountInCent) {
       int iDollarCoin=0;
        int iQuarterCoin=0;
        int iDimeCoin=0;
        int iNickelCoin=0;
        int iPennyCoin=0;
        int iTotalCoin=0;
        if(iAmountInCent>=100) {
            iDollarCoin = iAmountInCent / 100;
            iAmountInCent = iAmountInCent % 100;
            System.out.println("Dollar coin : " + iDollarCoin);
            //System.out.println(" Amount in cent : " + iAmountInCent);
        }
         if(iAmountInCent>=25) {
             iQuarterCoin = iAmountInCent / 25;
             iAmountInCent = iAmountInCent % 25;
             System.out.println("Quarter coin : " + iQuarterCoin);
         }
         if (iAmountInCent>=10){
            iDimeCoin=iAmountInCent/10;
            iAmountInCent=iAmountInCent%10;
             System.out.println("Dime coin : "+iDimeCoin);
        }
        if (iAmountInCent>=5){
          iNickelCoin=iAmountInCent/5;
          iAmountInCent=iAmountInCent%5;
            System.out.println("Nickel coin :  "+iNickelCoin);
        }
        iPennyCoin=iAmountInCent;
        System.out.println("Penny coin : "+iPennyCoin);
        iTotalCoin=iDollarCoin+iQuarterCoin+iDimeCoin+iNickelCoin+iPennyCoin;
        return iTotalCoin;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the amount in cents : ");
        System.out.println("The smallest coins required  is : "+calculateCoinCount(sc.nextInt()));
    }
}
