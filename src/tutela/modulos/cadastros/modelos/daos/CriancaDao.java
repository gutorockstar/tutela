/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutela.modulos.cadastros.modelos.daos;

import tutela.modulos.principal.modelos.daos.ConexaoBD;
import java.sql.Statement;
import javax.swing.JOptionPane;
import tutela.modulos.cadastros.modelos.negocios.Crianca;

/**
 *
 * @author augusto
 */
public class CriancaDao extends ConexaoBD
{    
    public boolean salvar(Crianca crianca) 
    {
        try 
        {
            if ( crianca.validaDadosObrigatorios() )
            {
                Statement st = super.getConnection().createStatement();

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


                int resultado = st.executeUpdate(sql);
                return true;
            }
            else
            {
                throw new Exception("Preencha corretamente os campos obrigatórios!");
            }
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Erro ao salvar: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
            return false;
        }
    }
}
