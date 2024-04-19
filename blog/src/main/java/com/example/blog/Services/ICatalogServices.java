package com.example.blog.Services;

public interface ICatalogServices {

    CategoryService getCategoryService();
    CommentService getCommentService();
    PermissionService getPermissionService();
    PostService getPostService();
    TagService getTagService();
    UserService getUserService();
}
