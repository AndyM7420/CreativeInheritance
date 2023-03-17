public class School {
    String principal;
    int studentCount;
    int Time;
    int periodic;
    String Classes;
    String[][] classes;

    public String getPrincipal() {
        return principal;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public int getTime() {
        return Time;
    }

    public int getPeriodic() {
        return periodic;
    }

    public String[][] getClasses() {
        return classes;
    }

    public School(String principal, int studentCount, int Time, int periodic, String Class){
        this.Classes=Class;
        this.periodic=periodic; this.Time=Time; this.studentCount=studentCount; this.principal=principal;
    classes= new String[][]{{"Pre-Calculus", "Calculus", "Algebra", "Algebra II", "AP Calculus BC", "AP Statistics"},{"AP Chemistry","AP Physics","AP Living environment","Physiology","AP chemistry","Astronomy"},{"Chorus","Drama","Band","Orchestra","AP Music theory","Musical"}};
    }
    public void classPeriod() {
        System.out.println("It is currently " + Time + "and we are in period " + periodic);
    }
    public String getSpecificClass() {
        return Classes;
    }



}
