/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutela.modulos.sistema.controladores;

import javax.swing.JDialog;
import javax.swing.JInternalFrame;

/**
 *
 * @author augusto
 */
public abstract class Controlador 
{
    public abstract boolean salvarAcao(JDialog visaoNovo);
    public abstract boolean atualizarAcao(JDialog visaoEditar);
    public abstract boolean excluirAcao(JDialog visaoRemover);
    public abstract boolean listarAcao(JInternalFrame visao);
}
