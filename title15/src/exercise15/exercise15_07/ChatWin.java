package exercise15.exercise15_07;

import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class ChatWin extends Frame {
	String nickname = "";
	TextArea ta = new TextArea();
	Panel p = new Panel();
	TextField tf = new TextField(30);
	Button bSave = new Button("저장");
	
	ChatWin(String nickname) {
		super("Chatting");
		this.nickname = nickname;
		
		setBounds(200, 100, 300, 200);
		
		p.setLayout(new FlowLayout());
		p.add(tf);
		p.add(bSave);
		
		add(ta, "Center");
		add(p, "South");
		
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		});
		
		bSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				FileDialog fileSave = new FileDialog(ChatWin.this, "파일저장", FileDialog.SAVE);
				fileSave.setVisible(true);
				String fileName = fileSave.getDirectory() + fileSave.getFile();
				
				saveAs(fileName);
			}
		});
		
		EventHandler handler = new EventHandler();
		ta.addFocusListener(handler);
		tf.addFocusListener(handler);
		tf.addActionListener(handler);
		
		ta.setText("#" + nickname + "님 즐거운 채팅되세요.");
		ta.setEditable(false);
		
		setResizable(false);
		setVisible(true);
		tf.requestFocus();
	}
	
	// #07
	void saveAs(String fileName) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		 try {
			 fw = new FileWriter(fileName);
			 bw = new BufferedWriter(fw);
			 bw.write(ta.getText()); // TextArea의 내용을 파일에 저장한다.
		 } catch(IOException e) {
			 e.printStackTrace();
		 } finally {
			 try {
				 if(bw != null) bw.close();
			 } catch(IOException e) { }
		 }
	}
	
	class EventHandler extends FocusAdapter implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String msg = tf.getText();
			if("".equals(msg)) return;
			
			ta.append("\r\n" + nickname + ">" + msg);
			tf.setText("");
		}
		
		public void focusGained(FocusEvent e) {
			tf.requestFocus();
		}
	}

}