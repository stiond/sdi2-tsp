package sdi2;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Calculator {

	private JFrame frame;
	private JTextField afisaretext;
	
	double nr1;
	double nr2;
	double total;
	String operator;
	String rez;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 313, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		afisaretext = new JTextField();
		afisaretext.setHorizontalAlignment(SwingConstants.RIGHT);
		afisaretext.setFont(new Font("Arial Black", Font.BOLD, 18));
		afisaretext.setBounds(68, 11, 227, 33);
		frame.getContentPane().add(afisaretext);
		afisaretext.setColumns(10);
		
		JButton but7 = new JButton("7");
		but7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NrIntrod = afisaretext.getText() + but7.getText();
				afisaretext.setText(NrIntrod);
			}
		});
		but7.setFont(new Font("Arial Black", Font.PLAIN, 22));
		but7.setBounds(10, 54, 50, 50);
		frame.getContentPane().add(but7);
		
		JButton but8 = new JButton("8");
		but8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NrIntrod = afisaretext.getText() + but8.getText();
				afisaretext.setText(NrIntrod);
			}
		});
		but8.setFont(new Font("Arial Black", Font.PLAIN, 22));
		but8.setBounds(70, 54, 50, 50);
		frame.getContentPane().add(but8);
		
		JButton but9 = new JButton("9");
		but9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NrIntrod = afisaretext.getText() + but9.getText();
				afisaretext.setText(NrIntrod);
			}
		});
		but9.setFont(new Font("Arial Black", Font.PLAIN, 22));
		but9.setBounds(130, 54, 50, 50);
		frame.getContentPane().add(but9);
		
		JButton butbksp = new JButton("\uF0E7");
		butbksp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String bkspace = null;
				if(afisaretext.getText().lenght()>0){
					StringBuilder str1 = StringBuilder(afisaretext.getText());
					str1.deleteCharAt(afisaretext.getText().lenght()-1);
					bkspace = str1.toString();
					afisaretext.setText(bkspace);
				}
			}
		});
		butbksp.setFont(new Font("Wingdings", Font.PLAIN, 14));
		butbksp.setBounds(190, 54, 50, 50);
		frame.getContentPane().add(butbksp);
		
		JButton but4 = new JButton("4");
		but4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NrIntrod = afisaretext.getText() + but4.getText();
				afisaretext.setText(NrIntrod);
			}
		});
		but4.setFont(new Font("Arial Black", Font.PLAIN, 22));
		but4.setBounds(10, 110, 50, 50);
		frame.getContentPane().add(but4);
		
		JButton but5 = new JButton("5");
		but5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NrIntrod = afisaretext.getText() + but5.getText();
				afisaretext.setText(NrIntrod);
			}
		});
		but5.setFont(new Font("Arial Black", Font.PLAIN, 22));
		but5.setBounds(70, 110, 50, 50);
		frame.getContentPane().add(but5);
		
		JButton but6 = new JButton("6");
		but6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NrIntrod = afisaretext.getText() + but6.getText();
				afisaretext.setText(NrIntrod);
			}
		});
		but6.setFont(new Font("Arial Black", Font.PLAIN, 22));
		but6.setBounds(130, 110, 50, 50);
		frame.getContentPane().add(but6);
		
		JButton butcl = new JButton("C");
		butcl.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				afisaretext.setText(null);
			}
		});
		butcl.setFont(new Font("Arial Black", Font.PLAIN, 18));
		butcl.setBounds(250, 54, 50, 50);
		frame.getContentPane().add(butcl);
		
		JButton but3 = new JButton("3");
		but3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NrIntrod = afisaretext.getText() + but3.getText();
				afisaretext.setText(NrIntrod);
			}
		});
		but3.setFont(new Font("Arial Black", Font.PLAIN, 22));
		but3.setBounds(10, 165, 50, 50);
		frame.getContentPane().add(but3);
		
		JButton but2 = new JButton("2");
		but2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NrIntrod = afisaretext.getText() + but2.getText();
				afisaretext.setText(NrIntrod);
			}
		});
		but2.setFont(new Font("Arial Black", Font.PLAIN, 22));
		but2.setBounds(70, 165, 50, 50);
		frame.getContentPane().add(but2);
		
		JButton but1 = new JButton("1");
		but1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NrIntrod = afisaretext.getText() + but1.getText();
				afisaretext.setText(NrIntrod);
			}
		});
		but1.setFont(new Font("Arial Black", Font.PLAIN, 22));
		but1.setBounds(130, 165, 50, 50);
		frame.getContentPane().add(but1);
		
		JButton butmin = new JButton("-");
		butmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nr1 = Double.parseDouble(afisaretext.getText());
				afisaretext.setText("");
				operator = "-";
			}
		});
		butmin.setFont(new Font("Arial Black", Font.PLAIN, 22));
		butmin.setBounds(250, 110, 50, 50);
		frame.getContentPane().add(butmin);
		
		JButton but0 = new JButton("0");
		but0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String NrIntrod = afisaretext.getText() + but0.getText();
				afisaretext.setText(NrIntrod);
			}
		});
		but0.setFont(new Font("Arial Black", Font.PLAIN, 22));
		but0.setBounds(10, 220, 50, 50);
		frame.getContentPane().add(but0);
		
		JButton butplus = new JButton("+");
		butplus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nr1 = Double.parseDouble(afisaretext.getText());
				afisaretext.setText("");
				operator = "+";
			}
		});
		butplus.setFont(new Font("Arial Black", Font.PLAIN, 22));
		butplus.setBounds(190, 110, 50, 50);
		frame.getContentPane().add(butplus);
		
		JButton butinm = new JButton("*");
		butinm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nr1 = Double.parseDouble(afisaretext.getText());
				afisaretext.setText("");
				operator = "*";
			}
		});
		butinm.setFont(new Font("Arial Black", Font.PLAIN, 22));
		butinm.setBounds(190, 165, 50, 50);
		frame.getContentPane().add(butinm);
		
		JButton butimp = new JButton("/");
		butimp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nr1 = Double.parseDouble(afisaretext.getText());
				afisaretext.setText("");
				operator = "/";
			}
		});
		butimp.setFont(new Font("Arial Black", Font.PLAIN, 22));
		butimp.setBounds(250, 165, 50, 50);
		frame.getContentPane().add(butimp);
		
		JButton butegal = new JButton("=");
		butegal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String rez;
				nr2 = Double.parseDouble(afisaretext.getText());
				if (operator == "+"){
					total = nr1 + nr2;
					rez = String.format("%.2f",total);
					afisaretext.setText(rez);
				}
				else if (operator == "-"){
					total = nr1 - nr2;
					rez = String.format("%.2f",total);
					afisaretext.setText(rez);
				}
				else if (operator == "*"){
					total = nr1 * nr2;
					rez = String.format("%.2f",total);
					afisaretext.setText(rez);
				}
				else if (operator == "/"){
					total = nr1 / nr2;
					rez = String.format("%.2f",total);
					afisaretext.setText(rez);
				}
			}
		});
		butegal.setFont(new Font("Arial Black", Font.PLAIN, 22));
		butegal.setBounds(70, 220, 230, 50);
		frame.getContentPane().add(butegal);
		
		JTextArea anmaster = new JTextArea();
		anmaster.setBackground(Color.BLUE);
		anmaster.setForeground(Color.WHITE);
		anmaster.setFont(new Font("Monospaced", Font.BOLD, 18));
		anmaster.setEditable(false);
		anmaster.setText("SDI2");
		anmaster.setBounds(10, 11, 48, 33);
		frame.getContentPane().add(anmaster);
	}
}
