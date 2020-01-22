package package2;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;

public class Log4jTest {

	public static void main(String[] args) {
	BasicConfigurator.configure();
	Logger log=Logger.getLogger(Log4jTest.class);
	log.info("info");
	log.warn("warning");
	log.error("error");	
	log.fatal("fatal log");
	log.debug("Debugging");
	}

}
