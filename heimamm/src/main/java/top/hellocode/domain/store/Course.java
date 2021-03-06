package top.hellocode.domain.store;

import java.util.Date;

/**
 * @author HelloCode
 * @site https://www.hellocode.top
 * @date 2022年05月27日 20:11
 */
public class Course {
    private String id;
    private String name;	// 学科名称
    private String remark;	// 描述
    private String state;	// 状态
    private Date createTime;	// 创建时间

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
