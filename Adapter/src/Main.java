import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Player player = new Player();
        Donate first_bet = new Donate();
        DonateAdapter adapter = new DonateAdapter(first_bet);

        System.out.println("Welcome to VALORANT! To buy a skin you need to enter your cash, and convert money to Radianite Points.");
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your cash(₸): ");
        int num = in.nextInt();

        player.insertTengeIntoATM(adapter,num);
    }
}