package com.ymyz.admin.mapper;

import com.ymyz.admin.entity.ImageT;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * 【请填写功能名称】Mapper接口
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
@Mapper
public interface ImageTMapper {
    /**
     * 查询【请填写功能名称】
     *
     * @param imageId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    public ImageT selectImageTByImageId(Long imageId);

    /**
     * 查询【请填写功能名称】列表
     *
     * @param imageT 【请填写功能名称】
     * @return 【请填写功能名称】集合
     */
    public List<ImageT> selectImageTList(ImageT imageT);

    /**
     * 新增【请填写功能名称】
     *
     * @param imageT 【请填写功能名称】
     * @return 结果
     */
    public int insertImageT(ImageT imageT);

    /**
     * 修改【请填写功能名称】
     *
     * @param imageT 【请填写功能名称】
     * @return 结果
     */
    public int updateImageT(ImageT imageT);

    /**
     * 删除【请填写功能名称】
     *
     * @param imageId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteImageTByImageId(Long imageId);

    /**
     * 批量删除【请填写功能名称】
     *
     * @param imageIds 需要删除的数据主键集合
     * @return 结果
     */
    public int deleteImageTByImageIds(Long[] imageIds);
}
