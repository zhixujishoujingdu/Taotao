package per.zqx.taotao.service;

import per.zqx.taotao.bean.EasyUITreeNode;

import java.util.List;

public interface IItemCatService {
    List<EasyUITreeNode> getItemCat(Long parentId);
}
