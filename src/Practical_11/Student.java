package Practical_11;

public class Student{
    private String student_id;

    public Student(String id){
        setStudent(id);
    }

    public Student() {
    }
/*
    int check(){
        int i;
        String[] copy = getStudent();
        for(i = 0;i < copy.length-1;i++){
            if(copy[i]==null){
                break;
            }
        }
        return i;
    }*/
    String getStudent(){return student_id;}
    void setStudent(String id){
        //student_id[check()] = id;
       //System.out.println(student_id[check()]);
    }
    /**
    @Override
    public int compareTo(Student o) {
        return 0;
    }
    */

}
// keu ashce upre uthe na ken ke jane
// tumi asooooo????