package OOPS;

public class StudentObjectOOP { //This is a class call StudentObjectOOP, class is like a blueprint for creating objects.
    private String name; //this is example of encapsulation in Java, where the variables are kept private, they can only be accessed by getters and setters in public
    private String college;
    
    public StudentObjectOOP(String name, String college) {
        super(); //This is used to call the parent class constructor
        this.name = name; //This is a constructor of the class, where "this" keyword refers to current object, it distinguishes between instance variable name and the constructor parameter name.
        this.college = college;
    }


    //Now here getter and setter are: Getter allow read access to private fields, and setters allow modifying the private fields.
    public String getName() {
        return name;
    }
    
    public void setName (String name){
        this.name = name;
    }
    
    public String getCollege() {
        return college;
    }
    
    public void setCollege(String college) {
        this.college = college;
    }

    public static void main(String[] args) {
        //Creating an object of the class StudentObjectOOP using the constructor, each object represents a studnet with name and a college.
        StudentObjectOOP student = new StudentObjectOOP("Yanice", "Seneca");
        StudentObjectOOP student1 = new StudentObjectOOP("Santos", "SIA");
        StudentObjectOOP student2 = new StudentObjectOOP("Hwasa", "Mamamoo");
        System.out.println(
                "Student name: " + student.name + " \nStudent College: " + student.college + "\n" +
                        "Student name: " + student1.name + " \nStudent College: " + student1.college + "\n" +
                        "Student name: " + student2.name + " \nStudent College: " + student2.college
        );

    }
}
