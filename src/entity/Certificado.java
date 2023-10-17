package entity;

public class Certificado {
    private String avaliador;
    private int cod_verificacao;
    private String assinatura;
    private String situacao;

    public String getAvaliador() {
        return avaliador;
    }

    public void setAvaliador(String avaliador) {
        this.avaliador = avaliador;
    }

    public int getCod_verificacao() {
        return cod_verificacao;
    }

    public void setCod_verificacao(int cod_verificacao) {
        this.cod_verificacao = cod_verificacao;
    }

    public String getAssinatura() {
        return assinatura;
    }

    public void setAssinatura(String assinatura) {
        this.assinatura = assinatura;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
}
