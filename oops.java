public class oops {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("purva");
        // Student s3 = new Student(123);
        s1.name = "purva";
        s1.rollno = 456 ;
        s1.password = "ppp"
    }  
}
class Student {
    String name ;
    int rollno ;
    String password =

    Student (){
        System.out.println("constructor is called");
    }
    Student (String name){
       this.name = name; 
       System.out.println("purva");
    }
    Student (int rollno){
        this.rollno= rollno;
        System.out.println(123);
    }
}
