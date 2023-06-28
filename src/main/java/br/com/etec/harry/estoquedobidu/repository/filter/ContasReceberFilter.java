package br.com.etec.harry.estoquedobidu.repository.filter;

import java.math.BigDecimal;
import java.util.Date;

public class ContasReceberFilter {

    private static Date data;

    private static BigDecimal valorconta;

    private String nomecliente;

    public static Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public static BigDecimal getValorconta() {
        return valorconta;
    }

    public void setValorconta(BigDecimal valorconta) {
        this.valorconta = valorconta;
    }

    public String getNomecliente() {
        return nomecliente;
    }

    public void setNomecliente(String nomecliente) {
        this.nomecliente = nomecliente;
    }
}
