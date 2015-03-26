/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tutela.modulos.cadastros.modelos;

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

    public boolean isPossuiNecessidadeEspecial() {
        return possuiNecessidadeEspecial;
    }

    public void setPossuiNecessidadeEspecial(boolean possuiNecessidadeEspecial) {
        this.possuiNecessidadeEspecial = possuiNecessidadeEspecial;
    }

    public String getNecessidadeEspecial() {
        return necessidadeEspecial;
    }

    public void setNecessidadeEspecial(String necessidadeEspecial) {
        this.necessidadeEspecial = necessidadeEspecial;
    }

    public String getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(String nomeMae) {
        this.nomeMae = nomeMae;
    }

    public String getNomePai() {
        return nomePai;
    }

    public void setNomePai(String nomePai) {
        this.nomePai = nomePai;
    }

    public String getOutroResponsavel() {
        return outroResponsavel;
    }

    public void setOutroResponsavel(String outroResponsavel) {
        this.outroResponsavel = outroResponsavel;
    }

    public String getCertidaoNascimento() {
        return certidaoNascimento;
    }

    public void setCertidaoNascimento(String certidaoNascimento) {
        this.certidaoNascimento = certidaoNascimento;
    }
}
