package HashPrep;
public class Student {
    public String first;
    public String last;
    private int birthYear;
    private double GPA;
    private String major;
    private int sId;

    public Student(String first, String last, int birthYear, double GPA, String major, int sId) {
        this.first = first;
        this.last = last;
        this.birthYear = birthYear;
        this.GPA = GPA;
        this.major = major;
        this.sId = sId;
    }
    public String getFirst() { return first;
    }
    public String getLast() { return last;
    }
    public int getBirthYear() { return birthYear;
    }
    public double getGPA() { return GPA;
    }
    public String getMajor() { return major;
    }
    public int getsId() { return sId;
    }
    @Override
    public String toString() {
        String oStudent = String.format("\n First:%s Last:%s Year:%s GPA:%s Major:%s ID:%s",
                                                 first, last, birthYear, GPA, major, sId);
        return oStudent;
//        return "Student{" +
//                "first='" + first + '\'' +
//                ", last='" + last + '\'' +
//                ", birthYear=" + birthYear +
//                ", GPA=" + GPA +
//                ", major='" + major + '\'' +
//                ", sId=" + sId +
//                '}';
    }
}
