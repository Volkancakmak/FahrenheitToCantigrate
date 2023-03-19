import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.print("Enter the value in fahrenheit:");
        double temperature= scanner.nextDouble();
        temperature=((temperature-32)*5)/9;

        System.out.print("value in centigrade:"+temperature);

    }
}
