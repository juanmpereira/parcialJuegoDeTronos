package tronos.persistencia;

import java.time.LocalDate;

import javax.persistence.*;

import org.uqbarproject.jpa.java8.extras.convert.LocalDateConverter;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(discriminatorType = DiscriminatorType.INTEGER,name="id_castillo1_ciudad2")
@Table(name="Lugar")
public class Lugar {
	
	@Id @GeneratedValue
	private Long id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Convert(converter=LocalDateConverter.class)
	@Column(name="anio_fundacion")
	private LocalDate anioFundacion;
	
	@Column(name="poblacion")
	private int poblacion;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public LocalDate getAnioFundacion() {
		return anioFundacion;
	}

	public void setAnioFundacion(LocalDate anioFundacion) {
		this.anioFundacion = anioFundacion;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	
}

/*
Tomo la decision de hacer un single_table por el hecho de que no hay tantos atributos distintos(solo 5), si aumentaran
quiza deberia considerar otra opcion. 
No me parece utilizar la opcion de JOINED por el tema de que siempre se esta consultando por castillo o por ciudad y deberia
estar haciendo joins constantes que harian que el programa funcione mas lento.
Por ultimo considere usar table_per_class pero no me parecia le mejor tener que andar haciendo una tabla que lleve el control 
de los id cuando por solo agregar 5 columnas puedo usar single_table
*/