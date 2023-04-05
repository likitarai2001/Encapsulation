import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Smartphone sp = new Smartphone();

        System.out.print("Enter model name: ");
        String model = sc.nextLine();
        System.out.print("Enter price: ");
        int price = sc.nextInt();

        sp.setModel(model);
        sp.setPrice(price);

        System.out.println("Rate of " + sp.getModel() + " is Rs. " + sp.getPrice());
    }
}