package per.zqx.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 通用的页面跳转逻辑
 */
@Controller
public class PageController {

    @RequestMapping("page")
    public String toIndex(){
        return "index";
    }
    /**
     *  具体的跳转逻辑
     * @param pageName
     * @return 视图名称
     */
    @RequestMapping(value = "/{pageName}")
    public String toPage(@PathVariable("pageName")String pageName){
        return pageName;
    }
}
