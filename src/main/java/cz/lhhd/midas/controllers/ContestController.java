package cz.lhhd.midas.controllers;

import cz.lhhd.midas.model.Contest;
import cz.lhhd.midas.repository.ContestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ContestController {

    @Autowired
    private ContestRepository contestRepository;

    @RequestMapping("/api/contest")
    public List<Contest> getAll(){
        return contestRepository.findAll();
    }



    @PostMapping("/api/contest/add")
    public Contest addNewContest(@RequestBody Contest contest){
        contestRepository.save(contest);
        return contest;
    }

}
