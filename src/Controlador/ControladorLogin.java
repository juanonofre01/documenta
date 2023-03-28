/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import DAO.DAOLogin;

/**
 *
 * @author AncyElMasPro
 * 
 * clase publica ControladorLogin que implementa la interface DAOLogin
 */
public class ControladorLogin implements DAOLogin{
    
    private static ControladorLogin controladorLogin; //se crea una varibale estatica controladorLogin de tipo clase ControladorLogin
    private String usuario; //variable cadena de texto usuario
    private String contrasenia; //variable cadena de texto contrasenia 
    
    
    /**
     * metodo privado para hacer implementaciones de la clase ControladorLogin()
     */
    private ControladorLogin() {
        
    }
    
    /**
     * metodo singleton que sirve para hacer una sola instancia de la clase 
     * condicional si controladorLogin es vacio se crea una nueva instancia 
     * @return devuelve la instancia controladorLogin
     */
    public static ControladorLogin getControladorLogin(){
        if(controladorLogin==null)
            controladorLogin=new ControladorLogin();
        
        return controladorLogin;
    }
    
    /**
     * metodo que permite verificar si los usuarios son correctos
     * @param usuario   usuario de los datos guardados
     * @param contrasenia contraseña de los datos guardados
     * @return falso si  no es correcto, true si es correcto el usuario ingresado 
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
     * metodo que da el usuario ingresado y lo devuelve
     */
    public String getUsuario() {
        return this.usuario;
    }

    @Override
    /**
     * metodo que permite cambiar la contraseña 
     * this.contrasenia = contrasenia la cambia por una nueva 
     * devuelve el estado, solo va a devolver estado true
     */
    public boolean CambiarContrasenia(String contrasenia) {
        boolean estado=true;        
        this.contrasenia=contrasenia;
        return estado;
        
    }
    
}
