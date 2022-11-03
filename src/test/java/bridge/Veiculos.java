package test.java.bridge;

import main.java.padraobridge.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Veiculos {
    @Test
    void deveRetornaSportManual(){
        Transmissao transmissao = new Manual();
        Sport sport = new Sport("2.0");
        sport.setTransmissao(transmissao);
        assertEquals("Sport 2.0 Manual", sport.montaVeiculo());
    }

    @Test
    void deveRetornarSportAutomatico(){
        Transmissao transmissao = new Automatico();
        Sport sport = new Sport("2.0");
        sport.setTransmissao(transmissao);
        assertEquals("Sport 2.0 Automatico", sport.montaVeiculo());
    }

    @Test
    void deveRetornarHatchManual(){
        Transmissao transmissao = new Manual();
        Hatch hatch = new Hatch("1.5");
        hatch.setTransmissao(transmissao);
        assertEquals("Hatch 1.5 Manual", hatch.montaVeiculo());
    }

    @Test
    void deveRetornarHatchAutomatico(){
        Transmissao transmissao = new Automatico();
        Hatch hatch = new Hatch("1.5");
        hatch.setTransmissao(transmissao);
        assertEquals("Hatch 1.5 Automatico", hatch.montaVeiculo());
    }

    @Test
    void deveRetornarSedanManual(){
        Transmissao transmissao = new Manual();
        Sedan sedan = new Sedan("1.0");
        sedan.setTransmissao(transmissao);
        assertEquals("Sedan 1.0 Manual", sedan.montaVeiculo());
    }

    @Test
    void deveRetornarSedanAutomatico(){
        Transmissao transmissao = new Automatico();
        Sedan sedan = new Sedan("1.0");
        sedan.setTransmissao(transmissao);
        assertEquals("Sedan 1.0 Automatico", sedan.montaVeiculo());
    }

}
