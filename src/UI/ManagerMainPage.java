/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import UI.LoginPage;
import db.MonthSales;
import db.Orderlist;
import db.OrderlistDAO;
import db.Sales;
import db.SalesDAO;
import db.Stock;
import db.StockDAO;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.NamingException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JaeHyuk
 */
public class ManagerMainPage extends javax.swing.JFrame {
    String branch;
    String orderNum;
    private ArrayList<Orderlist> olist = new ArrayList<>();
    private ArrayList<Stock> stockList = new ArrayList<>();
    private ArrayList<Sales> salesList = new ArrayList<>();
    private ArrayList<MonthSales> msalesList = new ArrayList<>();
    /**
     * Creates new form ManagerMainPage
     */
    public ManagerMainPage() {
        initComponents();
        setTitle(branch+ " 관리자");
        setSize(600, 520);
        setLocationRelativeTo(null);
    }
    public ManagerMainPage(String branch) {
        
        this.branch = branch;
        initComponents();
        setTitle(branch+ " 관리자");
        setSize(600, 520);
        detailPanel.setVisible(false);
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane2 = new javax.swing.JTabbedPane();
        OrderListPanel = new javax.swing.JPanel();
        orderListtPanel = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listTable = new javax.swing.JTable();
        detailPanel = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        detailTable = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        selectNum = new javax.swing.JLabel();
        label = new javax.swing.JLabel();
        StockPage = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        stockTable = new javax.swing.JTable();
        SalesPage = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        dayPanel = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        daySalesTable = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        monthSalesTable = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 550));
        setPreferredSize(new java.awt.Dimension(600, 650));
        setResizable(false);

        jTabbedPane2.setFont(new java.awt.Font("맑은 고딕", 1, 14)); // NOI18N

        listTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "주문번호", "주문", "가격"
            }
        ));
        listTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                listTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        listTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listTable);

        javax.swing.GroupLayout orderListtPanelLayout = new javax.swing.GroupLayout(orderListtPanel);
        orderListtPanel.setLayout(orderListtPanelLayout);
        orderListtPanelLayout.setHorizontalGroup(
            orderListtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, orderListtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                .addContainerGap())
        );
        orderListtPanelLayout.setVerticalGroup(
            orderListtPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(orderListtPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        detailTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "메뉴"
            }
        ));
        jScrollPane4.setViewportView(detailTable);

        jButton4.setText("보류");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("완료");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        selectNum.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N

        label.setFont(new java.awt.Font("맑은 고딕", 1, 18)); // NOI18N
        label.setText("주문번호");

        javax.swing.GroupLayout detailPanelLayout = new javax.swing.GroupLayout(detailPanel);
        detailPanel.setLayout(detailPanelLayout);
        detailPanelLayout.setHorizontalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(selectNum, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(detailPanelLayout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        detailPanelLayout.setVerticalGroup(
            detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(detailPanelLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectNum, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(detailPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout OrderListPanelLayout = new javax.swing.GroupLayout(OrderListPanel);
        OrderListPanel.setLayout(OrderListPanelLayout);
        OrderListPanelLayout.setHorizontalGroup(
            OrderListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderListPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(orderListtPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(20, 20, 20))
        );
        OrderListPanelLayout.setVerticalGroup(
            OrderListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(OrderListPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(OrderListPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(detailPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(orderListtPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        jTabbedPane2.addTab("주문 목록", OrderListPanel);

        stockTable.setFont(new java.awt.Font("맑은 고딕", 0, 14)); // NOI18N
        stockTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "재료", "수량"
            }
        ));
        stockTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                stockTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane2.setViewportView(stockTable);

        javax.swing.GroupLayout StockPageLayout = new javax.swing.GroupLayout(StockPage);
        StockPage.setLayout(StockPageLayout);
        StockPageLayout.setHorizontalGroup(
            StockPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(StockPageLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 504, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        StockPageLayout.setVerticalGroup(
            StockPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StockPageLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane2.addTab("재고 현황", StockPage);

        daySalesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "날짜", "매출"
            }
        ));
        daySalesTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                daySalesTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane3.setViewportView(daySalesTable);

        javax.swing.GroupLayout dayPanelLayout = new javax.swing.GroupLayout(dayPanel);
        dayPanel.setLayout(dayPanelLayout);
        dayPanelLayout.setHorizontalGroup(
            dayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
        );
        dayPanelLayout.setVerticalGroup(
            dayPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dayPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("일 매출", dayPanel);

        monthSalesTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "월", "매출"
            }
        ));
        monthSalesTable.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                monthSalesTableAncestorAdded(evt);
            }
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jScrollPane5.setViewportView(monthSalesTable);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(153, 153, 153))
        );

        jTabbedPane1.addTab("월 매출", jPanel3);

        javax.swing.GroupLayout SalesPageLayout = new javax.swing.GroupLayout(SalesPage);
        SalesPage.setLayout(SalesPageLayout);
        SalesPageLayout.setHorizontalGroup(
            SalesPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 552, Short.MAX_VALUE)
            .addGroup(SalesPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SalesPageLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jTabbedPane1)
                    .addContainerGap()))
        );
        SalesPageLayout.setVerticalGroup(
            SalesPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 377, Short.MAX_VALUE)
            .addGroup(SalesPageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(SalesPageLayout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGap(17, 17, 17)))
        );

        jTabbedPane2.addTab("매출 정보", SalesPage);

        jLabel3.setFont(new java.awt.Font("맑은 고딕", 1, 48)); // NOI18N
        jLabel3.setText("Manager");

        jMenu1.setText("menu");

        jMenuItem2.setText("로그아웃");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setText("종료");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 557, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(188, 188, 188)
                        .addComponent(jLabel3)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /*주문내역 OrderList*/
    //주문내역중 제작완료가 안된 리스트만 보여주는 메소드
    public void showListTable(){
        DefaultTableModel lTable = (DefaultTableModel)listTable.getModel();
            lTable.setNumRows(0);
            
            olist = (new OrderlistDAO()).getList(branch);
            for(int i = 0;i<olist.size();i++){
                lTable.insertRow(lTable.getRowCount(), new Object[]{
                    olist.get(i).getOrdernum(),
                    olist.get(i).getMenu(),
                    olist.get(i).getPrice()
                });
            }
    }
    //주문리스트에서 선택한 주문을 자세히 보여주는 메소드
    public void showDetailTable(){
        DefaultTableModel DTable = (DefaultTableModel)detailTable.getModel();
        DTable.setNumRows(0);
        
         int nRow = -1;
         int nCol = -1;
         nRow = listTable.getSelectedRow();
         nCol = listTable.getSelectedColumn();

        if(nRow != -1 && nCol != -1){
            //해당 그거의 주문번호 받기
            Object num = listTable.getValueAt(nRow, 0);
            orderNum = num.toString();
            selectNum.setText(orderNum);
            //주문내역 나눠서보여주기
            String order = listTable.getValueAt(nRow, 1).toString();
            String[] orderDetail = order.split(", ");
            for(int i = 0;i<orderDetail.length;i++){
                DTable.insertRow(DTable.getRowCount(), new Object[]{
                    orderDetail[i]
                });
            }
             detailPanel.setVisible(true);
        }
         
    }
    //바로 들어온 주문을 보여주는 메소드
    public void showNowDetailTable(int num, String menu){
        DefaultTableModel DTable = (DefaultTableModel)detailTable.getModel();
        DTable.setNumRows(0);
        String orderNum = Integer.toString(num);
            selectNum.setText(orderNum);
            //주문내역 나눠서보여주기
            String order = menu;
            String[] orderDetail = order.split(", ");
            for(int i = 0;i<orderDetail.length;i++){
                DTable.insertRow(DTable.getRowCount(), new Object[]{
                    orderDetail[i]
                });
            }
             detailPanel.setVisible(true);
        }
    
    /*재고 Stock*/
    //해당브랜치의 재고를 보여주는 메소드
    public void showStockTable(String branch){
   try {
            // TODO add your handling code here:
            DefaultTableModel sTable = (DefaultTableModel)stockTable.getModel();
            sTable.setNumRows(0);
            this.branch = branch;
            stockList = (new StockDAO()).getList(branch);
            for(int i=0; i<stockList.size();i++){
                sTable.insertRow(sTable.getRowCount(), new Object[]{
                    stockList.get(i).getName(),
                    stockList.get(i).getQty()
                });
            }
        } catch (NamingException ex) {
            Logger.getLogger(StockPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StockPage.class.getName()).log(Level.SEVERE, null, ex);
        }
}
    /*매출 Sales*/
    //일매출을 보여주는 메소드
    public void showDayTable(){
        try {
            // TODO add your handling code here:
            DefaultTableModel saTable = (DefaultTableModel)daySalesTable.getModel();
            saTable.setNumRows(0);
            
            salesList = (new SalesDAO()).getList(branch);
            for(int i = 0;i<salesList.size();i++){
                saTable.insertRow(saTable.getRowCount(), new Object[]{
                    salesList.get(i).getDate(),
                    salesList.get(i).getTotal()
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    //월매출을 보여주는 메소드
    public void showMonthTable(){
        try {
            // TODO add your handling code here:
            DefaultTableModel msTable = (DefaultTableModel)monthSalesTable.getModel();
            msTable.setNumRows(0);
            
            msalesList = (new SalesDAO()).getMonthList(branch);
            for(int i = 0;i<msalesList.size();i++){
                msTable.insertRow(msTable.getRowCount(), new Object[]{
                    msalesList.get(i).getDate(),
                    msalesList.get(i).getTotal()
                });
            }
        } catch (SQLException ex) {
            Logger.getLogger(SalesPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // 메뉴바의 종료버튼
        System.exit(0);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // 메뉴바의 로그아웃버튼
        new LoginPage().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void listTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_listTableAncestorAdded
        // 주문내역테이블
        showListTable();
    }//GEN-LAST:event_listTableAncestorAdded

    private void listTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listTableMouseClicked
        // 리스트목록클릭시
        showDetailTable();
    }//GEN-LAST:event_listTableMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // 보류버튼
        detailPanel.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //완료버튼
        //제작완료상태로 변경하기!
        (new OrderlistDAO()).completeOrder(orderNum);
        //판넬숨기고 리스트내역 새로 업데이트!
        showListTable();
        detailPanel.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void stockTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_stockTableAncestorAdded
        try {
            // 재고 테이블
            DefaultTableModel sTable = (DefaultTableModel)stockTable.getModel();
            sTable.setNumRows(0);

            stockList = (new StockDAO()).getList(branch);
            for(int i=0; i<stockList.size();i++){
                sTable.insertRow(sTable.getRowCount(), new Object[]{
                    stockList.get(i).getName(),
                    stockList.get(i).getQty()
                });
            }
        } catch (NamingException ex) {
            Logger.getLogger(StockPage.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(StockPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_stockTableAncestorAdded

    private void daySalesTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_daySalesTableAncestorAdded
        // 일매출 테이블
        showDayTable();
    }//GEN-LAST:event_daySalesTableAncestorAdded

    private void monthSalesTableAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_monthSalesTableAncestorAdded
        // 월매출 테이블
        showMonthTable();
    }//GEN-LAST:event_monthSalesTableAncestorAdded

    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ManagerMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManagerMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManagerMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManagerMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManagerMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel OrderListPanel;
    private javax.swing.JPanel SalesPage;
    private javax.swing.JPanel StockPage;
    public javax.swing.JPanel dayPanel;
    private javax.swing.JTable daySalesTable;
    private javax.swing.JPanel detailPanel;
    private javax.swing.JTable detailTable;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JLabel label;
    private javax.swing.JTable listTable;
    private javax.swing.JTable monthSalesTable;
    private javax.swing.JPanel orderListtPanel;
    private javax.swing.JLabel selectNum;
    public javax.swing.JTable stockTable;
    // End of variables declaration//GEN-END:variables
}
