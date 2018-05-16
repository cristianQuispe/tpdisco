package testdisco;

import static org.junit.Assert.*;

import org.junit.Test;

import disco.circulo;

public class test {

		
		@Test
		public void testQueCalculaElPerimetroInterior() {
			
			circulo miDisco=new circulo(4,6);
			
			Double valorEsperado=25.12;
			Double valorObtenido=miDisco.calcularPerimetroInterior();
			assertEquals(valorEsperado,valorObtenido ,0.01);
		}
		
		@Test
		public void testQueCalculaElPerimetroExterior() {
			
			circulo miDisco=new circulo(4,6);
			
			Double valorEsperado=37.68;
			Double valorObtenido=miDisco.calcularPerimetroExterior();
			assertEquals(valorEsperado, valorObtenido,0.01);
		}
		
		@Test
		public void testQueCalculaLaSuperficie(){
			circulo miDisco=new circulo(4,6);
			Double valorEsperado=62.80;
			Double valorObtenido=miDisco.calcularSuperficie();
			assertEquals(valorEsperado, valorObtenido,0.01);
			
			System.out.println(valorObtenido);
		}

		
		
		
		
		
	}

