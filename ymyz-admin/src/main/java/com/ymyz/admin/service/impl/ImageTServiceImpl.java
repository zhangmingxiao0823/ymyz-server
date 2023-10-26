package com.ymyz.admin.service.impl;

import com.ymyz.admin.entity.ImageT;
import com.ymyz.admin.mapper.ImageTMapper;
import com.ymyz.admin.service.ImageTService;
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
public class ImageTServiceImpl implements ImageTService {
    @Autowired
    private ImageTMapper imageTMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param imageId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public ImageT selectImageTByImageId(Long imageId) {
        return imageTMapper.selectImageTByImageId(imageId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param imageT 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<ImageT> selectImageTList(ImageT imageT) {
        return imageTMapper.selectImageTList(imageT);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param imageT 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertImageT(ImageT imageT) {
        imageT.setCreateTime(DateUtils.getNowDate());
        return imageTMapper.insertImageT(imageT);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param imageT 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updateImageT(ImageT imageT) {
        imageT.setUpdateTime(DateUtils.getNowDate());
        return imageTMapper.updateImageT(imageT);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param imageIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteImageTByImageIds(Long[] imageIds) {
        return imageTMapper.deleteImageTByImageIds(imageIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param imageId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deleteImageTByImageId(Long imageId) {
        return imageTMapper.deleteImageTByImageId(imageId);
    }
}
