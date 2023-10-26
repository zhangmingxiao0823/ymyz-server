package com.ymyz.admin.service.impl;

import com.ymyz.admin.entity.MusicT;
import com.ymyz.admin.mapper.MusicTMapper;
import com.ymyz.admin.service.MusicTService;
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
public class MusicTServiceImpl implements MusicTService {
    @Autowired
    private MusicTMapper musicTMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param musicId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public MusicT selectMusicTByMusicId(Long musicId) {
        return musicTMapper.selectMusicTByMusicId(musicId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param musicT 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<MusicT> selectMusicTList(MusicT musicT) {
        return musicTMapper.selectMusicTList(musicT);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param musicT 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertMusicT(MusicT musicT) {
        musicT.setCreateTime(DateUtils.getNowDate());
        return musicTMapper.insertMusicT(musicT);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param musicT 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateMusicT(MusicT musicT) {
        musicT.setUpdateTime(DateUtils.getNowDate());
        return musicTMapper.updateMusicT(musicT);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param musicIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMusicTByMusicIds(Long[] musicIds) {
        return musicTMapper.deleteMusicTByMusicIds(musicIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param musicId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteMusicTByMusicId(Long musicId) {
        return musicTMapper.deleteMusicTByMusicId(musicId);
    }
}
