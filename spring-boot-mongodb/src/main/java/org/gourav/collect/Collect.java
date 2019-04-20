package org.gourav.collect;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;

public class Collect {
	
	@Id
	public ObjectId _id;

	public String username;
	
	public String question1;
	
	public String getQuestion1() {
		return question1;
	}

	public void setQuestion1(String question1) {
		this.question1 = question1;
	}

	public String getQuestion2() {
		return question2;
	}

	public void setQuestion2(String question2) {
		this.question2 = question2;
	}
	public String question2;
	
	public Collect() {}
	  
	  public Collect(ObjectId _id, String username,String question1,String question2) {
	    this._id = _id;
	    this.username = username;
	    this.question1 = question1;
	    this.question2 = question2;
	  }
	
	  public String get_id() { return _id.toHexString(); }
	  public void set_id(ObjectId _id) { this._id = _id; }
	  
	  public String getUsername() { return username; }
	  public void setUsername(String username) { this.username = username; }
}
