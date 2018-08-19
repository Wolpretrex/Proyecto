import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class MontoEscritoTest {


	@Test
	void testDeUnoANueve() {
		Montoesc ejecucion = new Montoesc();
		//JOptionPane.showMessageDialog(null, new Montoesc().convertir(8));
		//Datos obtenidos
		String DatosObtenidos = ejecucion.convertir(8);
		//Datos esperados
		String DatosEsperados = " OCHO";
		//Comparacion assert
		assertEquals(DatosEsperados, DatosObtenidos);
	}	


	@Test
	void testDeDiezaNoventayNueve() {
		Montoesc ejecucion = new Montoesc();
		//JOptionPane.showMessageDialog(null, new Montoesc().convertir(85));
		//Datos obtenidos
		String DatosObtenidos = ejecucion.convertir(85);
		//Datos esperados
		String DatosEsperados = " OCHENTA Y CINCO";
		//Comparacion assert
		assertEquals(DatosEsperados, DatosObtenidos);
	}
	
	@Test
	void testDeCienaNovecientosNoventayNueve() {
		Montoesc ejecucion = new Montoesc();
		//JOptionPane.showMessageDialog(null, new Montoesc().convertir(645));
		//Datos obtenidos
		String DatosObtenidos = ejecucion.convertir(645);
		//Datos esperados
		String DatosEsperados = "SEISCIENTOS CUARENTA Y CINCO";
		//Comparacion assert
		assertEquals(DatosEsperados, DatosObtenidos);
	}
	
	@Test
	void testDeMilaNueveMilNovecientosNuevayNueve() {
		Montoesc ejecucion = new Montoesc();
		//JOptionPane.showMessageDialog(null, new Montoesc().convertir(5845));
		//Datos obtenidos
		String DatosObtenidos = ejecucion.convertir(5845);
		//Datos esperados
		String DatosEsperados = " CINCO MIL OCHOCIENTOS CUARENTA Y CINCO";
		//Comparacion assert
		assertEquals(DatosEsperados, DatosObtenidos);
	}

}
