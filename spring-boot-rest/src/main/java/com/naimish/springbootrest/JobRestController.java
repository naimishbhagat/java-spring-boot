package com.naimish.springbootrest;

import com.naimish.springbootrest.model.JobPost;
import com.naimish.springbootrest.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class JobRestController {
    @Autowired
    private JobService service;

    @GetMapping("jobPosts")
    public List<JobPost> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("jobPost/{id}")
    public JobPost getJob(@PathVariable int id){
        return service.getJob(id);
    }

    @PostMapping("jobPost")
    public JobPost addJob(@RequestBody JobPost jobPost){
        service.addJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }

    @GetMapping("jobPosts/keyword/{keyword}")
    public List<JobPost> searchByKeyword(@PathVariable("keyword") String keyword){
        return service.search(keyword);
    }

    @PutMapping("jobPost")
    public JobPost updateJob(@RequestBody JobPost jobPost){
        service.updateJob(jobPost);
        return service.getJob(jobPost.getPostId());
    }


    @DeleteMapping("jobPost/{id}")
    public String deleteJob(@PathVariable int id){
        service.deleteJob(id);
        return "Post deleted successfully";
    }

    @GetMapping("load")
    public String loadData(){
        service.load();
        return "success";
    }


}
