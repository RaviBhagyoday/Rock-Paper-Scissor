import java.util.Random;
import java.util.Scanner;
public class game {
    public static void main(String[]args)
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcom To Rock Paper Scissor");
        System.out.println("******************************************");
        System.out.println("******************************************");
        System.out.println(" ");
        System.out.println("1:Rock          2:Paper         3:Scissor ");
        int Player1 = input.nextInt();
        Random number = new Random();
        int Player2;
        Player2 = 1+number.nextInt(3);
        System.out.println("Player 2 Choose " + Player2);
        if(Player1 == Player2)
            System.out.println("Draw");
        else if(Player1==1 && Player2==2)
            System.out.println("Player 2 Win");
        else if(Player1==1 && Player2==3)
            System.out.println("Player 1 Win");
        else if(Player1==2 && Player2==1)
            System.out.println("Player 2 Win");
        else if(Player1==2 && Player2==3)
            System.out.println("Player 1 Win");
        else if(Player1==3 && Player2==1)
            System.out.println("Player 2 Win");
        else if(Player1==3 && Player2==2)
            System.out.println("Player 1 Win");
    }
}
