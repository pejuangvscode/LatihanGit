import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Welcome to the Collaboration Project ===");

        featureByGaby();
        featureByFelix();
        featureByAngga();
        featureByJennifer();
        featureByGrace();
        featureByTeo();
    }

    // Placeholder for Person 1
    public static void featureByGaby() {
        System.out.println("Feature by Gaby: [Perkalian]");
        int num1 = 1;
        int num2 = 2;

        int hasil = num1 * num2;
        System.out.println("Hasil" + num1 + " kali " + num2 + " adalah " + hasil);
    }

    // Placeholder for Person 2
    public static void featureByFelix() {
        System.out.println("Feature by Felix: Simple addition calculator");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        System.out.println("The sum of " + num1 + " and " + num2 + " is " + sum);
    }

    // Placeholder for Person 3
    public static void featureByAngga() {
        System.out.println("Feature by Angga : Perkalian");
         int num1 = 5;
        int num2 = 7;
        
        System.out.println("5x7 = " + num1 * num2);
    }
    }   

    // Placeholder for Person 4
    public static void featureByJennifer() {
        int a = 10;
        int b = 5;
        System.out.println("Feature by Person 4: " + a + b);
    }

    // Placeholder for Person 5
    public static void featureByGrace() {
        System.out.println("Feature by Person 5: [Add your feature here]");
    }

    // Placeholder for Person 6
    public static void featureByTeo() {
        System.out.println("Feature by Teo: Tambah-tambahan");
        
        int num1 = 5;
        int num2 = 7;
        
        System.out.println("5+7 = " + num1 + num2);
    }

    // buat conflict
    public static void testConflict() {
        int a = 6;
        int b = 5;
        System.out.println("conflict testing" + (a-b));
    }
}
//awikwok
