package per.zqx.taotao.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.zqx.taotao.bean.EasyUITreeNode;
import per.zqx.taotao.mapper.TbItemCatMapper;
import per.zqx.taotao.pojo.TbItemCat;
import per.zqx.taotao.pojo.TbItemCatExample;
import per.zqx.taotao.service.IItemCatService;

import java.util.ArrayList;
import java.util.List;

/**
 * 商品分类查询实现类
 */
@Service
public class ItemCatServiceImpl implements IItemCatService {

    @Autowired
    private TbItemCatMapper mapper;


    public List<EasyUITreeNode> getItemCat(Long parentId) {
        //创建example
        TbItemCatExample example = new TbItemCatExample();
        //设置查询条件
        TbItemCatExample.Criteria criteria = example.createCriteria();
        criteria.andParentIdEqualTo(parentId);
        //通过parendId查询列表
        List<TbItemCat> list = mapper.selectByExample(example);
        //转换树形列表
        List<EasyUITreeNode> resultList = new ArrayList<>();
        for (TbItemCat tbItemCat :
                list) {
            EasyUITreeNode node = new EasyUITreeNode();
            node.setId(tbItemCat.getId());
            node.setText(tbItemCat.getName());
            node.setState(tbItemCat.getIsParent()?"closed":"open");
            resultList.add(node);
        }
        return resultList;
    }
}
