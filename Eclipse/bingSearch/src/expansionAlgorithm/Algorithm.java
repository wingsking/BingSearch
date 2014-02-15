package expansionAlgorithm;

import indexer.Posting;

import java.util.ArrayList;
import java.util.HashMap;

import expansionAlgorithm.rocchio.Rocchio;
import expansionAlgorithm.termProximity.ProximityEval;
import bing.Result;

public class Algorithm {

	public static String expandQuery(HashMap<String, Posting> index, String query,ArrayList<Result> results){
		String expand[] = Rocchio.calBestTwoTerm( index, query, results);
		return ProximityEval.orderExpanedQuery(index, expand, query, results);
	}
	
	
}
