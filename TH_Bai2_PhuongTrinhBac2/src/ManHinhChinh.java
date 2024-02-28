import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhChinh extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField soA;
	private JTextField soB;
	private JTextField soC;
	private JTextField X;
	private JTextField Y;
	private JTextField KQ;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	public ManHinhChinh() {
		setTitle("PHƯƠNG TRÌNH BÂC 2");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 508, 418);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nhập A");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(99, 26, 92, 40);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập B");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpB.setBounds(99, 77, 92, 40);
		contentPane.add(lblNhpB);
		
		JLabel lblNhpC = new JLabel("Nhập C");
		lblNhpC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpC.setBounds(99, 128, 92, 40);
		contentPane.add(lblNhpC);
		
		soA = new JTextField();
		soA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		soA.setBounds(201, 28, 187, 40);
		contentPane.add(soA);
		soA.setColumns(10);
		
		soB = new JTextField();
		soB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		soB.setColumns(10);
		soB.setBounds(201, 77, 187, 40);
		contentPane.add(soB);
		
		soC = new JTextField();
		soC.setFont(new Font("Tahoma", Font.PLAIN, 16));
		soC.setColumns(10);
		soC.setBounds(201, 128, 187, 40);
		contentPane.add(soC);
		
		JButton btnTinh = new JButton("Kết Quả");
		btnTinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tinh();
			}
		});
		btnTinh.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnTinh.setBounds(201, 201, 100, 34);
		contentPane.add(btnTinh);
		
		X = new JTextField();
		X.setEditable(false);
		X.setBounds(73, 310, 143, 44);
		contentPane.add(X);
		X.setColumns(10);
		
		Y = new JTextField();
		Y.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Y.setEditable(false);
		Y.setColumns(10);
		Y.setBounds(297, 308, 153, 44);
		contentPane.add(Y);
		
		KQ = new JTextField();
		KQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		KQ.setEditable(false);
		KQ.setBounds(80, 257, 346, 34);
		contentPane.add(KQ);
		KQ.setColumns(10);
		
		lblNewLabel_1 = new JLabel("X1");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(29, 317, 53, 27);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("X2");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel_2.setBounds(248, 317, 53, 27);
		contentPane.add(lblNewLabel_2);
	}
	void Tinh() {
		String strA = soA.getText();
		String strB = soB.getText();
		String strC = soC.getText();
		double A = Double.parseDouble(strA);
		double B = Double.parseDouble(strB);
		double C = Double.parseDouble(strC);
		double delta = (B*B)- 4*A*C;
		double can2 = Math.sqrt(delta);
		if(delta<0) {
			KQ.setText("Phương Trình Vô Nghiệm");
		}else {
			if(delta==0) {
				KQ.setText("Nghiệm Kép");
				X.setText(String.valueOf(-B/(2*A)));
				Y.setText(String.valueOf(-B/(2*A)));
			}else {
				KQ.setText("Có 2 Nghiệm");
				X.setText(String.valueOf((-B+can2)/(2*A)));
				Y.setText(String.valueOf((-B-can2)/(2*A)));
			}
		}
		
	}

}
