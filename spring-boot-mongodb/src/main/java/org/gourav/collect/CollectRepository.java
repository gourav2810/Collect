package org.gourav.collect;


import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CollectRepository extends MongoRepository<Collect, String> {
	Collect findBy_id(ObjectId _id);
}
