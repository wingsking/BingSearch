package expansionAlgorithm.termProximity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class ProximityEval {
	
	//the score is between 0 to 2.2, this x is deduced from our application results
	private static double x = 0.5;
	
	/**
	 * this method return the best ordered query
	 */
	public ArrayList<String> orderExpanedQuery(String[] expand, String query) {
		// storing the original query, use linked list to easily insert expanded
		// terms
		LinkedList<String> queryList = new LinkedList<String>(
				Arrays.asList(query.split("\\+")));

		/**
		 * we will expanding the query from the highest score term, expand[1]
		 * then we consider the following: (e1,q1),(q1,e1),(e1,q2),(q2,e1)...
		 * which pair is the highest? we mark down the highest score, if this
		 * highest score smaller than x, then we temporarily ignore expand[1],
		 * first calculate expand[0]
		 * 
		 * Because in our algorithm, w(e,q)= 1/(|e-q|)^2 when |e-q|<=5 so if e1
		 * is always length 6 from q1, it will be 0 but some time, e1,e0,q1;
		 * after inserting e0 in between, it will be the best otherwise, we
		 * would just adding e1 to the end, so it becomes q1,e1,e0, not good so
		 * when smaller than x, we ignore e1 first
		 * 
		 */
		// this arr will ease very much when we want to ignore e1 temporarily
		String[] expandChanged = new String[] { expand[1], expand[0], expand[1] };

		for (int i = expandChanged.length - 1; i >= 0; i--) {
			Double weight = 0.0;
			for (int j = 0; j < queryList.size(); j++) {
				//calculate (e,q)
				
				//calcullate (q,e)
			}
		}
	}
}
