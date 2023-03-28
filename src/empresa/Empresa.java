/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

import Vistas.Login;

/**
 *
 * @author Angel
 */
public class Empresa {

    /**
     * creando la variable login hace el llamado de la clase Login y ademas usa el metodo getLogin
     * con login llama el metodo setVisible para mostrar la interfaz grafica de la clase Login
     */
    public static void main(String[] args) {
        Login login=Login.getLogin();
        login.setVisible(true);
    }
    
}
