package com.github.wlllr.controllers;

import com.github.wlllr.models.Pacient;
import com.github.wlllr.services.PacientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacient")
public class PacientController {

    @Autowired
    private PacientService service;

    @RequestMapping
    public List<Pacient> getAllPacients() {
        return service.listAllPacients();
    }

    @RequestMapping(value = "/{id}",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE
    )
    public Pacient findPacientById(@PathVariable("id") Long id) {
        return service.findById(id);
    }

}
