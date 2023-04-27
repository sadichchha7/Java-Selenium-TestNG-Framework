package util; 
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class Log { 
	 private static final Logger logger = LogManager.getLogger(Log.class);
	
////	private static Logger log = Logger.getLogger(Log.class.getClass()); 
//	static {
//PropertyConfigurator.configure("D:\\Users\\FCQBJ8R\\eclipse-workspace\\TestAutomation\\Firsttest\\src\\main\\resources\\log4j.properties");
//} 
//
	public static void warn(String message) { 
		logger.warn(message);
	}
	public static void debug(String message) { 
		logger.debug(message);
	}
	public static void info(String message) { 
		logger.info(message);
	}
	public static void error(String message) { 
		logger.error(message);
	}

public static void fatal(String message) {
	logger.fatal(message);
}

}