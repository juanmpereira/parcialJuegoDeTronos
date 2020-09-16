package tronos.persistencia;

import java.util.List;

import javax.persistence.*;

@Entity
@Table(name="region")
public class Region {

		@Id @GeneratedValue
		private Long id;
		
		@Column(name="nombre")
		String nombre;
		
		@ManyToOne
		private Casa casaPrincipal;
		
		@OneToMany
		private List<Lugar> lugares;

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

		public Casa getCasaPrincipal() {
			return casaPrincipal;
		}

		public void setCasaPrincipal(Casa casaPrincipal) {
			this.casaPrincipal = casaPrincipal;
		}

		public List<Lugar> getLugares() {
			return lugares;
		}

		public void setLugares(List<Lugar> lugares) {
			this.lugares = lugares;
		}
		
		
}
