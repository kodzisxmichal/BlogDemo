package com.example.blog.Repositories;

public interface ICatalogRepositories {
    CategoryRepository getCategories();
    CommentRepository getComments();
    PermissionRepository getPermissions();
    PostRepository getPosts();
    TagRepository getTags();
    UserRepository getUsers();
}
