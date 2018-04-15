package example06;

class Time {
	private int hour;
	private int minute;
	private float second;
	
	public Time() { }
	public Time(int hour, int minute, float second) {
		this.hour = hour;
		this.minute = minute;
		this.second = second;
		
		/*System.out.println(minute);
		System.out.println(hour);*/
	}
	
	public int getHour() { return hour; }
	public int getMinute() { return minute; }
	public float getSecond() { return second; }
	
	public void setHour(int hour) {
		if(hour < 0 || hour > 23)
			return;
		
		this.hour = hour;
	}
	
	public void setMinute(int minute) {
		if(minute < 0 || minute > 59)
			return;
		
		this.minute = minute;
	}
	
	public void setSecond(float second) {
		if(second < 0.0 || second > 59.99)
			return;
		
		this.second = second;
	}
	
	public float sumSecond(Time t1, Time t2) {
		if((t1.getSecond() + t2.getSecond()) / 60.00f > 0)
			minute += (int)((t1.getSecond() + t2.getSecond()) / 60.00f);
		//System.out.println((t1.getSecond() + t2.getSecond()) % 60.00f + "초");
		return (t1.getSecond() + t2.getSecond()) % 60.00f;
	}
	
	public int sumMinute(Time t1, Time t2) {
		if((t1.getMinute() + t2.getMinute()) / 60 > 0)
			hour += (t1.getMinute() + t2.getMinute()) / 60;
		return (t1.getMinute() + t2.getMinute()) % 60;
	}
	
	public int sumHour(Time t1, Time t2) {
		return t1.getHour() + t2.getHour();
	}
	
	public Time sum(Time t1, Time t2) {
		Time sumT = new Time();
		sumT.setSecond(sumSecond(t1, t2));
		//System.out.println(sumT.getSecond());
		sumT.setMinute(minute + sumMinute(t1, t2));
		//System.out.println(getMinute());
		sumT.setHour(hour + sumHour(t1, t2));
		//System.out.println(getHour());
		
		//System.out.println(sumT);
		
		return sumT;
	}
	
	public float subSecond(Time t1, Time t2) {
		if(t1.getSecond() < t2.getSecond()) {
			t1.minute--;
			//System.out.println(t1.minute);
			//System.out.println((t1.getSecond() + 60.00f) - t2.getSecond() + "-초 계산");
			return (t1.getSecond() + 60.00f) - t2.getSecond();
		}
		return t1.getSecond() - t2.getSecond();
	}
	
	public int subMinute(Time t1, Time t2) {
		if(t1.getMinute() < t2.getMinute()) {
			t1.hour--;
			/*System.out.println(t1.hour);
			System.out.println((t1.getMinute() + 60) - t2.getMinute());*/
			return (t1.getMinute() + 60) - t2.getMinute();
		}
		return t1.getMinute() - t2.getMinute();
	}
	
	public int subHour(Time t1, Time t2) {
		return t1.getHour() - t2.getHour();
	}
	
	public Time sub(Time t1, Time t2) {
		Time sumT = new Time();
		sumT.setSecond(subSecond(t1, t2));
		//System.out.println(sumT.getSecond());
		sumT.setMinute(subMinute(t1, t2));
		//System.out.println(getMinute());
		sumT.setHour(
				subHour(t1, t2));
		//System.out.println(getHour());
		
		//System.out.println(sumT);
		
		return sumT;
	}
	
	public String toString() {
		return getHour() + "시 " + getMinute() + "분 " + getSecond() + "초 입니다.";
	}
}

public class TimeTest { // p.245

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Time t1 = new Time();
		Time t2 = new Time();
		Time t3 = new Time();
		
		t1.setHour(4);
		t1.setMinute(15);
		t1.setSecond(20.18f);

		t2.setHour(15);
		t2.setMinute(50);
		t2.setSecond(45.00f);
		
		System.out.println(t1);
		System.out.println(t2);
		
		t3 = t3.sum(t1, t2);
		
		System.out.println("시간의 합: " + t3);
		System.out.println();
		
		Time t4 = new Time(6, 30, 52.03f);
		Time t5 = new Time(5, 43, 55.30f);
		
		System.out.println(t4);
		System.out.println(t5);
		
		t3 = t3.sub(t4, t5);
		
		System.out.println("시간의 차: " + t3);
		
	}

}
