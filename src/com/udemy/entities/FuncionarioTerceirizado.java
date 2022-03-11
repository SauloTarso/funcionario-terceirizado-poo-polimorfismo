package com.udemy.entities;

public class FuncionarioTerceirizado extends Funcionario{

    private Double pagamentoAdicional;

    public FuncionarioTerceirizado() {
    }

    public FuncionarioTerceirizado(String nome, Integer horas, Double valorPorHora, Double pagamentoAdicional) {
        super(nome, horas, valorPorHora);
        this.pagamentoAdicional = pagamentoAdicional;
    }

    public Double getPagamentoAdicional() {
        return pagamentoAdicional;
    }

    public void setPagamentoAdicional(Double pagamentoAdicional) {
        this.pagamentoAdicional = pagamentoAdicional;
    }

    @Override
    public double pagamento(){
        return super.pagamento() + pagamentoAdicional * 1.1;
    }
}
