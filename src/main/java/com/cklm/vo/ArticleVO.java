package com.cklm.vo;

import com.sun.javafx.beans.IDProperty;
import org.hibernate.validator.constraints.CodePointLength;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "article")
public class ArticleVO implements Serializable {

    @Id
    @GeneratedValue
    @Column(name = "article_id")
    private Long id;


    @Column(name = "article_title")
    private String title;

    @Column(name = "article_content")
    private String content;

    @Column(name = "article_create_time")
    private String createTime;

    @Column(name = "article_create_by")
    private String createBy;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }
}
