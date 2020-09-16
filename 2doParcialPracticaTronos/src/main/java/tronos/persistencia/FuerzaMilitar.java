package tronos.persistencia;

import javax.persistence.*;

@Entity
@Table(name="fuerza_militar")
public enum FuerzaMilitar {
		AEREA,
		TERRESTRE,
		NAVAL;
	
		@Id @GeneratedValue
		private Long id;
		
		@Column(name="cantidad_ataque")
		private int cantidadAtaque;
		
		public void atacarA(Lugar lugar) {
			
		}
		
}
