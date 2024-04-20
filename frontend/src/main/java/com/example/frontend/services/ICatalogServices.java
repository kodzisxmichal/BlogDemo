package com.example.frontend.services;

public interface ICatalogServices {

    CategoryService getCategoryService();
    CommentService getCommentService();
    PermissionService getPermissionService();
    PostService getPostService();
    TagService getTagService();
    UserService getUserService();
}
