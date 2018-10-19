import java.text.DecimalFormat;

public class Cocina extends Electrodomesticos 
{

	private double alto;
	private double ancho;
	private double profundidad;
	private String alimentacion;

	public Cocina() 
	{
		super();
		this.alto = 85;
		this.ancho = 65;
		this.profundidad = 65;
		this.alimentacion = "Gas";
	}

	public Cocina(double precio, String color, char cons, double peso, double alto, double ancho, double profundidad, String alimentacion) 
	{
		super(precio, color, cons, peso);
		this.alimentacion = alimentacion;
		
		if ((alto >= 80) && (alto <= 95) && (ancho >= 50) && (ancho <= 120) && (profundidad >= 60) && (profundidad <= 70)) 
		{
			this.alto = alto;
			this.ancho = ancho;
			this.profundidad = profundidad;
		}
		else	
		{
			throw new RuntimeException("Dato no permitido");
		}
	}

	public double getalto() 
	{
		return alto;
	}

	public double getancho() 
	{
		return ancho;
	}

	public double getprofundidad() 
	{
		return profundidad;
	}

	public String getalimentacion() 
	{
		return alimentacion;
	}

	public void setalimentacion(String alimentacion) 
	{
		this.alimentacion = alimentacion;
	}

	public double getPrecio_final() 
	{
		double p = super.getPrecio_final();
		
		if ((ancho >= 60) && (ancho <= 79)) 
		{
			p = (0.15 * p) + p;
		} 
		else 
		{
			if ((ancho >= 80) && (ancho <= 99)) 
			{
				p = (0.20 * p) + p;
			} 
			else 
			{
				if (ancho > 100) 
				{
					p = (0.30 * p) + p;
				}
			}
		}
		return p;
	}
	
	public String toString()
	{
		DecimalFormat df = new DecimalFormat("#.00");
		return "Cocina     >>> "+super.toString()+ " *** Alto: "+df.format(this.alto)+" *** Ancho: "+df.format(this.ancho)+" *** Profundidad: "+df.format(this.profundidad)+" *** Alimentación: "+this.alimentacion;
	}
}