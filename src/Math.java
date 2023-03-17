public class Math extends School{
    private boolean isMathClass;
    public Math(String principal, int studentCount, int Time, int periodic,String Class) {
        super(principal, studentCount, Time, periodic,Class);
    }
    public boolean correctMath(){
        String classes=super.getSpecificClass();
        for(int i=0;i<super.classes[0].length;i++){
            if(classes.equals(super.classes[0][i])){
                return true;
            }
        }
        return false;
    }
}
