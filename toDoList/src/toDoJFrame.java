
import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
        getContentPane().setBackground(Color.gray);
        setResizable(false);
        this.setTitle("Uzdevumi");
        
        Object col[] = {"Uzdevums","Apraksts","Datums","Prioritāte"};        
        model.setColumnIdentifiers(col);
        Tabula.setModel(model);
        conn = toDoJFrame.ConnectDb();
        
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

        newTask = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabula = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        newTask.setText("Jauns uzdevums");
        newTask.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newTaskActionPerformed(evt);
            }
        });
        getContentPane().add(newTask, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, -1, -1));

        Tabula.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Uzdevums", "Apraksts", "Datums", "Prioritāte"
            }
        ));
        jScrollPane1.setViewportView(Tabula);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 520, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void newTaskActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newTaskActionPerformed
        addTaskView s = new addTaskView();
        s.setVisible(true);
    }//GEN-LAST:event_newTaskActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    public void updateTable(){
        String sql = "Select Uzdevums,Apraksts,Datums,Prioritāte from toDoSQL";
        
        try{
            pst = conn.prepareStatement(sql);
            rs = pst.executeQuery();
            Object[] kolonuDati = new Object[4];
            
            while(rs.next()){
                kolonuDati[0] = rs.getString("Uzdevums");
                kolonuDati[1] = rs.getString("Apraksts");
                kolonuDati[2] = rs.getString("Datums");
                kolonuDati[3] = rs.getString("Prioritāte");
                model.addRow(kolonuDati);
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton newTask;
    // End of variables declaration//GEN-END:variables
}
