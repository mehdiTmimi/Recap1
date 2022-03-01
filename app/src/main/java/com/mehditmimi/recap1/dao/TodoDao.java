package com.mehditmimi.recap1.dao;

import com.mehditmimi.recap1.beans.Todo;

import java.util.List;

public interface TodoDao {
    public Todo add(Todo todo);
    public List<Todo> getAll();
}
