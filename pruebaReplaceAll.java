package pruebaReplaceAll;

public class pruebaReplaceAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "7,2";
		Double velocidadViento = 0.0;
		
		System.out.println("cadena con coma decimal = " + cadena);
		cadena = cadena.replaceAll(",",".");
		System.out.println("cadena con punto decimal = " + cadena);
		
		velocidadViento = Double.valueOf(cadena);
		System.out.println("velocidad sin conversión a km/h = " + velocidadViento);
		System.out.println("velocidad con conversión a km/h = " + 3.6*velocidadViento);
		
	}

}
