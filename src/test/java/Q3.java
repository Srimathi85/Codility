import java.util.ArrayList;
import java.util.Collections;

/*
* 3. Write a java program to implement the following Consider vehicle parking application
* where each vehicle information which enters into the parking location stored in 2 lists.
*  at the end of each day these lists to be merged into single list and one vehicle information
* which has highest parked hour should be retrieved, where each vehicle
* information has vehicle number, vehicle model, total duration parked in minutes.*/
public class Q3 {
public static ArrayList<Vehicle> createVehicleList(){
    ArrayList<Vehicle> vehicleArrayList= new ArrayList<Vehicle>();
    return vehicleArrayList;
}
public static ArrayList<Vehicle> addElementInArrayList(ArrayList<Vehicle> vehicleArrayList,Vehicle myVehicle){
    vehicleArrayList.add(myVehicle);
    return vehicleArrayList;
}
/*vehicleArrayList.add();
    vehicleArrayList.add(new Vehicle("CA1235","Audi",30));
    vehicleArrayList.add(new Vehicle("CA1236","Honda",10));
    vehicleArrayList.add(new Vehicle("CA1237","Toyoto",25));*/

    public static void printHighestParkingVehicle(ArrayList<Vehicle> list1,ArrayList<Vehicle> list2){
        list1.addAll(list2);
        list1.sort(Vehicle::compareTo);
        System.out.println("The highest parking vehicle detail : "+list1.get(list1.size()-1).toString());
    }

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicleArrayList1=createVehicleList();
        ArrayList<Vehicle> vehicleArrayList2=createVehicleList();
       Q3.addElementInArrayList (vehicleArrayList1,Vehicle.getVehicleDetails());
        Q3.addElementInArrayList (vehicleArrayList1,Vehicle.getVehicleDetails());
        Q3.addElementInArrayList (vehicleArrayList2,Vehicle.getVehicleDetails());
        Q3.addElementInArrayList (vehicleArrayList2,Vehicle.getVehicleDetails());
        Q3.printHighestParkingVehicle(vehicleArrayList1,vehicleArrayList2);
    }
}
