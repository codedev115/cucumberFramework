package managers;

import dataproviders.ConfigurableReader;
import dataproviders.JsonDataReader;

public class FileReaderManager {

	private static FileReaderManager fileReaderManager = new FileReaderManager();
	private static ConfigurableReader configFileReader;
	private static JsonDataReader jsonDataReader;

	private FileReaderManager() {
	}

	public static FileReaderManager getInstance( ) {
		return fileReaderManager;
	}

	public ConfigurableReader getConfigReader() {
		return (configFileReader == null) ? new ConfigurableReader() : configFileReader;
	}
	
	public JsonDataReader getJsonReader(){
		 return (jsonDataReader == null) ? new JsonDataReader() : jsonDataReader;
	}
}
