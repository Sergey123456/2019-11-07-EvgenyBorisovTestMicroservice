package com.microservice.db;

import com.microservice.db.exceptions.DatabaseException;
import com.starter.HandlerException;
import org.springframework.stereotype.Repository;

@Repository
@HandlerException(exceptionClass = DatabaseException.class)
public class MicroserviceRepository implements IMicroserviceRepository {
    @Override
    public void getDatabaseException() {
        throw new DatabaseException();
    }
}
