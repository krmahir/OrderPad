package Practical_11;

public class Module{
    private String[][] course = new String[3][6];
    private String[][] getCourse(){
        return course;
    }
    public String[][] setCourse(String[][] update){
        course = update;
        return null;
    }

    int check(){
        int i;
        String[][] copy = getCourse();
        for(i = 0;i < copy.length-1;i++){
            if(copy[i][0]==null){
                break;
            }
        }
        return i;
    }
    public void setCourse(String cid, int position){
        course[position][0] = cid;
    }
    public Module(String course_id) {
        setCourse(course_id,check());
    }
    void Custom_enrollment(){
        enroll("CIS2344","U00000001");
        enroll("CIS2344","U00000004");
        enroll("CIS2360","U00000001");
        enroll("CIS2360","U00000003");
        enroll("CIS2360","U00000005");
        enroll("CIM2130","U00000003");
        enroll("CIM2130","U00000004");
        enroll("CIM2130","U00000005");
    }
    int search_course(String cid){
        int i = -1;
        String[][] copy = getCourse();
        for(i=0;i< copy.length;i++){
            if(copy[i][0]==cid){
                break;
            }
        }
        return existance(i);
    }
    int check_st(int cidno,String st){
        int i;
        String[][] copy = getCourse();
        for(i = 0;i < copy[cidno].length;i++){
            if(copy[cidno][i]==st) {
                if(st!=null){i=-2;}
                break;
            }
        }
        return i;
    }

    int existance(int i){
        if(i!=-1){
            return i;
        }
        else {
            System.out.println("Does not exist.");
            return -1;
        }
    }
    void remove(int cidno, String stdno){
        String[][] copy = getCourse();
        for(int i=point_position(cidno,stdno);i<getCourse()[cidno].length;i++){
            copy[cidno][i] = copy[cidno][i+1];
        }
        setCourse(copy);
    }
    int point_position(int cidno, String stdno){
        int i;
        String[][] copy = getCourse();
        for(i = 0;i < copy[cidno].length;i++){
            if(copy[cidno][i]==stdno) {
                break;
            }
        }
        return i;
    }
    public void enroll(String cid, String stid){
        if(search_course(cid)==-1){
            System.out.println("Operation Failed.");
        }
        else{
            if(check_st(search_course(cid),stid)!=-2){
                String[][] copy = getCourse();
                copy[search_course(cid)][check_st(search_course(cid),null)] = stid;
                setCourse(copy);
            }
            else{
                System.out.println("Already Enrolled");
            }
        }
        print();
    }
    public void unenroll(String cid, String stid){
        if(search_course(cid)==-1){
            System.out.println("Operation Failed.");
        }
        else{
            if(check_st(search_course(cid),stid)==-2){

            }
            else{
                System.out.println("Not Enrolled");
            }
        }
    }
    void print(){
        String[][] copy = getCourse();
        for(int i = 0; i<copy.length; i++){
            for(int j = 0;j<copy[i].length;j++){
                System.out.println(copy[i][j]);
            }
        }
    }

}
