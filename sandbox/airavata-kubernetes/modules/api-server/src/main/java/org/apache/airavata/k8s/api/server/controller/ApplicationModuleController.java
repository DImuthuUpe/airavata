package org.apache.airavata.k8s.api.server.controller;

import org.apache.airavata.k8s.api.server.ServerRuntimeException;
import org.apache.airavata.k8s.api.server.resources.application.ApplicationModuleResource;
import org.apache.airavata.k8s.api.server.service.ApplicationModuleService;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * TODO: Class level comments please
 *
 * @author dimuthu
 * @since 1.0.0-SNAPSHOT
 */
@RestController
@RequestMapping(path="/appmodule")
public class ApplicationModuleController {

    @Resource
    private ApplicationModuleService applicationModuleService;

    @PostMapping( path = "", consumes = MediaType.APPLICATION_JSON_VALUE)
    public Long createApplicationModule(ApplicationModuleResource resource) {
        return applicationModuleService.create(resource);
    }

    @GetMapping(path = "{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ApplicationModuleResource findAppModuleById(@PathVariable("id") long id) {
        return this.applicationModuleService.findById(id)
                .orElseThrow(() -> new ServerRuntimeException("Compute resource with id " + id + " not found"));
    }
}
