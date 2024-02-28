package thomc.edu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginFrame extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtTDN;
	private JPasswordField txtPass;
	public LoginFrame() {
		setBackground(new Color(0, 0, 0));
		setTitle("Đăng Nhập Quản Lý Bán Hàng");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TÊN ĐĂNG NHẬP");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblNewLabel.setBounds(10, 31, 143, 41);
		contentPane.add(lblNewLabel);
		
		JLabel lblMt = new JLabel("MẬT KHẨU");
		lblMt.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblMt.setBounds(28, 83, 125, 41);
		contentPane.add(lblMt);
		
		txtTDN = new JTextField();
		txtTDN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtTDN.setBounds(151, 37, 235, 32);
		contentPane.add(txtTDN);
		txtTDN.setColumns(10);
		
		txtPass = new JPasswordField();
		txtPass.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtPass.setBounds(151, 83, 235, 32);
		contentPane.add(txtPass);
		
		JButton btnDN = new JButton("ĐĂNG NHẬP");
		btnDN.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DangNhap();
			}
		});
		btnDN.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnDN.setBounds(151, 165, 130, 41);
		contentPane.add(btnDN);
	}
	void DangNhap() {
		String strTDN = txtTDN.getText();
		String strPass = txtPass.getText();
		if(strTDN.equals("63CNTT")&& strPass.equals("123")) {
			MainFrame mainPage = new MainFrame();
			mainPage.setVisible(true);
			this.setVisible(false);
		}else {
			txtTDN.setText("");
			txtPass.setText("");
			JOptionPane hopThoai = new JOptionPane();
			hopThoai.showMessageDialog(this, "Đăng nhập thất bại");
		}
	}
}
