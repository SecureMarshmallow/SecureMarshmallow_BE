package com.Secure.Marshmallow.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Board {
    @Id
    private int idx;
    @Column(nullable = false)
    private String title;
    @Column(nullable = false)
    private String writer;
    @Column(nullable = false)
    private String content;
    @Column(nullable = false)
    private String password;

    public Board(String title, String writer, String content, String password)
    {
        this.title = title;
        this.writer = writer;
        this.content = content;
        this.password = password;
    }

    public Board() {

    }

    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
