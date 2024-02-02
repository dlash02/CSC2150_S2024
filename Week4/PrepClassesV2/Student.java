package PrepClassesV2;

import java.util.ArrayList;

public class Student {
    private String name;
    private int age;
    private ArrayList<String> grades;
    public Student(String name, int age, ArrayList<String> grades ) {
        this.name = name;
        this.age = age;
        this.grades = grades;
    }
    public Student(String name, int age ) {
        this.name = name;
        this.age = age;
        this.grades = new ArrayList<>();
    }
    public void setAge( int age) {
        this.age = age;
    }

    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }
    public ArrayList<String> getGrades (){
        return  grades;
    }
    public void addGrade( String grade ){
        this.grades.add( grade );
    }
    public double getGPA( ){
        double gpa = 0.0;
        int pts = 0;
        int ct = 0;   int sum = 0;
        for( String grade : grades ){
            if ( grade.equals("A")){
                pts = 4;
            } else if ( grade.equals("B")){
                pts = 3;
            } else if ( grade.equals("C")){
                pts = 2;
            } else if ( grade.equals("D")){
                pts = 1;
            }else if ( grade.equals("F")){
                pts = 0;
            } else {
                throw new    IllegalArgumentException( "Illegal Grade Value:" + grade );
            }
            sum += pts;
            ct++;
        }
        gpa = (double) sum / ct;
        return gpa;
    }
}
