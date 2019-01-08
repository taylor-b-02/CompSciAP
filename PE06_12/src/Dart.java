import java.util.Scanner;

public class Dart {
    public static boolean [] dartThrow(int r, int d){
        boolean [] booleanArray = new boolean[d];
        for(int i = 0; i < d; i++){
        double xCoord = Math.random() * r;
        double yCoord = Math.random() * r;
        if((Math.pow(xCoord,2) + Math.pow(yCoord,2)) <= r){
            booleanArray[i] = true;
        }
        else{
            booleanArray [i] = false;
        }
       }
       return booleanArray;
    }

    public static double piEstimater(boolean [] h, int d){
        int trueCounter = 0;
        for(int i = 0; i < h.length; i++){
            if(h[i] == true){
                trueCounter++;
            }
        }
        return 4 * ((double)trueCounter / d);
    }

    public static void printer(double [] a){
 
        for(int i = 0; i < a.length; i++){
            System.out.print("Execution " + (i + 1) + ": pi = ");
            System.out.println( a[i]);
        }
    }

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int radius = 1;
        int darts;
        int trials;

        System.out.println("# of Darts: ");
        darts = in.nextInt();
        System.out.println("# of Trials: ");
        trials = in.nextInt();

        double [] arrayOfEstimates = new double [trials];
        int i = 0;
        for(double a : arrayOfEstimates){
           boolean [] hitCounter = dartThrow(radius, darts);
           double piEstimate = piEstimater(hitCounter, darts);
           arrayOfEstimates[i] = piEstimate;
           i++;
        }

        printer(arrayOfEstimates);
    }
}