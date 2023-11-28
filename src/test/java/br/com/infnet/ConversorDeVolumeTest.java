package br.com.infnet;

import br.com.infnet.exeption.ValorInvalidoException;
import br.com.infnet.util.ConversorDeVolumes;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ConversorDeVolumeTest {
    @Test
    @DisplayName("Deve Converter de litro para GL")
    public void testLitroParaGalao(){
        ConversorDeVolumes conversorDeVolumes = new ConversorDeVolumes();
        double galoes = conversorDeVolumes.litrosParaGaloes(1);
        assertEquals(0.264,galoes, 0.001);
        assertEquals(4.876,conversorDeVolumes.litrosParaGaloes(18.456),0.001);
        assertEquals(0, conversorDeVolumes.litrosParaGaloes(0.0));
        assertThrows(ValorInvalidoException.class, () ->{
            conversorDeVolumes.litrosParaGaloes(- 18.456);
        });
    }
}

