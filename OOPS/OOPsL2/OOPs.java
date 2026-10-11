package OOPS.OOPsL2;

class Student{
    String name;
    int age;
    int roll_no;
    boolean markAttendance = false;

    Student(String name,int age,int roll_no,boolean markAttendance){
        this.name = name;
        this.age = age;
        this.roll_no = roll_no;
        this.markAttendance = markAttendance;
    }

    Student(){}

    void printStudentDetail(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + roll_no);
        System.out.println("Mark Attendance: " + markAttendance);
    }

}

public class OOPs {
    public static void main(String[] args) {
       Student s1 = new Student("vipul", 19, 45, true);
       Student s2 = new Student();

       s1.printStudentDetail();
    }
}
