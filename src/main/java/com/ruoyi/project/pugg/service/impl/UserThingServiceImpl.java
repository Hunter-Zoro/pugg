package com.ruoyi.project.pugg.service.impl;

import java.util.List;
import java.util.Map;

import com.ruoyi.project.pugg.domain.UserThing;
import com.ruoyi.project.pugg.mapper.UserThingMapper;
import com.ruoyi.project.pugg.service.IUserThingService;
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
public class UserThingServiceImpl implements IUserThingService
{
    @Autowired
    private UserThingMapper userThingMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public UserThing selectUserThingById(Long id)
    {
        return userThingMapper.selectUserThingById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param userThing 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Map> selectUserThingList(UserThing userThing)
    {
        return userThingMapper.selectUserThingList(userThing);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param userThing 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertUserThing(UserThing userThing)
    {
        return userThingMapper.insertUserThing(userThing);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param userThing 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateUserThing(UserThing userThing)
    {
        return userThingMapper.updateUserThing(userThing);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserThingByIds(String ids)
    {
        return userThingMapper.deleteUserThingByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteUserThingById(Long id)
    {
        return userThingMapper.deleteUserThingById(id);
    }
}
