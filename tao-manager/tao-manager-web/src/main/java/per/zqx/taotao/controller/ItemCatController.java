package per.zqx.taotao.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import per.zqx.taotao.bean.EasyUITreeNode;
import per.zqx.taotao.service.IItemCatService;

import java.util.List;

/**
 * 商品类别控制类
 */
@Controller
@RequestMapping("/item/cat")
public class ItemCatController {

    @Autowired
    private IItemCatService service;

    @RequestMapping(value = "/list")
    @ResponseBody
    public List<EasyUITreeNode> getCatList(@RequestParam(value = "id",defaultValue = "0") Long parentId){
        List<EasyUITreeNode> list = service.getItemCat(parentId);
        return list;
    }

}
