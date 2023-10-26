package com.ymyz.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ymyz.common.core.annotation.Excel;
import com.ymyz.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 text_t
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TextT extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 文本表主键
     */
    private Long textId;

    /**
     * 文本内容
     */
    @Excel(name = "文本内容")
    private String textContent;

    /**
     * 保存路径
     */
    @Excel(name = "保存路径")
    private String textFile;

    /**
     * 删除标记：0未删除  1已删除
     */
    @Excel(name = "删除标记：0未删除  1已删除")
    private Integer musicDel;

    /**
     * 创建人
     */
    @Excel(name = "创建人")
    private String createName;

    /**
     * 修改人
     */
    @Excel(name = "修改人")
    private String updateName;

}
