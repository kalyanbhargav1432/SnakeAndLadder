package Assignment_2;

public class SnakeAndLadder {
	public static void main(String[] args) {
		System.out.println("starting of Snake and Ladder game");
		int Snake = 1;
		int Ladder = 2;
		int presentposition = 0;
		System.out.println("starting the game you are in present position :"+ presentposition);
		while(presentposition < 100) {
			int dice = (int) ((Math.random() * 6) + 1);
			System.out.println("to print random number:" + dice);
			int option = (int) (Math.random() * 3);
			System.out.println("to get option is 0 it is no play or if u get 1 it isSnake or to get 2 it is Ladder");
			System.out.println("if u got option:"+option);	
		if(option == Snake) {
			presentposition = presentposition - dice;
			if(presentposition < 0)
				presentposition = 0;
			System.out.println("you are present position:"+ presentposition);
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
}