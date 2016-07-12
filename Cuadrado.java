
public class Cuadrado extends Forma
{
	protected double lado;
	
	public Cuadrado(double lado)
	{
		this.lado = lado;
	}
	
	public double superficie()
	{
		return this.lado * this.lado;
	}
	
	public double perimetro()
	{
		return 4 * this.lado;
	}
	
	public double base()
	{
		return this.lado;
	}
	
	public double altura()
	{
		return this.lado;
	}
	
	public double diametro()
	{
		return 0;
	}
	
	public String nombre()
	{
		return "cuadrado";
	}
}
