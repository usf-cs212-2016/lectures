import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * An example showing how to use the DatabaseConnector and JDBC to connect to
 * a database and retrieve information safely without directly using user
 * input to avoid an XSS or SQL injection attack.
 *
 * @see DatabaseConenctor
 * @see ContactServer
 * @see ContactSimpleServlet
 * @see ContactComplexServlet
 */
public class ContactServer  {

	public static void main(String[] args) throws Exception {
		Server server = new Server(8080);
		ServletHandler handler = new ServletHandler();

		DatabaseConnector connector = new DatabaseConnector("database.properties");

		// only start server if able to reach database
		if (connector.testConnection()) {
		    // call servlet constructors so they use the same connector
			ContactSimpleServlet simple = new ContactSimpleServlet(connector);
			ContactComplexServlet complex = new ContactComplexServlet(connector);

			// use servlet holders to map servlet instances to contexts
			handler.addServletWithMapping(new ServletHolder(simple), "/simple");
			handler.addServletWithMapping(new ServletHolder(complex), "/");

			server.setHandler(handler);
			server.start();
			server.join();
		}
	}
}