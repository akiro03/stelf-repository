import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;

import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

@SuppressWarnings("serial")
public class bungalow extends JFrame implements ActionListener {

	double zahl1 = 0, zahl2 = 0, ergebnis = 0;

	public static final DecimalFormat df = new DecimalFormat("0.00");

	public int[][] Buchungen = new int[10][5];

	Random random = new Random();

	JPanel contentPane;

	JTextField txtNumberOne, txtNumberTwo, txtNumberThree, txtNumberFour, txtNumberFive, txtNumberSix, txtNumberSeven,
			txtNumberEight, txtNumberNine, txtNumberTen, txtNumberEleven;

	JLabel lblNumberOne, lblNumberTwo, lblEndeKalenderwoche, lblWieVielePersonen, lblWelcherBungalowSoll,
			lblKalenderjahr;

	JButton btnBuchen, btnAnzeigen, btnBungalowListe;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bungalow frame = new bungalow();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	bungalow() {

		setBackground(new Color(0, 0, 0));
		setForeground(new Color(255, 255, 255));
		setTitle("Buchung");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 790, 411);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(51, 51, 51));
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		lblNumberOne = new JLabel("Nummer des Bungalows(1-10):");
		lblNumberOne.setForeground(Color.WHITE);
		lblNumberOne.setBackground(Color.WHITE);
		lblNumberOne.setBounds(27, 35, 180, 23);
		contentPane.add(lblNumberOne);

		lblNumberTwo = new JLabel("Start Kalenderwoche (1-52):");
		lblNumberTwo.setForeground(Color.WHITE);
		lblNumberTwo.setBounds(27, 69, 180, 25);
		contentPane.add(lblNumberTwo);

		lblEndeKalenderwoche = new JLabel("Ende Kalenderwoche (1-52):");
		lblEndeKalenderwoche.setForeground(Color.WHITE);
		lblEndeKalenderwoche.setBounds(27, 104, 180, 25);
		contentPane.add(lblEndeKalenderwoche);

		lblKalenderjahr = new JLabel("Jahr ausw\u00E4hlen:");
		lblKalenderjahr.setForeground(Color.WHITE);
		lblKalenderjahr.setBounds(27, 136, 180, 25);
		contentPane.add(lblKalenderjahr);

		lblWieVielePersonen = new JLabel("Wie viele Personen:");
		lblWieVielePersonen.setForeground(Color.WHITE);
		lblWieVielePersonen.setBounds(27, 170, 180, 25);
		contentPane.add(lblWieVielePersonen);

		txtNumberOne = new JTextField();
		txtNumberOne.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberOne.setForeground(new Color(255, 255, 255));
		txtNumberOne.setBackground(Color.DARK_GRAY);
		txtNumberOne.setBounds(220, 36, 118, 20);
		contentPane.add(txtNumberOne);
		txtNumberOne.setColumns(10);

		txtNumberTwo = new JTextField();
		txtNumberTwo.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberTwo.setForeground(new Color(255, 255, 255));
		txtNumberTwo.setBackground(Color.DARK_GRAY);
		txtNumberTwo.setBounds(220, 71, 118, 20);
		contentPane.add(txtNumberTwo);
		txtNumberTwo.setColumns(10);

		txtNumberThree = new JTextField();
		txtNumberThree.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberThree.setForeground(Color.WHITE);
		txtNumberThree.setColumns(10);
		txtNumberThree.setBackground(Color.DARK_GRAY);
		txtNumberThree.setBounds(220, 107, 118, 20);
		contentPane.add(txtNumberThree);

		txtNumberFour = new JTextField();
		txtNumberFour.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberFour.setForeground(Color.WHITE);
		txtNumberFour.setColumns(10);
		txtNumberFour.setBackground(Color.DARK_GRAY);
		txtNumberFour.setBounds(220, 172, 118, 20);
		contentPane.add(txtNumberFour);

		txtNumberFive = new JTextField();
		txtNumberFive.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberFive.setForeground(Color.WHITE);
		txtNumberFive.setColumns(10);
		txtNumberFive.setBackground(Color.DARK_GRAY);
		txtNumberFive.setBounds(563, 71, 190, 20);
		contentPane.add(txtNumberFive);

		txtNumberSix = new JTextField();
		txtNumberSix.setDropMode(DropMode.INSERT);
		txtNumberSix.setEditable(false);
		txtNumberSix.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberSix.setForeground(Color.BLACK);
		txtNumberSix.setColumns(10);
		txtNumberSix.setBackground(Color.LIGHT_GRAY);
		txtNumberSix.setBounds(563, 141, 190, 20);
		contentPane.add(txtNumberSix);

		txtNumberSeven = new JTextField();
		txtNumberSeven.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberSeven.setForeground(Color.BLACK);
		txtNumberSeven.setColumns(10);
		txtNumberSeven.setBackground(Color.LIGHT_GRAY);
		txtNumberSeven.setBounds(563, 172, 190, 20);
		contentPane.add(txtNumberSeven);

		txtNumberEight = new JTextField();
		txtNumberEight.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberEight.setForeground(Color.BLACK);
		txtNumberEight.setColumns(10);
		txtNumberEight.setBackground(Color.LIGHT_GRAY);
		txtNumberEight.setBounds(563, 203, 190, 20);
		contentPane.add(txtNumberEight);

		txtNumberNine = new JTextField();
		txtNumberNine.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberNine.setForeground(Color.BLACK);
		txtNumberNine.setColumns(10);
		txtNumberNine.setBackground(Color.LIGHT_GRAY);
		txtNumberNine.setBounds(563, 265, 190, 20);
		contentPane.add(txtNumberNine);

		txtNumberTen = new JTextField();
		txtNumberTen.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberTen.setForeground(new Color(255, 255, 255));
		txtNumberTen.setBackground(Color.DARK_GRAY);
		txtNumberTen.setBounds(220, 138, 118, 20);
		contentPane.add(txtNumberTen);
		txtNumberTen.setColumns(10);

		txtNumberEleven = new JTextField();
		txtNumberEleven.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberEleven.setForeground(Color.BLACK);
		txtNumberEleven.setColumns(10);
		txtNumberEleven.setBackground(Color.LIGHT_GRAY);
		txtNumberEleven.setBounds(563, 234, 190, 20);
		contentPane.add(txtNumberEleven);

		lblWelcherBungalowSoll = new JLabel(
				"<html><body><center> Welcher Bungalow soll <br>angezeigt werden?</center></body></html>");
		lblWelcherBungalowSoll.setHorizontalAlignment(SwingConstants.CENTER);
		lblWelcherBungalowSoll.setForeground(Color.WHITE);
		lblWelcherBungalowSoll.setBackground(Color.WHITE);
		lblWelcherBungalowSoll.setBounds(553, 35, 200, 30);
		contentPane.add(lblWelcherBungalowSoll);

		btnAnzeigen = new JButton("Anzeigen");
		btnAnzeigen.setForeground(Color.BLACK);
		btnAnzeigen.setBackground(Color.CYAN);
		btnAnzeigen.setBounds(602, 104, 118, 25);
		contentPane.add(btnAnzeigen);
		btnAnzeigen.addActionListener(this);
		btnAnzeigen.setFocusable(false);

		btnBuchen = new JButton("Buchen");
		btnBuchen.setForeground(Color.BLACK);
		btnBuchen.addActionListener(this);
		btnBuchen.setBackground(Color.CYAN);
		btnBuchen.setBounds(110, 220, 110, 25);
		contentPane.add(btnBuchen);
		btnBuchen.setFocusable(false);

		btnBungalowListe = new JButton("Liste");
		btnBungalowListe.setForeground(Color.BLACK);
		btnBungalowListe.setBackground(new Color(175, 238, 238));
		btnBungalowListe.setBounds(350, 35, 110, 25);
		contentPane.add(btnBungalowListe);
		btnBungalowListe.setFocusable(false);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ListeMaxPersonen liste = new ListeMaxPersonen();
		
		if (e.getSource() == btnBuchen || e.getSource() == btnAnzeigen) {
			if (Integer.parseInt(txtNumberTwo.getText()) < 1 && Integer.parseInt(txtNumberTwo.getText()) > 52) {
				txtNumberSix.setText("Fehler!");
				txtNumberSeven.setText("Endwoche");
				txtNumberEight.setText("ist nicht im");
				txtNumberEleven.setText("möglichen Rahmen");
				txtNumberNine.setText("!");
				btnAnzeigen.setVisible(false);

			} else if (Integer.parseInt(txtNumberThree.getText()) < 1
					&& Integer.parseInt(txtNumberThree.getText()) > 52) {
				txtNumberSix.setText("Fehler!");
				txtNumberSeven.setText("AnfangsWoche");
				txtNumberEight.setText("ist nicht im");
				txtNumberEleven.setText("möglichen Rahmen");
				txtNumberNine.setText("!");
				btnAnzeigen.setVisible(false);

			} else if (Integer.parseInt(txtNumberTwo.getText()) >= Integer.parseInt(txtNumberThree.getText())) {
				txtNumberSix.setText("Fehler!");
				txtNumberSeven.setText("Endwoche");
				txtNumberEight.setText("muss später als");
				txtNumberEleven.setText("Anfangswoche sein");
				txtNumberNine.setText("!");
				btnAnzeigen.setVisible(false);
			}else if (Integer.parseInt(txtNumberFour.getText()) > liste.bungPersonen[Integer.parseInt(txtNumberOne.getText())] ) {
				txtNumberSix.setText("Fehler!");
				txtNumberSeven.setText("Personenanzahl");
				txtNumberEight.setText("wurde");
				txtNumberEleven.setText("überschritten");
				txtNumberNine.setText("!");
				btnAnzeigen.setVisible(false);
			} else {
				btnAnzeigen.setVisible(true);
			}
		}

		if (e.getSource() == btnBuchen) {
			Buchungen[Integer.parseInt(txtNumberOne.getText())][0] = Integer.parseInt(txtNumberTwo.getText());
			Buchungen[Integer.parseInt(txtNumberOne.getText())][1] = Integer.parseInt(txtNumberThree.getText());
			Buchungen[Integer.parseInt(txtNumberOne.getText())][2] = Integer.parseInt(txtNumberFour.getText());
			Buchungen[Integer.parseInt(txtNumberOne.getText())][3] = random.nextInt(9999);
			Buchungen[Integer.parseInt(txtNumberOne.getText())][4] = Integer.parseInt(txtNumberTen.getText());
		}

		if (e.getSource() == btnAnzeigen) {
			txtNumberSix.setText("Anfangs Woche: " + Buchungen[Integer.parseInt(txtNumberFive.getText())][0]);
			txtNumberSeven.setText("End Woche: " + Buchungen[Integer.parseInt(txtNumberFive.getText())][1]);
			txtNumberEight.setText("Anzahl Personen: " + Buchungen[Integer.parseInt(txtNumberFive.getText())][2]);
			txtNumberNine.setText("Kundennummer: " + Buchungen[Integer.parseInt(txtNumberFive.getText())][3]);
			txtNumberEleven.setText("Jahr: " + Buchungen[Integer.parseInt(txtNumberFive.getText())][4]);
		}
	}
}
