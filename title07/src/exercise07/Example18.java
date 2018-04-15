/*package exercise07;

public class Example18 {
	public static void action(Robot r) {
		Object obj = r;
		if(obj instanceof Robot) {
			if(obj instanceof DanceRobot)
				obj.dance();
			else if(obj instanceof SingRobot)
				r.sing();
			else if(r instanceof DrawRobot)
				r.draw();
		} else
			return;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for(int i=0; i<arr.length; i++)
			action(arr[i]);
	}

}

class Robot { }

class DanceRobot extends Robot {
	void dance() {
		System.out.println("춤을 춥니다.");
	}
}

class SingRobot extends Robot {
	void sing() {
		System.out.println("노래를 합니다.");
	}
}

class DrawRobot extends Robot {
	void draw() {
		System.out.println("그림을 그립니다.");
	}
}*/