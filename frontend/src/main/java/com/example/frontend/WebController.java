package com.example.frontend;

import com.example.frontend.models.DTOs.PostDTO;
import com.example.frontend.services.ServiceCatalog;
import com.example.frontend.models.Post;
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

    @GetMapping("/admin/permissions")
    public String permissions(Model model) {
        model.addAttribute("permissions", services.getPermissionService().findAllPermissions());
        return "permissions";
    }

    @GetMapping("/admin/posts")
    public String posts(Model model) {
        model.addAttribute("posts", services.getPostService().findAllPosts());
        return "posts";
    }

    @GetMapping("/admin/tags")
    public String tags(Model model) {
        model.addAttribute("tags", services.getTagService().findAllTags());
        return "tags";
    }

    @GetMapping("/admin/users")
    public String users(Model model) {
        model.addAttribute("users", services.getUserService().findAllUsers());
        return "users";
    }

    @GetMapping("admin/categories")
    public String categories(Model model) {
        model.addAttribute("categories", services.getCategoryService().findAllCategories());
        return "categories";
    }

    @GetMapping("admin/comments")
    public String comments(Model model) {
        model.addAttribute("comments", services.getCommentService().findAllComments());
        return "comments";
    }

    @GetMapping("authenticated/posts/add")
    public String showFormPost(Model model) {
        model.addAttribute("post", new Post());
        return "addBlog";
    }

    @PostMapping("authenticated/posts/add")
    public String addPost(PostDTO postDTO) {
        log.info("Calling postService with postDTO");
        services.getPostService().savePost(postDTO);
        return "posts";
    }

    @GetMapping("/public/main")
    public String showMainPage(Model model) {
        model.addAttribute("posts", services.getPostService().findAllPosts());
        return "index";
    }

}
