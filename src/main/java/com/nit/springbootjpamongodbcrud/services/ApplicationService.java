package com.nit.springbootjpamongodbcrud.services;

import com.nit.springbootjpamongodbcrud.models.Application;

import java.util.List;

public interface ApplicationService {
    List<Application> getApplications();
    Application getApplication(String id);
    Application createApplication(Application application);
    Application updateApplication(String id, Application application);
    Application updateApplicationPartially(Application application);
    Boolean deleteApplication(String id);
}
