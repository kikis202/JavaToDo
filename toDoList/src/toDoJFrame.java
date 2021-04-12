
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumnModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author kikis
 */
public class toDoJFrame extends javax.swing.JFrame {

    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    DefaultTableModel model = new DefaultTableModel();
    
    
    /**
     * Creates new form toDoJFrame
     */
    public toDoJFrame(){
        initComponents();
        this.setTitle("Uzdevumi");
        
        
        jDialog1.setSize(509, 630);
        jDialog1.setResizable(false);
        Object col[] = {"Uzdevums","Apraksts","Datums","Prioritāte","Uzdevums_ID"};        
        model.setColumnIdentifiers(col);
        Tabula.setModel(model);
        conn = toDoJFrame.ConnectDb();
        Tabula.getTableHeader().setFont(new Font("Arial", Font.BOLD, 24));
        Tabula.getTableHeader().setBackground(Color.white);
        
        
        updateTable();
    }
    
    
    
    public static Connection ConnectDb(){
        try{
            Class.forName("org.sqlite.JDBC");
            Connection conn = DriverManager.getConnection("jdbc:sqlite:toDoSQL.db");
            return conn;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        uzdNosPanelis = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        uzdNosaukums = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        uzdApraksts = new javax.swing.JTextArea();
        datums = new javax.swing.JLabel();
        datumaIevade = new javax.swing.JSpinner();
        proritate = new javax.swing.JLabel();
        prioritateIevade = new javax.swing.JSpinner();
        pogaAtcelt = new javax.swing.JButton();
        pogaSaglabat = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        sodDatums = new javax.swing.JLabel();
        newTask = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabula = new javax.swing.JTable();
        dzestPoga = new javax.swing.JButton();
        labotPoga = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel1.setText("Uzdevuma nosaukums");

        uzdNosaukums.setColumns(20);
        uzdNosaukums.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        uzdNosaukums.setRows(5);
        uzdNosaukums.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        uzdNosaukums.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                uzdNosaukumsKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(uzdNosaukums);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel3.setText("Apraksts");

        uzdApraksts.setColumns(20);
        uzdApraksts.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        uzdApraksts.setRows(5);
        uzdApraksts.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        jScrollPane3.setViewportView(uzdApraksts);

        datums.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        datums.setText("Datums");

        datumaIevade.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        datumaIevade.setModel(new javax.swing.SpinnerDateModel());
        datumaIevade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));
        datumaIevade.setFocusable(false);
        datumaIevade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                datumaIevadeKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                datumaIevadeKeyTyped(evt);
            }
        });

        proritate.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        proritate.setText("Prioritāte");

        prioritateIevade.setFont(new java.awt.Font("Arial", 0, 13)); // NOI18N
        prioritateIevade.setModel(new javax.swing.SpinnerNumberModel(1, 1, 5, 1));
        prioritateIevade.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        pogaAtcelt.setBackground(new java.awt.Color(255, 51, 0));
        pogaAtcelt.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        pogaAtcelt.setForeground(new java.awt.Color(73, 73, 73));
        pogaAtcelt.setText("Atcelt");
        pogaAtcelt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogaAtceltActionPerformed(evt);
            }
        });

        pogaSaglabat.setBackground(new java.awt.Color(0, 204, 0));
        pogaSaglabat.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        pogaSaglabat.setForeground(new java.awt.Color(73, 73, 73));
        pogaSaglabat.setText("Saglabāt");
        pogaSaglabat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pogaSaglabatActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 22)); // NOI18N
        jLabel2.setText("Šodienas datums");

        sodDatums.setFont(new java.awt.Font("Lucida Grande", 0, 22)); // NOI18N
        sodDatums.setText("datums");

        javax.swing.GroupLayout uzdNosPanelisLayout = new javax.swing.GroupLayout(uzdNosPanelis);
        uzdNosPanelis.setLayout(uzdNosPanelisLayout);
        uzdNosPanelisLayout.setHorizontalGroup(
            uzdNosPanelisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uzdNosPanelisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(uzdNosPanelisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(uzdNosPanelisLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sodDatums, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(uzdNosPanelisLayout.createSequentialGroup()
                        .addGroup(uzdNosPanelisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(uzdNosPanelisLayout.createSequentialGroup()
                                .addComponent(pogaAtcelt, javax.swing.GroupLayout.DEFAULT_SIZE, 225, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pogaSaglabat, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane3)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(prioritateIevade)
                            .addComponent(datumaIevade, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(uzdNosPanelisLayout.createSequentialGroup()
                                .addGroup(uzdNosPanelisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(datums)
                                    .addComponent(proritate)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel3))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())))
        );
        uzdNosPanelisLayout.setVerticalGroup(
            uzdNosPanelisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(uzdNosPanelisLayout.createSequentialGroup()
                .addGroup(uzdNosPanelisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(sodDatums))
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(datums)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(datumaIevade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(proritate)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(prioritateIevade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(uzdNosPanelisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pogaSaglabat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pogaAtcelt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uzdNosPanelis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(uzdNosPanelis, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newTask.setBackground(new java.awt.Color(0, 204, 0));
        newTask.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        newTask.setForeground(new java.awt.Color(73, 73, 73));
        newTask.setText("Jauns uzdevums");
        newTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTaskActionPerformed(evt);
            }
        });
        getContentPane().add(newTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, -1, -1));

        Tabula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Uzdevums", "Apraksts", "Datums", "Prioritāte", "Uzdevums_ID"
            }
        ));
        Tabula.setFocusable(false);
        Tabula.setIntercellSpacing(new java.awt.Dimension(0, 0));
        Tabula.setRowHeight(25);
        Tabula.setShowVerticalLines(false);
        Tabula.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(Tabula);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 623, 413));

        dzestPoga.setBackground(new java.awt.Color(0, 204, 0));
        dzestPoga.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dzestPoga.setForeground(new java.awt.Color(73, 73, 73));
        dzestPoga.setText("Dzēst");
        dzestPoga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dzestPogaActionPerformed(evt);
            }
        });
        getContentPane().add(dzestPoga, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 530, 100, -1));

        labotPoga.setBackground(new java.awt.Color(0, 204, 0));
        labotPoga.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        labotPoga.setForeground(new java.awt.Color(73, 73, 73));
        labotPoga.setText("Labot");
        labotPoga.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                labotPogaActionPerformed(evt);
            }
        });
        getContentPane().add(labotPoga, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 530, 100, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTaskActionPerformed
        jDialog1.setTitle("Jauns uzdevums");
        jDialog1.setVisible(true);
        
        /// Pievieno datumu
        
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat Tdate = new SimpleDateFormat("dd MMM yyyy");
        sodDatums.setText(Tdate.format(timer.getTime()));
        
        //notīra lauciņus
        uzdNosaukums.setText("");
        uzdApraksts.setText("");
        //vajag ievadīt pareizos value
        //datumaIevade.setValue();
        //prioritateIevade.setValue();
    }//GEN-LAST:event_newTaskActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    private void pogaSaglabatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pogaSaglabatActionPerformed
        if(jDialog1.getTitle().equals("Jauns uzdevums")){
            String sql = "INSERT INTO toDoSQL(Uzdevums,Apraksts,Datums,Prioritāte)VALUES(?,?,?,?)";

            try{
                pst = conn.prepareStatement(sql);
                pst.setString(1, uzdNosaukums.getText());
                pst.setString(2, uzdApraksts.getText());
                pst.setString(3, String.valueOf(datumaIevade.getValue()));
                pst.setString(4, String.valueOf(prioritateIevade.getValue()));

                pst.execute();

                JOptionPane.showMessageDialog(null, "Uzdevums pievienots");

                if (rs != null) rs.close();
                if (pst != null) pst.close();

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            while(Tabula.getRowCount() > 0){
                model.removeRow(0);
            }


        }else if(jDialog1.getTitle().equals("Labot uzdevumu")){
                int rinda = Tabula.getSelectedRow();
                String id = (String) Tabula.getModel().getValueAt(rinda, 4);
                String sql = "update toDoSQL set "
                + "Uzdevums = '"+uzdNosaukums.getText()+"', "
                + "Apraksts = '"+uzdApraksts.getText()+"', "
                + "Datums = '"+String.valueOf(datumaIevade.getValue())+"', "
                + "Prioritāte = '"+String.valueOf(prioritateIevade.getValue())+"' "
                + "where Uzdevums_ID = "+id;
                
                try{
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Uzdevums labots");
                }
                catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
                }
            }
            jDialog1.setVisible(false);
            updateTable();
    }//GEN-LAST:event_pogaSaglabatActionPerformed

    private void pogaAtceltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pogaAtceltActionPerformed
        jDialog1.setVisible(false);
    }//GEN-LAST:event_pogaAtceltActionPerformed

    private void datumaIevadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datumaIevadeKeyTyped
        evt.consume();
    }//GEN-LAST:event_datumaIevadeKeyTyped

    private void datumaIevadeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_datumaIevadeKeyPressed
        evt.consume();
    }//GEN-LAST:event_datumaIevadeKeyPressed

    private void uzdNosaukumsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_uzdNosaukumsKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_uzdNosaukumsKeyTyped

    private void dzestPogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dzestPogaActionPerformed
        DefaultTableModel model = (DefaultTableModel) Tabula.getModel();
        if(Tabula.getSelectedRow()==-1){
            if(Tabula.getRowCount()==0){
                JOptionPane.showMessageDialog(null, "Nav uzdevuma, ko dzēst", "Uzdevumi", JOptionPane.OK_OPTION);
            }else{
                JOptionPane.showMessageDialog(null, "Izvēlies uzdevumu, ko dzēst", "Uzdevumi", JOptionPane.OK_OPTION);
            }
        }else{
            int rinda = Tabula.getSelectedRow();
            String id = (String) Tabula.getModel().getValueAt(rinda, 4);
            String sql = "DELETE FROM toDoSQL where Uzdevums_ID = " + id;
            try{
                pst = conn.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(null, "Uzdevums izdzēsts");
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, e);
            }
            model.removeRow(Tabula.getSelectedRow());
        }
    }//GEN-LAST:event_dzestPogaActionPerformed

    private void labotPogaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_labotPogaActionPerformed
        jDialog1.setTitle("Labot uzdevumu");
        jDialog1.setVisible(true);
        
        //pievieno datumu
        Calendar timer = Calendar.getInstance();
        timer.getTime();
        SimpleDateFormat Tdate = new SimpleDateFormat("dd MMM yyyy");
        sodDatums.setText(Tdate.format(timer.getTime()));
        
        //ievieot datus no tabulas
        int rinda = Tabula.getSelectedRow();
        String id = (String) Tabula.getModel().getValueAt(rinda, 4);
        uzdNosaukums.setText((String) Tabula.getModel().getValueAt(rinda, 0));
        uzdApraksts.setText((String) Tabula.getModel().getValueAt(rinda, 1));
        //vajag pārveidot value par pareizo tipu
