import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManHinhTinhToan extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtKQ;
	public ManHinhTinhToan() {
		setForeground(new Color(0, 0, 0));
		setTitle("CALCULATOR");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 528, 390);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtA = new JTextField();
		txtA.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtA.setBounds(136, 30, 325, 34);
		contentPane.add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtB.setColumns(10);
		txtB.setBounds(136, 78, 325, 34);
		contentPane.add(txtB);
		
		JButton btnCong = new JButton("CỘNG");
		btnCong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Cong();
			}
		});
		btnCong.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCong.setBounds(88, 136, 107, 34);
		contentPane.add(btnCong);
		
		JButton btnTru = new JButton("TRỪ");
		btnTru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tru();
			}
		});
		btnTru.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTru.setBounds(88, 191, 107, 34);
		contentPane.add(btnTru);
		
		JButton btnNhan = new JButton("NHÂN");
		btnNhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Nhan();
			}
		});
		btnNhan.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNhan.setBounds(294, 136, 107, 34);
		contentPane.add(btnNhan);
		
		JButton btnChia = new JButton("CHIA");
		btnChia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Chia();
			}
		});
		btnChia.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnChia.setBounds(294, 191, 107, 34);
		contentPane.add(btnChia);
		
		txtKQ = new JTextField();
		txtKQ.setEditable(false);
		txtKQ.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtKQ.setColumns(10);
		txtKQ.setBounds(136, 267, 325, 34);
		contentPane.add(txtKQ);
		
		JLabel lblNewLabel = new JLabel("Nhập A");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(32, 36, 69, 22);
		contentPane.add(lblNewLabel);
		
		JLabel lblNhpB = new JLabel("Nhập B");
		lblNhpB.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNhpB.setBounds(32, 90, 69, 22);
		contentPane.add(lblNhpB);
		
		JLabel lblKtQu = new JLabel("Kết Quả");
		lblKtQu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblKtQu.setBounds(32, 267, 69, 34);
		contentPane.add(lblKtQu);
	}
	void Cong() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double tong = soA + soB;
		txtKQ.setText(String.valueOf(tong));
	}
	void Tru() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double tong = soA - soB;
		txtKQ.setText(String.valueOf(tong));
	}
	void Nhan() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double tong = soA * soB;
		txtKQ.setText(String.valueOf(tong));
	}
	void Chia() {
		String str_soA = txtA.getText();
		String str_soB = txtB.getText();
		double soA = Double.parseDouble(str_soA);
		double soB = Double.parseDouble(str_soB);
		double tong = soA / soB;
		txtKQ.setText(String.valueOf(tong));
	}
}
