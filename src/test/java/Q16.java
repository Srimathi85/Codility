/*
* 16. Write a java program to create three threads T1, T2 and T3 and ensure sequence T1,T2,T3 in java.
*
 */
public class Q16 extends Thread{
    @Override
    public void run(){
        System.out.println("This is thread one : "+Thread.currentThread().getName());
    }

    public static void main(String[] args) throws InterruptedException {

        for (int index = 1; index <=3; index++) {
            Q16 obj=new Q16();
            obj.setName("Thread "+index);
            obj.start();
            obj.join();
           // sleep(1000);
        }
    }
}
