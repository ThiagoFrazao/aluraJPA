package financao.jpa.modelos;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Movimentacao {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;	
	private BigDecimal valor;
	@Enumerated(EnumType.STRING)
	private TipoMovimentacao tipo;
	@Temporal(TemporalType.DATE)
	private Date data;
	private String descricao;
	@ManyToOne
	private Conta conta;
	@ManyToMany
	private List<Categoria> categoria;
	


	public Movimentacao(BigDecimal valor, TipoMovimentacao tipo, Date data, String descricao,Categoria categoria) {
		this.valor = valor;
		this.tipo = tipo;
		this.data = data;
		this.descricao = descricao;
	}
	
	public Movimentacao(){
		
	}
	
	public void addCategoria(Categoria categoria){
		this.categoria.add(categoria);
	}
	
	public List<Categoria> getCategoria() {
		return categoria;
	}

	public void setCategoria(List<Categoria> categoria) {
		this.categoria = categoria;
	}

	public Integer getId() {
		return id;
	}

	public BigDecimal getValor() {
		return valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	public TipoMovimentacao getTipo() {
		return tipo;
	}

	public void setTipo(TipoMovimentacao tipo) {
		this.tipo = tipo;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}	
}
