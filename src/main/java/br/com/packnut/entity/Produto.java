package br.com.packnut.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.LocalDate;

@Entity
@Table(name="produtos")
public class Produto {
	
	//private static final long seriaVersionUID = 1L;
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String nome;
	private String responsavel;
	private String marca;
	private String lote;
	private Integer quantidade_descarte;
	private Integer quantidade_vendida;
	private Double temperatura;
	private LocalDate data_entrada;
	private LocalDate data_fabricacao;
	private LocalDate data_vencimento;

	// Getters e Setters
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getLote() {
		return lote;
	}

	public void setLote(String lote) {
		this.lote = lote;
	}

	public Integer getQuantidade_descarte() {
		return quantidade_descarte;
	}

	public void setQuantidade_descarte(Integer quantidade_descarte) {
		this.quantidade_descarte = quantidade_descarte;
	}

	public Integer getQuantidade_vendida() {
		return quantidade_vendida;
	}

	public void setQuantidade_vendida(Integer quantidade_vendida) {
		this.quantidade_vendida = quantidade_vendida;
	}

	public Double getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Double temperatura) {
		this.temperatura = temperatura;
	}

	public LocalDate getData_entrada() {
		return data_entrada;
	}

	public void setData_entrada(LocalDate data_entrada) {
		this.data_entrada = data_entrada;
	}

	public LocalDate getData_fabricacao() {
		return data_fabricacao;
	}

	public void setData_fabricacao(LocalDate data_fabricacao) {
		this.data_fabricacao = data_fabricacao;
	}

	public LocalDate getData_vencimento() {
		return data_vencimento;
	}

	public void setData_vencimento(LocalDate data_vencimento) {
		this.data_vencimento = data_vencimento;
	}
}
