package tronos.persistencia;

import javax.persistence.*;

public enum FuerzaMilitar {
		AEREA,
		TERRESTRE,
		NAVAL;
	
		@Id @GeneratedValue
		private Long id;
		
		@Column(name="cantidad_ataque")
		private int cantidadAtaque;   //preguntar donde iria esto siendo un enum y no teniendo tabla
		
		public void atacarA(Lugar lugar) {
			
		}
		
}
//NO PUEDE SER ENUM POR TENER ESTADO. EL CAMPO DEL ENUM NO DEBERIA TENER ATRIBUTOS, SOLO CONSTANTES. 
//DEBERIA HACER UNA CLASE ABSTRACTA.

//ANALIZANDO QUE HERENCIA CONVIENE SINGLE_TABLE PORQUE TIENE MUY POCOS ATRIBUTOS Y NO TIENE SENTIDO HACER UNA TABLA
//PARA UN SOLO ATRIBUTO + UN ID (COMO SERIA EL CASO DE JOINED O TABLE_PER_CLASS).
//ENCIMA AL SINGLE TABLE PUEDO PONERLE UN CAMPO CANTIDAD_UNIDADES QUE TODOS USEN PARA SU CANTIDAD Y LISTO