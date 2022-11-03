package main.java.padraobridge;

public class Sedan extends Categoria {
    public Sedan(String motor){ super(motor); }
    public String montaVeiculo(){ return "Sedan " + this.motor + " " + this.transmissao.tipoDeTransmissao(); }
}
