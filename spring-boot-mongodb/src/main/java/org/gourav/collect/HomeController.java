package org.gourav.collect;


import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(value = "/collects")
public class HomeController {

	  @Autowired
	  private CollectRepository repository;
	  
	  @RequestMapping(value = "/", method = RequestMethod.GET)
	  public List<Collect> getAllResponses() {
	    return repository.findAll();
	  }

	  @RequestMapping(value = "/{id}", method = RequestMethod.GET)
	  public Collect getResponseById(@PathVariable("id") ObjectId id) {
	    return repository.findBy_id(id);
	  }
	  
	  @RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	  public void modifyResponseById(@PathVariable("id") ObjectId id, @Valid @RequestBody Collect responses) {
	    responses.set_id(id);
	    repository.save(responses);
	  }
	  
	  @RequestMapping(value = "/", method = RequestMethod.POST)
	  public Collect createResponse(@Valid @RequestBody Collect responses) {
	    responses.set_id(ObjectId.get());
	    repository.save(responses);
	    return responses;
	  }
	
	
}
