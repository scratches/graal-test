import java.util.logging.Logger;

public class Loggers {

	public static void main(String[] args) throws Exception {
		new Loggers().run();
	}

	private void run() throws Exception {
		Logger.getLogger(Loggers.class.getName()).info("Hello World");
	}

}