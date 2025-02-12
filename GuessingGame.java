
import java.util.Random;
import java.util.Scanner;

class Game {
	   private int targetNumber;
	   private final int maxAttempts = 10;
	   
	   Game() {
	       targetNumber = generateRandomNumber();
	   }
	   public int generateRandomNumber() {
	       Random r = new Random();
	       return r.nextInt(1,100);
	   }
	   public int getTargetNumber() {
	       return targetNumber;
	   }
	   public int getMaxAttempts() {
	       return maxAttempts;
	   }
	   
	   public boolean checkGuess(int guess) {
	       if(guess==targetNumber) {
	           System.out.println("Your guess: "+guess);
	           System.out.println("Congratulations! You guessed the correct number "+targetNumber);
	           return true;
	       }else if(guess>targetNumber) {
	           System.out.println("Your guess: "+guess);
	           System.out.println("The number is too high!");
	       }else {
	           System.out.println("Your guess: "+guess);
	           System.out.println("The number is too low!");    
	       }
	       return false;
	   }
	   public boolean checkAttempts(int attemptsLeft) {
	       return attemptsLeft>0;
	   }
	}
	class Player {
	   private String name;
	   private int attempts = 10;
	   public Player(String name) {
	       super();
	       this.name = name;
	   }
	   public String getName() {
	       return name;
	   }
	   public int getAttempts() {
	       return attempts;
	   }
	   public void setName(String name) {
	       this.name = name;
	   }
	   public void makeGuess() {
	       attempts--;
	   }
	   
	   public void showAttempts() {
	       System.out.println("You have "+attempts+" attempts left.");
	   }
	}

	public class GuessingGame {
	public static void main(String[] args) {
	   Game g = new Game();
	   Player p = new Player("Ganesh Patil");
	   Scanner sc = new Scanner(System.in);
	   
	   for(int i = 1;i<=g.getMaxAttempts();i++) {
	       System.out.println("Attempt "+i+" Guess the number:");
	       int num = sc.nextInt();
	       boolean res = g.checkGuess(num);
	       p.makeGuess();
	       p.showAttempts();
	       if(res) {
	           System.out.println("You won Mr/Ms. "+p.getName());
	           break;
	       }
	   }
	   if(g.checkAttempts(p.getAttempts())==false) {
	       System.out.println("You lost Mr/Mrs."+p.getName());
	   }
	   
	}
	}