package aula3.e2;

public class Ponto
{
	private int xx;
	private int yy;
	
	public Ponto(int x, int y)
	{
		xx = x;
		yy = y;
	}
	
	public Ponto()
	{
		this(0, 0);
	}
	
	@Override
	public String toString()
	{
		return "(" + xx + ", " + yy + ")";
	}
	
	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + xx;
		result = prime * result + yy;
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ponto other = (Ponto) obj;
		if (xx != other.xx)
			return false;
		if (yy != other.yy)
			return false;
		return true;
	}
}
