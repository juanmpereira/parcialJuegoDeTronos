package tronos.persistencia;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.uqbarproject.jpa.java8.extras.*;
import org.uqbarproject.jpa.java8.extras.transaction.TransactionalOps;


public class Runner implements WithGlobalEntityManager,TransactionalOps{
	
	public static void main(String[] args){
		new Runner().run();
	}

	private void run() {
		entityManager();
		createEntities();
	}

	private void createEntities() {
		
	 Lugar lugar = new Lugar();
		
	 Ciudad ciudad = new Ciudad();
	 ciudad.setAnioFundacion(LocalDate.now());
	 ciudad.setNombre("campana");
	 ciudad.setPoblacion(50000);
	 ciudad.setCantComercios(50);
	 ciudad.setCantSantuarios(10);
	 ciudad.setTasaMortalidad(23);
	 
	 Casa casa = new Casa();
	 casa.setAnioFundacion(LocalDate.now());
	 casa.setLugar(ciudad);
	 casa.setPatrimonio(33000);
	 
	 Region region = new Region();
	 region.setNombre("caba");
	 List<Lugar> lugares = new ArrayList<Lugar>();
	 lugares.add(ciudad);
	 region.setCasaPrincipal(casa);
	 region.setLugares(lugares);
	 
	 entityManager().persist(ciudad);
	 entityManager().persist(casa);
	 entityManager().persist(region);
	}

}
