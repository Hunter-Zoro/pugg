package com.ruoyi.project.pugg.service;

import java.util.List;
import java.util.Map;

import com.ruoyi.project.pugg.domain.Transaction;

/**
 * 【请填写功能名称】Service接口
 * 
 * @author ruoyi
 * @date 2022-09-14
 */
public interface ITransactionService 
{
    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public Transaction selectTransactionById(Long id);

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param transaction 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<Map> selectTransactionList(Transaction transaction);

    /**
     * 新增【请填写功能名称】
     * 
     * @param transaction 【请填写功能名称】
     * @return 结果
     */
    public int insertTransaction(Transaction transaction);

    /**
     * 修改【请填写功能名称】
     * 
     * @param transaction 【请填写功能名称】
     * @return 结果
     */
    public int updateTransaction(Transaction transaction);

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteTransactionByIds(String ids);

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTransactionById(Long id);
}
