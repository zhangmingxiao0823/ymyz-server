package com.ymyz.admin.mapper;

import com.ymyz.admin.entity.TextT;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
@Mapper
public interface TextTMapper {
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
     * 删除【请填写功能名称】
     *
     * @param textId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteTextTByTextId(Long textId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param textIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteTextTByTextIds(Long[] textIds);
}
