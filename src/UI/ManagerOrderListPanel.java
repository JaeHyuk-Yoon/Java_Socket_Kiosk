package UI;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import db.Orderlist;
import db.OrderlistDAO;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ManagerOrderListPanel extends JPanel {
	private JTable table;
	private String branch;
    String orderNum;
	private ArrayList<Orderlist> list = new ArrayList<>();
	String header[] = {"주문번호", "주문내역", "금액"};

	/**
	 * Create the panel.
	 */
	
	
	public ManagerOrderListPanel() {
		
		JPanel BorderNorthPanel = new JPanel();
		JPanel BorderNorthDetailPanel = new JPanel();
		JPanel BorderCenterPanel = new JPanel();
		JPanel BorderCenterPanel1 = new JPanel();
		JPanel BorderCenterPanel2 = new JPanel();
		
		//최상위 패널
		setLayout(new BorderLayout(0, 0));
		//
		
		//Border Center 최상위 패널
		FlowLayout fl = new FlowLayout();
		BorderCenterPanel.setLayout(fl);
		this.add(BorderCenterPanel, BorderLayout.CENTER);
		//
		
		BorderCenterPanel.add(BorderCenterPanel1);
		BorderCenterPanel.add(BorderCenterPanel2);
		
		//라벨
		JLabel lblNewLabel = new JLabel("실시간 주문 내역");
		JLabel OrderMenuLabel = new JLabel("현재 주문 현황");
		JLabel CompleteMenuLabel = new JLabel("완료된 주문");
		
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 14));
		OrderMenuLabel.setFont(new Font("굴림", Font.PLAIN, 12));
		CompleteMenuLabel.setFont(new Font("굴림", Font.PLAIN, 12));
		
		lblNewLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 5, 0));
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		OrderMenuLabel.setHorizontalAlignment(JLabel.CENTER);
		CompleteMenuLabel.setHorizontalAlignment(JLabel.CENTER);
		//
		
		//Border North 최상위 패널
		BorderNorthPanel.setLayout(new BoxLayout(BorderNorthPanel, BoxLayout.Y_AXIS));
		add(BorderNorthPanel, BorderLayout.NORTH);
		
		BorderNorthPanel.add(lblNewLabel);
		//
		
		FlowLayout fl1 = new FlowLayout();
		BorderNorthDetailPanel.setLayout(fl1);
		
		fl1.setHgap(350);
		
		BorderNorthPanel.add(BorderNorthDetailPanel);
		
		BorderNorthDetailPanel.add(OrderMenuLabel);
		BorderNorthDetailPanel.add(CompleteMenuLabel);
		
		
		JTable table = new JTable(createTableModel1());
		JTable table2 = new JTable(createTableModel2());
		
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		scrollPane.setPreferredSize(new Dimension(400, 125));
		JScrollPane scrollPane2 = new JScrollPane(table2);
		table2.setFillsViewportHeight(true);
		scrollPane2.setPreferredSize(new Dimension(400, 125));
		JButton CompeteMenuBtn = new JButton("메뉴준비 완료");
		
		//주문완료 버튼 클릭
		CompeteMenuBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int line = table.getSelectedRow();
				
				int selectOrderNum = (int)table.getValueAt(line, 0);
				
				(new OrderlistDAO()).completeOrder(selectOrderNum);
				
				DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
				tableModel.setRowCount(0);
				DefaultTableModel tableModel2 = (DefaultTableModel) table2.getModel();
				tableModel2.setRowCount(0);
			
				table.setModel(createTableModel1());
				table2.setModel(createTableModel2());
			}
		});
		
		this.add(CompeteMenuBtn, BorderLayout.SOUTH);
		BorderCenterPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		BorderCenterPanel1.add(scrollPane);
		BorderCenterPanel2.add(scrollPane2);

	}
	
	public ManagerOrderListPanel(String branch) {
		
		JPanel BorderNorthPanel = new JPanel();
		JPanel BorderNorthDetailPanel = new JPanel();
		JPanel BorderCenterPanel = new JPanel();
		JPanel BorderCenterPanel1 = new JPanel();
		JPanel BorderCenterPanel2 = new JPanel();
		
		this.branch = branch;
		
		//최상위 패널
		setLayout(new BorderLayout(0, 0));
		//
		
		//Border Center 최상위 패널
		FlowLayout fl = new FlowLayout();
		BorderCenterPanel.setLayout(fl);
		this.add(BorderCenterPanel, BorderLayout.CENTER);
		//
		
		BorderCenterPanel.add(BorderCenterPanel1);
		BorderCenterPanel.add(BorderCenterPanel2);
		
		//라벨
		JLabel lblNewLabel = new JLabel("실시간 주문 내역");
		JLabel OrderMenuLabel = new JLabel("현재 주문 현황");
		JLabel CompleteMenuLabel = new JLabel("완료된 주문");
		
		lblNewLabel.setFont(new Font("굴림", Font.PLAIN, 14));
		OrderMenuLabel.setFont(new Font("굴림", Font.PLAIN, 12));
		CompleteMenuLabel.setFont(new Font("굴림", Font.PLAIN, 12));
		
		lblNewLabel.setBorder(BorderFactory.createEmptyBorder(10, 0, 5, 0));
		lblNewLabel.setHorizontalAlignment(JLabel.CENTER);
		OrderMenuLabel.setHorizontalAlignment(JLabel.CENTER);
		CompleteMenuLabel.setHorizontalAlignment(JLabel.CENTER);
		//
		
		//Border North 최상위 패널
		BorderNorthPanel.setLayout(new BoxLayout(BorderNorthPanel, BoxLayout.Y_AXIS));
		add(BorderNorthPanel, BorderLayout.NORTH);
		
		BorderNorthPanel.add(lblNewLabel);
		//
		
		FlowLayout fl1 = new FlowLayout();
		BorderNorthDetailPanel.setLayout(fl1);
		
		fl1.setHgap(350);
		
		BorderNorthPanel.add(BorderNorthDetailPanel);
		
		BorderNorthDetailPanel.add(OrderMenuLabel);
		BorderNorthDetailPanel.add(CompleteMenuLabel);
		
		
		JTable table = new JTable(createTableModel1());
		JTable table2 = new JTable(createTableModel2());
		
		JScrollPane scrollPane = new JScrollPane(table);
		table.setFillsViewportHeight(true);
		scrollPane.setPreferredSize(new Dimension(400, 125));
		JScrollPane scrollPane2 = new JScrollPane(table2);
		table2.setFillsViewportHeight(true);
		scrollPane2.setPreferredSize(new Dimension(400, 125));
		JButton CompeteMenuBtn = new JButton("메뉴준비 완료");
		
		//주문완료 버튼 클릭
		CompeteMenuBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				int line = table.getSelectedRow();
				
				int selectOrderNum = (int)table.getValueAt(line, 0);
				
				(new OrderlistDAO()).completeOrder(selectOrderNum);
				
				DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
				tableModel.setRowCount(0);
				DefaultTableModel tableModel2 = (DefaultTableModel) table2.getModel();
				tableModel2.setRowCount(0);
			
				table.setModel(createTableModel1());
				table2.setModel(createTableModel2());
			}
		});
		
		this.add(CompeteMenuBtn, BorderLayout.SOUTH);
		BorderCenterPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		BorderCenterPanel1.add(scrollPane);
		BorderCenterPanel2.add(scrollPane2);

	}
	
	
	public DefaultTableModel createTableModel1(){
		
		DefaultTableModel model = new DefaultTableModel(header, 0) {
			 @Override
			    public boolean isCellEditable(int row, int column) {
			       //all cells false
			       return false;
			    }
		};
		
		//model = (DefaultTableModel) table.getModel();
        list = (new OrderlistDAO()).getList(branch);
        for(int i = 0;i<list.size();i++){
            model.addRow(new Object[]{
                list.get(i).getOrdernum(),
                list.get(i).getMenu(),
                list.get(i).getPrice()
            });
        }
        
        return model;
	}
	
	public DefaultTableModel createTableModel2(){
		DefaultTableModel model2 = new DefaultTableModel(header, 0) {
			 @Override
			    public boolean isCellEditable(int row, int column) {
			       //all cells false
			       return false;
			    }
		};
        
		//model2 = (DefaultTableModel) table.getModel();
        list = (new OrderlistDAO()).getCompleteList(branch);
        for(int i = 0;i<list.size();i++){
            model2.addRow(new Object[]{
                list.get(i).getOrdernum(),
                list.get(i).getMenu(),
                list.get(i).getPrice()
            });
        }
        return model2;
	}

}
