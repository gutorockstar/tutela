/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutela.modulos.cadastros.modelos.negocios;

import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author augusto
 */
public class Crianca extends Pessoa
{
    private boolean possuiNecessidadeEspecial;
    private String necessidadeEspecial;
    private String nomeMae;
    private String nomePai;
    private String outroResponsavel;
    private String certidaoNascimento;

    public boolean isPossuiNecessidadeEspecial() 
    {
        return possuiNecessidadeEspecial;
    }

    public void setPossuiNecessidadeEspecial(boolean possuiNecessidadeEspecial) 
    {
        this.possuiNecessidadeEspecial = possuiNecessidadeEspecial;
    }

    public String getNecessidadeEspecial() 
    {
        return necessidadeEspecial;
    }

    public void setNecessidadeEspecial(String necessidadeEspecial) 
    {
        this.necessidadeEspecial = necessidadeEspecial;
    }

    public String getNomeMae() 
    {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) 
    {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() 
    {
        return nomePai;
    }

    public void setNomePai(String nomePai) 
    {
        this.nomePai = nomePai;
    }

    public String getOutroResponsavel() 
    {
        return outroResponsavel;
    }

    public void setOutroResponsavel(String outroResponsavel) 
    {
        this.outroResponsavel = outroResponsavel;
    }

    public String getCertidaoNascimento() 
    {
        return certidaoNascimento;
    }

    public void setCertidaoNascimento(String certidaoNascimento) 
    {
        this.certidaoNascimento = certidaoNascimento;
    }
    
    /**
     * Verifica se os dados obrigatórios para um
     * registro de criança, foram corretamente
     * preenchidos.
     * 
     * @return boolean
     */
    public boolean validaDadosObrigatorios() 
    {
        boolean camposValidos = true;
        
        if ( this.getNome().length() == 0 )
        {
            camposValidos = false;
        }
        else if ( this.getEstadoCivil().length() == 0 )
        {
            camposValidos = false;
        }        
        else if ( this.getDataNascimento().length() == 0 )
        {
            camposValidos = false;
        }        
        else if ( this.getSexo() == 0 )
        {
            camposValidos = false;
        }        
        else if ( this.getOrigemEtnica().length() == 0 )
        {
            camposValidos = false;
        }        
        else if ( this.getEstado().length() == 0 )
        {
            camposValidos = false;
        }        
        else if ( this.getCidade().length() == 0 )
        {
            camposValidos = false;
        }        
        else if ( this.getBairro().length() == 0 )
        {
            camposValidos = false;
        }        
        else if ( this.getRua().length() == 0 )
        {
            camposValidos = false;
        }        
        else if ( this.getNumero().length() == 0 )
        {
            camposValidos = false;
        }        
        else if ( this.getTelefoneCelular().length() == 0 )
        {
            camposValidos = false;
        }        
        else if ( this.getCertidaoNascimento().length() == 0 )
        {
            camposValidos = false;
        }
        
        if ( !camposValidos )
        {
            JOptionPane.showMessageDialog(null, "Preencha corretamente os campos obrigatórios!", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        
        return camposValidos;
    }
    
    /**
     * Popula os registros obtidos na tabela.
     * Conforme colunas que a tabela aceite.
     * 
     * @param tabel
     * @param resultSet 
     */
    public void populaRegistrosNaTabela(JTable tabela, ResultSet resultSet)
    {
        try
        {
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columns = metaData.getColumnCount();

            while ( resultSet.next() )
            {  
                Object[] row = new Object[columns];

                for ( int i = 1; i <= columns; i++ )
                {  
                    row[i - 1] = resultSet.getObject(i);
                }

                ((DefaultTableModel) tabela.getModel()).insertRow(resultSet.getRow() -1,row);
            }
        }
        catch ( Exception e )
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao popular a tabela: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
