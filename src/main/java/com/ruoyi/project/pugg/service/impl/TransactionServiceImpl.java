package com.ruoyi.project.pugg.service.impl;

import java.util.List;
import java.util.Map;

import com.ruoyi.project.pugg.domain.Transaction;
import com.ruoyi.project.pugg.mapper.TransactionMapper;
import com.ruoyi.project.pugg.service.ITransactionService;
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
public class TransactionServiceImpl implements ITransactionService
{
    @Autowired
    private TransactionMapper transactionMapper;

    /**
     * 查询【请填写功能名称】
     * 
     * @param id 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public Transaction selectTransactionById(Long id)
    {
        return transactionMapper.selectTransactionById(id);
    }

    /**
     * 查询【请填写功能名称】列表
     * 
     * @param transaction 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<Map> selectTransactionList(Transaction transaction)
    {
        return transactionMapper.selectTransactionList(transaction);
    }

    /**
     * 新增【请填写功能名称】
     * 
     * @param transaction 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTransaction(Transaction transaction)
    {
        return transactionMapper.insertTransaction(transaction);
    }

    /**
     * 修改【请填写功能名称】
     * 
     * @param transaction 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTransaction(Transaction transaction)
    {
        return transactionMapper.updateTransaction(transaction);
    }

    /**
     * 批量删除【请填写功能名称】
     * 
     * @param ids 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTransactionByIds(String ids)
    {
        return transactionMapper.deleteTransactionByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除【请填写功能名称】信息
     * 
     * @param id 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTransactionById(Long id)
    {
        return transactionMapper.deleteTransactionById(id);
    }
}
