/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 *
 * @author Daniel Arteaga
 */
public interface DAOLogin {
    /**
     * metodo que verifica si el usuario y la contraseña ingresados son correctos
     * @param usuario usuario ingresado
     * @param contrasenia contraseña ingresada
     * @return si los usuarios son correctos es true, sino false
     */
    public boolean VerificarUsuarios(String usuario, String contrasenia);
    /**
     * da el usuario ingresado
     * @return devuelve el usuario ingresado
     */
    public String getUsuario();
    
    /**
     * metodo que se usa para cambiar la contraseña 
     * @param contrasenia se cambia la contraseña
     * @return true 
     */
    public boolean CambiarContrasenia(String contrasenia);
    
}
