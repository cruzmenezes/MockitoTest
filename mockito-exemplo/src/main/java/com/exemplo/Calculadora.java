package com.exemplo;

public class Calculadora {

    private ServiceExterno servico;

    public Calculadora(ServiceExterno servico){
        this.servico = servico;
    }

    public int somarComValorExterno(int valor){
        int valorExterno = servico.obterValor();
        return valor + valorExterno;
    }
}
