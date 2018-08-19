import static org.junit.jupiter.api.Assertions.*;

import javax.swing.JOptionPane;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import org.junit.jupiter.api.Test;

class MontoEscritoTest {


	@Test
	void testDeUnoADiez() {
		Montoesc ejecucion = new Montoesc();
		//JOptionPane.showMessageDialog(null, new Montoesc().convertir(8));
		//Datos obtenidos
		String DatosObtenidos = ejecucion.convertir(8);
		System.out.println(DatosObtenidos);
		//Datos esperados
		String DatosEsperados = " OCHO";
		//Comparacion assert
		assertEquals(DatosEsperados, DatosObtenidos);
	}	


	@Test
	void testDeOnceACien() {
		Montoesc ejecucion = new Montoesc();
		//JOptionPane.showMessageDialog(null, new Montoesc().convertir(8));
		//Datos obtenidos
		String DatosObtenidos = ejecucion.convertir(85);
		System.out.println(DatosObtenidos);
		//Datos esperados
		String DatosEsperados = " OCHENTA Y CINCO";
		//Comparacion assert
		assertEquals(DatosEsperados, DatosObtenidos);
	}

}
