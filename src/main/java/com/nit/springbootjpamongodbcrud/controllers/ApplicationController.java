package com.nit.springbootjpamongodbcrud.controllers;

import com.nit.springbootjpamongodbcrud.models.Application;
import com.nit.springbootjpamongodbcrud.services.ApplicationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api")
public class ApplicationController {

    @Autowired
    private ApplicationService service;

    @GetMapping("applications")
    public List<Application> getApplications() {
        return service.getApplications();
    }

    @GetMapping("applications/{id}")
    public Application getApplication(@PathVariable("id") String applicationId) {
        return service.getApplication(applicationId);
    }

    @PostMapping("applications")
    public Application createApplication(@RequestBody Application application) {
        return service.createApplication(application);
    }

    @PutMapping("applications/{id}")
    public Application updateApplication(@PathVariable("id") String applicationId,
                                         @RequestBody Application application) {
        return service.updateApplication(applicationId, application);
    }

    @PatchMapping("applications")
    public Application updateApplicationPartially(@RequestBody Application application) {
        return service.updateApplicationPartially(application);
    }

    @DeleteMapping("applications/{id}")
    public String deleteApplication(@PathVariable("id") String applicationId) {
        if(service.deleteApplication(applicationId))
            return "Application with ID: "+ applicationId + " has been deleted successfully";
        else
            return "Error occurred while deleting application with ID : " + applicationId;
    }
}
