package com.neobe.novaregulacao;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "Beneficiario")
public class Beneficiario implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Identificador do beneficiário")
	private java.lang.Long id;
	@org.kie.api.definition.type.Label("Nome do beneficiário")
	private java.lang.String nome;

	@org.kie.api.definition.type.Label("Idade máxima do beneficiário no plano")
	private int idadeMaximaPlano;

	@org.kie.api.definition.type.Label("Negado")
	private java.lang.Boolean negado;

	@org.kie.api.definition.type.Label("Idade do beneficiário")
	private int idadeAnos;

	@org.kie.api.definition.type.Label("Idade do beneficiário Ano e Meses")
	private int idadeMeses;

	@org.kie.api.definition.type.Label("Idade do beneficiário (Ano, Meses e Dias)")
	private int idadeDias;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "BENEFICIARIO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "BENEFICIARIO_ID_SEQ", name = "BENEFICIARIO_ID_GENERATOR")
	private java.lang.Long id1;

	@org.kie.api.definition.type.Label("Indica se beneficiário está suspenso na data corrente")
	private java.lang.Boolean suspenso;

	@org.kie.api.definition.type.Label(value = "Beneficiário inativo na data de solicitação")
	private java.lang.Boolean inativo;

	@org.kie.api.definition.type.Label(value = "Cartão do beneficiário cancelado")
	private java.lang.Boolean cartaoCancelado;

	@org.kie.api.definition.type.Label(value = "Cartão do beneficiário bloqueado")
	private java.lang.Boolean cartaoBloqueado;

	public Beneficiario() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.String getNome() {
		return this.nome;
	}

	public void setNome(java.lang.String nome) {
		this.nome = nome;
	}

	public int getIdadeMaximaPlano() {
		return this.idadeMaximaPlano;
	}

	public void setIdadeMaximaPlano(int idadeMaximaPlano) {
		this.idadeMaximaPlano = idadeMaximaPlano;
	}

	public java.lang.Boolean getNegado() {
		return this.negado;
	}

	public void setNegado(java.lang.Boolean negado) {
		this.negado = negado;
	}

	public int getIdadeAnos() {
		return this.idadeAnos;
	}

	public void setIdadeAnos(int idadeAnos) {
		this.idadeAnos = idadeAnos;
	}

	public int getIdadeMeses() {
		return this.idadeMeses;
	}

	public void setIdadeMeses(int idadeMeses) {
		this.idadeMeses = idadeMeses;
	}

	public int getIdadeDias() {
		return this.idadeDias;
	}

	public void setIdadeDias(int idadeDias) {
		this.idadeDias = idadeDias;
	}

	public java.lang.Long getId1() {
		return this.id1;
	}

	public void setId1(java.lang.Long id1) {
		this.id1 = id1;
	}

	public java.lang.Boolean getSuspenso() {
		return this.suspenso;
	}

	public void setSuspenso(java.lang.Boolean suspenso) {
		this.suspenso = suspenso;
	}

	public java.lang.Boolean getInativo() {
		return this.inativo;
	}

	public void setInativo(java.lang.Boolean inativo) {
		this.inativo = inativo;
	}

	public java.lang.Boolean getCartaoCancelado() {
		return this.cartaoCancelado;
	}

	public void setCartaoCancelado(java.lang.Boolean cartaoCancelado) {
		this.cartaoCancelado = cartaoCancelado;
	}

	public java.lang.Boolean getCartaoBloqueado() {
		return this.cartaoBloqueado;
	}

	public void setCartaoBloqueado(java.lang.Boolean cartaoBloqueado) {
		this.cartaoBloqueado = cartaoBloqueado;
	}

	public Beneficiario(java.lang.Long id, java.lang.String nome,
			int idadeMaximaPlano, java.lang.Boolean negado, int idadeAnos,
			int idadeMeses, int idadeDias, java.lang.Long id1,
			java.lang.Boolean suspenso, java.lang.Boolean inativo,
			java.lang.Boolean cartaoCancelado, java.lang.Boolean cartaoBloqueado) {
		this.id = id;
		this.nome = nome;
		this.idadeMaximaPlano = idadeMaximaPlano;
		this.negado = negado;
		this.idadeAnos = idadeAnos;
		this.idadeMeses = idadeMeses;
		this.idadeDias = idadeDias;
		this.id1 = id1;
		this.suspenso = suspenso;
		this.inativo = inativo;
		this.cartaoCancelado = cartaoCancelado;
		this.cartaoBloqueado = cartaoBloqueado;
	}

}