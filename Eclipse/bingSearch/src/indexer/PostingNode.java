package indexer;

import java.util.ArrayList;

import bing.*;

public class PostingNode {
	private Result doc;
	private Integer frequency;
	private ArrayList<Integer> posList;
	
	
	
	
	public PostingNode(Result doc, Integer frequency, ArrayList<Integer> posList) {
		super();
		this.doc = doc;
		this.frequency = frequency;
		this.posList = posList;
	}


	public PostingNode(Result doc, Integer frequency) {
		super();
		this.doc = doc;
		this.frequency = frequency;
	}
	
	
	public ArrayList<Integer> getPosList() {
		return posList;
	}


	public void setPosList(ArrayList<Integer> posList) {
		this.posList = posList;
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
