package com.neobe.novaregulacao;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity
@javax.persistence.Table(name = "GuiaSolicitacao")
public class GuiaSolicitacao implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "GUIASOLICITACAO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "GUIASOLICITACAO_ID_SEQ", name = "GUIASOLICITACAO_ID_GENERATOR")
	private java.lang.Long id;
	@org.kie.api.definition.type.Label("Data da solicitação")
	private java.util.Date dataSolicitacao;
	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("Beneficiário da solicitação")
	private com.neobe.novaregulacao.Beneficiario beneficiario;

	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("Negativas da solicitação")
	private java.util.List<com.neobe.novaregulacao.Negativa> negativas;

	@javax.persistence.OneToMany(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label("Lista de procedimentos solicitados")
	private java.util.List<com.neobe.novaregulacao.ProcedimentoSolicitado> procedimentosSolicitados;

	@javax.persistence.ManyToOne(cascade = {javax.persistence.CascadeType.ALL}, fetch = javax.persistence.FetchType.EAGER)
	@org.kie.api.definition.type.Label(value = "Prestador solicitante")
	private com.neobe.novaregulacao.Solicitante solicitante;

	public GuiaSolicitacao() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.util.Date getDataSolicitacao() {
		return this.dataSolicitacao;
	}

	public void setDataSolicitacao(java.util.Date dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public com.neobe.novaregulacao.Beneficiario getBeneficiario() {
		return this.beneficiario;
	}

	public void setBeneficiario(
			com.neobe.novaregulacao.Beneficiario beneficiario) {
		this.beneficiario = beneficiario;
	}

	public java.util.List<com.neobe.novaregulacao.Negativa> getNegativas() {
		return this.negativas;
	}

	public void setNegativas(
			java.util.List<com.neobe.novaregulacao.Negativa> negativas) {
		this.negativas = negativas;
	}

	public void addNegativa(com.neobe.novaregulacao.Negativa item) {
		this.negativas.add(item);
	}

	public java.util.List<com.neobe.novaregulacao.ProcedimentoSolicitado> getProcedimentosSolicitados() {
		return this.procedimentosSolicitados;
	}

	public void setProcedimentosSolicitados(
			java.util.List<com.neobe.novaregulacao.ProcedimentoSolicitado> procedimentosSolicitados) {
		this.procedimentosSolicitados = procedimentosSolicitados;
	}

	public com.neobe.novaregulacao.Solicitante getSolicitante() {
		return this.solicitante;
	}

	public void setSolicitante(com.neobe.novaregulacao.Solicitante solicitante) {
		this.solicitante = solicitante;
	}

	public GuiaSolicitacao(
			java.lang.Long id,
			java.util.Date dataSolicitacao,
			com.neobe.novaregulacao.Beneficiario beneficiario,
			java.util.List<com.neobe.novaregulacao.Negativa> negativas,
			java.util.List<com.neobe.novaregulacao.ProcedimentoSolicitado> procedimentosSolicitados,
			com.neobe.novaregulacao.Solicitante solicitante) {
		this.id = id;
		this.dataSolicitacao = dataSolicitacao;
		this.beneficiario = beneficiario;
		this.negativas = negativas;
		this.procedimentosSolicitados = procedimentosSolicitados;
		this.solicitante = solicitante;
	}

}