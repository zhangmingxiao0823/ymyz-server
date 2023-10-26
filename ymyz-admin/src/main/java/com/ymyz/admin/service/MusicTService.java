package com.ymyz.admin.service;

import com.ymyz.admin.entity.MusicT;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
public interface MusicTService {
    /**
     * 查询【请填写功能名称】
     *
     * @param musicId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public MusicT selectMusicTByMusicId(Long musicId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param musicT 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<MusicT> selectMusicTList(MusicT musicT);

    /**
     * 新增【请填写功能名称】
     *
     * @param musicT 【请填写功能名称】
     * @return 结果
     */
    public int insertMusicT(MusicT musicT);

    /**
     * 修改【请填写功能名称】
     *
     * @param musicT 【请填写功能名称】
     * @return 结果
     */
    public int updateMusicT(MusicT musicT);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param musicIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteMusicTByMusicIds(Long[] musicIds);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param musicId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMusicTByMusicId(Long musicId);
}
