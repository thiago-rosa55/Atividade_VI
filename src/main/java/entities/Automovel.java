package entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Automovel implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "anoFabricacao", nullable = false)
	private Integer anoFabricacao;

	@Column(name = "anoModelo", nullable = false)
	private Integer anoModelo;

	@Column(name = "observacoes", nullable = false)
	private String observacoes;

	@Column(name = "preco", nullable = false)
	private float preco;

	@Column(name = "kilometragem", nullable = false)
	private Integer kilometragem;

	@ManyToOne
	@JoinColumn(name = "modelo_id")
	private Modelo modelo;

	public Automovel() {

	}

	public Automovel(Integer id, Integer anoFabricacao, Integer anoModelo, String observacoes, float preco,
			Integer kilometragem, Modelo modelo) {
		this.id = id;
		this.anoFabricacao = anoFabricacao;
		this.anoModelo = anoModelo;
		this.observacoes = observacoes;
		this.preco = preco;
		this.kilometragem = kilometragem;
		this.modelo = modelo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getAnoFabricacao() {
		return anoFabricacao;
	}

	public void setAnoFabricacao(Integer anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}

	public Integer getAnoModelo() {
		return anoModelo;
	}

	public void setAnoModelo(Integer anoModelo) {
		this.anoModelo = anoModelo;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	public float getPreco() {
		return preco;
	}

	public void setPreco(float preco) {
		this.preco = preco;
	}

	public Integer getKilometragem() {
		return kilometragem;
	}

	public void setKilometragem(Integer kilometragem) {
		this.kilometragem = kilometragem;
	}

	public Modelo getModelo() {
		return modelo;
	}

	public void setModelo(Modelo modelo) {
		this.modelo = modelo;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((anoFabricacao == null) ? 0 : anoFabricacao.hashCode());
		result = prime * result + ((anoModelo == null) ? 0 : anoModelo.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((kilometragem == null) ? 0 : kilometragem.hashCode());
		result = prime * result + ((modelo == null) ? 0 : modelo.hashCode());
		result = prime * result + ((observacoes == null) ? 0 : observacoes.hashCode());
		result = prime * result + Float.floatToIntBits(preco);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Automovel other = (Automovel) obj;
		if (anoFabricacao == null) {
			if (other.anoFabricacao != null)
				return false;
		} else if (!anoFabricacao.equals(other.anoFabricacao))
			return false;
		if (anoModelo == null) {
			if (other.anoModelo != null)
				return false;
		} else if (!anoModelo.equals(other.anoModelo))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (kilometragem == null) {
			if (other.kilometragem != null)
				return false;
		} else if (!kilometragem.equals(other.kilometragem))
			return false;
		if (modelo == null) {
			if (other.modelo != null)
				return false;
		} else if (!modelo.equals(other.modelo))
			return false;
		if (observacoes == null) {
			if (other.observacoes != null)
				return false;
		} else if (!observacoes.equals(other.observacoes))
			return false;
		if (Float.floatToIntBits(preco) != Float.floatToIntBits(other.preco))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Automovel [id=" + id + ", anoFabricacao=" + anoFabricacao + ", anoModelo=" + anoModelo
				+ ", observacoes=" + observacoes + ", preco=" + preco + ", kilometragem=" + kilometragem + ", modelo="
				+ modelo + "]";
	}

}
