package com.ymyz.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ymyz.common.core.annotation.Excel;
import com.ymyz.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 video_t
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VideoT extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 视频表主键
     */
    private Long videoId;

    /**
     * 视频封面图片id
     */
    @Excel(name = "视频封面图片id")
    private Long imageId;

    /**
     * 视频文本id
     */
    @Excel(name = "视频文本id")
    private Long textId;

    /**
     * 视频名称
     */
    @Excel(name = "视频名称")
    private String videoName;

    /**
     * 视频格式
     */
    @Excel(name = "视频格式")
    private Integer videoFormat;

    /**
     * 视频类型
     */
    @Excel(name = "视频类型")
    private Integer videoType;

    /**
     * 视频作者
     */
    @Excel(name = "视频作者")
    private String videoAuthor;

    /**
     * 保存路径
     */
    @Excel(name = "保存路径")
    private String videoFile;

    /**
     * 删除标记：0未删除  1已删除
     */
    @Excel(name = "删除标记：0未删除  1已删除")
    private Integer videoDel;

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
