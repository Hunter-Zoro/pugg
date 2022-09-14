package com.ruoyi.project.pugg.mapper;

import java.util.List;
import java.util.Map;

import com.ruoyi.project.pugg.domain.UserThing;

/**
 * 【请填写功能名称】Mapper接口
 * 
 * @author ruoyi
 * @date 2022-09-14
 */
public interface UserThingMapper 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public UserThing selectUserThingById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userThing 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Map> selectUserThingList(UserThing userThing);

    /**
     * 新增【请填写功能名称】
     * 
     * @param userThing 【请填写功能名称】
     * @return 结果
     */
    public int insertUserThing(UserThing userThing);

    /**
     * 修改【请填写功能名称】
     * 
     * @param userThing 【请填写功能名称】
     * @return 结果
     */
    public int updateUserThing(UserThing userThing);

    /**
     * 删除【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteUserThingById(Long id);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteUserThingByIds(String[] ids);
}
