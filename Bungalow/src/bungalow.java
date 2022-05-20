import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.Random;

import javax.naming.ContextNotEmptyException;
import javax.swing.DropMode;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
//Test
@SuppressWarnings("serial")
public class bungalow extends JFrame implements ActionListener {
 
	double zahl1 = 0, zahl2 = 0, ergebnis = 0;
 
	public static final DecimalFormat df = new DecimalFormat("0.00");
 
	public int[][] Buchungen = new int[10][4];
	
	Random random = new Random();
 
	private JPanel contentPane;
	private JTextField txtNumberOne;
	private JLabel lblNumberOne;
	private JLabel lblNumberTwo;
	private JTextField txtNumberTwo;
	private JTextField txtNumberThree;
	private JButton btnBuchen;
	private JLabel lblWieVielePersonen;
	private JTextField txtNumberFour;
	private JLabel lblWelcherBungalowSoll;
	private JTextField txtNumberFive;
	private JTextField txtNumberSix;
	private JButton btnAnzeigen;
	private JTextField txtNumberSeven;
	private JTextField txtNumberEight;
	private JTextField txtNumberNine;
 
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
 
	public bungalow() {
 
		setBackground(new Color(0, 0, 0));
		setForeground(new Color(255, 255, 255));
		setTitle("Buchung");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 100, 600, 350);
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
		
 
		txtNumberOne = new JTextField();
		txtNumberOne.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberOne.setForeground(new Color(255, 255, 255));
		txtNumberOne.setBackground(Color.DARK_GRAY);
		txtNumberOne.setBounds(220, 36, 118, 20);
		contentPane.add(txtNumberOne);
		txtNumberOne.setColumns(10);
 
		lblNumberTwo = new JLabel("Start Kalenderwoche (1-51):");
		lblNumberTwo.setForeground(Color.WHITE);
		lblNumberTwo.setBounds(27, 69, 180, 25);
		contentPane.add(lblNumberTwo);
 
		txtNumberTwo = new JTextField();
		txtNumberTwo.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberTwo.setForeground(new Color(255, 255, 255));
		txtNumberTwo.setBackground(Color.DARK_GRAY);
		txtNumberTwo.setBounds(220, 71, 118, 20);
		contentPane.add(txtNumberTwo);
		txtNumberTwo.setColumns(10);
		JLabel lblEndeKalenderwoche = new JLabel("Ende Kalenderwoche (1-51):");
		lblEndeKalenderwoche.setForeground(Color.WHITE);
		lblEndeKalenderwoche.setBounds(27, 104, 180, 25);
		contentPane.add(lblEndeKalenderwoche);
		txtNumberThree = new JTextField();
		txtNumberThree.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberThree.setForeground(Color.WHITE);
		txtNumberThree.setColumns(10);
		txtNumberThree.setBackground(Color.DARK_GRAY);
		txtNumberThree.setBounds(220, 107, 118, 20);
		contentPane.add(txtNumberThree);
		btnBuchen = new JButton("Buchen");
		btnBuchen.setForeground(Color.BLACK);
		btnBuchen.addActionListener(this);
		btnBuchen.setBackground(Color.CYAN);
		btnBuchen.setBounds(110, 190, 110, 25);
		contentPane.add(btnBuchen);
 
		lblWieVielePersonen = new JLabel("WIe viele Personen");
		lblWieVielePersonen.setForeground(Color.WHITE);
		lblWieVielePersonen.setBounds(27, 139, 180, 25);
		contentPane.add(lblWieVielePersonen);
 
		txtNumberFour = new JTextField();
		txtNumberFour.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberFour.setForeground(Color.WHITE);
		txtNumberFour.setColumns(10);
		txtNumberFour.setBackground(Color.DARK_GRAY);
		txtNumberFour.setBounds(220, 142, 118, 20);
		contentPane.add(txtNumberFour);
 
		lblWelcherBungalowSoll = new JLabel("<html><body><center> Welcher Bungalow soll <br>angezeigt werden</center></body></html>");
		lblWelcherBungalowSoll.setForeground(Color.WHITE);
		lblWelcherBungalowSoll.setBackground(Color.WHITE);
		lblWelcherBungalowSoll.setBounds(403, 30, 200, 30);
		contentPane.add(lblWelcherBungalowSoll);
 
		txtNumberFive = new JTextField();
		txtNumberFive.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberFive.setForeground(Color.WHITE);
		txtNumberFive.setColumns(10);
		txtNumberFive.setBackground(Color.DARK_GRAY);
		txtNumberFive.setBounds(411, 72, 118, 20);
		contentPane.add(txtNumberFive);
 
		txtNumberSix = new JTextField();
		txtNumberSix.setDropMode(DropMode.INSERT);
		txtNumberSix.setEditable(false);
		txtNumberSix.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberSix.setForeground(Color.BLACK);
		txtNumberSix.setColumns(10);
		txtNumberSix.setBackground(Color.LIGHT_GRAY);
		txtNumberSix.setBounds(411, 142, 118, 20);
		contentPane.add(txtNumberSix);
 
		btnAnzeigen = new JButton("Anzeigen");
		btnAnzeigen.setForeground(Color.BLACK);
		btnAnzeigen.setBackground(Color.CYAN);
		btnAnzeigen.setBounds(411, 106, 118, 25);
		contentPane.add(btnAnzeigen);
		btnAnzeigen.addActionListener(this);
 
		txtNumberSeven = new JTextField();
		txtNumberSeven.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberSeven.setForeground(Color.BLACK);
		txtNumberSeven.setColumns(10);
		txtNumberSeven.setBackground(Color.LIGHT_GRAY);
		txtNumberSeven.setBounds(411, 172, 118, 20);
		contentPane.add(txtNumberSeven);
 
		txtNumberEight = new JTextField();
		txtNumberEight.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberEight.setForeground(Color.BLACK);
		txtNumberEight.setColumns(10);
		txtNumberEight.setBackground(Color.LIGHT_GRAY);
		txtNumberEight.setBounds(411, 202, 118, 20);
		contentPane.add(txtNumberEight);
		
		txtNumberNine = new JTextField();
		txtNumberNine.setHorizontalAlignment(SwingConstants.CENTER);
		txtNumberNine.setForeground(Color.BLACK);
		txtNumberNine.setColumns(10);
		txtNumberNine.setBackground(Color.LIGHT_GRAY);
		txtNumberNine.setBounds(411, 232, 118, 20);
		contentPane.add(txtNumberNine);
	}
 
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnBuchen) {
			Buchungen[Integer.parseInt(txtNumberOne.getText())][0] = Integer.parseInt(txtNumberTwo.getText());
			Buchungen[Integer.parseInt(txtNumberOne.getText())][1] = Integer.parseInt(txtNumberThree.getText());
			Buchungen[Integer.parseInt(txtNumberOne.getText())][2] = Integer.parseInt(txtNumberFour.getText());
			Buchungen[Integer.parseInt(txtNumberOne.getText())][3] = random.nextInt(9999);
		}
 
		if (e.getSource() == btnAnzeigen) {
			txtNumberSix.setText("Anfangsmonat: " + Buchungen[Integer.parseInt(txtNumberFive.getText())][0]);
			txtNumberSeven.setText("Endemonat: " + Buchungen[Integer.parseInt(txtNumberFive.getText())][1]);
			txtNumberEight.setText("Anzahl Personen: " + Buchungen[Integer.parseInt(txtNumberFive.getText())][2]);
			txtNumberNine.setText("Kundennummer: " + Buchungen[Integer.parseInt(txtNumberFive.getText())][3]);
		}
	}
}
