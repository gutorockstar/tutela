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
import tutela.modulos.cadastros.modelos.daos.CriancaDAO;

/**
 *
 * @author augusto
 */
public final class Crianca extends Pessoa
{
    private boolean possuiNecessidadeEspecial;
    private String necessidadeEspecial;
    private String nomeMae;
    private String nomePai;
    private String outroResponsavel;
    private String certidaoNascimento;

    public Crianca(){}
    
    public Crianca(int idPessoa) {
        this.popular(idPessoa);
    }

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
        else if ( this.getEstadoCivil().length() == 0 || this.getEstadoCivil().equals(" "))
        {
            camposValidos = false;
        }        
        else if ( this.getDataNascimento().length() == 0 )
        {
            camposValidos = false;
        }        
        else if ( this.getSexo().length() == 0 )
        {
            camposValidos = false;
        }        
        else if ( this.getOrigemEtnica().length() == 0 || this.getOrigemEtnica().equals(" ") )
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
    public void populaRegistrosNaTabela(JTable tabela, ResultSet resultSet, int codigoRegistroASelecionar)
    {
        try
        {
            this.limparTabela(tabela);
            
            ResultSetMetaData metaData = resultSet.getMetaData();
            int columns = metaData.getColumnCount();
            boolean selecionarLinha = false;
            boolean linhaSelecionada = false;
            int linhaASelecionar = 0;

            while ( resultSet.next() )
            {  
                Object[] row = new Object[columns];

                for ( int i = 1; i <= columns; i++ )
                {  
                    row[i - 1] = resultSet.getObject(i);
                    
                    /**
                     * Se for a primeira, coluna, e o registro dessa coluna for igual ao registro a ser selecionado, 
                     * a linha deste registro deve ficar selecionada.
                     */
                    
                    if ( ( i -1 ) == 0 && ( resultSet.getObject(i).toString().equals(String.valueOf(codigoRegistroASelecionar)) ) && !linhaSelecionada )
                    {
                        selecionarLinha = true;
                    }
                }

                ((DefaultTableModel) tabela.getModel()).insertRow(resultSet.getRow() -1, row);
                
                
                if ( selecionarLinha )
                {
                    tabela.addRowSelectionInterval(linhaASelecionar, linhaASelecionar);
                    linhaSelecionada = true;
                    selecionarLinha = false;
                }
                
                linhaASelecionar ++;
            }
        }
        catch ( Exception e )
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao popular a tabela: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Popula os campos do formulário com os dados
     * do modelo criança.
     * 
     * @param int idPessoa
     */
    public void popular(int idPessoa)
    {
        try
        {
            CriancaDAO criancaDao = new CriancaDAO();
            ResultSet resultSet;
            resultSet = criancaDao.listar(idPessoa);
            resultSet.next();
            
            this.setIdPessoa(idPessoa);
            this.setNome(resultSet.getString("nome"));
            this.setEstadoCivil(resultSet.getString("estadocivil"));
            this.setDataNascimento(resultSet.getString("datanascimento"));
            this.setSexo(resultSet.getString("sexo"));
            this.setOrigemEtnica(resultSet.getString("origemetnica"));
            this.setCidade(resultSet.getString("cidade"));
            this.setTelefoneCelular(resultSet.getString("telefonecelular"));
            this.setPossuiNecessidadeEspecial(resultSet.getBoolean("possuinecessidadeespecial"));
            this.setNomeMae(resultSet.getString("nomemae"));
            this.setNomePai(resultSet.getString("nomepai"));
            this.setOutroResponsavel(resultSet.getString("outroresponsavel"));
            this.setEstado(resultSet.getString("estado"));
            this.setBairro(resultSet.getString("bairro"));
            this.setRua(resultSet.getString("rua"));
            this.setNumero(resultSet.getString("numero"));
            this.setComplemento(resultSet.getString("complemento"));
            this.setRg(resultSet.getString("rg"));
            this.setCpf(resultSet.getString("cpf"));
            this.setTelefoneResidencial(resultSet.getString("telefoneresidencial"));
            this.setEmail(resultSet.getString("email"));
            this.setNecessidadeEspecial(resultSet.getString("necessidadeespecial"));
            this.setCertidaoNascimento(resultSet.getString("certidaonascimento"));            
        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao popular registro da criança: " + e, "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    /**
     * Limpa os registros populados da tabela.
     * 
     * @param tabela 
     */
    public void limparTabela(JTable tabela)
    {
        while ( tabela.getRowCount() > 0 )
        {
            ((DefaultTableModel) tabela.getModel()).removeRow(0);
        }
    }
}
