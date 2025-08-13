// Import necessary FileNet and Java libraries
import java.util.Iterator;

import javax.security.auth.Subject;

import com.filenet.api.collection.RepositoryRowSet;
import com.filenet.api.core.Connection;
import com.filenet.api.core.Domain;
import com.filenet.api.core.Factory;
import com.filenet.api.core.ObjectStore;
import com.filenet.api.query.RepositoryRow;
import com.filenet.api.query.SearchSQL;
import com.filenet.api.query.SearchScope;
import com.filenet.api.util.UserContext;

public class test {
	public static void main(String[] args) {
		// Set connection parameters
		String uri = "http://10.0.90.113:9080/wsi/FNCEWS40MTOM/"; // Replace
		String username = "filemgr_inddev"; // Replace with your username
		String password = "Tradaxdev@123"; // Replace with your password

		// Establish connection
		Connection conn = Factory.Connection.getConnection(uri);
		Subject subject = UserContext.createSubject(conn, username, password,
				null);
		UserContext.get().pushSubject(subject);

		try {
			// Fetch the default domain
			Domain domain = Factory.Domain.fetchInstance(conn, null, null);
			System.out.println("Domain: " + domain.get_Name());

			// Retrieve and iterate through object stores
//			ObjectStoreSet osSet = domain.get_ObjectStores();
			
			ObjectStore os = Factory.ObjectStore.getInstance(domain, "TOS_IND");
			
			// 2. Construct the search query
            // Example: Search for documents where DocumentTitle contains "report"
            String sqlStatement = "SELECT * FROM EO_EmpOnboard";
            SearchSQL searchSQL = new SearchSQL(sqlStatement);

            // 3. Create a SearchScope
            SearchScope searchScope = new SearchScope(os);

            // 4. Execute the query
            // fetchRows returns a RepositoryRowSet which contains the results
            RepositoryRowSet rowSet = searchScope.fetchRows(searchSQL, null, null, new Boolean(true));

//            System.out.println("ROW SETS : "+ rowSet);
            // 5. Iterate through the results and access document properties
            Iterator<RepositoryRow> iter = rowSet.iterator();
            int count = 0;
            
//            System.out.println("iter : "+ iter);
            while (iter.hasNext()) {
                RepositoryRow row = iter.next();
                String documentId = row.getProperties().getIdValue("Id").toString();
                count++;
                // You can retrieve other properties as needed
                System.out.println("Document ID: " + documentId);
            }
            


			System.out
					.println("Connection to Content Platform Engine successful. : with count : "+count);
		} finally {
			// Clean up the user context
			UserContext.get().popSubject();
		}
	}
}
