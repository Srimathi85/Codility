import java.util.ArrayList;
import java.util.Scanner;

/*
* 4. Write a java program to store 5 unique elements in sorted order.
*  Error should exist if user tries to add duplicates.*/
public class Q4 {
    public static void addUniqueElements(ArrayList<Integer> list,int newElement){
        boolean flag=false;
        for (int element:list) {
            if (element==newElement) {
                flag = true;
                break;
            }
        }if(flag)
            System.out.println("The element "+newElement+ " already presents in the ArrayList");
        else {
            list.add(newElement);
            System.out.println("The element"+newElement+" is added  in the ArrayList");
        }
        System.out.println("The List :"+list);
    }
    public static ArrayList<Integer> createArrayList(){
        ArrayList<Integer> list=new ArrayList<Integer>();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements in the list");
        int sizeOfList=sc.nextInt();
        for (int index = 0; index <sizeOfList ; index++) {
            System.out.println("Enter the element to be added in the list");
            addUniqueElements(list,sc.nextInt());
        }

        return list;
    }

    public static void main(String[] args) {
        System.out.println("The list : "+createArrayList());


    }
}
