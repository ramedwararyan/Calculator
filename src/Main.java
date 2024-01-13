import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        System.out.println("Tax Calculator App");
        System.out.println("-----WELCOME------");
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter total person count: ");
        int count = scan.nextInt();
        String[] name = new String[count];
        long[] income = new long[count];
        int j = 1;
        for (int i = 0; i < count; i++){
            scan.nextLine();
            System.out.println("Enter name " + j + ": ");
            name[i] = scan.nextLine();
            System.out.println("Enter " + name[i] + "'s Annual Income: ");
            income[i] = scan.nextLong();
            j++;
        }
        for(int a = 0; a < count; a++) {
            calculateTax(name[a], income[a]);
        }
    }
    public static void calculateTax(String name, long income) {
        long tax;
        if (income >= 300000) {
            tax = income * 20 / 100;
        }
        else if (income >= 100000 && income < 300000){
            tax = income * 10 / 100;
        }
        else{
            tax = income * 0;
        }
        System.out.println(name + " : " +  + tax);
    }
}







