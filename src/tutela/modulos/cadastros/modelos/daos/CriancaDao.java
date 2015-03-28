/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutela.modulos.cadastros.modelos.daos;

import tutela.modulos.principal.modelos.daos.ConexaoBD;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import tutela.modulos.cadastros.modelos.negocios.Crianca;

/**
 *
 * @author augusto
 */
public class CriancaDao extends ConexaoBD
{    
    /**
     * Registra uma nova criança na base de dados.
     * 
     * @param crianca
     * @return boolean
     */
    public boolean salvar(Crianca crianca) 
    {
        try 
        {
            if ( crianca.validaDadosObrigatorios() )
            {
                String sql = "INSERT INTO crianca" +
                                         "(nome," +
                                          "estadoCivil," +
                                          "dataNascimento," +
                                          "sexo," +
                                          "origemEtnica," +
                                          "estado," +
                                          "cidade," +
                                          "bairro," +
                                          "rua," +
                                          "numero," +
                                          "complemento," +
                                          "rg," +
                                          "cpf," +
                                          "telefoneResidencial," +
                                          "telefoneCelular," +
                                          "email," +
                                          "possuiNecessidadeEspecial," +
                                          "necessidadeEspecial," +
                                          "nomeMae," +
                                          "nomePai," +
                                          "outroResponsavel," +
                                          "certidaoNascimento)" +
                                  "VALUES ('" + crianca.getNome() + "'," +
                                          "'" + crianca.getEstadoCivil() + "'," +
                                          "'" + crianca.getDataNascimento() + "'," +
                                          "'" + crianca.getSexo() + "'," +
                                          "'" + crianca.getOrigemEtnica() + "'," +
                                          "'" + crianca.getEstado() + "'," +
                                          "'" + crianca.getCidade() + "'," +
                                          "'" + crianca.getBairro() + "'," +
                                          "'" + crianca.getRua() + "'," +
                                          "'" + crianca.getNumero() + "'," +
                                          "'" + crianca.getComplemento() + "'," +
                                          "'" + crianca.getRg() + "'," +
                                          "'" + crianca.getCpf() + "'," +
                                          "'" + crianca.getTelefoneResidencial() + "'," +
                                          "'" + crianca.getTelefoneCelular() + "'," +
                                          "'" + crianca.getEmail() + "'," +
                                          "'" + crianca.isPossuiNecessidadeEspecial() + "'," +
                                          "'" + crianca.getNecessidadeEspecial() + "'," +
                                          "'" + crianca.getNomeMae() + "'," +
                                          "'" + crianca.getNomePai() + "'," +
                                          "'" + crianca.getOutroResponsavel() + "'," +
                                          "'" + crianca.getCertidaoNascimento() + "')";

                Statement st = super.getConnection().createStatement();
                st.executeUpdate(sql);
                
                return true;
            }
            else
            {
                throw new Exception("Preencha corretamente os campos obrigatórios!");
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar registro: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
    
    /**
     * Lista todos os registros de crianças, obtidos
     * da base de dados.
     * 
     * @param filtro
     * @return ArrayList
     */
    public ArrayList listar(String filtro)
    {
        ArrayList criancas = null;
        
        try
        {
            String where = "";
            String sql = "SELECT idPessoa," +
                                "nome," +
                                "estadoCivil," +
                                "dataNascimento," +
                                "sexo," +
                                "origemEtnica," +
                                "estado," +
                                "cidade," +
                                "bairro," +
                                "rua," +
                                "numero," +
                                "complemento," +
                                "rg," +
                                "cpf," +
                                "telefoneResidencial," +
                                "telefoneCelular," +
                                "email," +
                                "possuiNecessidadeEspecial," +
                                "necessidadeEspecial," +
                                "nomeMae," +
                                "nomePai," +
                                "outroResponsavel," +
                                "certidaoNascimento" +
                           "FROM crianca ";
            
            if ( filtro.length() > 0 )
            {
                
            }
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao listar registros: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return criancas;
    }
    
    /**
     * Atualiza registro de uma criança na base de dados.
     * 
     * @param crianca
     * @return boolean
     */
    public boolean atualizar(Crianca crianca)
    {
        return false;
    }
    
    /**
     * Exclui registro de uma criança da base de dados.
     * 
     * @param idCrianca
     * @return boolean
     */
    public boolean excluir(int idCrianca)
    {
        return false;   
    }
    
}
