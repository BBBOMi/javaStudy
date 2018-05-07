package exercise15.exercise15_07;

public class Exercise07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		if(args.length != 1) {
			System.out.println("USAGE: java Exercise07 NICKNAME");
			System.exit(0);
		}
		
		new ChatWin(args[0]);
	}

}