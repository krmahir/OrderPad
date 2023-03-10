package Habi_jabi;



public class StudentSupportOffice {


    public static void main(String[] args) {
        Student st1 = new Student("U0000001");
        Student st2 = new Student("U0000002");
        Student st3 = new Student("U0000003");
        Student st4 = new Student("U0000004");
        Student st5 = new Student("U0000005");

        Module c1 = new Module("CIS2344");
        Module c2 = new Module("CIS2360");
        Module c3 = new Module("CIM2130");
        c1.enrolment(st1.getStudent_id());
        c1.enrolment(st4.getStudent_id());
        c2.enrolment(st1.getStudent_id());
        c2.enrolment(st3.getStudent_id());
        c2.enrolment(st5.getStudent_id());
        c3.enrolment(st3.getStudent_id());
        c3.enrolment(st4.getStudent_id());
        c3.enrolment(st5.getStudent_id());
        c1.print();
        c2.print();
        c3.print();
        c1.enrolment(st2.getStudent_id());
        c1.enrolment(st3.getStudent_id());
        c1.enrolment(st5.getStudent_id());
        c2.unenrollment(st3.getStudent_id());
        c2.enrolment(st2.getStudent_id());

        c1.print();
        c2.print();




    }

    //
}
