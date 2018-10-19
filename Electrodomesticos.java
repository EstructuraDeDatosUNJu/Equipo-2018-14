import java.text.DecimalFormat;

public class Electrodomesticos 
{
	private double precio_base;
	private String color;
	private char consumo_energetico;
	private double peso_kg;

	public Electrodomesticos() 
	{
		this.precio_base = 0;
		this.color = "Blanco";
		this.consumo_energetico = 'F';
		this.peso_kg = 5;
	}

	public Electrodomesticos(double precio, String color, char cons, double peso) 
	{
		this.precio_base = precio;
		this.color = color;
		this.consumo_energetico = cons;
		this.peso_kg = peso;
	}

	public double getPrecio_base() 
	{
		return precio_base;
	}

	public double getPrecio_final() 
	{
		double p = this.precio_base;
		switch (this.consumo_energetico) 
		{
		case 'A':
		{
			p = p + 100;
			break;
		}
		case 'B':
		{
			p = p + 80;
			break;
		}
		case 'C':
		{
			p = p + 60;
			break;
	    } 
		case 'D':
		{
			p = p + 50;
			break;
		}
		case 'E':
		{	
			p = p + 30;
			break;
		}
		case 'F': p = p + 10;
		}

		if ((this.peso_kg >= 0) && (this.peso_kg <= 19)) 
		{
			p = p + 10;
		} 
		else if ((this.peso_kg >= 20) && (this.peso_kg <= 49)) 
		{
			p = p + 50;
		} 
		else if ((this.peso_kg >= 50) && (this.peso_kg <= 79)) 
		{
			p = p + 80;
		} 
		else
			p = p + 100;
		return p;
	}

	public void setPrecio_base(double precio_base) {
		if (precio_base > 0)
			this.precio_base = precio_base;
		else
			this.precio_base = 0;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		if ((color == "rojo") || (color == "Negro") || (color == "Azul") || (color == "Gris") || (color == "Blanco"))
			this.color = color;
		else
			this.color = "Blanco";
	}

	public char getConsumo_energetico() {
		return consumo_energetico;
	}

	public void setConsumo_energetico(char consumo_energetico) {
		if ((consumo_energetico >= 'A') && (consumo_energetico <= 'F'))
			this.consumo_energetico = consumo_energetico;
		else
			this.consumo_energetico = 'F';
	}

	public double getPeso_kg() {
		return peso_kg;
	}

	public void setPeso_kg(double peso_kg) {
		if (peso_kg > 0)
			this.peso_kg = peso_kg;
		else
			this.peso_kg = 5;
	}
	
	public String toString()
	{
		DecimalFormat df = new DecimalFormat("#.00");
		return "Color: "+this.color+" *** Consumo energético: "+this.consumo_energetico+" *** Peso en kg: "+df.format(this.peso_kg)+" *** Precio base: "+df.format(this.precio_base);
	}
}
