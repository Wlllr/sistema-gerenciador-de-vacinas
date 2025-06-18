package com.github.wlllr.services;

import com.github.wlllr.exception.ResourceNotFoundException;
import com.github.wlllr.models.Pacient;
import com.github.wlllr.repositorys.PacientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacientService {

    @Autowired
    private PacientRepository repository;

    public List<Pacient> listAllPacients() {
        return repository.findAll();
    }

    public Pacient findById(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
    }

    public Pacient save(Pacient pacient) {
        return repository.save(pacient);
    }

    /*public Pacient update(Pacient pacient) {
        Pacient entity = repository.findById(pacient.getId())
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));
        entity.setName(pacient.getName());
        entity.setCpf(pacient.getCpf());
        entity.setGender(pacient.getGender());
        entity.setDateOfBirth(pacient.getDateOfBirth());

        return repository.save(entity);
    }

    public void delete(Long id) {
        Pacient entity = repository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("No records found for this id"));

        repository.delete(entity);
    }*/
}
