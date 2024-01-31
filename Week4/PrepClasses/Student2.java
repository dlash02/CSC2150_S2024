package PrepClasses;

public class Student2 {
    private String name;
    private int age;
    private double gpa;

    public Student2(String name, int age, double gpa) {
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public double getGpa(){
        return gpa;
    }
}
