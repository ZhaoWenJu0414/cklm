package com.cklm.controller;

import com.cklm.dao.ArticleJPA;
import com.cklm.vo.ArticleVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/article")
public class ArticleController {

    @Autowired
    private ArticleJPA  articleJPA;


    @RequestMapping(value = "/queryList",method = RequestMethod.GET)
    public List<ArticleVO> queryList(){
        return  articleJPA.findAll();
    }



}
