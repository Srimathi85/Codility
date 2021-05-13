import java.util.Scanner;

/*
* 14. Implement your own QUEUE using STACKS data structure
 */
public class Q14 {
    int[] myQueue=new int[getSizeOfQueue()];
    int iFront=-1;
    int iRear=-1;
    int iSizeOfQueue;
    public int getSizeOfQueue(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of the Queue :");
        iSizeOfQueue=sc.nextInt();
        return iSizeOfQueue;
    }

    public void enqueue(int iValue){
        if(iFront==-1 &&iRear==-1){
            iFront=0;
            iRear=0;
            myQueue[iRear]=iValue;
            System.out.println(+iValue+" is added in the Queue");
        }else if(iSizeOfQueue==(iRear+1)){
            System.out.println("Queue is Full.....!");
        }else {
            iRear=iRear+1;
            myQueue[iRear]=iValue;
            System.out.println(+iValue+" is added in the Queue");
        }
    }
    public void dequeue(){
        if(iFront==-1 && iRear==-1)
            System.out.println("Queue is Empty...!");
        else if(iFront==iRear){
            System.out.println("Deleted value is :"+myQueue[iFront]);
            iFront=iRear=-1;
        }
        else {
            System.out.println("Deleted value is :"+myQueue[iFront]);
            iFront=iFront+1;
        }
    }
    public void displayQueue(){
        if(iFront==-1 && iRear==-1)
            System.out.println("Queue is Empty...!");
        else{
            System.out.print("Queue is : | ");
            for (int index = iFront; index <=iRear ; index++) {
                System.out.print(myQueue[index]+" | ");
            }
            System.out.println();

        }
    }
    public void peek(){
        if (iFront==-1 && iRear==-1)
            System.out.println("Queue is Empty...!");
        else
            System.out.println("The peek Element is :"+myQueue[iFront]);
    }

    public static void main(String[] args) {
        Q14 queue=new Q14();
        queue.enqueue(3);
        queue.displayQueue();
        queue.enqueue(4);
        queue.displayQueue();
        queue.enqueue(5);
        queue.displayQueue();
        queue.enqueue(6);
        queue.displayQueue();
        queue.enqueue(7);
        queue.displayQueue();
        queue.dequeue();
        queue.displayQueue();
        queue.peek();
    }
}
