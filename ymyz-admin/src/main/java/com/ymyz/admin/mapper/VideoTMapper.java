package com.ymyz.admin.mapper;

import com.ymyz.admin.entity.VideoT;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
@Mapper
public interface VideoTMapper {
    /**
     * 查询【请填写功能名称】
     *
     * @param videoId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public VideoT selectVideoTByVideoId(Long videoId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param videoT 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<VideoT> selectVideoTList(VideoT videoT);

    /**
     * 新增【请填写功能名称】
     *
     * @param videoT 【请填写功能名称】
     * @return 结果
     */
    public int insertVideoT(VideoT videoT);

    /**
     * 修改【请填写功能名称】
     *
     * @param videoT 【请填写功能名称】
     * @return 结果
     */
    public int updateVideoT(VideoT videoT);

    /**
     * 删除【请填写功能名称】
     *
     * @param videoId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteVideoTByVideoId(Long videoId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param videoIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteVideoTByVideoIds(Long[] videoIds);
}
