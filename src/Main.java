import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Smartphone smartphone = new Smartphone();

        System.out.print("Enter model name: ");
        String model = sc.nextLine();
        System.out.print("Enter price: ");
        int price = sc.nextInt();

        smartphone.setModel(model);
        smartphone.setPrice(price);

        System.out.println("Rate of " + smartphone.getModel() + " is Rs. " + smartphone.getPrice());
    }
}