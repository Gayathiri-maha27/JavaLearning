package Day3;

class Students{
    String name;
    yesterday

    My Java Practice
    int rno;
5 days ago

    git add .
    String dept;
    static String college;
    yesterday

    My Java Practice

5 days ago

    git add .
    public Students(String name,int rno,String dept,String college){
        this.name=name;
        this.rno=rno;
        this.dept=dept;
        this.college=college;
    }
    yesterday

    My Java Practice
    //    No-args Constructor
5 days ago

    git add .
    public Students(){
        yesterday

        My Java Practice

        5 days ago

        git add .
    }
    public void display(){
        yesterday

        My Java Practice
        System.out.println("Name: "+name+"\nRno: "+rno+"\nDept: "+dept+"\nCollege Name: "+college);
        5 days ago

        git add .
    }
}
public class Constructor {
    public static void main(String[] args) {
        yesterday

        My Java Practice
        Students.college="MSAJCE";
        Students s1=new Students("Dilli",26,"IT","MSAJCE");
        5 days ago

        git add .
        s1.display();
        yesterday

        My Java Practice
        System.out.println("--------------------------------------");
        5 days ago

        git add .
        Students s2=new Students();
        s2.name="Rani";
        yesterday

        My Java Practice
        s2.rno=76;
        s2.dept="Civil";
        


        s2.display();


        My Java Practice
        Students s3=new Students();
        s3.name="Atchaya";
        s3.rno=14;
        s3.dept="AIDS";

        s3.display();
        Students s4=new Students();


        My Java Practice
        s4.name="Abi";
        s4.rno=35;
        s4.dept="CSE";
        s4.display();


    }
}