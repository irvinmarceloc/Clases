/* Calcular el área de un triángulo (1/2*b*h). Imprimir los datos de entrada y el resultado.*/
import java.io.*;
class Triangulo{
	/*Bloque de defincion de variables*/
		float base, altura;

	/*Definicion de metodos*/
	public void asignar(float x, float y){
		base = x;
		altura = y;
	}
	public double calcular_area(){
		double area;
		area = 0.5*base*altura;
		return (area);
	} 
}
//Programa Principal 
public class areaTriangulo {
    public static void main(String[] args) throws IOException {
       
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		
		/* Se crea variables */
		float a,b;
		double res;	
		
		/* Se crea el objeto */
		Triangulo obj_triangulo = new Triangulo();
		
		/* Bloque de instrucciones */ 
		
		//Ingresan valores por el usuario via consola
		System.out.print("Entrar  base del triángulo>> ");
		a = Float.parseFloat(br.readLine());
		System.out.print("Entrar  altura del triángulo>> ");
		b = Float.parseFloat(br.readLine());
		//Activación de mensajes 
		obj_triangulo.asignar(a,b);
		res = obj_triangulo.calcular_area();
		//Imprimir resultado en consola
		System.out.println("El area del triángulo es = "+res); 
    }    
}
