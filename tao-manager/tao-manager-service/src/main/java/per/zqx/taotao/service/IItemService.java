package per.zqx.taotao.service;

import per.zqx.taotao.bean.EUDataGridResult;

public interface IItemService {
    EUDataGridResult getItemList(int page, int rows);
}
