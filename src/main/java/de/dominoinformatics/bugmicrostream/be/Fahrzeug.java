
package de.dominoinformatics.bugmicrostream.be;

public class Fahrzeug
{
	private FahrzeugTyp fTyp;
	private String      Fahrzeughalter;
	
	public Fahrzeug(final String fahrzeugHalter, final FahrzeugTyp fTyp)
	{
		this.Fahrzeughalter = fahrzeugHalter;
		this.fTyp           = fTyp;

	}
	
	public FahrzeugTyp getfTyp()
	{
		return this.fTyp;
	}

	public void setfTyp(final FahrzeugTyp fTyp)
	{
		this.fTyp = fTyp;
	}

	public String getFahrzeughalter()
	{
		return this.Fahrzeughalter;
	}

	public void setFahrzeughalter(final String fahrzeughalter)
	{
		this.Fahrzeughalter = fahrzeughalter;
	}

}
