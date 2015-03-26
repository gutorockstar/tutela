/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutela.modulos.principal.visoes;

/**
 *
 * @author augusto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        Sistema sistema = new Sistema();
        sistema.setExtendedState(sistema.MAXIMIZED_BOTH);
        sistema.setVisible(true);
    }
}
