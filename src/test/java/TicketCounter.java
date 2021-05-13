public class TicketCounter {
    private int seatsAvailable=10;
    public  synchronized void bookTicket(String sPassengerName,int iTicketRequired){
        if(seatsAvailable>=iTicketRequired){
            System.out.println(iTicketRequired+ " Tickets are booked successfully for : "+sPassengerName);
            seatsAvailable=seatsAvailable-iTicketRequired;
        }else System.out.println(iTicketRequired+" Tickets are not available for : "+sPassengerName);
    }

}
