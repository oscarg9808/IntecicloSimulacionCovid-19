/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.vista;

import ec.edu.ups.controlador.ControladorGeneric;
import java.awt.event.WindowAdapter;
import javax.swing.JFrame;
import java.awt.event.WindowEvent;
import javax.swing.JOptionPane;



/**
 *
 * @author opizarro
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
        initComponents();
        setExtendedState(JFrame.MAXIMIZED_BOTH); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuBar = new javax.swing.JMenuBar();
        btndatos = new javax.swing.JMenu();
        btndata = new javax.swing.JMenuItem();
        btnRefresh = new javax.swing.JMenuItem();
        btnRegresion = new javax.swing.JMenu();
        btnPolinomial = new javax.swing.JMenuItem();
        btnProbabilistico = new javax.swing.JMenuItem();
        btnSIR = new javax.swing.JMenuItem();
        exitMenuItem = new javax.swing.JMenuItem();
        btnSimulacion = new javax.swing.JMenu();
        btnContagios = new javax.swing.JMenuItem();
        btnPlanificacion = new javax.swing.JMenuItem();
        btnResultados = new javax.swing.JMenu();
        btnEstadisticas = new javax.swing.JMenuItem();
        btnGraficas = new javax.swing.JMenuItem();
        btnsalir = new javax.swing.JMenu();
        btncerrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btndatos.setText("Datos");

        btndata.setText("Datos Covid-19");
        btndata.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndataActionPerformed(evt);
            }
        });
        btndatos.add(btndata);

        btnRefresh.setText("Actualizar Datos");
        btnRefresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRefreshActionPerformed(evt);
            }
        });
        btndatos.add(btnRefresh);

        menuBar.add(btndatos);

        btnRegresion.setMnemonic('f');
        btnRegresion.setText("Regresiones");

        btnPolinomial.setMnemonic('o');
        btnPolinomial.setText("Polinomial");
        btnPolinomial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPolinomialActionPerformed(evt);
            }
        });
        btnRegresion.add(btnPolinomial);

        btnProbabilistico.setMnemonic('s');
        btnProbabilistico.setText("Probabilistico");
        btnProbabilistico.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProbabilisticoActionPerformed(evt);
            }
        });
        btnRegresion.add(btnProbabilistico);

        btnSIR.setMnemonic('a');
        btnSIR.setText("SIR");
        btnSIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSIRActionPerformed(evt);
            }
        });
        btnRegresion.add(btnSIR);

        exitMenuItem.setMnemonic('x');
        exitMenuItem.setText("Exit");
        exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitMenuItemActionPerformed(evt);
            }
        });
        btnRegresion.add(exitMenuItem);

        menuBar.add(btnRegresion);

        btnSimulacion.setMnemonic('e');
        btnSimulacion.setText("Simulacion");

        btnContagios.setMnemonic('t');
        btnContagios.setText("Contagios");
        btnContagios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContagiosActionPerformed(evt);
            }
        });
        btnSimulacion.add(btnContagios);

        btnPlanificacion.setMnemonic('y');
        btnPlanificacion.setText("Planificacion y modelado");
        btnPlanificacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanificacionActionPerformed(evt);
            }
        });
        btnSimulacion.add(btnPlanificacion);

        menuBar.add(btnSimulacion);

        btnResultados.setMnemonic('h');
        btnResultados.setText("Resultados");

        btnEstadisticas.setMnemonic('c');
        btnEstadisticas.setText("Estadisticas");
        btnEstadisticas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadisticasActionPerformed(evt);
            }
        });
        btnResultados.add(btnEstadisticas);

        btnGraficas.setMnemonic('a');
        btnGraficas.setText("Graficas");
        btnGraficas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGraficasActionPerformed(evt);
            }
        });
        btnResultados.add(btnGraficas);

        menuBar.add(btnResultados);

        btnsalir.setText("Salir");
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });

        btncerrar.setText("Cerrar todo");
        btncerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncerrarActionPerformed(evt);
            }
        });
        btnsalir.add(btncerrar);

        menuBar.add(btnsalir);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 660, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 435, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

    private void btnPolinomialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPolinomialActionPerformed
        // TODO add your handling code here:
        VistaPolinomial vistaPolinomial = new VistaPolinomial();
        add(vistaPolinomial);
        
        vistaPolinomial.setVisible(true);
    }//GEN-LAST:event_btnPolinomialActionPerformed

    private void btnProbabilisticoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProbabilisticoActionPerformed
        // TODO add your handling code here:
        VistaProbabilidad vistaProbabilidad = new VistaProbabilidad();
        add(vistaProbabilidad);
        vistaProbabilidad.setVisible(true);
    }//GEN-LAST:event_btnProbabilisticoActionPerformed

    private void btnSIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSIRActionPerformed
        // TODO add your handling code here:
        VistaSIR vistaSIR = new VistaSIR();
        add(vistaSIR);
        vistaSIR.setVisible(true);
    }//GEN-LAST:event_btnSIRActionPerformed

    private void btnContagiosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContagiosActionPerformed
        // TODO add your handling code here:
        VistaContagio vistaContagio = new VistaContagio();
        add(vistaContagio);
        vistaContagio.setVisible(true);
        
    }//GEN-LAST:event_btnContagiosActionPerformed

    private void btnPlanificacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanificacionActionPerformed
        // TODO add your handling code here:
        VistaPlanificacion vistaPlanificacion = new VistaPlanificacion();
        add(vistaPlanificacion);
        vistaPlanificacion.setVisible(true);
        
    }//GEN-LAST:event_btnPlanificacionActionPerformed

    private void btnEstadisticasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadisticasActionPerformed
        // TODO add your handling code here:
        VistaResultados vistaResultados = new VistaResultados();
        add(vistaResultados);
        vistaResultados.setVisible(true);
    }//GEN-LAST:event_btnEstadisticasActionPerformed

    private void btnGraficasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGraficasActionPerformed
        // TODO add your handling code here:
        VistaResultados vistaResultados = new VistaResultados();
        add(vistaResultados);
        vistaResultados.setVisible(true);
    }//GEN-LAST:event_btnGraficasActionPerformed

    private void btndataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndataActionPerformed
        VistaDatos vd = new VistaDatos();
        add(vd);
        vd.setVisible(true);
    }//GEN-LAST:event_btndataActionPerformed

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btncerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncerrarActionPerformed
      salir();
    }//GEN-LAST:event_btncerrarActionPerformed

    private void btnRefreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRefreshActionPerformed
        // TODO add your handling code here:
        
        //String comando = "python python/refresh_data.py";
        String comando = "cd python && python refresh_data.py";
        ControladorGeneric.ejecutarComando(comando);
    }//GEN-LAST:event_btnRefreshActionPerformed
  
    
    public void salir(){
            int valor = JOptionPane.showConfirmDialog(this, "¿Desea salir de la aplicacion?");
            if (valor == JOptionPane.YES_OPTION){
                JOptionPane.showMessageDialog(null, "Gracias");
                System.exit(0);
            }
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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem btnContagios;
    private javax.swing.JMenuItem btnEstadisticas;
    private javax.swing.JMenuItem btnGraficas;
    private javax.swing.JMenuItem btnPlanificacion;
    private javax.swing.JMenuItem btnPolinomial;
    private javax.swing.JMenuItem btnProbabilistico;
    private javax.swing.JMenuItem btnRefresh;
    private javax.swing.JMenu btnRegresion;
    private javax.swing.JMenu btnResultados;
    private javax.swing.JMenuItem btnSIR;
    private javax.swing.JMenu btnSimulacion;
    private javax.swing.JMenuItem btncerrar;
    private javax.swing.JMenuItem btndata;
    private javax.swing.JMenu btndatos;
    private javax.swing.JMenu btnsalir;
    private javax.swing.JMenuItem exitMenuItem;
    private javax.swing.JMenuBar menuBar;
    // End of variables declaration//GEN-END:variables

}