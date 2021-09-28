package Assignment_2;

public class SnakeAndLadder {
	int OptionMethod() {
		int option = (int) (Math.random() * 3);
		System.out.println("to get option is 0 it is no play or if u get 1 it isSnake or to get 2 it is Ladder");
		System.out.println("if u got option:"+option);	
		return option;
	}
		int play() {
			int presentposition = 0;
			int NumberOfTimesDiceRolled = 0;
			while(presentposition < 100) {
				NumberOfTimesDiceRolled++;
				SnakeAndLadder Playing = new SnakeAndLadder();
				int diceRoll = (int)((Math.random() * 6) + 1);
				System.out.println("to print random number:" + diceRoll);
				switch(Playing .OptionMethod() ) {
				case 1:
					presentposition += diceRoll;
					if(presentposition > 100)
						presentposition = presentposition - diceRoll;
					System.out.println("you are present position:"+ presentposition);
					int extraRoll = (int)((Math.random() * 6) + 1);
					System.out.println("The extra roll for getting Ladder and you get number :" + extraRoll);
					presentposition = presentposition + extraRoll;
					if(presentposition > 100)
						presentposition = presentposition - extraRoll;
					System.out.println("you are present position:"+ presentposition);
					break;
				case 2:
					presentposition = presentposition - diceRoll;
					if(presentposition < 0)
						presentposition = 0;
					System.out.println("you are present position:"+ presentposition);
					break;
				default:
					System.out.println("you are present position:"+ presentposition);
				}
			}
				return NumberOfTimesDiceRolled;
		}
		public static void main(String[] args) {
			SnakeAndLadder game = new SnakeAndLadder();
			int PlayerOne = game.play();
			int PlayerTwo = game.play();
			System.out.println("Number of Two dice rolled by playerone to reach 100:" + PlayerOne);
			System.out.println("Number of Two dice rolled by playertwo to reach 100:" + PlayerTwo);
			if(PlayerOne < PlayerTwo) {
				System.out.println("playerone is winner");
			}
			else
				System.out.println("playerone is winner");
	}
}