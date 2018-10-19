import java.text.DecimalFormat;

public class lavarropa extends Electrodomesticos 
{
	private double Carga_kg;

	public lavarropa() 
	{
		super();
		this.Carga_kg = 10;
	}

	public lavarropa(double carga, double precio, String color, char cons, double peso) 
	{
		super(precio, color, cons, peso);
		this.Carga_kg = carga;
	}

	public double getCarga_kg() 
	{
		return Carga_kg;
	}

	public void setCarga_kg(double carga_kg) 
	{
		Carga_kg = carga_kg;
	}

	public double getPrecio_final() 
	{
		double precio = super.getPrecio_final();
		if (this.Carga_kg > 10) 
		{
			precio = ((1 / 3) * this.Carga_kg) * 100 + precio;
		}
		return precio;
	}
	
	public String toString()
	{
		DecimalFormat df = new DecimalFormat("#.00");
		return "Lavarropa  >>> "+super.toString()+ " *** Carga: "+df.format(this.Carga_kg);
	}
}
