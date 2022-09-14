package com.ruoyi.project.pugg.service.impl;

import java.util.List;

import com.ruoyi.project.pugg.domain.Thing;
import com.ruoyi.project.pugg.mapper.ThingMapper;
import com.ruoyi.project.pugg.service.IThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ruoyi.common.utils.text.Convert;

/**
 * 【请填写功能名称】Service业务层处理
 * 
 * @author ruoyi
 * @date 2022-09-14
 */
@Service
public class ThingServiceImpl implements IThingService
{
    @Autowired
    private ThingMapper thingMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Thing selectThingById(Long id)
    {
        return thingMapper.selectThingById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param thing 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Thing> selectThingList(Thing thing)
    {
        return thingMapper.selectThingList(thing);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param thing 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertThing(Thing thing)
    {
        return thingMapper.insertThing(thing);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param thing 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateThing(Thing thing)
    {
        return thingMapper.updateThing(thing);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteThingByIds(String ids)
    {
        return thingMapper.deleteThingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteThingById(Long id)
    {
        return thingMapper.deleteThingById(id);
    }
}
