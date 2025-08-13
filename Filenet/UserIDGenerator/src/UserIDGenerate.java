// Import necessary FileNet and Java libraries
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;

import javax.security.auth.Subject;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.filenet.api.collection.RepositoryRowSet;
import com.filenet.api.core.Connection;
import com.filenet.api.core.Domain;
import com.filenet.api.core.Factory;
import com.filenet.api.core.ObjectStore;
import com.filenet.api.query.RepositoryRow;
import com.filenet.api.query.SearchSQL;
import com.filenet.api.query.SearchScope;
import com.filenet.api.util.UserContext;
import org.json.simple.parser.ParseException;

public class UserIDGenerate {

	// private static Logger logger =
	// Logger.getLogger(UserIDGenerate.class.getName());

	private static final Logger logger = LoggerFactory
			.getLogger(UserIDGenerate.class);

	// private final static Logger LOGGER =
	// Logger.getLogger(UserIDGenerate.class.getName());

	public Domain connection() {
		// Set connection parameters
		String uri = Constant.URI; // Replace with your server url

		String username = Constant.username; // Replace with your username
		String password = Constant.password; // Replace with your password

		// Establish connection
		Connection conn = Factory.Connection.getConnection(uri);
		Subject subject = UserContext.createSubject(conn, username, password,"FileNetP8WSI");
		UserContext.get().pushSubject(subject);

		// Fetch the default domain
		Domain domain = Factory.Domain.fetchInstance(conn, null, null);
		System.out.println("Domain: " + domain.get_Name());
		logger.info("Domain: log : " + domain.get_Name());

		return domain;

	}

	public String Generator() {
		Domain ddomain = null;

		try {

			ddomain = connection();
			// Retrieve and iterate through object stores
			// ObjectStoreSet osSet = domain.get_ObjectStores();

			ObjectStore os = Factory.ObjectStore
					.getInstance(ddomain, "TOS_IND");

			// 2. Construct the search query
			// Example: Search for documents where DocumentTitle contains
			// "report"
			String sqlStatement = "SELECT * FROM EO_EmpOnboard";
			SearchSQL searchSQL = new SearchSQL(sqlStatement);

			// 3. Create a SearchScope
			SearchScope searchScope = new SearchScope(os);

			// 4. Execute the query
			// fetchRows returns a RepositoryRowSet which contains the results
			RepositoryRowSet rowSet = searchScope.fetchRows(searchSQL, null,
					null, new Boolean(true));

			// System.out.println("ROW SETS : "+ rowSet);
			// 5. Iterate through the results and access document properties
			Iterator<RepositoryRow> iter = rowSet.iterator();
			int count = 0;

			// System.out.println("iter : "+ iter);
			while (iter.hasNext()) {
				RepositoryRow row = iter.next();
				String documentId = row.getProperties().getIdValue("Id")
						.toString();
				count++;
				// You can retrieve other properties as needed
				System.out.println("Document ID: " + documentId);
				logger.info("Document ID: " + documentId);
			}

			System.out
					.println("Connection to Content Platform Engine successful. : with count : "
							+ count);
			logger.info("Connection to Content Platform Engine successful. : with count logs : "
					+ count);

			String cc = String.valueOf(count + 1);
			return "USER" + cc;
		} finally {
			// Clean up the user context
			UserContext.get().popSubject();
		}

	}

	public static void main(String[] args){

		// try (InputStream inputStream =
		// UserIDGenerate.class.getClassLoader().getResourceAsStream("logging.properties"))
		// {
		// System.out.println("inside logger load");
		// if (inputStream != null) {
		// LogManager.getLogManager().readConfiguration(inputStream);
		// System.out.println("inside inputstream : "+inputStream);
		// } else {
		// System.err.println("Could not find logging.properties in classpath.");
		// }
		// } catch (IOException e) {
		// logger.severe("Error loading logging configuration: " +
		// e.getMessage());
		// }

		UserIDGenerate usergg = new UserIDGenerate();
		usergg.Generator();
		// System.out.println("finalcount : "+ finalcount);
		// logger.info("finalcount : log : "+ finalcount);
	}
}
