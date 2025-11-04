package Day3;

class Student{
    int rno;
    String name;
    String dept;
    public void display(){
        System.out.println("RNo: "+rno+"\nName: "+name+"\nDept: "+dept);
    }
}
public class Class {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.name="Gayu";
        s1.rno=13;
        s1.dept="IT";
        s1.display();
        System.out.println("---------------------------------");
        Student s2=new Student();
        s2.name="nisha";
        s2.rno=26;
        s2.dept="Mech";
        s2.display();

    }
}
