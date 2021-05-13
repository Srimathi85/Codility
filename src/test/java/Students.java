public class Students {
    String sName;
    int iRegNo;
    int[] iMarks=new int[5];
    int iTotal;
    Students(String sName,int iRegNo,int[] iMarks){
        this.sName=sName;
        this.iRegNo=iRegNo;
        this.iMarks=iMarks;
        this.iTotal=calculateTotal(iMarks);
    }
public static int  calculateTotal(int[] iMarks){
        int total=0;
    for (int index = 0; index <iMarks.length ; index++) {
        total+=iMarks[index];
    }
    return total;
}
    @Override
    public String toString() {
        return "Student{"+"Name : "+sName+", RegNo.: "+iRegNo+", Subject1 : "+iMarks[0]+", Subject2 : "+iMarks[1]+", Subject3 : "+iMarks[2]+", Total : "+iTotal+"}";
    }
public int compareTo(Students students){
        int comMarks=Students.this.iTotal;
        return students.iTotal-comMarks;
}

}
