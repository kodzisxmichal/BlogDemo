package com.example.frontend.Services;

public interface ICatalogServices {

    CategoryService getCategoryService();
    CommentService getCommentClient();
    PermissionService getPermissionService();
    PostService getPostService();
    TagService getTagService();
    UserService getUserService();
}
