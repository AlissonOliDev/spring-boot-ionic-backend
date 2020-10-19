package com.alissondev.cursomc.domain;

import java.util.Date;

import javax.persistence.Entity;

import com.alissondev.cursomc.domain.enums.EstadoPagamento;

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private Date dataVencimeno;
	private Date dataPagamento;
	
	public PagamentoComBoleto() {		
	}

	public PagamentoComBoleto(Integer id, EstadoPagamento estado, Pedido pedido, Date dataVencimento, Date dataPagamento) {
		super(id, estado, pedido);
		this.dataPagamento = dataPagamento;
		this.dataVencimeno = dataVencimento;
	}

	public Date getDataVencimeno() {
		return dataVencimeno;
	}

	public void setDataVencimeno(Date dataVencimeno) {
		this.dataVencimeno = dataVencimeno;
	}

	public Date getDataPagamento() {
		return dataPagamento;
	}

	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}

	
	
}
