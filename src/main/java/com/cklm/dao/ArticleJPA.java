package com.cklm.dao;

import com.cklm.vo.ArticleVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

public interface ArticleJPA  extends JpaRepository<ArticleVO,String>,JpaSpecificationExecutor<ArticleJPA>, Serializable {

}
