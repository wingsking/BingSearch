package indexer;

import bing.*;

public class PostingNode {
	private Result doc;
	private Integer frequency;
	
	
	
	public PostingNode(Result doc, Integer frequency) {
		super();
		this.doc = doc;
		this.frequency = frequency;
	}
	public Result getDoc() {
		return doc;
	}
	public void setDoc(Result doc) {
		this.doc = doc;
	}
	public Integer getFrequency() {
		return frequency;
	}
	public void setFrequency(Integer frequency) {
		this.frequency = frequency;
	}
	
	
}
