package com.cklm.dao;

import com.cklm.vo.UserInfoVO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.io.Serializable;

/**
 * JpaRepository  SpringDataJPA提供的简单数据操作接口
 * JpaSpecificationExecutor  SpringDataJPA 提供的复杂查询接口
 * SpringDataJPA内部使用了类代理的方式让继承了它接口的子接口都以spring管理的Bean的形式存在，
 * 也就是说我们可以直接使用@Autowired注解在spring管理bean使用，
 */
public interface UserJPA extends JpaRepository<UserInfoVO,String>,
        JpaSpecificationExecutor<UserJPA>, Serializable{



}
