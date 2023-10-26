package com.ymyz.admin.service.impl;

import com.ymyz.admin.entity.VideoT;
import com.ymyz.admin.mapper.VideoTMapper;
import com.ymyz.admin.service.VideoTService;
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
public class VideoTServiceImpl implements VideoTService {
    @Autowired
    private VideoTMapper videoTMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param videoId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public VideoT selectVideoTByVideoId(Long videoId) {
        return videoTMapper.selectVideoTByVideoId(videoId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param videoT 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<VideoT> selectVideoTList(VideoT videoT) {
        return videoTMapper.selectVideoTList(videoT);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param videoT 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertVideoT(VideoT videoT) {
        videoT.setCreateTime(DateUtils.getNowDate());
        return videoTMapper.insertVideoT(videoT);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param videoT 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateVideoT(VideoT videoT) {
        videoT.setUpdateTime(DateUtils.getNowDate());
        return videoTMapper.updateVideoT(videoT);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param videoIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVideoTByVideoIds(Long[] videoIds) {
        return videoTMapper.deleteVideoTByVideoIds(videoIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param videoId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteVideoTByVideoId(Long videoId) {
        return videoTMapper.deleteVideoTByVideoId(videoId);
    }
}
