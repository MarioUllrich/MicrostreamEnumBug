
package de.dominoinformatics.bugmicrostream.microstream;

import java.nio.file.Paths;

import one.microstream.storage.types.EmbeddedStorage;
import one.microstream.storage.types.EmbeddedStorageManager;


public class DBUtils
{
	public static DataRoot               root          = new DataRoot();
	public static EmbeddedStorageManager storageManger =
		EmbeddedStorage.start(DBUtils.root, Paths.get("C:/Microstream/BugMicrostream"));
	
}
