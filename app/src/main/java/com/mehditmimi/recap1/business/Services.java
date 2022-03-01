package com.mehditmimi.recap1.business;

import com.mehditmimi.recap1.beans.Todo;

import java.util.List;

public interface Services {
    public Todo add(Todo todo);
    public List<Todo> getAll();
}
