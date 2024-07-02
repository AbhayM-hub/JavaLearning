public class StaticMethod {
    public static void main(String[] args) {
        Student.change();
        Student s1 = new Student(01,"Abhay");
        Student s2 = new Student(02,"Abhi");
        Student s3 = new Student(03,"Saurav");

        s1.display();
        s2.display();
        s3.display();


    }
}

class Student{
    int rollno;
    String name;
    static String college = "ITS";

    static void change(){
        college="RHS";
    }

    Student(int r, String n){
        rollno = r;
        name = n;
    }

    void display(){
        System.out.println("Roll No: "+rollno+ " Name: " +name);
    }
}