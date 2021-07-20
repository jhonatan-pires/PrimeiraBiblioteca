package AprendendoSobreBibliotecas;

import java.util.Scanner;

public class InteracaoConsoleBiblioteca {
    Scanner scanner = new Scanner(System.in);

    public Integer lerVariosNumeros(String texto){
       System.out.println("Digite um, numero");
        return scanner.nextInt();
    }
    public Double numerosDecimais(String texto){
        System.out.println("Digite um decimal");
        return scanner.nextDouble();
    }

}
