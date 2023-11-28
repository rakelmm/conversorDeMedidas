package br.com.infnet;

import br.com.infnet.util.ConversorDeTemperaturas;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

/**
 * Hello world!
 */
public class App {

    private static final Logger LOGGER = LoggerFactory.getLogger(App.class);
    public static void main(String[] args) {
        LOGGER.info("Iniciando o programa");
        System.out.println("Bem vindo ao Conversor!");
        System.out.println("======================");
        System.out.println();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a opção");
        System.out.println("1 - C para k");
        System.out.println("2 - C para F");
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                scanner.nextLine();
                System.out.println("Digite a temperatura em C");
                LOGGER.debug("Aguardando entrada da temperatura em C");
                double celsius = scanner.nextDouble();
                ConversorDeTemperaturas conversorDeTemperaturas = new ConversorDeTemperaturas();
                LocalDateTime start = LocalDateTime.now();
                LOGGER.info("Inicio do calculo de conversão");
                LOGGER.debug("Iniciando conversão de Celsius para Kelvin");
                double resultKelvin = conversorDeTemperaturas.celsiusParaKelvin(celsius);
                LocalDateTime end = LocalDateTime.now();
                long between = ChronoUnit.MILLIS.between(start, end);
                LOGGER.info("Final do metodo de conversão com tempo: " + between + " MS.");
                LOGGER.debug("Conversão concluída com tempo: {} MS.", between);
                System.out.println("A temperatura em K é: " + "\u001B[32m" + resultKelvin + "\u001B[0m" + "k");
                break;

            default:
                LOGGER.error("Código inválido inserido pelo usuário: {}", option);
                System.out.println("Invalid code");
                break;
        }
        LOGGER.debug("Encerrando o programa");
    }
}
