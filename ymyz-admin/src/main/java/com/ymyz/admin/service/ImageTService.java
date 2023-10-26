package com.ymyz.admin.service;

import com.ymyz.admin.entity.ImageT;
import java.util.List;

/**
 * 【请填写功能名称】Service接口
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
public interface ImageTService {
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
     * 批量删除【请填写功能名称】
     *
     * @param imageIds 需要删除的【请填写功能名称】主键集合
     * @return 结果
     */
    public int deleteImageTByImageIds(Long[] imageIds);

    /**
     * 删除【请填写功能名称】信息
     *
     * @param imageId 【请填写功能名称】主键
     * @return 结果
     */
    public int deleteImageTByImageId(Long imageId);
}
