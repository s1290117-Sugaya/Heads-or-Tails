import java.util.Random;
import java.util.Scanner;

public class index{
	int count_h=0, count_t=0;
	String name = "";

	public void whoAreYou(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Who are you?");
		name = sc.next();
		System.out.println("Hello, "+name+"!");
	}
	public String which(){
		Random rand = new Random();
		if(rand.nextInt(2) == 1){
			count_h++;
			return "Heads";
		}else{
			count_t++;
			return "Tails";
		}
	}
	public void coinToss(){
		System.out.println("Tossing a coin...");
		for(int i=1; i<=3; i++){
			System.out.println("Round "+i+": "+which());
		}
		
		System.out.println("Heads: "+count_h+", Tails: "+count_t);
	}
	public void WinOrLose(){
		if(count_h > count_t) System.out.println("You won!");
		else System.out.println("You lost");
	}

	public static void main(String[] args){
		index i = new index();
		i.whoAreYou();
		i.coinToss();
		i.WinOrLose();
	}
}
