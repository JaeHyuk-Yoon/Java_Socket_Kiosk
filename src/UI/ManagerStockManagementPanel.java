package UI;

import java.awt.BorderLayout;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Font;

public class ManagerStockManagementPanel extends JPanel {
	
	/**
	 * Create the panel.
	 */
	public ManagerStockManagementPanel() {
		setLayout(new BorderLayout(0, 0));
		
		JLabel lblNewLabel = new JLabel("실시간 재고 관리");
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 14));
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		add(lblNewLabel, BorderLayout.NORTH);
		
	}
}
