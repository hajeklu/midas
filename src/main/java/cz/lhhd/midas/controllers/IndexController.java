package cz.lhhd.midas.controllers;

import cz.lhhd.midas.model.Feed;
import cz.lhhd.midas.model.User;
import cz.lhhd.midas.repository.FeedRepository;
import cz.lhhd.midas.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
public class IndexController {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private FeedRepository feedRepository;

    @RequestMapping("/")
    public String index(){
        return "Hello World.";
    }


    @PostMapping("/test")
    public Feed test(@RequestBody Feed u){
        return u;
    }

    @RequestMapping("/generate")
    public String genrate(){

        User u = new User();
        u.setPassword("59529d4b40658898b9f5a4b60668285480f03a242ae73f1685ec62c4b2feb0a8");
        u.setNick("Nick");
        u.setEmail("first.last@email.eu");

        userRepository.save(u);


        User u1 = new User();
        u1.setPassword("59529d4b40658898b9f5a4b60668285480f03a242ae73f1685ec62c4b2feb0a8");
        u1.setNick("Nick1");
        u1.setEmail("first1.last1@email.eu");

        userRepository.save(u1);


        User u2= new User();
        u2.setPassword("59529d4b40658898b9f5a4b60668285480f03a242ae73f1685ec62c4b2feb0a8");
        u2.setNick("Nick2");
        u2.setEmail("first2.last2@email.eu");

        userRepository.save(u2);



        User u3 = new User();
        u3.setPassword("59529d4b40658898b9f5a4b60668285480f03a242ae73f1685ec62c4b2feb0a8");
        u3.setNick("Nick3");
        u3.setEmail("first3.last3@email.eu");

        userRepository.save(u3);

        Feed f = new Feed();

        f.setDateTime(LocalDateTime.now());
        f.setHref("http://46.28.110.106:8080/");
        f.setName("Name");
        f.setStatus("Status");
        f.setText("Lorem ipsum dolor sit amet, consectetuer adipiscing elit. Fuscenec bibendum odio risusim sagittis. ");
        f.setUser(u);
        feedRepository.save(f);

        Feed f1 = new Feed();

        f1.setDateTime(LocalDateTime.now());
        f1.setHref("http://46.28.110.106:8080/");
        f1.setName("Name1");
        f1.setStatus("Status1");
        f1.setText("Lorem ipsum dolor sit amet, urpis at pulvinar vulputate, erat libero tristique tellus, necsit amet nibh dignissim sagittis. ");
        f1.setUser(u1);
        feedRepository.save(f1);

        Feed f2 = new Feed();

        f2.setDateTime(LocalDateTime.now());
        f2.setHref("http://46.28.110.106:8080/");
        f2.setName("Name2");
        f2.setStatus("Status2");
        f2.setText("Lorem ipsum dolor sit amet, turpis at pulvinar vulputate, erat libero tristique tellus, nec bibendum odio risus sit amet ante. ");
        f2.setUser(u2);
        feedRepository.save(f2);

        Feed f3 = new Feed();

        f3.setDateTime(LocalDateTime.now());
        f3.setHref("http://46.28.110.106:8080/");
        f3.setName("Name3");
        f3.setStatus("Status3");
        f3.setText("Lorem Nullam feugiat, turpis at pulvinar vulputate, erat libero tristique tellus, nec bibendum odio risus sit amet ante.");
        f3.setUser(u3);
        feedRepository.save(f3);


        return "Success";
    }

}
