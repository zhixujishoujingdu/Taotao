package per.zqx.taotao.bean;

import java.util.List;


public class ResultBean{
    private Long totalPage;
    private List<?> rows;

    public ResultBean() {
    }

    public ResultBean(Long totalPage, List<?> rows) {
        this.totalPage = totalPage;
        this.rows = rows;
    }

    public Long getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
