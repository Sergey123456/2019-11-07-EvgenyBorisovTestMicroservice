package com.microservice.service;

import com.microservice.db.IMicroserviceRepository;
import com.microservice.service.exceptions.ServiceException;
import com.starter.HandlerException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@HandlerException(exceptionClass = ServiceException.class)
@RequiredArgsConstructor
public class MicroserviceService implements IMicroserviceService {
    private final IMicroserviceRepository repo;

    @Override
    public void getServiceException() {
        throw new ServiceException();
    }

    @Override
    public void getDatabaseException() {
        repo.getDatabaseException();
    }
}
