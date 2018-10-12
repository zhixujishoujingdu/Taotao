package per.zqx.taotao.service.serviceImpl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import per.zqx.taotao.bean.ResultBean;
import per.zqx.taotao.mapper.TbItemMapper;
import per.zqx.taotao.pojo.TbItem;
import per.zqx.taotao.pojo.TbItemExample;
import per.zqx.taotao.service.IItemService;

import java.util.List;

@Service
public class ItemServiceImpl implements IItemService {

    @Autowired
    private TbItemMapper mapper;

    /**
     *
     * @param page 页数
     * @param rows 每页记录数
     * @return ResultBean（easyui）类型对象
     */
    public ResultBean listItem(int page, int rows) {
        //查询商品列表
        TbItemExample example =new TbItemExample();
        //分页查询
        PageHelper.startPage(page,rows);
        List<TbItem> list = mapper.selectByExample(example);
        //获取返回值对象
        ResultBean result = new ResultBean();
        result.setRows(list);
        //获取总记录
        PageInfo<TbItem> pageInfo = new PageInfo<>(list);
        result.setTotalPage(pageInfo.getTotal());
//        System.out.println(result.getRows()+","+result.getTotalPage());
        //返回前端要求的格式
        return result;
    }
}
