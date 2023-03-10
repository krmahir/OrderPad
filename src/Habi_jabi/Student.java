package Habi_jabi;

public class Student {
    private String student_id;
    public String getStudent_id(){ return student_id; }
    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }

    public Student(String st_id) {
        setStudent_id(st_id);
    }
}
