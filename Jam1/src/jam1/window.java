/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jam1;

/**
 *
 * @author rishabhrustogi
 */
public class window extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public window() {
        initComponents();
        Jam1.change();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        label1 = new java.awt.Label();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bstatus = new javax.swing.JButton();
        lstatus = new javax.swing.JButton();
        mstatus = new javax.swing.JButton();
        pstatus = new javax.swing.JButton();
        panda = new java.awt.Label();
        lion = new java.awt.Label();
        monkey = new java.awt.Label();
        lfeed = new javax.swing.JButton();
        bear = new java.awt.Label();
        pfeed = new javax.swing.JButton();
        bfeed = new javax.swing.JButton();
        mfeed = new javax.swing.JButton();
        notice = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        label1.setBackground(new java.awt.Color(0, 0, 0));
        label1.setFont(new java.awt.Font("Skia", 1, 36)); // NOI18N
        label1.setForeground(new java.awt.Color(255, 255, 255));
        label1.setText("Animal Monitoring System");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 10, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jam1/rsz_bear.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 68, 152, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jam1/rsz_lion.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 68, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jam1/rsz_monkey.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(27, 336, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/jam1/rsz_panda.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 336, -1, -1));

        bstatus.setBackground(new java.awt.Color(102, 255, 0));
        bstatus.setToolTipText("");
        getContentPane().add(bstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 56, -1));

        lstatus.setBackground(new java.awt.Color(102, 255, 0));
        lstatus.setToolTipText("");
        getContentPane().add(lstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 230, 56, -1));

        mstatus.setBackground(new java.awt.Color(102, 255, 0));
        mstatus.setToolTipText("");
        getContentPane().add(mstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 498, 56, -1));

        pstatus.setBackground(new java.awt.Color(102, 255, 0));
        pstatus.setToolTipText("");
        getContentPane().add(pstatus, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 498, 56, -1));

        panda.setText("label2");
        getContentPane().add(panda, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 490, 90, 30));

        lion.setText("label2");
        getContentPane().add(lion, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 220, 90, 30));

        monkey.setText("label2");
        getContentPane().add(monkey, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 490, 90, 30));

        lfeed.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        lfeed.setText("FEED");
        lfeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lfeedActionPerformed(evt);
            }
        });
        getContentPane().add(lfeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 220, 50, -1));

        bear.setText("label2");
        getContentPane().add(bear, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 90, 30));

        pfeed.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        pfeed.setText("FEED");
        pfeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pfeedActionPerformed(evt);
            }
        });
        getContentPane().add(pfeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 490, 50, -1));

        bfeed.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        bfeed.setText("FEED");
        bfeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bfeedActionPerformed(evt);
            }
        });
        getContentPane().add(bfeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 50, -1));

        mfeed.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        mfeed.setText("FEED");
        mfeed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mfeedActionPerformed(evt);
            }
        });
        getContentPane().add(mfeed, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, 50, -1));

        notice.setText("textField1");
        getContentPane().add(notice, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 530, 300, 90));

        pack();
    }// </editor-fold>                        

    private void lfeedActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Jam1.lstatus="eating";
        Jam1.ltime=30;
        Jam1.lfeed=120;
    }                                     

    private void pfeedActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Jam1.pstatus="eating";
        Jam1.ptime=10;
        Jam1.pfeed=40;
    }                                     

    private void bfeedActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Jam1.bstatus="eating";
        Jam1.btime=40;
        Jam1.bfeed=160;
    }                                     

    private void mfeedActionPerformed(java.awt.event.ActionEvent evt) {                                      
        Jam1.mstatus="eating";
        Jam1.mtime=20;
        Jam1.mfeed=80;
    }                                     

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    public static java.awt.Label bear;
    private javax.swing.JButton bfeed;
    public static javax.swing.JButton bstatus;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private java.awt.Label label1;
    private javax.swing.JButton lfeed;
    public static java.awt.Label lion;
    public static javax.swing.JButton lstatus;
    private javax.swing.JButton mfeed;
    public static java.awt.Label monkey;
    public static javax.swing.JButton mstatus;
    public static javax.swing.JTextArea notice;
    public static java.awt.Label panda;
    private javax.swing.JButton pfeed;
    public static javax.swing.JButton pstatus;
    // End of variables declaration                   
}