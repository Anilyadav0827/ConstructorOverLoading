public class ExamStudentDemo {
    public String schoolName;
    public String schoolAddress;

    public ExamStudentDemo(String schoolName, String schoolAddress) {
        this.schoolName = schoolName;
        this.schoolAddress = schoolAddress;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ExamStudentDemo{" +
                "schoolName='" + schoolName + '\'' +
                ", schoolAddress='" + schoolAddress + '\'' +
                '}';
    }
}