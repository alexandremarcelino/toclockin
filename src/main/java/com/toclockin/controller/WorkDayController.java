package com.toclockin.controller;

import com.toclockin.model.Workday;
import com.toclockin.service.ServiceJourney;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
@RequestMapping("/Journey")
public class WorkDayController {

    @Autowired
    ServiceJourney serviceJourney;
    @PostMapping
    public Workday createJourney(@RequestBody Workday workday) {
        return serviceJourney.saveJourney(workday);
    }

    @GetMapping
    public List<Workday> getJourneyList() {
        return serviceJourney.findAll();
    }

    @GetMapping("/{idJourney}")
    public ResponseEntity<Workday> getJourneyByID(@PathVariable("idJourney") Long idJourney) throws Exception {
        return ResponseEntity.ok(serviceJourney.getById(idJourney).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public Workday updateJourney(@RequestBody Workday workday){
        return serviceJourney.updateJourney(workday);
    }

    @DeleteMapping("/{idJourney}")
    public ResponseEntity deleteByID(@PathVariable("idJourney") Long idJourney) throws Exception{
        try {
            serviceJourney.deleteJourney(idJourney);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok("Successfully deleted journey!");
    }


}
