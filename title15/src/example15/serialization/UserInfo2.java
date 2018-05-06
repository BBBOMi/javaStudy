package example15.serialization;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/* ����ȭ ���� �ʴ� �������κ���  ��ӹ��� �ν��Ͻ������� ���� ����ȭ�� ����*/
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
	
	// writeObject()/readObject()�� �߰��� �������� ���� ��ӹ��� name, password�� ���� ����ȭ�ǵ�Ȥ �ؾ� �Ѵ�
	// ����ȭ/������ȭ �۾��ÿ� �ڵ������� ȣ��
	private void writeObject(ObjectOutputStream out) throws IOException {
		out.writeUTF(name);
		out.writeUTF(password);
		out.defaultWriteObject(); // �ڽſ� ���ǵ� �ν��Ͻ����� age�� ����ȭ�� ����
	}

	private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
		name = in.readUTF();
		password = in.readUTF();
		in.defaultReadObject();
	}
}
