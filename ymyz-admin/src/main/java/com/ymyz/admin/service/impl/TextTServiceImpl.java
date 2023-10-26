package com.ymyz.admin.service.impl;

import com.ymyz.admin.entity.TextT;
import com.ymyz.admin.mapper.TextTMapper;
import com.ymyz.admin.service.TextTService;
import com.ymyz.common.core.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


/**
 * 【请填写功能名称】Service业务层处理
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
@Service
public class TextTServiceImpl implements TextTService {
    @Autowired
    private TextTMapper textTMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param textId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public TextT selectTextTByTextId(Long textId) {
        return textTMapper.selectTextTByTextId(textId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param textT 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<TextT> selectTextTList(TextT textT) {
        return textTMapper.selectTextTList(textT);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param textT 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertTextT(TextT textT) {
        textT.setCreateTime(DateUtils.getNowDate());
        return textTMapper.insertTextT(textT);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param textT 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateTextT(TextT textT) {
        textT.setUpdateTime(DateUtils.getNowDate());
        return textTMapper.updateTextT(textT);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param textIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTextTByTextIds(Long[] textIds) {
        return textTMapper.deleteTextTByTextIds(textIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param textId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteTextTByTextId(Long textId) {
        return textTMapper.deleteTextTByTextId(textId);
    }
}
