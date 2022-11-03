package main.java.padraobridge;

public class Sport extends Categoria {
    public Sport(String motor){ super(motor); }
    public String montaVeiculo(){ return "Sport " + this.motor + " " + this.transmissao.tipoDeTransmissao(); }
}
