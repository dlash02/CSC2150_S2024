package Reports;

public class Student {
    private  int StudentID;
    private String FirstName;
    private String LastName;
    private String Major;
    private double gpa;

    public Student(int studentID, String firstName, String LastName, String major, double gpa) {
        StudentID = studentID;
        FirstName = firstName;
        LastName = LastName;
        Major = major;
        this.gpa = gpa;
    }

    public int getStudentID() {
        return StudentID;
    }

    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getMajor() {
        return Major;
    }

    public double getGpa() {
        return gpa;
    }
}
