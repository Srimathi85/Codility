import java.util.Scanner;

/*
*13. Explain circular queue with implemented program for addition and deletion. */
public class Q13 {
    int[] circularQueue=new int[getSizeOfQueue()];
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
        circularQueue[iRear]=iValue;
        System.out.println(+iValue+" is added in the Queue");
    }else if((iRear+1)%iSizeOfQueue==iFront){
        System.out.println("Queue is Full.....!");
    }else {
        iRear=(iRear+1)%iSizeOfQueue;
        circularQueue[iRear]=iValue;
        System.out.println(+iValue+" is added in the Queue");
    }
    }
public void dequeue(){
   if(iFront==-1 && iRear==-1)
       System.out.println("Queue is Empty...!");
   else if(iFront==iRear){
       System.out.println("Deleted value is :"+circularQueue[iFront]);
       iFront=iRear=-1;
       }
   else {
       System.out.println("Deleted value is :"+circularQueue[iFront]);
       iFront=(iFront+1)%iSizeOfQueue;
   }
}
public void displayQueue(){
    if(iFront==-1 && iRear==-1)
        System.out.println("Queue is Empty...!");
    else{
        System.out.print("Queue is : | ");
        int index=iFront;
        while(index!=iRear){
            System.out.print(circularQueue[index]+" | ");
            index=(index+1)%iSizeOfQueue;
        }
        System.out.print(circularQueue[iRear]+" |");
        System.out.println();
    }
}
public void peek(){
        if (iFront==-1 && iRear==-1)
            System.out.println("Queue is Empty...!");
        else
            System.out.println("The peek Element is :"+circularQueue[iFront]);

}

    public static void main(String[] args) {
        Q13 cQueue=new Q13();
        cQueue.enqueue(3);
      cQueue.displayQueue();
        cQueue.enqueue(4);
        cQueue.displayQueue();
        cQueue.enqueue(5);
        cQueue.displayQueue();
        cQueue.enqueue(6);
        cQueue.displayQueue();
        cQueue.enqueue(7);
        cQueue.displayQueue();
        cQueue.enqueue(8);
        cQueue.dequeue();
        cQueue.displayQueue();
    }
}
