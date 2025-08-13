import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class readPropertyFile {

	private static readPropertyFile obj = null;

	private static final Logger logger = LoggerFactory.getLogger(readPropertyFile.class);

	public static readPropertyFile getinstance() {
		if (obj == null) {
			obj = new readPropertyFile();
			logger.info("Getting Values from Properties file");
		}
		return obj;
	}
	
	public Properties getPropConst() {
	    logger.info("Inside getPropConst");
	    Properties prop = new Properties();
	    InputStream input = null;
	    try {
	      input = new FileInputStream("./userIDCreds.properties");
	      prop.load(input);
	      logger.info("getPropConst :: Exit");
	    } catch (IOException ex) {
	      logger.info("Exception: getPropConst:" + ex.getMessage());
	      ex.printStackTrace();
	    } finally {
	      if (input != null)
	        try {
	          input.close();
	        } catch (IOException e) {
	          logger.info("Exception: finally:" + e.getMessage());
	          e.printStackTrace();
	        }  
	    } 
	    return prop;
	  }

}
