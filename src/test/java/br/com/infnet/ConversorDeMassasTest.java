package br.com.infnet;

import br.com.infnet.exeption.ValorInvalidoException;
import br.com.infnet.util.ConversorDeMassas;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorDeMassasTest {
    @Test
    @DisplayName("Deve converter de Quilos para Libras")
    public void testKilosParaLibras(){
        ConversorDeMassas conversorDeMassas = new ConversorDeMassas();
        double libras = conversorDeMassas.kilosParaLibras(1);
        assertEquals(2.204,libras,0.01);
        assertEquals(2966.6945,conversorDeMassas.kilosParaLibras(1345.67),0.01);
        assertThrows(ValorInvalidoException.class, () ->{
            conversorDeMassas.kilosParaLibras(-1345.67);
        });
    }
}
