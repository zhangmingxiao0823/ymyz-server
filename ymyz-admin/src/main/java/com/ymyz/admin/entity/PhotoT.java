package com.ymyz.admin.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.ymyz.common.core.web.domain.BaseEntity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 【请填写功能名称】对象 photo_t
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "photo_t")
public class PhotoT extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 图片表主键
     */
    @TableId(value = "photo_id", type = IdType.AUTO)
    private Long photoId;

    /**
     * 图片名称
     */
    @TableField(value = "photo_name")
    private String photoName;

    /**
     * 图片格式
     */
    @TableField(value = "photo_format")
    private Integer photoFormat;

    /**
     * 图片类型
     */
    @TableField(value = "photo_type")
    private Integer photoType;

    /**
     * 图片作者
     */
    @TableField(value = "photo_author")
    private String photoAuthor;

    /**
     * 保存路径
     */
    @TableField(value = "photo_file")
    private String photoFile;

}
