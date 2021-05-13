/*
*1. Write a java program to store 5 student information in a treeMapNote: student object has student name
*  and student reg no

 *  */

import java.util.TreeMap;

public class Q1 {
public static TreeMap createTreeMap(){
    TreeMap<Integer,Student> studentTreeMap=new TreeMap<Integer, Student>();
    Student student1=new Student("Arthi",101);
    Student student2=new Student("Beena",102);
    Student student3=new Student("Charan",103);
    Student student4=new Student("Devi",104);
    Student student5=new Student("Eva",105);
    studentTreeMap.put(1,student1);
    studentTreeMap.put(2,student2);
    studentTreeMap.put(3,student3);
    studentTreeMap.put(4,student4);
    studentTreeMap.put(5,student5);
    return studentTreeMap;
}

    public static void main(String[] args) {
        System.out.println("My Student Tree Map : "+createTreeMap());

    }
}
