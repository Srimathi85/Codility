/*
* 17. Implement ticket reservation application using multithreading where it has available seats
*  information. Create 4 threads to access this data to book tickets and ensure data consistency
*  Ex available seats=10 T1 requires 6 seats T2 requires 3 seats T2 requires 4 seats
* If available seats < seats required proper error message should get printed*/
public class Q17 extends Thread {
    private String sPassengerName;
    private int iSeatsRequired;
    private TicketCounter ticketCounter;

    public Q17(String sPassengerName,int iSeatsRequired,TicketCounter ticketCounter) {
        this.sPassengerName=sPassengerName;
        this.iSeatsRequired=iSeatsRequired;
        this.ticketCounter=ticketCounter;

    }

    @Override
    public void run(){
   ticketCounter.bookTicket(sPassengerName,iSeatsRequired);
}

    public static void main(String[] args) throws InterruptedException {
        TicketCounter ticketCounter=new TicketCounter();
        Q17 t1=new Q17("Sri",5,ticketCounter);
        Q17 t2=new Q17("Mathi",3,ticketCounter);
        Q17 t3=new Q17("Devi",4,ticketCounter);
        Q17 t4=new Q17("Ram",2,ticketCounter);
        t1.start();
        t1.join();
        t2.start();
        t2.join();
        t3.start();
        t3.join();
        t4.start();
        t4.join();

    }
}
