package com.example.study.controller.page;

import com.example.study.service.AdminMenuService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Slf4j
@Controller
@RequestMapping("/pages")
public class PageController {

    @Autowired
    private AdminMenuService adminMenuService;

    @RequestMapping(path = {"", "/main"})
    public ModelAndView index() {
      log.info("{}", adminMenuService.getAdminMenu());
        return new ModelAndView("/pages/main")
                .addObject("menuList", adminMenuService.getAdminMenu())
                .addObject("code", "main")
                ;
    }

    @RequestMapping("/user")
    public ModelAndView user() {
        log.info("{}", adminMenuService.getAdminMenu());
        return new ModelAndView("/pages/user")
                .addObject("menuList", adminMenuService.getAdminMenu())
                .addObject("code", "user")
                ;
    }
}
