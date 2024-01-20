package com.ymyz.admin.service.impl;

import com.ymyz.admin.entity.PhotoT;
import com.ymyz.admin.mapper.PhotoTMapper;
import com.ymyz.admin.model.dto.PhotoDTO;
import com.ymyz.admin.service.PhotoTService;
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
public class PhotoTServiceImpl implements PhotoTService {
    @Autowired
    private PhotoTMapper photoTMapper;

    /**
     * 查询【请填写功能名称】
     *
     * @param photoId 【请填写功能名称】主键
     * @return 【请填写功能名称】
     */
    @Override
    public PhotoT selectPhotoTByphotoId(Long photoId) {
        return photoTMapper.selectPhotoTByphotoId(photoId);
    }

    /**
     * 查询【请填写功能名称】列表
     *
     * @param photoDTO 【请填写功能名称】
     * @return 【请填写功能名称】
     */
    @Override
    public List<PhotoT> selectPhotoTList(PhotoDTO photoDTO) {
        return photoTMapper.selectPhotoTList(photoDTO);
    }

    /**
     * 新增【请填写功能名称】
     *
     * @param PhotoT 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int insertPhotoT(PhotoT PhotoT) {
        PhotoT.setCreateTime(DateUtils.getNowDate());
        return photoTMapper.insertPhotoT(PhotoT);
    }

    /**
     * 修改【请填写功能名称】
     *
     * @param PhotoT 【请填写功能名称】
     * @return 结果
     */
    @Override
    public int updatePhotoT(PhotoT PhotoT) {
        PhotoT.setUpdateTime(DateUtils.getNowDate());
        return photoTMapper.updatePhotoT(PhotoT);
    }

    /**
     * 批量删除【请填写功能名称】
     *
     * @param photoIds 需要删除的【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePhotoTByphotoIds(Long[] photoIds) {
        return photoTMapper.deletePhotoTByphotoIds(photoIds);
    }

    /**
     * 删除【请填写功能名称】信息
     *
     * @param photoId 【请填写功能名称】主键
     * @return 结果
     */
    @Override
    public int deletePhotoTByphotoId(Long photoId) {
        return photoTMapper.deletePhotoTByphotoId(photoId);
    }
}