//        datumaIevade.setValue(Tabula.getModel().getValueAt(rinda, 2));
//        prioritateIevade.setValue(Tabula.getModel().getValueAt(rinda, 3));
               
    }//GEN-LAST:event_labotPogaActionPerformed

    /**
     * @param args the command line arguments
     */
    
    
    
    
    public void updateTable(){
        DefaultTableModel dtm = (DefaultTableModel) Tabula.getModel();
        dtm.setRowCount(0);
        
        String sql = "Select Uzdevums,Apraksts,Datums,Prioritāte,Uzdevums_ID from toDoSQL";
        
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Object[] kolonuDati = new Object[5];
            
            while(rs.next()){
                kolonuDati[0] = rs.getString("Uzdevums");
                kolonuDati[1] = rs.getString("Apraksts");
                kolonuDati[2] = rs.getString("Datums");
                kolonuDati[3] = rs.getString("Prioritāte");
                kolonuDati[4] = rs.getString("Uzdevums_ID");

                model.addRow(kolonuDati);
            }
                TableColumnModel tcm = Tabula.getColumnModel();
                if(tcm.getColumnCount()>4){
                    tcm.removeColumn( tcm.getColumn(4) );
                }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
    }
    
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
            java.util.logging.Logger.getLogger(toDoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(toDoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(toDoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(toDoJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new toDoJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JTable Tabula;
    private javax.swing.JSpinner datumaIevade;
    private javax.swing.JLabel datums;
    private javax.swing.JButton dzestPoga;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton labotPoga;
    private javax.swing.JButton newTask;
    private javax.swing.JButton pogaAtcelt;
    private javax.swing.JButton pogaSaglabat;
    private javax.swing.JSpinner prioritateIevade;
    private javax.swing.JLabel proritate;
    private javax.swing.JLabel sodDatums;
    private javax.swing.JTextArea uzdApraksts;
    private javax.swing.JPanel uzdNosPanelis;
    private javax.swing.JTextArea uzdNosaukums;
    // End of variables declaration//GEN-END:variables
}
