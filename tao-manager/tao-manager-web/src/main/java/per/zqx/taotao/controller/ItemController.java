package per.zqx.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.zqx.taotao.bean.ResultBean;
import per.zqx.taotao.service.IItemService;

/**
 * 商品列表控制类
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private IItemService service;

    @RequestMapping("/list")
    @ResponseBody
    public ResultBean ItemList(Integer page, Integer rows) {
        ResultBean result = service.listItem(page, rows);
        System.out.println(result.toString());
        return result;
    }
}
