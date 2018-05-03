package com.cklm.controller;

import com.cklm.dao.UserJPA;
import com.cklm.vo.UserInfoVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 *   @restController:标签标示该类为访问控制器
 *
 */
@Controller
public class UserInfoController {

        @Autowired
        private UserJPA userJPA;

        @RequestMapping(value = "getInfo",method = RequestMethod.GET)
        @ResponseBody
        public List<UserInfoVO> getInfo(){
            List<UserInfoVO> list = userJPA.findAll();
            return list;
        }
         @RequestMapping(value = "index",method =RequestMethod.GET)
         public String  forwordIndex(){
                return "index";
         }
}
