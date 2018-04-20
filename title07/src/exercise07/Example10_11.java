package exercise07;

class MyTv2 {
	private boolean isPowerOn;
	private int channel;
	private int volume;
	int prevChannel;
	
	final int MAX_VOLUME = 100;
	final int MIN_VOLUME = 0;
	final int MAX_CHANNEL = 100;
	final int MIN_CHANNEL = 1;
	
	void setIsPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	} // Example10
	
	boolean getIsPowerOn() {
		return isPowerOn;
	} // Example10
	
	void setChannel(int channel) {
		if(channel > MAX_CHANNEL || channel < MIN_CHANNEL) return; // 유효성 검사
		
		prevChannel = this.channel;
		this.channel = channel;
	} // Example10
	
	int getChannel() {
		return channel;
	} // Example10
	
	void setVolume(int volume) {
		if(volume > MAX_VOLUME || volume < MIN_VOLUME) return; // 유효성 검사
		this.volume = volume;
	} // Example10
	
	int getVolume() {
		return volume;
	} // Example10
	
	void gotoPrevChannel() {
		setChannel(prevChannel);
	}
}

public class Example10_11 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyTv2 t = new MyTv2();
		
		t.setChannel(10);
		System.out.println("CH: " + t.getChannel());
		t.setChannel(20);
		System.out.println("CH: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());
		t.gotoPrevChannel();
		System.out.println("CH: " + t.getChannel());
		
		/*t.setVolume(20);
		System.out.println("VOL: " + t.getVolume());*/
	}

}
