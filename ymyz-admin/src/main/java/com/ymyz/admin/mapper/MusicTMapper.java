package com.ymyz.admin.mapper;

import com.ymyz.admin.entity.MusicT;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


/**
 * 【请填写功能名称】Mapper接口
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
@Mapper
public interface MusicTMapper {
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
     * 删除【请填写功能名称】
     *
     * @param musicId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteMusicTByMusicId(Long musicId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param musicIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteMusicTByMusicIds(Long[] musicIds);
}
