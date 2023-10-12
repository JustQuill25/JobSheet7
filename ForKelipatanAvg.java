import java.util.Scanner;

public class ForKelipatanAvg {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int kelipatan, total = 0, jumlah = 0, counter = 0, average;
        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = input.nextInt();

        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                total += i;
                counter++;
            }
        }
        average = total / counter;

        System.out.println("Banyaknya bilangan " + kelipatan + " dari 1 sampai 50 adalah " + counter);
        System.out.println("Total bilangan kelipatan " + kelipatan + " dari 1 sampai 50 adalah " + total);
        System.out.println("Rata Rata bilangan kelipatan " + kelipatan + " dari 1 sampai 50 adalah " + average);
    }
}