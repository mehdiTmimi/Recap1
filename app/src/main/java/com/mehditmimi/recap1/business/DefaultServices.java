package com.mehditmimi.recap1.business;

import com.mehditmimi.recap1.beans.Todo;
import com.mehditmimi.recap1.dao.TodoDao;

import java.util.List;

public class DefaultServices implements Services{
    private TodoDao todoDao;
    public DefaultServices(TodoDao todoDao)
    {
        this.todoDao=todoDao;
    }

    @Override
    public Todo add(Todo todo) {
        return todoDao.add(todo);
    }

    @Override
    public List<Todo> getAll() {
        return todoDao.getAll();
    }
}
