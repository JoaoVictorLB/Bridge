package main.java.padraobridge;

public class Hatch extends Categoria{
    public Hatch(String motor){ super(motor); }
    public String montaVeiculo(){ return "Hatch " + this.motor + " " + this.transmissao.tipoDeTransmissao(); }
}
