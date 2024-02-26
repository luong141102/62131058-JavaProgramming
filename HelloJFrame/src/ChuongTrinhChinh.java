/**
 * 
 */
import java.awt.FlowLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
/**
 * 
 */
public class ChuongTrinhChinh {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("Vi du");
		f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		f.setSize(500, 600);
		f.setLayout(new FlowLayout());
		JButton btnOK = new JButton("Nút");
		f.add(btnOK);
		f.show();
	}
	class BolangNgheOK implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			JDialog dialog = new JDialog(this, "Thong Bao!");
			dialog.setTitle("Thong bao gi do");
			dialog.show();
		}
	}

}
