package example15.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* 직렬화 되지 않는 조상으로부터  상속받은 인스턴스변수에 대한 직렬화를 구현*/
class SuperUserInfo {
	String name;
	String password;
	
	SuperUserInfo() {
		this("Unknown", "1111");
	}
	
	SuperUserInfo(String name, String password) {
		this.name = name;
		this.password = password;
	}
}

public class UserInfo2 extends SuperUserInfo implements java.io.Serializable { // p.942
	int age;
	
	public UserInfo2() {
		this("Unknown", "1111", 0);
	}
	
	public UserInfo2(String name, String password, int age) {
		super(name, password);
		this.age = age;
	}
	
	public String toString() {
		return "(" + name +", " + password + ", " + age + ")";
	}
	
	// writeObject()/readObject()를 추가해 조상으로 부터 상속받은 name, password가 직접 직렬화되도혹 해야 한다
	// 직렬화/역직렬화 작업시에 자동적으로 호출
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(password);
		out.defaultWriteObject(); // 자신에 정의된 인스턴스변수 age의 직렬화를 수행
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
}
