/****************************************************************************************
Name            : LoggerClass
Revision Log    : 2015-10-21: Subhash Chander : created.
                : 
                : 
Use             :create exception log file 
 ****************************************************************************************/
package Assignment1;
import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;
public class LoggerClass {
		private static Logger logger = Logger.getLogger(LoggerClass.class.getName());
		private static LoggerClass loggerClass = new LoggerClass();
		Handler fileHandler;
		Handler consoleHandler;
		/**
		 * LoggerClass method : private constractor of logger class
		 * use : Create the instance of fileHandler and consoleHandler
		 */
		private LoggerClass() {
			try {
				fileHandler = new FileHandler("C:\\Users\\Subhash\\workspace1\\DeignPattern\\src\\Assignment1\\exception.log",true);
				consoleHandler = new ConsoleHandler();
				fileHandler.setFormatter(new SimpleFormatter());
			} catch (SecurityException e) {

				e.printStackTrace();
			} catch (IOException e) {

				e.printStackTrace();
			}
		}

		/**
		 * getInstance method : used to get LoggerClass instance
		 * 
		 * @return : LoggerClass instance
		 */
		public static LoggerClass getInstance() {
			return loggerClass;
		}
		public void catchException( String string ) {
			logger.removeHandler(fileHandler);
			logger.removeHandler(consoleHandler);
			logger.addHandler(consoleHandler);
			logger.addHandler(fileHandler);
			logger.setLevel(Level.ALL);
			consoleHandler.setLevel(Level.ALL);
			logger.log(Level.FINE,string);
		}
}


