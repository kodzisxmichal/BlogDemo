package com.example.blog.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class ServicesCatalog implements ICatalogServices{

    private final CategoryService categoryService;
    private final CommentService commentService;
    private final PermissionService permissionService;
    private final PostService postService;
    private final TagService tagService;
    private final UserService userService;


    @Override
    public CategoryService getCategoryService() {
        return categoryService;
    }

    @Override
    public CommentService getCommentService() {
        return commentService;
    }

    @Override
    public PermissionService getPermissionService() {
        return permissionService;
    }

    @Override
    public PostService getPostService() {
        return postService;
    }

    @Override
    public TagService getTagService() {
        return tagService;
    }

    @Override
    public UserService getUserService() {
        return userService;
    }
}
