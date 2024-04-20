package com.example.blog.repositories;

public interface ICatalogRepositories {
    CategoryRepository getCategories();
    CommentRepository getComments();
    PermissionRepository getPermissions();
    PostRepository getPosts();
    TagRepository getTags();
    UserRepository getUsers();
}
