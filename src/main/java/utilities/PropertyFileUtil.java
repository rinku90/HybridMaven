package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

public class PropertyFileUtil {
public static String getValueForKey(String key) throws Exception{
	Properties p =new Properties();
	FileInputStream fis = new FileInputStream("D:\\Srikant_82\\StockAccounting_Hybrid\\PropertiesFile\\Environment.properties");
    p.load(fis);
    return p.getProperty(key);
}
}
