package com.ymyz.admin.controller;

import com.ymyz.admin.entity.ImageT;
import com.ymyz.admin.service.ImageTService;
import com.ymyz.common.core.utils.poi.ExcelUtil;
import com.ymyz.common.core.web.controller.BaseController;
import com.ymyz.common.core.web.domain.AjaxResult;
import com.ymyz.common.core.web.page.TableDataInfo;
import com.ymyz.common.log.annotation.Log;
import com.ymyz.common.log.enums.BusinessType;
import com.ymyz.common.security.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 【请填写功能名称】Controller
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
@RestController
@RequestMapping("/image")
public class ImageTController extends BaseController {
    @Autowired
    private ImageTService imageTService;

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:t:list")
    @GetMapping("/list")
    public TableDataInfo list(ImageT imageT) {
        startPage();
        List<ImageT> list = imageTService.selectImageTList(imageT);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:t:export")
    @Log(title = "图片管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, ImageT imageT) {
        List<ImageT> list = imageTService.selectImageTList(imageT);
        ExcelUtil<ImageT> util = new ExcelUtil<ImageT>(ImageT.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @RequiresPermissions("system:t:query")
    @GetMapping(value = "/{imageId}")
    public AjaxResult getInfo(@PathVariable("imageId") Long imageId) {
        return success(imageTService.selectImageTByImageId(imageId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @RequiresPermissions("system:t:add")
    @Log(title = "图片管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody ImageT imageT) {
        return toAjax(imageTService.insertImageT(imageT));
    }

    /**
     * 修改【请填写功能名称】
     */
    @RequiresPermissions("system:t:edit")
    @Log(title = "图片管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody ImageT imageT) {
        return toAjax(imageTService.updateImageT(imageT));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:t:remove")
    @Log(title = "图片管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{imageIds}")
    public AjaxResult remove(@PathVariable Long[] imageIds) {
        return toAjax(imageTService.deleteImageTByImageIds(imageIds));
    }
}
