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

	static Logger log=Logger.getLogger(Demo.class.getName());
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
        Layout l=new PatternLayout();
        
        Appender ap=new FileAppender(l,"abc.txt");
        
        log.addAppender(ap);
        
        log.debug("DEBUG");
        log.info("INFO");
        log.warn("WARN");
        log.error("ERROR");
        log.fatal("FATAL");
	}
}
