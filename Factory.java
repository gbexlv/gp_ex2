
public class Factory {
	public static Forma createForma(double aux)
	{
		return new Cuadrado(aux);
	}
	
	public static Forma createForma(double aux, double aux2)
	{
		return new Rectangulo(aux, aux2);
	}
}

