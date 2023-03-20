import java.util.*;
class guesser{
	int guesser=0;
	int guess() {
		System.out.println("gueeser please guess one number under 20");
		Scanner sc= new Scanner(System.in);
		guesser=sc.nextInt();
        if(guesser>20) {
        	System.out.println("you have entered number which is out of bound please retry");
        	System.exit(0);
        	}
        return guesser;
	}
}
class player1{
	int gplayer1=0;
	int gplayer1() {
	System.out.println("player1 please guess one number under 20");
    Scanner sc= new Scanner(System.in);
    gplayer1=sc.nextInt();
    if(gplayer1>20) {
    	System.out.println("you have entered number which is out of bound please retry");
    	System.exit(0);
    	}
    return gplayer1;
	}
}

class player2{
	int gplayer2=0;
	int gplayer2() {
	System.out.println("player2 please guess one number under 20");
    Scanner sc= new Scanner(System.in);
    gplayer2=sc.nextInt();
    if(gplayer2>20) {
    	System.out.println("you have entered number which is out of bound please retry");
    	System.exit(0);
    	}
    return gplayer2;
	}
}

class player3{
	  int gplayer3=0;
	int gplayer3() {
	System.out.println("player3 please guess one number under 20");
    Scanner sc= new Scanner(System.in);
    gplayer3=sc.nextInt();
    if(gplayer3>20) {
    	System.out.println("you have entered number which is out of bound please retry");
    	System.exit(0);
    	}
    return gplayer3;
	 
	}
}
class umpire{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumberFromGuesser() 
	{
		guesser g=new guesser();
		numFromGuesser=g.guess();
		
	}
	void collectNumberFromPlayers() 
	{
		 player1 p1 =new player1();
		 player2 p2 =new player2();
		 player3 p3 =new player3();
		 numFromPlayer1=p1.gplayer1();
		 numFromPlayer2=p2.gplayer2();
		 numFromPlayer3=p3.gplayer3();
	}
	void compare() {
		if(numFromGuesser==numFromPlayer1) {
			if (numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3) 
			{
				System.out.println("All players won the game");
				System.out.println();
				System.out.println("Game Over");
			}
			else if(numFromGuesser==numFromPlayer2) 
			{
				System.out.println("Player 1 and Player 2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3) 
			{
			System.out.println("Player 1 and Player 3 won the game");
			}
			else 
			{
			System.out.println("Player 1 won the game");
			System.out.println();
			System.out.println("Game Over");
			}
		}
		else if (numFromGuesser==numFromPlayer2) 
		{
			if(numFromGuesser==numFromPlayer3) 
			{
				System.out.println("Player 2 and Player 3 won the game");
			}
			else 
			{
				System.out.println("Player 2 won the game");
				System.out.println();
				System.out.println("Game Over");
			}
		}
		else if (numFromGuesser==numFromPlayer3) 
		{
			System.out.println("Player 3 won the game");
			System.out.println();
			System.out.println("Game Over");
		}	
		else 
		{
			System.out.println("All players lost the game and Please try again");
		}
	
		}
	}

public class Guessergame {

	public static void main(String args[]) {
//		guesser g= new guesser();
//		g.guess();
//		player1 p1= new player1();
//		p1.gplayer1();
//		player2 p2= new player2();
//		p2.gplayer2();
		player3 p3= new player3();
	
		umpire u=new umpire();
		u.collectNumberFromGuesser();
		u.collectNumberFromPlayers();
		u.compare();
	}
}
