package PrepClasses;

public class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
}
