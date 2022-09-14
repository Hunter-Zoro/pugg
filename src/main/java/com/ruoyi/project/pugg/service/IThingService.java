package com.ruoyi.project.pugg.service;

import java.util.List;

import com.ruoyi.project.pugg.domain.Thing;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-09-14
 */
public interface IThingService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Thing selectThingById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param thing 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Thing> selectThingList(Thing thing);

    /**
     * 新增【请填写功能名称】
     * 
     * @param thing 【请填写功能名称】
     * @return 结果
     */
    public int insertThing(Thing thing);

    /**
     * 修改【请填写功能名称】
     * 
     * @param thing 【请填写功能名称】
     * @return 结果
     */
    public int updateThing(Thing thing);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteThingByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteThingById(Long id);
}
