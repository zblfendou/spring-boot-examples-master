package com.zbl.model.repository.secondary;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author zbl
 */
public interface SecondaryRepository extends MongoRepository<SecondaryMongoObject, String> {
}
