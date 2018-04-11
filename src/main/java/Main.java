import java.util.Scanner;

public class Main {
    public static void main(String [ ] args){
        ProcessOrder processOrder = new ProcessOrder();
        Scanner scanner = new Scanner(System.in);
        String s;
        System.out.println("Please input transformation order:");
        if(scanner.hasNext()) {
            s = scanner.nextLine();
            if (s.length() > 50)
                System.out.println("Maximum input length is 50!");
            else
                processOrder.processLoop(s);
        }
        scanner.close();
    }
}
