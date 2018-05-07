package exercise15.exercise15_09;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class MemoField extends Frame {
	String fileName;
	TextArea content;
	MenuBar mb;
	Menu mFile;
	MenuItem miNew, miOpen, miSaveAs, miExit;
	
	MemoField(String title) {
		super(title);
		content = new TextArea();
		add(content);
		
		mb = new MenuBar();
		mFile = new Menu("File");
		
		miNew = new MenuItem("New");
		miOpen = new MenuItem("Open");
		miSaveAs = new MenuItem("SaveAs...");
		miExit = new MenuItem("Exit");
		
		mFile.add(miNew);
		mFile.add(miOpen);
		mFile.add(miSaveAs);
		mFile.addSeparator(); // 메뉴 분리선(separator)을 넣는다
		mFile.add(miExit);
		
		mb.add(mFile); // MenuBar에 Menu를 추가한다
		setMenuBar(mb); // Frame에 MenuBar를 포함시킨다
		
		// 메뉴에 이벤트 핸들러를 등록한다
		MyHandler handler = new MyHandler();
		miNew.addActionListener(handler);
		miOpen.addActionListener(handler);
		miSaveAs.addActionListener(handler);
		miExit.addActionListener(handler);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	// #09_1
	// 선택된 파일의 내용을 읽어서 TextArea에 보여주는 메소드
	void fileOpen(String fileName) {
		FileReader fr = null;
		BufferedReader br = null;
		StringWriter sw = null;
		
		try {
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			sw = new StringWriter();
			
			String line = "";
			
			if((line = br.readLine()) != null) {
				sw.write(line);
				sw.write('\n'); // 개행문자 출력
			}
			
			// StringWriter의 내용을 content(TextArea)에 보여준다
			content.setText(sw.toString());
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(br != null) {
					br.close();
				}
			} catch(IOException e) { }
		}
	}
	
	// #09_2
	// TextArea의 내용을 지정된 파일에 저장하는 메소드
	void saveAs(String fileName) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			
			// content에 있는 내용을 가져와서 BufferedWriter에 출력
			bw.write(content.getText());
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
			} catch(IOException e) { }
		}
	}
	
	// 메뉴를 클릭했을 때 메뉴별 처리코드
	class MyHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			
			if(command.equals("New")) {
				content.setText("");
			
			} else if(command.equals("Open")) {
				FileDialog fileOpen = new FileDialog(MemoField.this, "파일열기");
				fileOpen.setVisible(true);
				fileName = fileOpen.getDirectory() + fileOpen.getFile();
				System.out.println(fileName);
				
				// 선택된 파일의 내용을 TextArea에 보여준다
				fileOpen(fileName);
			
			} else if(command.equals("Save As...")) {
				FileDialog fileSave = new FileDialog(MemoField.this, "파일저장", FileDialog.SAVE);
				fileSave.setVisible(true);
				fileName = fileSave.getDirectory() + fileSave.getFile();
				System.out.println(fileName);
				
				// 현재 TextArea의 내용을 선택한 파일에 저장한다
				saveAs(fileName);
			
			} else if(command.equals("Exit")) {
				System.exit(0); // 프로그램을 종료시킨다
			}
		}
	}
}
