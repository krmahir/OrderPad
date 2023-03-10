package Habi_jabi;

public class Module {
    public String getModule() {
        return module;
    }

    public void setModule(String module) {
        this.module = module;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = this.size + size;
    }

    private String module;

    public String[] getStudent_list() {
        return student_list;
    }

    public void setStudent_list(String[] student_list) {
        this.student_list = student_list;
    }

    void add(String id){
        String[] copy = getStudent_list();
        copy[getSize()] = id;
        setSize(1);
        setStudent_list(copy);
    }
    void print(){
        String[] mahir = getStudent_list();
        for(int i = 0; i<getSize();i++){
            System.out.println(mahir[i]);
        }
    }

    private String[] student_list = new String[5];
    private int size = 0;
    public Module(String module_id) {
        setModule(module_id);
    }
    public void enrolment(String stid){

        int check = -1;
        String[] copy = getStudent_list();
        for(int i=0;i<getSize();i++){
            if(copy[i]==stid){
                check++;
                break;
            }
        }
        if(check==-1){
            add(stid);
        }
        else{
            System.out.println("Already Enrolled");
        }
    }
    public void unenrollment(String stid){
        int check = -1,i;
        String[] copy = getStudent_list();
        for(i=0;i<getSize();i++){
            if(copy[i]==stid){
                check++;
                break;
            }
        }
        if(check==-1){
            System.out.println("Not Enrolled");
        }
        else{
            for(int j = i;j<getSize();j++){
                copy[j] = copy[j+1];
            }
            setStudent_list(copy);
            setSize(-1);
        }
    }


}
