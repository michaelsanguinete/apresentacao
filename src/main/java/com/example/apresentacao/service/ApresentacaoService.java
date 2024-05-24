package com.example.apresentacao.service;

import org.springframework.stereotype.Component;

@Component
public class ApresentacaoService {

    public static void main(String[] args) {

        int numero = 100;

        for (int i = 0; i <= numero; i++) {
            System.out.println("Número: " + i);
        }
    }

    public boolean ehPositivo(int numero) {
        return numero > 0;
    }

    public boolean retornaMaiorValorLong(Long numero1, Long numero2) {
        if(numero1 > numero2) {
            return true;
        } else if (numero1 < numero2) {
            return false;
        } else {
            return false;
        }
    }

    public static int retornaMaiorValor(int numero1, int numero2) {
        if(numero1 > numero2) {
            return numero1;
        } else {
            return numero2;
        }
    }
}
