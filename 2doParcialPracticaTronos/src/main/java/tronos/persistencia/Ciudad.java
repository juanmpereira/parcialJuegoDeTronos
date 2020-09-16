package tronos.persistencia;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class Ciudad extends Lugar {
	
	@Column(name="cantidad_comercios")
	private int cantComercios;
	
	@Column(name="cantidad_santuarios")
	private int cantSantuarios;
	
	@Column(name="tasa_mortalidad")
	private double tasaMortalidad;

	public int getCantComercios() {
		return cantComercios;
	}

	public void setCantComercios(int cantComercios) {
		this.cantComercios = cantComercios;
	}

	public int getCantSantuarios() {
		return cantSantuarios;
	}

	public void setCantSantuarios(int cantSantuarios) {
		this.cantSantuarios = cantSantuarios;
	}

	public double getTasaMortalidad() {
		return tasaMortalidad;
	}

	public void setTasaMortalidad(double tasaMortalidad) {
		this.tasaMortalidad = tasaMortalidad;
	}
	
	
}
