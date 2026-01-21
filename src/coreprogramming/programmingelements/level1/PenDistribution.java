package coreprogramming.programmingelements.level1;

public class PenDistribution {
    public  static void main(String[] args){
        int penCount = 14 ;
        int studentsCount = 3 ;
        double penPerStudent = penCount / studentsCount ;
        double remainingPen = penCount % studentsCount ;
        System.out.println("The Pen per student is " + penPerStudent + " and the remaining pen not distributed is " + remainingPen );
    }
}
