package per.zqx.taotao.bean;

import java.util.List;


public class EUDataGridResult {
    private Long total;
    private List<?> rows;

    public Long getTotalPage() {
        return total;
    }

    public void setTotalPage(Long total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
