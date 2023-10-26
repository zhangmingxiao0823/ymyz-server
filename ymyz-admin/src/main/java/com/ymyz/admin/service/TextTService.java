package com.ymyz.admin.service;

import com.ymyz.admin.entity.TextT;
import java.util.List;


/**
 * 【请填写功能名称】Service接口
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
public interface TextTService {
    /**
     * 查询【请填写功能名称】
     *
     * @param textId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public TextT selectTextTByTextId(Long textId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param textT 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<TextT> selectTextTList(TextT textT);

    /**
     * 新增【请填写功能名称】
     *
     * @param textT 【请填写功能名称】
     * @return 结果
     */
    public int insertTextT(TextT textT);

    /**
     * 修改【请填写功能名称】
     *
     * @param textT 【请填写功能名称】
     * @return 结果
     */
    public int updateTextT(TextT textT);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param textIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteTextTByTextIds(Long[] textIds);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param textId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTextTByTextId(Long textId);
}
