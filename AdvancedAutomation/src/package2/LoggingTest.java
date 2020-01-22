package package2;

import java.io.IOException;

import org.apache.log4j.BasicConfigurator;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

public class LoggingTest {

	public static void main(String[] args) throws IOException {
		String dir=System.getProperty("user.dir");
		PatternLayout layout=new PatternLayout("%t -%d -%p -%c -%m%n");
		RollingFileAppender appender=new RollingFileAppender(layout, dir+"/logs/Report.log");
		BasicConfigurator.configure(appender);
		Logger log = Logger.getLogger(LoggingTest.class);
		//log.setLevel(Level.OFF);
		log.trace("tracing");
		log.debug("Debugging");
		log.info("Information");
		log.error("Error");
		log.warn("Warning");
		log.fatal("fatal");
	}
}
