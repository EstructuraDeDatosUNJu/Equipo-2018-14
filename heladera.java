import java.text.DecimalFormat;

public class heladera extends Electrodomesticos 
{

	private double cap_lt;
	private String refri;

	public heladera() 
	{
		super();
		this.cap_lt = 40;
		this.refri = "Congelador";
	}

	public heladera(double cap, String ref, double precio, String color, char cons, double peso) 
	{
		super(precio, color, cons, peso);
		this.cap_lt = cap;
		this.refri = ref;
	}

	public double getrefri() 
	{
		return cap_lt;
	}

	public void setrefri(String ref) 
	{
		if ((refri == "Congelador") || (refri == "Frigorífico"))
			this.refri = ref;
		else
			this.refri = "Congelador";
	}

	public double getCarga_kg() 
	{
		return cap_lt;
	}

	public void setCarga_kg(double cap_lt) 
	{
		this.cap_lt = cap_lt;
	}

	public double getPrecio_final() 
	{
		double p = super.getPrecio_final();
		if (this.cap_lt > 50) 
		{
			if (this.refri == "Congelador")
				p = p + 100;
			else 
				if (this.refri == "Frigorífico")
				p = p + 60;
		}
		return p;
	}
	
	public String toString()
	{
		DecimalFormat df = new DecimalFormat("#.00");
		return "Heladera   >>> "+super.toString() + " *** Capacidad en litros: "+df.format(this.cap_lt)+" *** Refrigeración: "+this.refri;
	}
}