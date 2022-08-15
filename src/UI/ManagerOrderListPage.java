package UI;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.BoxLayout;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.CardLayout;

public class ManagerOrderListPage extends JFrame {

	private JPanel contentPane;
	private String branch;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ManagerOrderListPage frame = new ManagerOrderListPage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	
	public ManagerOrderListPage() {
		branch = "919";
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,600);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("뒤로가기");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("종료");
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel ViewPanel = new JPanel();
		contentPane.add(ViewPanel, BorderLayout.CENTER);
		ViewPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel MenuPanel = new JPanel();
		MenuPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		ViewPanel.add(MenuPanel, BorderLayout.WEST);
		MenuPanel.setLayout(new BoxLayout(MenuPanel, BoxLayout.Y_AXIS));
		
		JButton OrderListBtn = new JButton("주문 내역");
		
		MenuPanel.add(OrderListBtn);
		
		JButton StockManagementBtn = new JButton("재고 관리");
		
		MenuPanel.add(StockManagementBtn);
		
		JButton SalesStatusBtn = new JButton("매출 현황");
		
		MenuPanel.add(SalesStatusBtn);
		
		JPanel OutputPanel = new JPanel();
		OutputPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		ViewPanel.add(OutputPanel, BorderLayout.CENTER);
		OutputPanel.setLayout(new CardLayout(0, 0));
		
		ManagerOrderListPanel OrderListPanel = new ManagerOrderListPanel(branch);
		ManagerStockManagementPanel StockManagementPanel = new ManagerStockManagementPanel();
		ManagerSalesStatusPanel SalesStatusPanel = new ManagerSalesStatusPanel();
		
		
		OutputPanel.add("one",OrderListPanel/*, BorderLayout.CENTER*/);
		OutputPanel.add("two", StockManagementPanel/* , BorderLayout.CENTER */);
		OutputPanel.add("three", SalesStatusPanel/* , BorderLayout.CENTER */);
		
		
		CardLayout cl = (CardLayout) OutputPanel.getLayout();
		cl.first(OutputPanel);
		
		//주문 내역 버튼
		OrderListBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(OutputPanel, "one");
			}
		});
		
		//재고 관리 버튼
		StockManagementBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(OutputPanel, "two");
			}
		});
		
		//매출 현황 버튼
		SalesStatusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(OutputPanel, "three");
			}
		});
		
		
		
	}
	
	public ManagerOrderListPage(String branch) {
		this.branch = branch;
		System.out.println(branch);
		
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(1000,600);
		setLocationRelativeTo(null);
		setResizable(false);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Menu");
		menuBar.add(mnNewMenu);
		
		JMenuItem mntmNewMenuItem = new JMenuItem("뒤로가기");
		mnNewMenu.add(mntmNewMenuItem);
		
		JMenuItem mntmNewMenuItem_1 = new JMenuItem("종료");
		mnNewMenu.add(mntmNewMenuItem_1);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel ViewPanel = new JPanel();
		contentPane.add(ViewPanel, BorderLayout.CENTER);
		ViewPanel.setLayout(new BorderLayout(0, 0));
		
		JPanel MenuPanel = new JPanel();
		MenuPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		ViewPanel.add(MenuPanel, BorderLayout.WEST);
		MenuPanel.setLayout(new BoxLayout(MenuPanel, BoxLayout.Y_AXIS));
		
		JButton OrderListBtn = new JButton("주문 내역");
		
		MenuPanel.add(OrderListBtn);
		
		JButton StockManagementBtn = new JButton("재고 관리");
		
		MenuPanel.add(StockManagementBtn);
		
		JButton SalesStatusBtn = new JButton("매출 현황");
		
		MenuPanel.add(SalesStatusBtn);
		
		JPanel OutputPanel = new JPanel();
		OutputPanel.setBorder(new LineBorder(new Color(0, 0, 0), 2));
		ViewPanel.add(OutputPanel, BorderLayout.CENTER);
		OutputPanel.setLayout(new CardLayout(0, 0));
		
		ManagerOrderListPanel OrderListPanel = new ManagerOrderListPanel(branch);
		ManagerStockManagementPanel StockManagementPanel = new ManagerStockManagementPanel();
		ManagerSalesStatusPanel SalesStatusPanel = new ManagerSalesStatusPanel();
		
		OutputPanel.add("one",OrderListPanel/*, BorderLayout.CENTER*/);
		OutputPanel.add("two", StockManagementPanel/* , BorderLayout.CENTER */);
		OutputPanel.add("three", SalesStatusPanel/* , BorderLayout.CENTER */);
		
		CardLayout cl = (CardLayout) OutputPanel.getLayout();
		cl.first(OutputPanel);
		
		//주문 내역 버튼
		OrderListBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(OutputPanel, "one");
			}
		});
		
		//재고 관리 버튼
		StockManagementBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(OutputPanel, "two");
			}
		});
		
		//매출 현황 버튼
		SalesStatusBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cl.show(OutputPanel, "three");
			}
		});
	}

}
