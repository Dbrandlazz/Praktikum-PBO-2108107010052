import java.util.Scanner;

public class No2 {
    
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        double nilai;
        System.out.print("Masukkan nilai: ");
        nilai = input.nextDouble();

        if(nilai < 41){
            System.out.println("Grade E -> 0.00");
        }
        else if (nilai >= 41 && nilai < 51){
            System.out.println("Grade D -> 1.00");
        }
        else if (nilai >= 51 && nilai < 60){
            System.out.println("Grade C -> 2.00");
        }
        else if (nilai >= 60 && nilai < 69){
            System.out.println("Grade BC -> 2.50");
        }
        else if (nilai >= 69 && nilai < 78){
            System.out.println("Grade B -> 3.00");
        }
        else if (nilai >= 78 && nilai < 87){
            System.out.println("Grade AB -> 3.50");
        }
        else if (nilai >= 87 && nilai <= 100){
            System.out.print("Grade A -> 4.00");
        }
        else {
            System.out.println("Invalid!");
        }
    }
}
