import java.util.Scanner;

public class Vehicle {
   private String sNumber;
   private String sBrandName;
   private int iParkingTime;
    public String getsNumber() {
        return sNumber;
    }

    public void setsNumber(String sNumber) {
        this.sNumber = sNumber;
    }

    public String getsBrandName() {
        return sBrandName;
    }

    public void setsBrandName(String sBrandName) {
        this.sBrandName = sBrandName;
    }

    public  int getParkingTime() {
        return iParkingTime;
    }

    public void setParkingTime(int iParkingTime) {
        this.iParkingTime = iParkingTime;
    }

    Vehicle(String sNumber,String sBrandName,int iParkingTime){
this.sNumber=sNumber;
this.sBrandName=sBrandName;
this.iParkingTime=iParkingTime;
    }
    Vehicle(){

    }
    public static Vehicle getVehicleDetails(){
        Vehicle oVehicle=new Vehicle();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the vehicle  Number : ");
        oVehicle.setsNumber(sc.next());
        System.out.println("Enter the Brand Name : ");
        oVehicle.setsBrandName(sc.next());
        System.out.println("Enter the vehicle ParkingTime : ");
        oVehicle.setParkingTime(sc.nextInt());
        return oVehicle;
    }
    @Override
    public  String toString(){
        return "Vehicle  { Number :"+getsNumber()+" Brand Name : "+getsBrandName()+" Parking Time : "+getParkingTime()+" }";
    }
public int compareTo(Vehicle vehicle){
   // int conParkingTime=Vehicle.this.getParkingTime();
        return this.getParkingTime()- vehicle.getParkingTime();
}

}
