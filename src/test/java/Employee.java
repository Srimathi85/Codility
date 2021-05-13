import java.util.Scanner;

public class Employee {
    private int iEmp_id;
    private String sEmp_name;

    public String getEmp_name() {
        return sEmp_name;
    }

    public void setEmp_name(String sEmp_name) {
        this.sEmp_name = sEmp_name;
    }

    public String getDepartment() {
        return sDepartment;
    }

    public void setDepartment(String sDepartment) {
        this.sDepartment = sDepartment;
    }

    private String sDepartment;
    public int getEmp_id(){
        return iEmp_id;
    }
    public void setEmp_id(int iEmp_id){
        this.iEmp_id=iEmp_id;
    }
    public static Employee getEmpDetails(){
        Employee myEmp=new Employee();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Employee ID number : ");
        myEmp.setEmp_id(sc.nextInt());
        System.out.println("Enter the Employee name : ");
        myEmp.setEmp_name(sc.nextLine());
        System.out.println("Enter the Employee Department : ");
        myEmp.setDepartment(sc.nextLine());
        return myEmp;
    }
}
