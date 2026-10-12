package Array;

import java.util.*;

public class Try {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student("raj",101,98));
        list.add(new Student("shiv",105,90));
        list.add(new Student("rim",103,99));

        Collections.sort(list,new MyComparator());
        for (Object s : list){
            System.out.println(s);
        }

    }
}
class Student {
        String name;
        int roll;
        int marks;

    public Student(String name, int roll, int marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }
    public String toString(){
        return name+"\t"+roll+"\t"+marks;
    }
}
class MyComparator implements Comparator<Student>{

    public int compare(Student s1, Student s2) {

            return s1.marks-s2.marks;
        }

    }


