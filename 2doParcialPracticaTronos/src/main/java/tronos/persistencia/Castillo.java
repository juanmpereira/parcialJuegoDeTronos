package tronos.persistencia;

import javax.persistence.*;

@Entity
@DiscriminatorValue("1")
public class Castillo extends Lugar{

	@Column(name="cantidad_murallas")
	private int cantMurallas;
	
	@Column(name="cantidad_torres")
	private int cantTorres;
}
