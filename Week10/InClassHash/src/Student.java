public class Student {
//    First Name,Last Name,Birth Year,GPA,Major,Student ID
//    Harry,Potter,2006,3.8,DarkArts,123456
    private String firstName;
    private String lastName;
    private int birthYear;
    private double gpa;
    private String major;
    private int studentID;

    public Student(String firstName, String lastName, int birthYear, double gpa, String major, int studentID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthYear = birthYear;
        this.gpa = gpa;
        this.major = major;
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public double getGpa() {
        return gpa;
    }

    public String getMajor() {
        return major;
    }

    public int getStudentID() {
        return studentID;
    }

    @Override
    public String toString() {
        return
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthYear=" + birthYear +
                ", gpa=" + gpa +
                ", major='" + major + '\'' +
                ", studentID=" + studentID;
    }
}
