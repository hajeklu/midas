package cz.lhhd.midas.controllers;

import cz.lhhd.midas.model.Feed;
import cz.lhhd.midas.repository.FeedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FeedController {

    @Autowired
    private FeedRepository feedRepository;

    @ResponseBody
    @RequestMapping("/api/feed")
    public List<Feed> getAllFeed(){
        return feedRepository.findAll();
    }

    @ResponseBody
    @PostMapping("/api/feed/add")
    public Feed addFeed(Feed feed){
        feedRepository.save(feed);
        return feed;
    }

}
