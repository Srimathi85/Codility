import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

/*
* 7. Write a java program to implement your own ArrayList which has two methods
* a) add b) remove and store 5 student information in your ArrayList.
 */
public class Q7 {

    Object[] myArrayList=new Object[5];
    int iActualSize=0;
    public  int size(){
        return iActualSize;
      }

    public  Object[] addElementInAL(Object element){
        if(myArrayList.length-iActualSize>0) {
            myArrayList[iActualSize++]=element;
            System.out.println("Element added");
        }else{
            myArrayList=incrementArraySize(myArrayList);
            addElementInAL(element);
        }
        return myArrayList;
    }
    public Object[] incrementArraySize(Object[] myArrayList){
        myArrayList= Arrays.copyOf(myArrayList,myArrayList.length*2);
        return myArrayList;
    }
    public void displayArrayList(Object[] myArrayList){
        System.out.print("{ ");
        for (int index = 0; index < iActualSize; index++) {
            System.out.print(myArrayList[index]+", ");
        }
        System.out.println("}");
    }
    public Object[] deleteElement(int indexOfElement){
        if(indexOfElement>=iActualSize)
            System.out.println("ArrayOutOfBoundException ");
        else{
            myArrayList[indexOfElement]=null;
            for (int index = indexOfElement; index < iActualSize; index++) {
               myArrayList[index]=myArrayList[index+1];
            }
            System.out.println("Actual Size 1 : "+iActualSize);
           iActualSize-=1;
            System.out.println("Actual Size 2: "+iActualSize);
        }
        return  myArrayList;
    }

    public static void main(String[] args) {
        Q7 obj=new Q7();
        obj.displayArrayList(obj.addElementInAL(new Student("Sri",1)));
        obj.displayArrayList(obj.addElementInAL(new Student("AAA",2)));
        obj.displayArrayList(obj.addElementInAL(new Student("BBB",3)));
        obj.displayArrayList(obj.addElementInAL(new Student("CCC",4)));
        obj.displayArrayList(obj.addElementInAL(new Student("DDD",5)));
        obj.displayArrayList(obj.addElementInAL(new Student("EEE",6)));
        obj.displayArrayList(obj.addElementInAL(new Student("FFF",7)));
        obj.displayArrayList(obj.addElementInAL(new Student("GGG",8)));
        obj.displayArrayList(obj.addElementInAL(new Student("HHH",9)));
        System.out.println("Size of the List"+obj.size());
        obj.displayArrayList(obj.deleteElement(3));
        System.out.println("Size of the List"+obj.size());
    }

}
