package com.ymyz.admin.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ymyz.common.core.annotation.Excel;
import com.ymyz.common.core.web.domain.BaseEntity;

/**
 * 【请填写功能名称】对象 music_t
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class MusicT extends BaseEntity {
    private static final long serialVersionUID = 1L;

    /**
     * 音乐表主键
     */
    private Long musicId;

    /**
     * 音乐封面图片id
     */
    @Excel(name = "音乐封面图片id")
    private Long imageId;

    /**
     * 歌词文本id
     */
    @Excel(name = "歌词文本id")
    private Long textId;

    /**
     * 音乐名称
     */
    @Excel(name = "音乐名称")
    private String musicName;

    /**
     * 音乐格式
     */
    @Excel(name = "音乐格式")
    private Integer musicFormat;

    /**
     * 音乐类型
     */
    @Excel(name = "音乐类型")
    private Integer musicType;

    /**
     * 音乐作者
     */
    @Excel(name = "音乐作者")
    private String musicAuthor;

    /**
     * 保存路径
     */
    @Excel(name = "保存路径")
    private String musicFile;

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
