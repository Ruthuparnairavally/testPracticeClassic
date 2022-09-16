package genericLib;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class PropertyFile {

	public String getData(String key) throws FileNotFoundException, IOException
	{
		Properties p = new Properties();
		
		FileInputStream fis = new FileInputStream(AutoConstant.propertyFilePPath);
		p.load(fis);
		
		String value = p.getProperty(key);
		return value;
	}
}
