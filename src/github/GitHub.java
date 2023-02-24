/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package github;

import javax.swing.JOptionPane;

/**
 *
 * @author Axelt
 */
public class GitHub {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = JOptionPane.showInputDialog(null, "Escribe tu nombre: ");
        String Apellido = JOptionPane.showInputDialog(null, "Ingresa tu primer Apellido");
        
        JOptionPane.showMessageDialog(null, "Bienvenido: " + nombre + " " + Apellido);
    }
    
}
