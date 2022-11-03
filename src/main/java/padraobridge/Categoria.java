package main.java.padraobridge;

public abstract class Categoria {
    protected Transmissao transmissao;
    protected String motor;

    public Categoria(String motor){ this.motor = motor; }

    public void setTransmissao(Transmissao transmissao) { this.transmissao = transmissao; }

    public void setMotor(String motor) { this.motor = motor; }

    public abstract String montaVeiculo();
}
