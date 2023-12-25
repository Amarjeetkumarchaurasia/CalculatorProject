import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class CalculatorOriganal extends JFrame implements ActionListener {
	JLabel CalculatorName, heading;
	JTextField txname;
	JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, clear, back, div, mul, add, sub, dot, equal;
	static double a, b, c = 0;
	static char operation;

	CalculatorOriganal() {
		setLayout(null);
		CalculatorName = new JLabel("Calculator");
		CalculatorName.setBounds(100, 10, 365, 50);
		CalculatorName.setFont(new Font("Times New Roman", Font.BOLD, 30));
		add(CalculatorName);

		txname = new JTextField();
		txname.setBounds(10, 60, 365, 60);
		txname.setBackground(Color.gray);
		txname.setForeground(Color.white);
		txname.setFont(new Font("Times New Roman", Font.BOLD, 30));
		add(txname);

		///////////////////////// First Row////////////////////////
		btn1 = new JButton("1");
		btn1.setBounds(10, 130, 80, 60);
		btn1.setFont(new Font("Times New Roman", Font.BOLD, 32));
		add(btn1);

		btn2 = new JButton("2");
		btn2.setBounds(105, 130, 80, 60);
		btn2.setFont(new Font("Times New Roman", Font.BOLD, 32));
		add(btn2);

		btn3 = new JButton("3");
		btn3.setBounds(200, 130, 80, 60);
		btn3.setFont(new Font("Times New Roman", Font.BOLD, 32));
		add(btn3);

		add = new JButton("+");
		add.setBounds(295, 130, 80, 60);
		add.setFont(new Font("Times New Roman", Font.BOLD, 34));
		add(add);

		///////////////////////// Second Row////////////////////////
		btn4 = new JButton("4");
		btn4.setBounds(10, 205, 80, 60);
		btn4.setFont(new Font("Times New Roman", Font.BOLD, 32));
		add(btn4);

		btn5 = new JButton("5");
		btn5.setBounds(105, 205, 80, 60);
		btn5.setFont(new Font("Times New Roman", Font.BOLD, 32));
		add(btn5);

		btn6 = new JButton("6");
		btn6.setBounds(200, 205, 80, 60);
		btn6.setFont(new Font("Times New Roman", Font.BOLD, 32));
		add(btn6);

		sub = new JButton("-");
		sub.setBounds(295, 205, 80, 60);
		sub.setFont(new Font("Times New Roman", Font.BOLD, 34));
		add(sub);

		///////////////////////// Third Row////////////////////////
		btn7 = new JButton("7");
		btn7.setBounds(10, 280, 80, 60);
		btn7.setFont(new Font("Times New Roman", Font.BOLD, 32));
		add(btn7);

		btn8 = new JButton("8");
		btn8.setBounds(105, 280, 80, 60);
		btn8.setFont(new Font("Times New Roman", Font.BOLD, 32));
		add(btn8);

		btn9 = new JButton("9");
		btn9.setBounds(200, 280, 80, 60);
		btn9.setFont(new Font("Times New Roman", Font.BOLD, 32));
		add(btn9);

		mul = new JButton("*");
		mul.setBounds(295, 280, 80,60);
		mul.setFont(new Font("Times New Roman", Font.BOLD, 34));
		add(mul);

		///////////////////////// Fourth Row////////////////////////
		btn0 = new JButton("0");
		btn0.setBounds(10, 355, 80, 60);
		btn0.setFont(new Font("Times New Roman", Font.BOLD, 32));
		add(btn0);

		dot = new JButton(".");
		dot.setBounds(105, 355, 80, 60);
		dot.setFont(new Font("Times New Roman", Font.BOLD, 32));
		add(dot);

		back = new JButton("X");
		back.setBounds(200, 355, 80, 60);
		back.setFont(new Font("Times New Roman", Font.BOLD, 32));
		add(back);

		div = new JButton("/");
		div.setBounds(295, 355, 80, 60);
		div.setFont(new Font("Times New Roman", Font.BOLD, 34));
		add(div);

		///////////////////////// Fifth Row////////////////////////
		equal = new JButton("=");
		equal.setBounds(10, 430, 175, 60);
		equal.setFont(new Font("Times New Roman", Font.BOLD, 34));
		add(equal);

		clear = new JButton("C");
		clear.setBounds(200, 430, 175, 60);
		clear.setFont(new Font("Times New Roman", Font.BOLD, 32));
		add(clear);

		heading = new JLabel("Amarjeet Kumar");
		heading.setBounds(10, 505, 350, 60);
		heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 44));
		add(heading);

		setSize(400, 600);
		setLocation(600, 120);
		setVisible(true);

		/////////////////// Button Number Click Action//////////////
		btn0.addActionListener(this);
		btn1.addActionListener(this);
		btn2.addActionListener(this);
		btn3.addActionListener(this);
		btn4.addActionListener(this);
		btn5.addActionListener(this);
		btn6.addActionListener(this);
		btn7.addActionListener(this);
		btn8.addActionListener(this);
		btn9.addActionListener(this);
		dot.addActionListener(this);
		equal.addActionListener(this);
		clear.addActionListener(this);
		back.addActionListener(this);

		/////////////////// Button Calculate Click Action//////////////
		div.addActionListener(this);
		mul.addActionListener(this);
		add.addActionListener(this);
		sub.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btn0)
			txname.setText(txname.getText().concat("0"));

		if (e.getSource() == btn1)
			txname.setText(txname.getText().concat("1"));

		if (e.getSource() == btn2)
			txname.setText(txname.getText().concat("2"));

		if (e.getSource() == btn3)
			txname.setText(txname.getText().concat("3"));

		if (e.getSource() == btn4)
			txname.setText(txname.getText().concat("4"));

		if (e.getSource() == btn5)
			txname.setText(txname.getText().concat("5"));

		if (e.getSource() == btn6)
			txname.setText(txname.getText().concat("6"));

		if (e.getSource() == btn7)
			txname.setText(txname.getText().concat("7"));

		if (e.getSource() == btn8)
			txname.setText(txname.getText().concat("8"));

		if (e.getSource() == btn9)
			txname.setText(txname.getText().concat("9"));

		if (e.getSource() == dot)
			txname.setText(txname.getText().concat("."));

		if (e.getSource() == div) {
			a = Double.parseDouble(txname.getText());
			operation = 1;
			txname.setText("");
		}
		if (e.getSource() == mul) {
			a = Double.parseDouble(txname.getText());
			operation = 2;
			txname.setText("");
		}
		if (e.getSource() == add) {
			a = Double.parseDouble(txname.getText());
			operation = 3;
			txname.setText("");
		}
		if (e.getSource() == sub) {
			a = Double.parseDouble(txname.getText());
			operation = 4;
			txname.setText("");
		}
		if (e.getSource() == equal) {
			b = Double.parseDouble(txname.getText());
			switch (operation) {
				case 1:
					c = a / b;
					break;
				case 2:
					c = a * b;
					break;
				case 3:
					c = a + b;
					break;
				case 4:
					c = a - b;
					break;
				default:
					JOptionPane.showMessageDialog(null, "Error Corret Input");
			}
			txname.setText(" " + c);
		}
		if (e.getSource() == clear) {
			txname.setText("");
		}

		if (e.getSource() == back) {
			int length = txname.getText().length();
			int number = length - 1;

			if (length > 0) {
				StringBuilder back1 = new StringBuilder(txname.getText());
				back1.deleteCharAt(number);
				txname.setText(back1.toString());
			}
		}
	}

	public static void main(String args[]) {
		new CalculatorOriganal();
	}
}