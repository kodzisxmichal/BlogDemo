package com.example.blog.mappers;

public interface IMap<TDTO, TEntity>{

    TEntity map(TDTO dto);
}
