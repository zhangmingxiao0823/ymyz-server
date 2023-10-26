package com.ymyz.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ymyz.common.core.annotation.Excel;
import com.ymyz.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 image_t
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ImageT extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 图片表主键
     */
    private Long imageId;

    /**
     * 图片名称
     */
    @Excel(name = "图片名称")
    private String imageName;

    /**
     * 图片格式
     */
    @Excel(name = "图片格式")
    private Integer imageFormat;

    /**
     * 图片类型
     */
    @Excel(name = "图片类型")
    private Integer imageType;

    /**
     * 图片作者
     */
    @Excel(name = "图片作者")
    private String imageAuthor;

    /**
     * 保存路径
     */
    @Excel(name = "保存路径")
    private String imageFile;

    /**
     * 删除标记：0未删除  1已删除
     */
    @Excel(name = "删除标记：0未删除  1已删除")
    private Integer imageDel;

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
