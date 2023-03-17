public class Science extends School{
    public boolean isAP;
    public Science(String principal, int studentCount, int Time, int periodic, String Class) {
        super(principal, studentCount, Time, periodic,Class);
    }
    public boolean isAP(){
        String specific= super.getSpecificClass();
        for(int i=0;i<super.classes[1].length;i++){
        String each=classes[1][i];
            if(specific.contains("AP")&&each.equals(specific)){
            return true;
        }
    }
    return false;}
}
