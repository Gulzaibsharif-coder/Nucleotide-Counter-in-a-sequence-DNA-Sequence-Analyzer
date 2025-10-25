package labtask51;
import java.util.Scanner;

public class Labtask51 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int totalA = 0, totalT = 0, totalG = 0, totalC = 0;
        int totalBases = 0;

        System.out.println("Enter DNA sequences (type 'stop' to finish):");

        while (true) {
            System.out.print("Sequence: ");
            String seq = sc.nextLine().toUpperCase();

            if (seq.equalsIgnoreCase("stop")) {
                break; 
            }

            System.out.println("You entered: " + seq);

            int countA = 0, countT = 0, countG = 0, countC = 0;

          
            for (int i = 0; i < seq.length(); i++) {
                char base = seq.charAt(i);
                switch (base) {
                    case 'A': countA++; break;
                    case 'T': countT++; break;
                    case 'G': countG++; break;
                    case 'C': countC++; break;
                }
            }

            // update totals
            totalA += countA;
            totalT += countT;
            totalG += countG;
            totalC += countC;
            totalBases += seq.length();

            
            System.out.println("Sequence counts:");
            System.out.println("A: " + countA + ", T: " + countT + ", G: " + countG + ", C: " + countC);
            System.out.println("---------------------------------------");
        }

        
        if (totalBases > 0) {
            double percA = (totalA * 100.0) / totalBases;
            double percT = (totalT * 100.0) / totalBases;
            double percG = (totalG * 100.0) / totalBases;
            double percC = (totalC * 100.0) / totalBases;

            System.out.println("\nOverall Nucleotide Percentages:");
            System.out.printf("A: %.2f%%\n", percA);
            System.out.printf("T: %.2f%%\n", percT);
            System.out.printf("G: %.2f%%\n", percG);
            System.out.printf("C: %.2f%%\n", percC);
        } else {
            System.out.println("No sequences were entered.");
        }

        sc.close();
    }
}

        