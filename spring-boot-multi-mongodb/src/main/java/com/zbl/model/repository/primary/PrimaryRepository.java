package com.zbl.model.repository.primary;

import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author zbl
 */
public interface PrimaryRepository extends MongoRepository<PrimaryMongoObject, String> {
}
