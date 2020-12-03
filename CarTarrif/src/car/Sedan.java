package car;

public class Sedan {
	private int km;
	Sedan(int km)
	{
		this.km=km;
	}
	public long calculate()
	{
		if(km>100)
			return (long)10*km;
		long t=80;
		km-=5;
		
		if(km>0)t+=((km<=15)?(km*12):(15*12));
		km-=15;
		if(km>0)t+=km*10;
		return t;
		
	}
}
