/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutela.modulos.cadastros.modelos.negocios;

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
        
        return camposValidos;
    }
}
