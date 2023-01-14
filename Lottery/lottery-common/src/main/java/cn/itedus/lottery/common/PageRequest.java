package cn.itedus.lottery.common;

/**
 * @description: 分页类
 * @author: 小傅哥，微信：fustack
 * @date: 2021/12/11
 * @github: https://github.com/fuzhengwei
 * @Copyright: 公众号：bugstack虫洞栈 | 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 */
public class PageRequest {

    /**
     * 开始 limit 第1个入参
     */
    private int pageBegin = 0;

    /**
     * 开始 limit 第2个入参
     */
    private int pageEnd = 0;

    /**
     * 页数
     */
    private int page;

    /**
     * 行数
     */
    private int rows;

    public PageRequest() {
    }

    public PageRequest(String page, String rows) {
        this.setPage(page, rows);
    }

    public PageRequest(int page, int rows) {
        this.setPage(page, rows);
    }

    public void setPage(String page, String rows) {
        this.page = null == page ? 1 : Integer.parseInt(page);
        this.rows = null == page ? 10 : Integer.parseInt(rows);
        if (0 == this.page) {
            this.page = 1;
        }
        this.pageBegin = (this.page - 1) * this.rows;
        this.pageEnd = this.rows;
    }

    public void setPage(int page, int rows) {
        this.page = page;
        this.rows = rows;

        if (0 == this.page) {
            this.page = 1;
        }
        this.pageBegin = (this.page - 1) * this.rows;
        this.pageEnd = this.rows;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public int getPageBegin() {
        return pageBegin;
    }

    public void setPageBegin(int pageBegin) {
        this.pageBegin = pageBegin;
    }

    public int getPageEnd() {
        return pageEnd;
    }

    public void setPageEnd(int pageEnd) {
        this.pageEnd = pageEnd;
    }

}
