
public class Rectangulo extends Forma
{
	protected double lado1;
	protected double lado2;
	
	public Rectangulo(double lado1, double lado2)
	{	
		this.lado1 = lado1;
		this.lado2 = lado2;
	}
	
	public double superficie()
	{
		return this.lado1 * this.lado2;
	}
	
	public double perimetro()
	{
		return (2 * this.lado1) + (2 * this.lado2);
	}
}
