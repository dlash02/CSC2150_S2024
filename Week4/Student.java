public class Student {
    // properities or attributes
    private String name;
    private int age;
    private String major;
    public String sport;
    public Student(String name, int age, String m) {
        this.name = name;
        this.age = age;
         major = m;
        sport = "football";
    }

    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getMajor() {
        return major;
    }
}
