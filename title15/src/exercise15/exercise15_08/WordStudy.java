package exercise15.exercise15_08;

import java.util.*;
import java.io.*;
import java.awt.*;
import java.awt.event.*;

public class WordStudy extends Frame {
	Button first = new Button("<<");
	Button prev = new Button("<");
	Button next = new Button(">");
	Button last = new Button(">>");
	Panel buttons = new Panel();
	TextArea ta = new TextArea();
	ArrayList wordList = new ArrayList();

	final String WORD_FILE = "word_data.txt";
	final String CR_LF = System.getProperty("line.separator"); // 개행 문자

	int pos = 0;
	
	WordStudy(String title) {
		buttons.add(first);
		buttons.add(prev);
		buttons.add(next);
		buttons.add(last);
		add("South", buttons);
		add("Center", ta);
		
		EventHandler handler = new EventHandler();
		addWindowListener(handler);
		first.addActionListener(handler);
		prev.addActionListener(handler);
		next.addActionListener(handler);
		last.addActionListener(handler);
		
		loadFile(WORD_FILE);
		
		setBackground(Color.BLACK);
		setSize(300, 200);
		setLocation(200, 200);
		setResizable(true);
		setVisible(true);
		
		showFirst();
	}
	
	void showFirst() {
		pos = 0;
		display(pos);
	}
	
	void showPrevious() {
		pos = (pos > 0) ? --pos : 0;	
		display(pos);
	}
	
	void showNext() {
		int size = wordList.size();
		pos = (pos < size-1) ? ++pos : size-1; 
		display(pos);
	}
	
	void showLast() {
		pos = wordList.size() - 1;
		display(pos);
	}
	
	// #08_1
	void display(int pos) {
		String tmp = (String)wordList.get(pos);
		StringBuffer sb = new StringBuffer(tmp.length());
		
		StringTokenizer st = new StringTokenizer(tmp, "|");
		
		while(st.hasMoreTokens()) {
			sb.append(st.nextToken()).append(CR_LF);
		}
		
		ta.setText(sb.toString());
	}
	
	// #08_2
	void loadFile(String fileName) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(fileName));
			String line = "";
			
			while((line = br.readLine()) != null) {
				wordList.add(line);
			}
		} catch(IOException e) {
			System.out.println("데이터 파일을 읽을 수 없습니다.");
			System.exit(1);
		}
	}
	
	class EventHandler extends WindowAdapter implements ActionListener {
		public void  actionPerformed(ActionEvent ae) {
			Button b = (Button)ae.getSource();
			
			if(b == first)
				showFirst();
			else if(b == prev)
				showPrevious();
			else if(b == next)
				showNext();
			else if(b == last)
				showLast();
		}
		
		public void windowClosing(WindowEvent e) {
			System.exit(0);
		}
	}

}
