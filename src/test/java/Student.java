public class Student {
    String sName;
    int iRegNo;
    Student(String sName,int iRegNo){
        this.sName=sName;
        this.iRegNo=iRegNo;
    }

    @Override
    public String toString() {
        return "Student{"+"Name : "+sName+", RegNo.: "+iRegNo+"}";
    }


}
