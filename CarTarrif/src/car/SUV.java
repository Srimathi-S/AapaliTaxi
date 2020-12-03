package car;

public class SUV {
	private int km;
	SUV(int km)
	{
		this.km=km;
	}
	public long calculate()
	{
		
		long t=100;
		km-=5;
		if(km>0)t+=((km<=15)?(km*15):(15*15));
		km-=15;
		if(km>0)t+=km*12;
		return t;
		
	}
}
