package CoreProgramming.ProgrammingElements.Level1;

public class ProfitLoss {
    public static void main(String[] args){
        int costPrice = 129 ;
        int sellingPrice = 191 ;
        int profit = sellingPrice - costPrice ;
        double profitPercentage =  ( profit * 100.0 ) / costPrice ;
        System.out.println("The cost price is INR " + costPrice + " and Selling price is INR " + sellingPrice + "\n" + "The profit is INR " + profit + " and the profit percentage is " + profitPercentage + "%");
    }
}
