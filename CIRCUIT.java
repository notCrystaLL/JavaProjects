
package circuit;
import java.util.Scanner;

public class CIRCUIT {
    double totalresistance, totalcurrent;
    static double totalvoltage;
        
    static void setVoltageSource(){
        totalvoltage = 24;
    }
        
    static double getTotalCurrent(double V, double R){
        double totalcurrent;
            totalcurrent = V / R;
            return totalcurrent;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Series series = new Series();
        Parallel parallel = new Parallel();
        
        System.out.println("Enter 3 resistance values: ");
        int r1 = input.nextInt();
        int r2 = input.nextInt();
        int r3 = input.nextInt();
        
        setVoltageSource();
        
        series.computeTotalresistance(r1, r2);
        series.disType();
        System.out.printf("\nTotal Resistance in 24 (V): %.2f", series.computeTotalresistance(r1, r2));
        System.out.printf("\nTotal Current in 24 (V): %.2f", getTotalCurrent(totalvoltage, series.computeTotalresistance(r1, r2)));
        
        System.out.println("\n------------------------------------------------------------");
        
        series.computeTotalresistance(r1, r2, r3);
        series.disType();
        System.out.printf("\nTotal Resistance in 24 (V): %.2f", series.computeTotalresistance(r1, r2, r3));
        System.out.printf("\nTotal Current in 24 (V): %.2f", getTotalCurrent(totalvoltage, series.computeTotalresistance(r1, r2, r3)));
        
        System.out.println("\n------------------------------------------------------------");
        
        parallel.computeTotalresistance(r1, r2);
        parallel.disType();
        System.out.printf("\nTotal Resistance in 24 (V): %.2f", parallel.computeTotalresistance(r1, r2));
        System.out.printf("\nTotal Current in 24 (V): %.2f", getTotalCurrent(totalvoltage, parallel.computeTotalresistance(r1, r2)));
        
        System.out.println("\n------------------------------------------------------------");
        
        parallel.computeTotalresistance(r1, r2, r3);
        parallel.disType();
        System.out.printf("\nTotal Resistance in 24 (V): %.2f", parallel.computeTotalresistance(r1, r2, r3));
        System.out.printf("\nTotal Current in 24 (V): %.2f", getTotalCurrent(totalvoltage, parallel.computeTotalresistance(r1, r2, r3)));
        
        System.out.println("\n");
        
    }
    
public interface DisplayCircuitType{
    abstract void disType();
    }   

static class Series extends CIRCUIT implements DisplayCircuitType{
        int numres;
        private double totalresistance;
        
        public double getTotalresistance(){
            return totalresistance;
        }
        
        public void setTotalresistance(double newTotalresistance){
            totalresistance = newTotalresistance;
        }
        
        public double computeTotalresistance(double r1, double r2){
            double totalresistance;
            totalresistance = r1 + r2;
            numres = 2;  
            return totalresistance;
        }
        public double computeTotalresistance(double r1, double r2, double r3){
            double totalresistance;
            totalresistance = r1 + r2 + r3;
            numres = 3;
            return totalresistance;
        }
        
        public void disType(){
            System.out.print("SERIES CONNECTION with " + numres + " resistors");            
        }
        
    }
    
static class Parallel extends CIRCUIT implements DisplayCircuitType{
        int numres;
        private double totalresistance;
        
        public double getTotalresistance(){
            return totalresistance;
        }
        
        public void setTotalresistance(double newTotalresistance){
            totalresistance = newTotalresistance;
        }
        
        
        public double computeTotalresistance(double r1, double r2){
            double totalresistance;
            totalresistance =  1/(1/r1 + 1/r2);
            numres = 2;
            return totalresistance;
        }
        public double computeTotalresistance(double r1, double r2, double r3){
            double totalresistance;
            totalresistance = 1/(1/r1 + 1/r2 + 1/r3);
            numres = 3;     
            return totalresistance;
        }
        
        public void disType(){
            System.out.print("PARALLEL CONNECTION with " + numres + " resistors");
        }
    
}
}
