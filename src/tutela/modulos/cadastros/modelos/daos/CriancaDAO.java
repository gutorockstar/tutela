/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutela.modulos.cadastros.modelos.daos;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import tutela.modulos.principal.modelos.daos.ConexaoBD;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import tutela.modulos.cadastros.modelos.negocios.Crianca;

/**
 *
 * @author augusto
 */
public class CriancaDAO extends ConexaoBD
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
     * @return ResultSet
     */
    public ResultSet listar()
    {        
        try
        {
            String sql = "SELECT idpessoa," +
                                "nome," +
                                "estadoCivil," +
                                "TO_CHAR(dataNascimento, 'dd/mm/yyyy') AS dataNascimento," +
                                "(CASE sexo WHEN 'M' THEN 'Masculino' ELSE 'Feminino' END) AS sexo," +
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
                                "(CASE possuiNecessidadeEspecial WHEN TRUE THEN 'Sim' ELSE 'Não' END) AS possuiNecessidadeEspecial," +
                                "necessidadeEspecial," +
                                "nomeMae," +
                                "nomePai," +
                                "outroResponsavel," +
                                "certidaoNascimento " +
                           "FROM crianca";
            
            Statement st = super.getConnection().createStatement();
            ResultSet resultSet = st.executeQuery(sql);
            
            return resultSet;
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Erro ao listar registros: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
            return null;
        }
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
