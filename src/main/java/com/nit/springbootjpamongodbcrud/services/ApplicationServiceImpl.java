package com.nit.springbootjpamongodbcrud.services;

import com.nit.springbootjpamongodbcrud.models.Application;
import com.nit.springbootjpamongodbcrud.repositories.ApplicationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

@Service
public class ApplicationServiceImpl implements ApplicationService {

    @Autowired
    private ApplicationRepository repository;

    @Override
    public List<Application> getApplications() {
        return repository.findAll();
    }

    @Override
    public Application getApplication(String id) {
        return repository.findById(id).get();
    }

    @Override
    public Application createApplication(Application application) {
        return repository.save(application);
    }

    @Override
    public Application updateApplication(String id, Application application) {
        Application existingApplication = repository.findById(id).get();
        if(existingApplication != null) {
            application.setId(existingApplication.getId());
            return repository.save(application);
        }
        throw new IllegalArgumentException("Invalid application id");
    }

    @Override
    public Application updateApplicationPartially(Application application) {
        if(application.getId()!=null) {
            Application existingApplication = repository.findById(application.getId()).get();
            if (existingApplication != null) {
                if (StringUtils.hasLength(application.getName()))
                    existingApplication.setName(application.getName());
                if(StringUtils.hasLength(application.getDescription()))
                    existingApplication.setDescription(application.getDescription());
                if(StringUtils.hasLength(application.getOwner()))
                    existingApplication.setOwner(application.getOwner());
                return repository.save(existingApplication);
            }
        }
        return null;
    }

    @Override
    public Boolean deleteApplication(String id) {
        repository.deleteById(id);
        if(!repository.existsById(id))
            return true;
        return false;
    }


}
