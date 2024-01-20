package com.ymyz.admin.mapper;

import com.ymyz.admin.entity.PhotoT;
import com.ymyz.admin.model.dto.PhotoDTO;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
@Mapper
public interface PhotoTMapper {
    /**
     * 查询【请填写功能名称】
     *
     * @param photoId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public PhotoT selectPhotoTByphotoId(Long photoId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param photoDTO 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<PhotoT> selectPhotoTList(PhotoDTO photoDTO);

    /**
     * 新增【请填写功能名称】
     *
     * @param PhotoT 【请填写功能名称】
     * @return 结果
     */
    public int insertPhotoT(PhotoT PhotoT);

    /**
     * 修改【请填写功能名称】
     *
     * @param PhotoT 【请填写功能名称】
     * @return 结果
     */
    public int updatePhotoT(PhotoT PhotoT);

    /**
     * 删除【请填写功能名称】
     *
     * @param photoId 【请填写功能名称】主键
     * @return 结果
     */
    public int deletePhotoTByphotoId(Long photoId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param photoIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deletePhotoTByphotoIds(Long[] photoIds);
}
