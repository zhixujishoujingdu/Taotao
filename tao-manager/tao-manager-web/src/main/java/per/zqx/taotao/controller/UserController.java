package per.zqx.taotao.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import per.zqx.taotao.bean.EUDataGridResult;

@Controller
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/list",method = RequestMethod.POST)
    public EUDataGridResult queryUserList(){
        return null;
    }
}
