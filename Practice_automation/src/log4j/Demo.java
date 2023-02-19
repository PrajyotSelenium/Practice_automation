package log4j;

import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
public class Demo {
        
	// Logger 
	static Logger log=Logger.getLogger(Demo.class.getName());
	
	// Main method
	public static void main(String[] args) throws IOException {
		
        // Layout		
        Layout l=new PatternLayout();
        
	// Appender
        Appender ap=new FileAppender(l,"abc.txt");
        
	// Add appender	
        log.addAppender(ap);
        
	// Debug	
        log.debug("DEBUG");
	// Info	
        log.info("INFO");
	// Warn	
        log.warn("WARN");
	// Error	
        log.error("ERROR");
	// Fatal	
        log.fatal("FATAL");
	}
}
