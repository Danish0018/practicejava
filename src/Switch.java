import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int button = sc.nextInt();
        switch(button){
            case 1 : System.out.println("Adil");
            break;
            case 2 : System.out.println("Danish");
            break;
            case 3 : System.out.println("ibrahim");
            break;
            case 4 : System.out.println("Saqib");
            break;
            default: System.out.println("Invalid button");
        }

    }
}
