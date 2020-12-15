package cz.lhhd.midas.controllers;

import cz.lhhd.midas.model.AnixaUser;
import cz.lhhd.midas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserRepository userRepository;

    @ResponseBody
    @RequestMapping("/api/user")
    public List<AnixaUser> getAllUsers(){
        return userRepository.findAll();
    }

}
