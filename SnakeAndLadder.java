package Assignment_2;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("single player at start position is : 0");
		int dice = (int) ((Math.random() * 6) + 1);
		System.out.println("to print random number:" + dice);
		int option = (int) (Math.random() * 3);
		int Snake = 1;
		int Ladder = 2;
		int presentposition = 5;
		System.out.println("you are in present position :"+presentposition);
		System.out.println("to get option is 0 it is no play or if u get 1 it isSnake or to get 2 it is Ladder");
		System.out.println("if u got option:"+option);
		if(option == Snake) {
			presentposition = presentposition - dice;
			System.out.println("you are on:"+presentposition);
		}
		else if(option == Ladder) {
			presentposition = presentposition + dice;
			System.out.println("you are present position is:"+ presentposition);
		}
		else {
			System.out.println("you are present position is:"+ presentposition);
		}	
	}
}