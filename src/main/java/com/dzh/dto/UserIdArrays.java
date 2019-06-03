package com.dzh.dto;

import java.util.List;

public class UserIdArrays {
    private List<Integer> list;

    public List<Integer> getList() {
        return list;
    }

    public void setList(List<Integer> list) {
        this.list = list;
    }

    public UserIdArrays() {
    }

    public UserIdArrays(List<Integer> list) {
        this.list = list;
    }

    @Override
    public String toString() {
        return "UserIdArrays{" +
                "list=" + list +
                '}';
    }
}
