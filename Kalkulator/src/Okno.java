import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Okno extends JFrame {

	Okno() {

		JPanel p = new JPanel();
		JLabel tekst = new JLabel("Uszanowanko");
		JLabel tekst1 = new JLabel(" ");
		JTextField liczba1;
		JTextField liczba2;

		JButton mnozenie = new JButton("*");
		JButton dzielenie = new JButton("/");
		JButton dodawanie = new JButton("+");
		JButton odejmowanie = new JButton("-");
		JLabel wynik;
		setSize(500, 500);
		setLocation(100, 100);
		setTitle("Kalkulator");
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		liczba1 = new JTextField(20);
		liczba2 = new JTextField(20);
		wynik = new JLabel(" ");
		p.setLayout(new FlowLayout(1));
		p.setLayout(new GridLayout(7, 1));

		mnozenie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = liczba1.getText();
				String s2 = liczba2.getText();
				if (s2.isEmpty() || s1.isEmpty()) {
					wynik.setText("jedna z liczb nie jest wprowadzona");
				} else {
					double l1 = Double.parseDouble(s1);
					double l2 = Integer.parseInt(s2);
					wynik.setText(l1 + " * " + l2 + " = " + l1 * l2);
				}
			}
		});
		dzielenie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = liczba1.getText();
				String s2 = liczba2.getText();
				if (s2.isEmpty() || s1.isEmpty()) {
					wynik.setText("jedna z liczb nie jest wprowadzona");
				} else {
					double l1 = Double.parseDouble(s1);
					double l2 = Double.parseDouble(s2);
					if (l2 == 0) {
						wynik.setText("nie dziel przez 0");
					} else {
						wynik.setText(l1 + " / " + l2 + " = " + l1 / l2);
					}
				}
			}
		});
		dodawanie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = liczba1.getText();
				String s2 = liczba2.getText();
				if (s2.isEmpty() || s1.isEmpty()) {
					wynik.setText("jedna z liczb nie jest wprowadzona");
				} else {
					double l1 = Double.parseDouble(s1);
					double l2 = Double.parseDouble(s2);
					double l3 = l1 + l2;
					wynik.setText(l1 + " + " + l2 + " = " + l3);
				}
			}
		});
		odejmowanie.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s1 = liczba1.getText();
				String s2 = liczba2.getText();
				if (s2.isEmpty() || s1.isEmpty()) {
					wynik.setText("jedna z liczb nie jest wprowadzona");
				} else {
					double l1 = Double.parseDouble(s1);
					double l2 = Double.parseDouble(s2);
					double l3 = l1 - l2;
					wynik.setText(l1 + " - " + l2 + " = " + l3);
				}
			}
		});
		p.setBackground(Color.pink);
		p.add(tekst);
		p.add(tekst1);
		p.add(liczba1);
		p.add(liczba2);
		p.add(mnozenie);
		p.add(dzielenie);
		p.add(dodawanie);
		p.add(odejmowanie);
		p.add(wynik);

		add(p);

	}
}
