import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Classroom theClass=new Classroom();
        Student s1=new Student(1,"Greg");
        Student s2=new Student(2,"John");
        Student s3=new Student(13,"Celine");
        theClass.studentAdd(s1);
        theClass.studentAdd(s2);
        theClass.studentAdd(s3);

        System.out.println(s3);
        System.out.println(s1);


    }
}
class Student{
    private int id;
    private String name;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }

    public Student(int id, String name){
        this.id=id;
        this.name=name;
    }
    public String toString(){
        return "The student name: "+getId()+" and name: "+getName();
    }
}
class Classroom{
    public Classroom(){}
    ArrayList<Student> kisiler=new ArrayList<Student>();
    public void studentAdd(Student objectOfStudent){
        kisiler.add(objectOfStudent);
    }
}

