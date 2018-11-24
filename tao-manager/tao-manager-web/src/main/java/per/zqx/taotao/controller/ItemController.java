package per.zqx.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import per.zqx.taotao.bean.EUDataGridResult;
import per.zqx.taotao.service.IItemService;

/**
 * 商品列表控制类
 */
@Controller
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private IItemService itemService;

    @RequestMapping("/list")
    @ResponseBody
    public EUDataGridResult ItemList(Integer page, Integer rows) {
        EUDataGridResult result = itemService.getItemList(page, rows);
        System.out.println(result.getTotalPage().toString());
        return result;
    }
}
