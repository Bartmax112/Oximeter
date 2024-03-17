package com.bart.affirmations;

import java.util.UUID;

import io.micronaut.data.repository.CrudRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.repository.CrudRepository;

@JdbcRepository(dialect = Dialect.POSTGRES) 
public interface AffirmationRepository extends CrudRepository<AffirmationEntity, Long> {
    
}
