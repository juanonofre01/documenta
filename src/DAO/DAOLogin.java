/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package DAO;

/**
 *
 * @author Angel
 */
public interface DAOLogin {
    /**
     * con este metodo booleano se puede ver si los usuarios son correctos o no
     * @param usuario el nombre de usuario
     * @param contrasenia la contraseña del usuario
     * @return devuelve si los usuarios son correctos o no, con un true o false
     */
    public boolean VerificarUsuarios(String usuario, String contrasenia);
    /**
     * muestra el usuario que se guarda y lo devuelve
     */
    public String getUsuario();
    
    /**
     * con este metodo se puede cambiar la contraseña
     * @param contrasenia da una nueva contraseña y devuelve una variable tipo booleana
     */
    public boolean CambiarContrasenia(String contrasenia);
    
}
