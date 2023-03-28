/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vistas;

import Controlador.ControladorLogin;
import DAO.DAOLogin;
import javax.swing.JOptionPane;

/**
 *
 * @author Angel
 */
public class Login extends javax.swing.JFrame {

    private static Login login; //con el uso de login se conecta a la clase Login para utilizarla
    private DAOLogin cLogin=ControladorLogin.getControladorLogin(); //con el uso de cLogin se puede contectar con ControlaadorLogin la cual implementa la interface DAOLogin para acceder a los datos de los usuarios, con getControlLogin
    
    /**
     * Creates new form Login
     */
    private Login() { //es un metodo que solo se utiliza en esta clase porque es privado 
        initComponents(); //inicializa componentes
    }
    /**
     * metodo publico de tipo clase Login getLogin
     * es un metodo que se lo conoce como singleton y puede ayudar a crear nuevas instancias
     * si login esta vacio o null, crea una nueva instancia y la retorna en return login
     */
    public static Login getLogin(){ 
                                    
        if(login==null)
            login=new Login();
        
        return login;
    }
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        olvido = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        usuario = new javax.swing.JTextField();
        contrasenia = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");

        olvido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        olvido.setText("¿Olvido su contraseña?");
        olvido.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                olvidoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                olvidoMouseExited(evt);
            }
        });
        getContentPane().add(olvido, java.awt.BorderLayout.PAGE_END);

        jPanel1.setLayout(new java.awt.GridLayout(0, 1));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Logo");
        jPanel1.add(jLabel1);

        jPanel2.setLayout(new java.awt.GridLayout(0, 1));

        usuario.setText("Usuario.....");
        usuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                usuarioMouseClicked(evt);
            }
        });
        jPanel2.add(usuario);

        contrasenia.setText("Contraseña....");
        contrasenia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                contraseniaMouseClicked(evt);
            }
        });
        jPanel2.add(contrasenia);

        jButton1.setText("Iniciar Sesión");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1);

        jPanel1.add(jPanel2);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_usuarioMouseClicked
        // TODO add your handling code here:
        usuario.setText(""); //borra el texto de la pantalla 
    }//GEN-LAST:event_usuarioMouseClicked

    private void contraseniaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_contraseniaMouseClicked
        // TODO add your handling code here:
        contrasenia.setText("");//borra el texto de la pantalla
    }//GEN-LAST:event_contraseniaMouseClicked

    private void olvidoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidoMouseEntered
        // TODO add your handling code here:
        olvido.setForeground(new java.awt.Color(51, 0, 255)); //cambia el color azul cuando se pone el puntero del mouse
    }//GEN-LAST:event_olvidoMouseEntered

    private void olvidoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_olvidoMouseExited
        // TODO add your handling code here:
        olvido.setForeground(new java.awt.Color(0, 0, 0)); //devuelve al color original al quitar el puntero del mouse
    }//GEN-LAST:event_olvidoMouseExited
    
    /** 
     * se utiliza con el cLogin el metodo VerificarUsuarios para verificar si los datos son correctos
     * con el if se puede verificar si el usuario es correcto o no, dando un mensaje en pantalla
     * tambien se utiliza el DAOLogin para acceder a esa forma de una manera mas segura, como si hubiera un filtro 
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        if(cLogin.VerificarUsuarios(usuario.getText(), contrasenia.getText()))
            JOptionPane.showMessageDialog(this, "Usuario correcto", "Información", JOptionPane.OK_OPTION);
        else
            JOptionPane.showMessageDialog(this, "Usuario incorrecto", "Información", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_jButton1ActionPerformed

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField contrasenia;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel olvido;
    private javax.swing.JTextField usuario;
    // End of variables declaration//GEN-END:variables
}
