import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class ListeMaxPersonen extends JFrame {

	private JFrame frmListe;
	private JTextField txtField1;
	private JTextField txtField2;
	private JTextField txtField3;
	private JTextField txtField4;
	private JTextField txtField5;
	private JTextField txtField6;
	private JTextField txtField7;
	private JTextField txtField8;
	private JTextField txtField9;
	private JTextField txtField10;

	// ArrayList<Integer> bungPersonen = new ArrayList<>();
	int[] bungPersonen = new int[10];
	Random random = new Random();

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ListeMaxPersonen window = new ListeMaxPersonen();
					window.frmListe.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	 ListeMaxPersonen() {
		bungalowPersonen();
		frmListe = new JFrame();
		frmListe.setTitle("Liste");
		frmListe.setForeground(Color.WHITE);
		frmListe.setBackground(Color.DARK_GRAY);
		frmListe.setAlwaysOnTop(true);
		frmListe.setBounds(100, 100, 338, 444);
		frmListe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel contentPane = new JPanel();
		contentPane.setLayout(null);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setBackground(new Color(51, 51, 51));
		frmListe.getContentPane().add(contentPane, BorderLayout.CENTER);

		JLabel lblBungalow_1 = new JLabel("Bungalow 1:");
		lblBungalow_1.setForeground(Color.WHITE);
		lblBungalow_1.setBackground(Color.WHITE);
		lblBungalow_1.setBounds(27, 35, 76, 23);
		contentPane.add(lblBungalow_1);

		JLabel lblBungalow_2 = new JLabel("Bungalow 2:");
		lblBungalow_2.setForeground(Color.WHITE);
		lblBungalow_2.setBackground(Color.WHITE);
		lblBungalow_2.setBounds(27, 69, 76, 23);
		contentPane.add(lblBungalow_2);

		JLabel lblBungalow_3 = new JLabel("Bungalow 3:");
		lblBungalow_3.setForeground(Color.WHITE);
		lblBungalow_3.setBackground(Color.WHITE);
		lblBungalow_3.setBounds(27, 103, 76, 23);
		contentPane.add(lblBungalow_3);

		JLabel lblBungalow_4 = new JLabel("Bungalow 4:");
		lblBungalow_4.setForeground(Color.WHITE);
		lblBungalow_4.setBackground(Color.WHITE);
		lblBungalow_4.setBounds(27, 137, 76, 23);
		contentPane.add(lblBungalow_4);

		JLabel lblBungalow_5 = new JLabel("Bungalow 5:");
		lblBungalow_5.setForeground(Color.WHITE);
		lblBungalow_5.setBackground(Color.WHITE);
		lblBungalow_5.setBounds(27, 171, 76, 23);
		contentPane.add(lblBungalow_5);

		JLabel lblBungalow_6 = new JLabel("Bungalow 6:");
		lblBungalow_6.setForeground(Color.WHITE);
		lblBungalow_6.setBackground(Color.WHITE);
		lblBungalow_6.setBounds(27, 205, 76, 23);
		contentPane.add(lblBungalow_6);

		JLabel lblBungalow_7 = new JLabel("Bungalow 7:");
		lblBungalow_7.setForeground(Color.WHITE);
		lblBungalow_7.setBackground(Color.WHITE);
		lblBungalow_7.setBounds(27, 239, 76, 23);
		contentPane.add(lblBungalow_7);

		JLabel lblBungalow_8 = new JLabel("Bungalow 8:");
		lblBungalow_8.setForeground(Color.WHITE);
		lblBungalow_8.setBackground(Color.WHITE);
		lblBungalow_8.setBounds(27, 273, 76, 23);
		contentPane.add(lblBungalow_8);

		JLabel lblBungalow_9 = new JLabel("Bungalow 9:");
		lblBungalow_9.setForeground(Color.WHITE);
		lblBungalow_9.setBackground(Color.WHITE);
		lblBungalow_9.setBounds(27, 307, 76, 23);
		contentPane.add(lblBungalow_9);

		JLabel lblBungalow_10 = new JLabel("Bungalow 10:");
		lblBungalow_10.setForeground(Color.WHITE);
		lblBungalow_10.setBackground(Color.WHITE);
		lblBungalow_10.setBounds(27, 341, 76, 23);
		contentPane.add(lblBungalow_10);

		txtField1 = new JTextField("Max. " + bungPersonen[0] + " Personen");
		txtField1.setEditable(false);
		txtField1.setBounds(113, 38, 154, 20);
		contentPane.add(txtField1);
		txtField1.setColumns(10);

		txtField2 = new JTextField("Max. " + bungPersonen[1] + " Personen");
		txtField2.setEditable(false);
		txtField2.setColumns(10);
		txtField2.setBounds(113, 70, 154, 20);
		contentPane.add(txtField2);

		txtField3 = new JTextField("Max. " + bungPersonen[2] + " Personen");
		txtField3.setEditable(false);
		txtField3.setColumns(10);
		txtField3.setBounds(113, 104, 154, 20);
		contentPane.add(txtField3);

		txtField4 = new JTextField("Max. " + bungPersonen[3] + " Personen");
		txtField4.setEditable(false);
		txtField4.setColumns(10);
		txtField4.setBounds(113, 138, 154, 20);
		contentPane.add(txtField4);

		txtField5 = new JTextField("Max. " + bungPersonen[4] + " Personen");
		txtField5.setEditable(false);
		txtField5.setColumns(10);
		txtField5.setBounds(113, 172, 154, 20);
		contentPane.add(txtField5);

		txtField6 = new JTextField("Max. " + bungPersonen[5] + " Personen");
		txtField6.setEditable(false);
		txtField6.setColumns(10);
		txtField6.setBounds(113, 206, 154, 20);
		contentPane.add(txtField6);

		txtField7 = new JTextField("Max. " + bungPersonen[6] + " Personen");
		txtField7.setEditable(false);
		txtField7.setColumns(10);
		txtField7.setBounds(113, 240, 154, 20);
		contentPane.add(txtField7);

		txtField8 = new JTextField("Max. " + bungPersonen[7] + " Personen");
		txtField8.setEditable(false);
		txtField8.setColumns(10);
		txtField8.setBounds(113, 274, 154, 20);
		contentPane.add(txtField8);

		txtField9 = new JTextField("Max. " + bungPersonen[8] + " Personen");
		txtField9.setEditable(false);
		txtField9.setColumns(10);
		txtField9.setBounds(113, 308, 154, 20);
		contentPane.add(txtField9);

		txtField10 = new JTextField("Max. " + bungPersonen[9] + " Personen");
		txtField10.setEditable(false);
		txtField10.setColumns(10);
		txtField10.setBounds(113, 342, 154, 20);
		contentPane.add(txtField10);
	}

	public void bungalowPersonen() {
		for (int i = 0; i < 10; i++) {
			bungPersonen[i] = random.nextInt(6) + 2;
			System.out.println(i + 1 + ". Bungalow: \t" + bungPersonen[i]);
		}
	}
}
