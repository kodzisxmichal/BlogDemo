package com.example.frontend;

import com.example.frontend.Models.DTOs.PostDTO;
import com.example.frontend.Services.ServiceCatalog;
import com.example.frontend.Models.Post;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Slf4j
@RequiredArgsConstructor
@Controller
public class WebController {

    private final ServiceCatalog services;

    @GetMapping("/permissions")
    public String permissions(Model model) {
        model.addAttribute("permissions", services.getPermissionService().findAllPermissions());
        return "permissions";
    }

    @GetMapping("/posts")
    public String posts(Model model) {
        model.addAttribute("posts", services.getPostService().findAllPosts());
        return "posts";
    }

    @GetMapping("/tags")
    public String tags(Model model) {
        model.addAttribute("tags", services.getTagService().findAllTags());
        return "tags";
    }

    @GetMapping("/users")
    public String users(Model model) {
        model.addAttribute("users", services.getUserService().findAllUsers());
        return "users";
    }

    @GetMapping("/categories")
    public String categories(Model model) {
        model.addAttribute("categories", services.getCategoryService().findAllCategories());
        return "categories";
    }

    @GetMapping("/comments")
    public String comments(Model model) {
        model.addAttribute("comments", services.getCommentClient().findAllComments());
        return "comments";
    }

    @GetMapping("/posts/add")
    public String showFormPost(Model model) {
        model.addAttribute("post", new Post());
        return "createPost";
    }

    @PostMapping("/posts/add")
    public String addPost(PostDTO postDTO) {
        log.info("Calling postService with postDTO");
        services.getPostService().savePost(postDTO);
        return "posts";
    }

}
