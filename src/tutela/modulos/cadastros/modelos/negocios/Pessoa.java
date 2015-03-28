/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutela.modulos.cadastros.modelos.negocios;

/**
 *
 * @author augusto
 */
public class Pessoa 
{
    public static final char sexoM = 'M';
    public static final char sexoF = 'F';
    
    private int idPessoa;
    private String nome;
    private String estadoCivil;
    private String dataNascimento;
    private char sexo;
    private String origemEtnica;
    private String estado;
    private String cidade;
    private String bairro;
    private String rua;
    private String numero;
    private String complemento;
    private String rg;
    private String cpf;
    private String telefoneResidencial;
    private String telefoneCelular;
    private String email;

    public int getIdPessoa() 
    {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) 
    {
        this.idPessoa = idPessoa;
    }
    
    public String getNome() 
    {
        return nome;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public String getEstadoCivil() 
    {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) 
    {
        this.estadoCivil = estadoCivil;
    }

    public String getDataNascimento() 
    {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) 
    {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() 
    {
        return sexo;
    }

    public void setSexo(char sexo) 
    {
        this.sexo = sexo;
    }

    public String getOrigemEtnica() 
    {
        return origemEtnica;
    }

    public void setOrigemEtnica(String origemEtnica) 
    {
        this.origemEtnica = origemEtnica;
    }

    public String getEstado() 
    {
        return estado;
    }

    public void setEstado(String estado) 
    {
        this.estado = estado;
    }

    public String getCidade() 
    {
        return cidade;
    }

    public void setCidade(String cidade) 
    {
        this.cidade = cidade;
    }

    public String getBairro() 
    {
        return bairro;
    }

    public void setBairro(String bairro) 
    {
        this.bairro = bairro;
    }

    public String getRua() 
    {
        return rua;
    }

    public void setRua(String rua) 
    {
        this.rua = rua;
    }

    public String getNumero() 
    {
        return numero;
    }

    public void setNumero(String numero) 
    {
        this.numero = numero;
    }

    public String getComplemento() 
    {
        return complemento;
    }

    public void setComplemento(String complemento) 
    {
        this.complemento = complemento;
    }

    public String getRg() 
    {
        return rg;
    }

    public void setRg(String rg) 
    {
        this.rg = rg;
    }

    public String getCpf() 
    {
        return cpf;
    }

    public void setCpf(String cpf) 
    {
        this.cpf = cpf;
    }

    public String getTelefoneResidencial() 
    {
        return telefoneResidencial;
    }

    public void setTelefoneResidencial(String telefoneResidencial) 
    {
        this.telefoneResidencial = telefoneResidencial;
    }

    public String getTelefoneCelular() 
    {
        return telefoneCelular;
    }

    public void setTelefoneCelular(String telefoneCelular) 
    {
        this.telefoneCelular = telefoneCelular;
    }

    public String getEmail() 
    {
        return email;
    }

    public void setEmail(String email) 
    {
        this.email = email;
    }
}
