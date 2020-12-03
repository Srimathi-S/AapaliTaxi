package car;

public class Mini {
	private int km;
	Mini(int km)
	{
		this.km=km;
	}
	public long calculate()
	{
		if(km>75)
			return (long)8*km;
		long t=50;
		km-=3;
		
		if(km>0)t+=((km<=15)?(km*10):(15*10));
		km-=15;
		if(km>0)t+=km*8;
		return t;
		
	}
}
