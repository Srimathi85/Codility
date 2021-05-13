/*
* 10. Write a java program to implement your own stack data structure to store any number of items.
*  And implement the following operations 1.push 2. pop 3. peek 4.display stack content*/
public class Q10 {
    private Object[] myStack=new Object[5];
    int iTop=-1;
    public Object peek(){
        return myStack[iTop];
    }
    public Object[] push(Object pushElement){
        if(iTop== myStack.length)
            System.out.println("Stack is full");
        else{
           myStack[++iTop]=pushElement;
            System.out.println("Element added");
        }
       return myStack;
    }
    public void display(){
        System.out.print("[ ");
        for (int index = 0; index <=iTop ; index++) {
            System.out.print(myStack[index]+", ");
        }
        System.out.print("]\n");
    }
    public Object[] pop(){
        if(iTop==-1)
            System.out.println("Stack is Empty"+iTop);
        else {
            myStack[iTop--] = null;
            System.out.println(iTop);
        }
        return myStack;
    }

    public static void main(String[] args) {
        Q10 oStack=new Q10();
        oStack.push(5);
        oStack.display();
        oStack.push(6);
        oStack.display();
        oStack.push(7);
        oStack.display();
        oStack.push(8);
        oStack.display();
        oStack.pop();
        oStack.display();
        oStack.pop();
        oStack.display();
        oStack.pop();
        oStack.display();
        oStack.pop();
        oStack.display();
        oStack.pop();
        oStack.display();

    }

}
