package com.ruoyi.project.pugg.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.framework.aspectj.lang.annotation.Excel;
import com.ruoyi.framework.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 thing
 * 
 * @author ruoyi
 * @date 2022-09-14
 */
public class Thing extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** $column.columnComment */
    private Long id;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String thingName;

    /** $column.columnComment */
    @Excel(name = "${comment}", readConverterExp = "$column.readConverterExp()")
    private String thingBlock;

    private String thingImg;

    private String thingPrice;

    public String getThingImg() {
        return thingImg;
    }

    public void setThingImg(String thingImg) {
        this.thingImg = thingImg;
    }

    public String getThingPrice() {
        return thingPrice;
    }

    public void setThingPrice(String thingPrice) {
        this.thingPrice = thingPrice;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public Long getId()
    {
        return id;
    }
    public void setThingName(String thingName)
    {
        this.thingName = thingName;
    }

    public String getThingName()
    {
        return thingName;
    }
    public void setThingBlock(String thingBlock)
    {
        this.thingBlock = thingBlock;
    }

    public String getThingBlock()
    {
        return thingBlock;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("id", getId())
            .append("thingName", getThingName())
            .append("thingBlock", getThingBlock())
            .toString();
    }
}
