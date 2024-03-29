/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package tokobukuapps;
import java.io.File;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JasperFillManager; 
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.JasperCompileManager; 
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author yogaadipratama
 */
public class mainMenu extends javax.swing.JFrame {
    String id_peg; 

    /**
     * Creates new form mainMenu
     */
    public mainMenu() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    
    public mainMenu(String id_pegawai) {
        initComponents();
        this.setLocationRelativeTo(null);
        id_peg = id_pegawai;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuBar4 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        kasirMenu = new javax.swing.JMenu();
        listMenu = new javax.swing.JMenu();
        listBuku = new javax.swing.JMenuItem();
        listPegawai = new javax.swing.JMenuItem();
        listSupplier = new javax.swing.JMenuItem();
        orderMenu = new javax.swing.JMenu();
        transaksiMenu = new javax.swing.JMenu();
        kategoriMenu = new javax.swing.JMenu();
        laporanMenu = new javax.swing.JMenu();
        laporanBuku = new javax.swing.JMenuItem();
        laporanPegawai = new javax.swing.JMenuItem();
        laporanSupplier = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        laporanOrder = new javax.swing.JMenuItem();
        laporanOrderFilter = new javax.swing.JMenuItem();
        laporanOrderDetail = new javax.swing.JMenuItem();
        jSeparator2 = new javax.swing.JPopupMenu.Separator();
        laporanTransaksi = new javax.swing.JMenuItem();
        laporanTransaksiFilter = new javax.swing.JMenuItem();
        laporanTransaksiDetail = new javax.swing.JMenuItem();
        logoutMenu = new javax.swing.JMenu();

        jMenuItem2.setText("jMenuItem2");

        jMenuItem1.setText("jMenuItem1");

        jScrollPane1.setViewportView(jTree1);

        jMenu1.setText("File");
        jMenuBar2.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar2.add(jMenu2);

        jMenu5.setText("jMenu5");

        jMenu3.setText("File");
        jMenuBar3.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar3.add(jMenu4);

        jMenu6.setText("File");
        jMenuBar4.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar4.add(jMenu7);

        jMenuItem3.setText("jMenuItem3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel1.setText("SISTEM MANAJEMEN TOKO BUKU");

        jLabel2.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jLabel2.setText("YOGA PRATAMA BOOK STORE");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/book2.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 126, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(122, 122, 122))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addComponent(jLabel4)
                .addGap(34, 34, 34)
                .addComponent(jLabel2)
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jMenuBar1.setBackground(new java.awt.Color(255, 255, 51));

        kasirMenu.setText("Kasir");
        kasirMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kasirMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(kasirMenu);

        listMenu.setText("List");

        listBuku.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/book.png"))); // NOI18N
        listBuku.setText("List Buku");
        listBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listBukuActionPerformed(evt);
            }
        });
        listMenu.add(listBuku);

        listPegawai.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/person.png"))); // NOI18N
        listPegawai.setText("List Pegawai");
        listPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listPegawaiActionPerformed(evt);
            }
        });
        listMenu.add(listPegawai);

        listSupplier.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/cart.png"))); // NOI18N
        listSupplier.setText("List Supplier");
        listSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listSupplierActionPerformed(evt);
            }
        });
        listMenu.add(listSupplier);

        jMenuBar1.add(listMenu);

        orderMenu.setText("Order");
        orderMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(orderMenu);

        transaksiMenu.setText("Transaksi");
        transaksiMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                transaksiMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(transaksiMenu);

        kategoriMenu.setText("Kategori");
        kategoriMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kategoriMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(kategoriMenu);

        laporanMenu.setText("Laporan");

        laporanBuku.setText("Data Buku");
        laporanBuku.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanBukuActionPerformed(evt);
            }
        });
        laporanMenu.add(laporanBuku);

        laporanPegawai.setText("Data Pegawai");
        laporanPegawai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanPegawaiActionPerformed(evt);
            }
        });
        laporanMenu.add(laporanPegawai);

        laporanSupplier.setText("Data Supplier");
        laporanSupplier.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanSupplierActionPerformed(evt);
            }
        });
        laporanMenu.add(laporanSupplier);
        laporanMenu.add(jSeparator1);

        laporanOrder.setText("Data Order ");
        laporanOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanOrderActionPerformed(evt);
            }
        });
        laporanMenu.add(laporanOrder);

        laporanOrderFilter.setText("Data Order Filter");
        laporanOrderFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanOrderFilterActionPerformed(evt);
            }
        });
        laporanMenu.add(laporanOrderFilter);

        laporanOrderDetail.setText("Data Order Detail");
        laporanOrderDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanOrderDetailActionPerformed(evt);
            }
        });
        laporanMenu.add(laporanOrderDetail);
        laporanMenu.add(jSeparator2);

        laporanTransaksi.setText("Data Transaksi");
        laporanTransaksi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanTransaksiActionPerformed(evt);
            }
        });
        laporanMenu.add(laporanTransaksi);

        laporanTransaksiFilter.setText("Data Transaksi Filter");
        laporanTransaksiFilter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanTransaksiFilterActionPerformed(evt);
            }
        });
        laporanMenu.add(laporanTransaksiFilter);

        laporanTransaksiDetail.setText("Data Transaksi Detail");
        laporanTransaksiDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanTransaksiDetailActionPerformed(evt);
            }
        });
        laporanMenu.add(laporanTransaksiDetail);

        jMenuBar1.add(laporanMenu);

        logoutMenu.setText("Logout");
        logoutMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMenuMouseClicked(evt);
            }
        });
        jMenuBar1.add(logoutMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kasirMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kasirMenuMouseClicked
        // TODO add your handling code here:
        kasirMenu km = new kasirMenu(id_peg);
        km.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kasirMenuMouseClicked

    private void listBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listBukuActionPerformed
        // TODO add your handling code here:
        bukuMenu bm = new bukuMenu(id_peg);
        bm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_listBukuActionPerformed

    private void listPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listPegawaiActionPerformed
        // TODO add your handling code here:
        pegawaiMenu pm = new pegawaiMenu(id_peg);
        pm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_listPegawaiActionPerformed

    private void listSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listSupplierActionPerformed
        // TODO add your handling code here:
        supplierMenu sm = new supplierMenu(id_peg);
        sm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_listSupplierActionPerformed

    private void orderMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderMenuMouseClicked
        // TODO add your handling code here:
        orderMenu om = new orderMenu(id_peg);
        om.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_orderMenuMouseClicked

    private void transaksiMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_transaksiMenuMouseClicked
        // TODO add your handling code here:
        transaksiMenu tm = new transaksiMenu(id_peg);
        tm.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_transaksiMenuMouseClicked

    private void kategoriMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kategoriMenuMouseClicked
        // TODO add your handling code here:
        kategoriMenu km = new kategoriMenu(id_peg);
        km.setVisible(true);
        setVisible(false);
    }//GEN-LAST:event_kategoriMenuMouseClicked

    private void logoutMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMenuMouseClicked
        // TODO add your handling code here:
        loginMenu lm = new loginMenu();
        lm.setVisible(true);
        Connection c = Koneksi.getKoneksi();
        try {
            Statement s = c.createStatement();
            String sql = "UPDATE tb_pegawai SET stat='logout' WHERE id_pegawai='"+id_peg+"'";
        } catch (SQLException ex) {
            Logger.getLogger(mainMenu.class.getName()).log(Level.SEVERE, null, ex);
        }
        setVisible(false);
    }//GEN-LAST:event_logoutMenuMouseClicked

    private void laporanBukuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanBukuActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = Koneksi.getKoneksi();
            String reportPath = "/Users/yogaadipratama/JaspersoftWorkspace/MyReports/laporanBuku.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath); 
            JasperPrint jp = JasperFillManager.fillReport(jr,null, c); 
            JasperViewer.viewReport(jp);
            c.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_laporanBukuActionPerformed

    private void laporanPegawaiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanPegawaiActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = Koneksi.getKoneksi();
            String reportPath = "/Users/yogaadipratama/JaspersoftWorkspace/MyReports/laporanPegawai.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath); 
            JasperPrint jp = JasperFillManager.fillReport(jr,null, c); 
            JasperViewer.viewReport(jp);
            c.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_laporanPegawaiActionPerformed

    private void laporanSupplierActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanSupplierActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = Koneksi.getKoneksi();
            String reportPath = "/Users/yogaadipratama/JaspersoftWorkspace/MyReports/laporanSupplier.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath); 
            JasperPrint jp = JasperFillManager.fillReport(jr,null, c); 
            JasperViewer.viewReport(jp);
            c.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_laporanSupplierActionPerformed

    private void laporanOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanOrderActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = Koneksi.getKoneksi();
            String reportPath = "/Users/yogaadipratama/JaspersoftWorkspace/MyReports/laporanOrder.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath); 
            JasperPrint jp = JasperFillManager.fillReport(jr,null, c); 
            JasperViewer.viewReport(jp);
            c.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_laporanOrderActionPerformed

    private void laporanOrderDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanOrderDetailActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = Koneksi.getKoneksi();
            String reportPath = "/Users/yogaadipratama/JaspersoftWorkspace/MyReports/laporanOrderDetail.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath); 
            JasperPrint jp = JasperFillManager.fillReport(jr,null, c); 
            JasperViewer.viewReport(jp);
            c.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_laporanOrderDetailActionPerformed

    private void laporanTransaksiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanTransaksiActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = Koneksi.getKoneksi();
            String reportPath = "/Users/yogaadipratama/JaspersoftWorkspace/MyReports/laporanTransaksi.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath); 
            JasperPrint jp = JasperFillManager.fillReport(jr,null, c); 
            JasperViewer.viewReport(jp);
            c.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_laporanTransaksiActionPerformed

    private void laporanTransaksiDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanTransaksiDetailActionPerformed
        // TODO add your handling code here:
        try{
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = Koneksi.getKoneksi();
            String reportPath = "/Users/yogaadipratama/JaspersoftWorkspace/MyReports/laporanTransaksiDetail.jrxml";
            JasperReport jr = JasperCompileManager.compileReport(reportPath); 
            JasperPrint jp = JasperFillManager.fillReport(jr,null, c); 
            JasperViewer.viewReport(jp);
            c.close();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_laporanTransaksiDetailActionPerformed

    private void laporanOrderFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanOrderFilterActionPerformed
        // TODO add your handling code here:
        new laporanOrder().setVisible(true);
    }//GEN-LAST:event_laporanOrderFilterActionPerformed

    private void laporanTransaksiFilterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanTransaksiFilterActionPerformed
        // TODO add your handling code here:
        new laporanTransaksi().setVisible(true);
    }//GEN-LAST:event_laporanTransaksiFilterActionPerformed

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
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(mainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new mainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuBar jMenuBar4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JPopupMenu.Separator jSeparator2;
    private javax.swing.JTree jTree1;
    private javax.swing.JMenu kasirMenu;
    private javax.swing.JMenu kategoriMenu;
    private javax.swing.JMenuItem laporanBuku;
    private javax.swing.JMenu laporanMenu;
    private javax.swing.JMenuItem laporanOrder;
    private javax.swing.JMenuItem laporanOrderDetail;
    private javax.swing.JMenuItem laporanOrderFilter;
    private javax.swing.JMenuItem laporanPegawai;
    private javax.swing.JMenuItem laporanSupplier;
    private javax.swing.JMenuItem laporanTransaksi;
    private javax.swing.JMenuItem laporanTransaksiDetail;
    private javax.swing.JMenuItem laporanTransaksiFilter;
    private javax.swing.JMenuItem listBuku;
    private javax.swing.JMenu listMenu;
    private javax.swing.JMenuItem listPegawai;
    private javax.swing.JMenuItem listSupplier;
    private javax.swing.JMenu logoutMenu;
    private javax.swing.JMenu orderMenu;
    private javax.swing.JMenu transaksiMenu;
    // End of variables declaration//GEN-END:variables
}
