package com.example.blog.Mappers;

public interface IMap<TDTO, TEntity>{

    TEntity map(TDTO dto);
}
