
package de.dominoinformatics.bugmicrostream.be;

public enum FahrzeugTyp
{
	PKW("Personenkraftwagen Bla1"),
	LKW("Lastkraftwagen Bla1"),
	KRAD("Motorrad Bla1");

	private String label;

	FahrzeugTyp(final String label)
	{
		this.label = label;

	}

	public String getLabel()
	{
		return this.label;

	}
}
