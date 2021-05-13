import java.util.HashMap;
import java.util.Scanner;

/*
*20. Write a java code for the following Store n number of drink type with quantity. If user wants a drink,
*  user should enter drink  type. If drink quantity is greater than one then request should be served and
* decrease the corresponding quantity by one else no availability message should be printed on screen
 */
public class Q20 {
    public static HashMap<String,Integer> createHashMap(){
        HashMap<String,Integer> drinksHashMap=new HashMap<String, Integer>();
        drinksHashMap.put("Cola",1);
        drinksHashMap.put("Sprite",30);
        drinksHashMap.put("Fanta",35);
        drinksHashMap.put("Apple Juice",40);
        return drinksHashMap;
    }
    public static String getDrinkName(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the drink name:");
        return scanner.nextLine();
    }
    public static void checkDrinksAvailability(String drinkNeeded,HashMap<String,Integer> drinkHashMap){
        int iAvailQuantity=drinkHashMap.get(drinkNeeded);
        if(iAvailQuantity>=1){
            System.out.println(drinkNeeded+" drink is available");
            drinkHashMap.put(drinkNeeded,drinkHashMap.get(drinkNeeded)-1);

        }else
            System.out.println(drinkNeeded+" drink is  not available");
    }

    public static void main(String[] args) {
        HashMap<String,Integer> drinksHashMap=Q20.createHashMap();
        checkDrinksAvailability(Q20.getDrinkName(),drinksHashMap);
        checkDrinksAvailability(Q20.getDrinkName(),drinksHashMap);
    }
}
