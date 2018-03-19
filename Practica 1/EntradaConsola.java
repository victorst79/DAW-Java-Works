import java.io.*;

/* 
ESTA CLASE SE IMPLEMENTA EN TODAS LAS CARPETAS DE PRACTICAS QUE NECESITEN DE CONSOLA
PARA PERMITER RECOGER LOS DATOS EN VARIABLE Y TRABAJAR CON ENTRADAS EN ESTA.
*/ 

public class EntradaConsola{
	// FUNCION LEER VALORES NUMERICOS ENTEROS
	public static int leeEntero(){
		int n=0;
		String cadena="";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			cadena = br.readLine();
		}catch (java.io.IOException e){
			System.out.println("No se pudo leer correctamente el número entero");
		}
		n = (Integer.valueOf(cadena)).intValue();
		return n;
	}

	// FUNCION LEER VALORES NUMERICOS REALES
	public static float leeReal(){
		float n=0;
		String cadena="";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			cadena = br.readLine();
		}catch (java.io.IOException e){
			System.out.println("No se pudo leer correctamente el número real");
		}
		n = (Float.valueOf(cadena)).floatValue();
		return n;
	}
    
    // FUNCION LEER STRING
	public static String leeCadena(){
		String cadena="";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			cadena = br.readLine();
		}catch (java.io.IOException e){
			System.out.println("No se pudo leer correctamente la cadena de caracteres");
		}
		return cadena;
	}

	// FUNCION LEER CARACTER 
	public static char leeCaracter(){
		char c='\0';
		String cadena="";
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try{
			cadena = br.readLine();
		}catch (java.io.IOException e){
			System.out.println("No se pudo leer correctamente el caracter");
		}
		c=cadena.charAt(0);
		return c;
	}
}
                               
                                        
