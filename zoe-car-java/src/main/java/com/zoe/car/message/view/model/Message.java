package com.zoe.car.message.view.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Message
 *
 * @author Dai Wenqing
 * @date 2015/11/12
 */
public class Message {
    private int type;
    private int pageSize;
    private int pageNum;
    private List<Post> posts = new ArrayList<>();

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNum() {
        return pageNum;
    }

    public void setPageNum(int pageNum) {
        this.pageNum = pageNum;
    }

    public List<Post> getPosts() {
        return posts;
    }

    public void setPosts(List<Post> posts) {
        this.posts = posts;
    }
}
