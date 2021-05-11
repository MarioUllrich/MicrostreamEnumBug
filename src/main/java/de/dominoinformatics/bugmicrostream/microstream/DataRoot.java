
package de.dominoinformatics.bugmicrostream.microstream;

import java.util.HashSet;
import java.util.Set;

import de.dominoinformatics.bugmicrostream.be.Fahrzeug;


/**
 * MicroStream data root. Create your data model from here.
 *
 * @see <a href="https://manual.docs.microstream.one/">Reference Manual</a>
 */
public class DataRoot
{
	Set<Fahrzeug> fahrzeuge = new HashSet<>();
	
	public DataRoot()
	{
		super();
	}

	public Set<Fahrzeug> getFahrzeuge()
	{
		return this.fahrzeuge;

	}
}
