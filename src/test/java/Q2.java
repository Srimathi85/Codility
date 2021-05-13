/*
 *2. Write a java program to store 5 student information and award the students with 1st rank,
 *  2nd rank and 3rd rank according to marks obtained where each student has student name,
 *  student marks and student reg no information
 */


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Q2 {
public static ArrayList<Students> createStudentList(){
    ArrayList<Students> myStudentsList=new ArrayList<Students>();
    myStudentsList.add(new Students("Arthi",101, new int[]{69, 58, 50}));
    myStudentsList.add(new Students("Beena",102, new int[]{67, 78, 80}));
    myStudentsList.add(new Students("Devi",103, new int[]{78, 67, 60}));
    myStudentsList.add(new Students("Saran",104, new int[]{65, 75, 70}));
    myStudentsList.add(new Students("Uma",105, new int[]{45, 58, 60}));
return myStudentsList;
}
public static ArrayList<Students> sortList(ArrayList<Students> myList){
    myList.sort(Students::compareTo);
     return myList;
}
public static Students displayStudentRank(ArrayList<Students> myStudentList,int iRankPosition){
    return myStudentList.get(iRankPosition - 1);

}

    public static void main(String[] args) {
    ArrayList<Students> myStudentList=Q2.createStudentList();
        System.out.println("Before Sorting :"+myStudentList);
        System.out.println("The sorted List"+Q2.sortList(myStudentList));
        System.out.println("The First Rank holder : "+Q2.displayStudentRank(myStudentList,1));
        System.out.println("The Second Rank holder : "+Q2.displayStudentRank(myStudentList,2));
        System.out.println("The Third Rank holder : "+Q2.displayStudentRank(myStudentList,3));

    }
}
