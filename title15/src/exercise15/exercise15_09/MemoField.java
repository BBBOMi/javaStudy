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
		mFile.addSeparator(); // �޴� �и���(separator)�� �ִ´�
		mFile.add(miExit);
		
		mb.add(mFile); // MenuBar�� Menu�� �߰��Ѵ�
		setMenuBar(mb); // Frame�� MenuBar�� ���Խ�Ų��
		
		// �޴��� �̺�Ʈ �ڵ鷯�� ����Ѵ�
		MyHandler handler = new MyHandler();
		miNew.addActionListener(handler);
		miOpen.addActionListener(handler);
		miSaveAs.addActionListener(handler);
		miExit.addActionListener(handler);
		
		setSize(300, 200);
		setVisible(true);
	}
	
	// #09_1
	// ���õ� ������ ������ �о TextArea�� �����ִ� �޼ҵ�
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
				sw.write('\n'); // ���๮�� ���
			}
			
			// StringWriter�� ������ content(TextArea)�� �����ش�
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
	// TextArea�� ������ ������ ���Ͽ� �����ϴ� �޼ҵ�
	void saveAs(String fileName) {
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			fw = new FileWriter(fileName);
			bw = new BufferedWriter(fw);
			
			// content�� �ִ� ������ �����ͼ� BufferedWriter�� ���
			bw.write(content.getText());
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if(bw != null) bw.close();
			} catch(IOException e) { }
		}
	}
	
	// �޴��� Ŭ������ �� �޴��� ó���ڵ�
	class MyHandler implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			String command = e.getActionCommand();
			
			if(command.equals("New")) {
				content.setText("");
			
			} else if(command.equals("Open")) {
				FileDialog fileOpen = new FileDialog(MemoField.this, "���Ͽ���");
				fileOpen.setVisible(true);
				fileName = fileOpen.getDirectory() + fileOpen.getFile();
				System.out.println(fileName);
				
				// ���õ� ������ ������ TextArea�� �����ش�
				fileOpen(fileName);
			
			} else if(command.equals("Save As...")) {
				FileDialog fileSave = new FileDialog(MemoField.this, "��������", FileDialog.SAVE);
				fileSave.setVisible(true);
				fileName = fileSave.getDirectory() + fileSave.getFile();
				System.out.println(fileName);
				
				// ���� TextArea�� ������ ������ ���Ͽ� �����Ѵ�
				saveAs(fileName);
			
			} else if(command.equals("Exit")) {
				System.exit(0); // ���α׷��� �����Ų��
			}
		}
	}
}
