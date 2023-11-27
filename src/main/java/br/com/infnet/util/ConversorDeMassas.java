package br.com.infnet.util;

import br.com.infnet.exeption.ValorInvalidoException;

public class ConversorDeMassas {
    public double kilosParaLibras(double kilos) {
        if(kilos < 0) throw new ValorInvalidoException("Não existe massa negativa");
        return kilos * 2.20462;
    }
}
