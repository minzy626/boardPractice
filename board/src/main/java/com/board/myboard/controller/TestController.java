package com.board.myboard.controller;


import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
 
@Controller
public class TestController {
     
    Logger log = Logger.getLogger(this.getClass());
     
    @RequestMapping(value="/interceptorTest")
    public ModelAndView interceptorTest() throws Exception{
         
        ModelAndView mv = new ModelAndView("");
        log.debug("���ͼ��� �׽�Ʈ�Դϴ�!");
         
        return mv;
    }
     
}


