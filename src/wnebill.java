import java.awt.Graphics;
import java.awt.PrintJob;
import java.awt.Toolkit;
import javax.swing.JTextField;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */



public class wnebill extends javax.swing.JFrame {

    public wnebill() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        date = new javax.swing.JTextField();
        purpose = new javax.swing.JTextField();
        con = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        Pbarang = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Badmin = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        sitio = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        dateselect = new com.toedter.calendar.JDateChooser();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 48)); // NOI18N
        jLabel1.setText("WATER AND ELECTRICTY CONNECTION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 29)); // NOI18N
        jLabel6.setText("Name:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, -1, -1));

        name.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 90, 240, 40));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 29)); // NOI18N
        jLabel7.setText("Age:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 80, -1));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 29)); // NOI18N
        jLabel3.setText("Date:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 90, -1));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel4.setText("Request Connection:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 340, -1, 40));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 29)); // NOI18N
        jLabel5.setText("Sitio:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 240, 90, -1));

        age.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jPanel1.add(age, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 240, 40));

        date.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jPanel1.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 190, 110, 40));

        purpose.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jPanel1.add(purpose, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 240, 40));

        con.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jPanel1.add(con, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 340, 210, 40));

        area.setColumns(20);
        area.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        area.setRows(5);
        jScrollPane1.setViewportView(area);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 90, 710, 550));

        jLabel10.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel10.setText("Punong Barangay:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, -1, -1));

        Pbarang.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jPanel1.add(Pbarang, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 240, 40));

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel9.setText("Barangay Administrator:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, 280, 40));

        Badmin.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jPanel1.add(Badmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 240, 40));

        jButton3.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton3.setText("PREVIEW");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        jButton1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton1.setText("RESET");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 600, 150, -1));

        jButton2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton2.setText("PRINT");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(253, 550, 140, -1));

        jButton4.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jButton4.setText("GO BACK");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 600, -1, -1));

        jLabel11.setFont(new java.awt.Font("Times New Roman", 1, 29)); // NOI18N
        jLabel11.setText("Purpose:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 120, -1));

        sitio.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jPanel1.add(sitio, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 240, 240, 40));

        jButton5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton5.setText("UPDATE");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 470, -1, -1));
        jPanel1.add(dateselect, new org.netbeans.lib.awtextra.AbsoluteConstraints(168, 190, 150, 40));

        jButton6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jButton6.setText("Select");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 660));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
     Pbarang.setText("");
     Badmin.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        
        String selectdate = ((JTextField)dateselect.getDateEditor().getUiComponent()).getText();
        
        date.setText(selectdate);
             
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton3ActionPerformed

        area.setText("                                                             Republic of the Philippines\n");
        area.setText(area.getText()
                + "                                                               City of Cagayan de Oro \n");
        area.setText(
                area.getText() + "                                                               BARANGAY LAPASAN \n");
        area.setText(
                area.getText() + "                                               OFFICE OF THE BARANGAY CHAIRMAN \n");
        area.setText(area.getText()
                + "                                                              Tel. No. (08822) 881-9850 \n");
        area.setText(area.getText()
                + "                                               E-mail: GodblessLapasan2018@gmail.com \n");

        // for the elements

        area.setText(area.getText() + "\n\nTo Whom it May Concern: \n\n");
        area.setText(area.getText() + "This is to certify that    " + name.getText() + ", " + age.getText()
                + " years of age, a resident of Sitio " + sitio.getText()
                + ", of\nLapasan Cagayan De Oro City, is requesting for  " + con.getText()
                + " Connection.\n\n\nFurther, certify that the above named person is erecting his/her dwelling in Private land.\n\n");
        area.setText(area.getText() + "\n");
        area.setText(area.getText()
                + "This certification is Issued upon the request of the above name mentioned\nas a requirement for "
                + purpose.getText() + " ");
        area.setText(area.getText() + " and for whatever legal intent it may serve him/her Best.");
        area.setText(area.getText() + "\n\nIssued on this " + date.getText()
                + "  at the LGU Barangay , Lapasan , Cagayan De Oro City.");
        area.setText(area.getText()
                + "\n\t\t                                                                               "
                + Pbarang.getText()
                + "\n\t\t                                                       Punong Barangay\n");
        area.setText(area.getText() + "\n\n ");
        area.setText(area.getText() + "By the Authority of Punong Barangay\n");
        area.setText(area.getText() + "\n                                                                             "
                + Badmin.getText());
        area.setText(area.getText()
                + "\n                                                             Barangay Administrator\n");
        area.setText(area.getText()
                + "\n\n                                                         GOD BLESS LAPASAN !!!");

    }// GEN-LAST:event_jButton3ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton1MouseClicked

        area.setText("");
        name.setText("");
        purpose.setText("");
        date.setText("");
        sitio.setText("");
        age.setText("");
        con.setText("");

    }// GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed

    }// GEN-LAST:event_jButton1ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton2MouseClicked
        Toolkit tkp = area.getToolkit();
        PrintJob pjp = tkp.getPrintJob(this, null, null);
        Graphics g = pjp.getGraphics();
        area.print(g);
        g.dispose();
        pjp.end();


       
    }// GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton2ActionPerformed
        Toolkit tkp = area.getToolkit();
        PrintJob pjp = tkp.getPrintJob(this, null, null);
        Graphics g = pjp.getGraphics();
        area.print(g);
        g.dispose();
        pjp.end();


    }// GEN-LAST:event_jButton2ActionPerformed

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jButton4MouseClicked

        NDashboard nd = new NDashboard();
        nd.show();
        this.dispose();

    }// GEN-LAST:event_jButton4MouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Indigency1.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Indigency1.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Indigency1.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Indigency1.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new wnebill().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Badmin;
    private javax.swing.JTextField Pbarang;
    private javax.swing.JTextField age;
    private javax.swing.JTextArea area;
    private javax.swing.JTextField con;
    private javax.swing.JTextField date;
    private com.toedter.calendar.JDateChooser dateselect;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField purpose;
    private javax.swing.JTextField sitio;
    // End of variables declaration//GEN-END:variables

}
