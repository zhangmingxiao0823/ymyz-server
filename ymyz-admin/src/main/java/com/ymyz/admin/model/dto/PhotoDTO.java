package com.ymyz.admin.model.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data
@Accessors
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@ApiModel("图片相关信息")
public class PhotoDTO {
    /**
     * 图片表主键
     */
    private Long photoId;

    /**
     * 图片名称
     */
    @ApiModelProperty(value = "图片名称")
    private String photoName;

    /**
     * 图片格式
     */
    @ApiModelProperty(value = "图片格式")
    private Integer photoFormat;

    /**
     * 图片类型
     */
    @ApiModelProperty(value = "图片类型")
    private Integer photoType;

    /**
     * 图片作者
     */
    @ApiModelProperty(value = "图片作者")
    private String photoAuthor;

    /**
     * 保存路径
     */
    @ApiModelProperty(value = "保存路径")
    private String photoFile;

    /**
     * 删除标记：0未删除  1已删除
     */
    @ApiModelProperty(value = "删除标记：0未删除  1已删除")
    private Integer delFlag;

    /**
     * 创建人
     */
    @ApiModelProperty(value = "创建人")
    private String createBy;

    /**
     * 修改人
     */
    @ApiModelProperty(value = "修改人")
    private String updateBy;
}
