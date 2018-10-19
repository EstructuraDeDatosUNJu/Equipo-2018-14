import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Random;

public class Proyect 
{
	public static void main(String[]args)
	{
		Proyect ejercicio = new Proyect();
		ejercicio.ejecutar();	
	}
	
	private void ejecutar() 
	{
		ArrayList<Electrodomesticos> v = new ArrayList<Electrodomesticos>();
		System.out.println("Se cargarán diez electrodomésticos aleatoriamente con valores al azar: ");
		System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________");
	
		for (int i = 0; i < 10; i++) 
		{
			int cargar = new Random().nextInt(3);
			switch (cargar) 
				{
				case 0: 
				{
					cargar_lavarropas(v);
					break;
				}
				case 1: 
				{
					cargar_heladeras(v);
					break;
				}
				case 2: cargar_cocinas(v);
				}
		}
		mostrar(v);
	}
	
	private static void cargar_lavarropas(ArrayList<Electrodomesticos> v)
	{
		Random A = new Random();

		int constructor = A.nextInt(2);
		
		switch (constructor)
		{ 
	      case 0: 
	      {
	    	  v.add(new lavarropa());
	    	  break;
	      }
	      case 1: 
    	  {    		  
    		  v.add(new lavarropa(carga(),precio_base(),color(),consumo(),peso()));
    	  }
		}
	}
	
	private static void cargar_heladeras(ArrayList<Electrodomesticos> v)
	{
		int constructor = new Random().nextInt(2);
		
		switch (constructor)
		{ 
	      case 0: 
	      {
	    	  v.add(new heladera());
	    	  break;
	      }
	      case 1:
	      {      	    					    	   				
	    	  v.add(new heladera(capacidad_lt(),refrigerador(),precio_base(),color(),consumo(),peso()));
	      } 
		}				
	}
	
	
	private static void cargar_cocinas(ArrayList<Electrodomesticos> v)
	{
		int constructor = new Random().nextInt(2);
			
		switch (constructor)
		{ 
	      case 0: 
	      {
	    	  v.add(new Cocina());
	    	  break;
	      }
	      case 1:
	      {					
    		v.add(new Cocina(precio_base(),color(),consumo(),peso(),alto(),ancho(),profundidad(),alimentacion()));
	      }
	    }				
	}
	
	private static void mostrar(ArrayList<Electrodomesticos> v)
	{
		double total = 0;
		
		for(Electrodomesticos e : v)
		{	
			DecimalFormat df = new DecimalFormat("#.00");
		System.out.println(e.toString()+" *** Precio final: "+df.format(e.getPrecio_final()));
		total += e.getPrecio_final();
		}
		System.out.println("_______________________________________________________________________________________________________________________________________________________________________________________________________________________________");
		System.out.print("El total de los precios finales es de: "); System.out.printf("%.2f",total);
	}
	
	private static String color()
	{		
		String[] colores = {"Rojo","Gris","Negro","Blanco","Azul"};
		return colores[new Random().nextInt(colores.length)];
	}
	
	private static char consumo()
	{
		char[] consumo = {'A','B','C','D','E','F'};
		return consumo[new Random().nextInt(consumo.length)];
	}
	
	private static double peso()
	{
		return new Random().nextDouble()*100;
	}
	
	private static double precio_base()
	{
		return new Random().nextDouble()*1000;
	}
	
	private static double alto()
	{
		double alto;
		do
		{
			alto = 80 + new Random().nextDouble()*10;
		}while (alto > 95);
		return alto;
	}
	
	private static double ancho()
	{
		double ancho;
		do
		{
			ancho = 50 + new Random().nextDouble()*50;
		}while (ancho > 120);
		return ancho;
	}
	
	private static double profundidad()
	{
		double profundidad;
		do
		{
			profundidad = 60 + new Random().nextDouble()*10;
		}while(profundidad > 70);
		return profundidad;
	}
	
	private static String alimentacion()
	{
		int al = new Random().nextInt(2);
		
		if(al == 0)
		{
			return "Gas";
		}
		else
			return "Eléctrica";
	}
	
	private static String refrigerador()
	{
		int ref = new Random().nextInt(2); 
	
		if(ref == 0)
		{
			return "Congelador";
		}
		else
			return "Frigorífico";
	}
	private static double capacidad_lt()
	{
		return new Random().nextDouble()*100;
	}
	
	private static double carga()
	{
		return new Random().nextDouble()*100;
	}
}
