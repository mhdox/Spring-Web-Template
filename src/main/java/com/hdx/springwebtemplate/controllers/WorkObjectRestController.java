package com.hdx.springwebtemplate.controllers;

import com.hdx.springwebtemplate.models.WorkObject;
import com.hdx.springwebtemplate.repositories.WorkObjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

/**
 * Created by michael.hadox on 5/17/17.
 */
@RestController
@RequestMapping("/workobject")
public class WorkObjectRestController {


    @Autowired
    private WorkObjectRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<WorkObject>> getAllWorkObjects(){
        return new ResponseEntity<>((Collection<WorkObject>) repository.findAll(), HttpStatus.OK);
    }
}

