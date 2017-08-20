package com.reddit.Reddit.controller;


import com.reddit.Reddit.model.Post;
import com.reddit.Reddit.model.User;
import com.reddit.Reddit.repository.PostRepository;
import com.reddit.Reddit.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/post")
public class PostController {

    private PostRepository postRepository;

    @Autowired
    public PostController(PostRepository postRepository) {
        this.postRepository = postRepository;
    }

    @RequestMapping(value = "/allPosts")
    public List<Post> allPosts(){
        return postRepository.getAllBy();
    }

    @RequestMapping(value = "/updatePosts/{id}/{vote}", method = RequestMethod.POST)
    @ResponseBody
    public void updatePost(@PathVariable("id") Integer id, @PathVariable("vote") Integer vote){
        Post post = postRepository.findOne(id);
        post.setVote(vote);
        postRepository.save(post);
    }
}
