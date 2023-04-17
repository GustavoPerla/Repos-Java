import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import calculadora.Calculadora;

public class CalculadoraTest {
	
	@DisplayName("Prueba suma")
	@Test
	public void test1(){
		double resultado;
		double esperado=240;
		
		resultado=Calculadora.multiplicar(80,3);
		Assertions.assertEquals(esperado, resultado);
	}
	
	@DisplayName("El resultado de sumar 150 y 180, dividido por 3, da 110")
	@Test
	public void test2(){
		double resultado;
		double esperado=110;
		
		resultado=Calculadora.dividir(Calculadora.sumar(180,150),3);
		Assertions.assertEquals(esperado, resultado);
	}
	
	@DisplayName("El resultado de restar 90 y 50, multiplicado por 15, no da 605.")
	@Test
	public void test3(){
		double resultado;
		double esperado=605;
		
		resultado=Calculadora.multiplicar(Calculadora.restar(90,50),15);
		Assertions.assertNotEquals(esperado, resultado);
	}
	
	@DisplayName("El resultado de sumar 70 y 40, multiplicado por 25, no da 2700")
	@Test
	public void test4(){
		double resultado;
		double esperado=2700;
		
		resultado=Calculadora.multiplicar(Calculadora.sumar(70,40),25);
		Assertions.assertNotEquals(esperado, resultado);
	}
	
}
