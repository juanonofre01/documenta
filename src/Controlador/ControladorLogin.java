/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.DAOLogin;

/**
 *
 * @author Angel
 * 
 */
public class ControladorLogin implements DAOLogin{
    
    private static ControladorLogin controladorLogin; //controladorLogin es una variable estatica que usa metodos de la clase ControladorLogin 
    private String usuario; //usuario
    private String contrasenia; // contraseña del usuario  
    
    
   
    private ControladorLogin() { //metodo que sirve para implementar componentes en la clase ControladorLogin()
        
    }
    
    /**
     * se usa el singleton nuevamente para hacer una sola instancia cuando el controladorLogin sea vacio
     * @return y devuelve controladorLogin
     */
    public static ControladorLogin getControladorLogin(){
        if(controladorLogin==null)
            controladorLogin=new ControladorLogin();
        
        return controladorLogin;
    }
    
    /**
     * con este metodo booleano se puede ver si los usuarios son correctos o no
     * @param usuario el usuario dado
     * @param contrasenia contraseña dada
     * @return se devuelve estado como booleano, verdadero si es correcto y falso si no lo es
     */
    @Override
    public boolean VerificarUsuarios(String usuario, String contrasenia) {
        boolean estado=false;
        
        if((usuario.equals("daniel"))&&(contrasenia.equals("12345")))
            estado=true;
        
        return estado;
    }

    @Override
    /**
     * este metodo publico sirve para mostrar el usuario dado
     */
    public String getUsuario() {
        return this.usuario;
    }

    @Override
    /**
     * el metodo booleano puede cambiar la contraseña
     * @param contrasenia es la nueva contraseña que el usuario dio
     * devuelve estado en true
     */
    public boolean CambiarContrasenia(String contrasenia) {
        boolean estado=true;        
        this.contrasenia=contrasenia;
        return estado;
        
    }
    
}
