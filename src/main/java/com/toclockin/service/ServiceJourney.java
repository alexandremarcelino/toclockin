package com.toclockin.service;

import com.toclockin.model.Workday;
import com.toclockin.repository.RepositoryJourney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceJourney {

    @Autowired
    static
    RepositoryJourney repositoryJourney;

    public Workday saveJourney(Workday workday) {
        return repositoryJourney.save(workday);
    }

    public List<Workday> findAll() {
        return repositoryJourney.findAll();
    }

    public Optional<Workday> getById(Long idJourney) {
        return repositoryJourney.findById(idJourney);
    }

    public static Workday updateJourney(Workday workday) {
        return repositoryJourney.save(workday);
    }
    public static void deleteJourney(Long idJourney) {
        repositoryJourney.deleteById(idJourney);
    }

}
