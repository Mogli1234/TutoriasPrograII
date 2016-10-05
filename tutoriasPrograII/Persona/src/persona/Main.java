/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import java.util.LinkedList;

/**
 *
 * @author Iso.chan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
//    public static void main(String[] args) {
//        Lugar l1 = new Lugar("Lugar 1", "Calle 1", "93277393");
//         Lugar l2 = new Lugar("Lugar 2", "Calle 2", "23049933");
//         Lugar l3 = new Lugar("Lugar 3", "Calle 3", "24692312");
// 
//         Foto f = new Foto();
//         f.setPathToFile("c:/Fotos/foto1.jpg");
//         f.setTipoArchivo("jpg");
//         f.setTamanno("320x320");
// 
//         LinkedList<Lugar> lugares = new LinkedList<>();
//         lugares.add(l1);
//         lugares.add(l2);
// 
//         Persona p = new Persona("Pedro", "Perez", lugares, f);
//         System.out.println(p);
//         p.agregarLugarFrecuante(l3);
//         System.out.println(p);
// 
//         p.agregarPerfil(1, "Ladron");
//         p.agregarPerfil(2, "Violador");
//         p.agregarPerfil(3, "Secuestrador");
//         
//         System.out.println(p);
//    }
    
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
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainView().setVisible(true);
            }
        });
    }
}
