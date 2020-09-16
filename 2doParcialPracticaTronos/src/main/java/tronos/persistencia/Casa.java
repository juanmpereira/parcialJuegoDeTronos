package tronos.persistencia;

import java.time.LocalDate;

import javax.persistence.*;

import org.uqbarproject.jpa.java8.extras.convert.LocalDateConverter;

@Entity
@Table(name="casa")
public class Casa {
	
	@Id @GeneratedValue
	private Long id;
	
	@Column(name="patrimonio")
	private int patrimonio;
	
	@Convert(converter=LocalDateConverter.class)
	@Column(name="anio_fundacion")
	private LocalDate anioFundacion;
	
	@ManyToOne
	private Lugar lugar;
	
	@Enumerated(EnumType.ORDINAL)
	@Column(name="fuerza_militar")
	private FuerzaMilitar fuerza;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public int getPatrimonio() {
		return patrimonio;
	}

	public void setPatrimonio(int patrimonio) {
		this.patrimonio = patrimonio;
	}

	public LocalDate getAnioFundacion() {
		return anioFundacion;
	}

	public void setAnioFundacion(LocalDate anioFundacion) {
		this.anioFundacion = anioFundacion;
	}

	public Lugar getLugar() {
		return lugar;
	}

	public void setLugar(Lugar lugar) {
		this.lugar = lugar;
	}

	public FuerzaMilitar getFuerza() {
		return fuerza;
	}

	public void setFuerza(FuerzaMilitar fuerza) {
		this.fuerza = fuerza;
	}
	
	
}

