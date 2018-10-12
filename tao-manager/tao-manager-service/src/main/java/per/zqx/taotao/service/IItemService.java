package per.zqx.taotao.service;

import per.zqx.taotao.bean.ResultBean;
import per.zqx.taotao.pojo.TbItem;

import java.util.List;

public interface IItemService {
    ResultBean listItem(int page,int rows);
}
