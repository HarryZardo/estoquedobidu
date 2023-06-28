package br.com.etec.harry.estoquedobidu.repository.projections;

import java.math.BigDecimal;
import java.util.Date;

public class ContasreceberDto {

    private Integer id;

    private Date data;

    private BigDecimal valorconta;

    private String nomecliente;

    public ContasreceberDto(Integer id, Date data, BigDecimal valorconta, String nomecliente) {
        this.id = id;
        this.data = data;
        this.valorconta = valorconta;
        this.nomecliente = nomecliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public BigDecimal getValorconta() {
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
