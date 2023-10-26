package com.ymyz.admin.controller;

import com.ymyz.admin.entity.VideoT;
import com.ymyz.admin.service.VideoTService;
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
@RequestMapping("/video")
public class VideoTController extends BaseController {
    @Autowired
    private VideoTService videoTService;

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:t:list")
    @GetMapping("/list")
    public TableDataInfo list(VideoT videoT) {
        startPage();
        List<VideoT> list = videoTService.selectVideoTList(videoT);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:t:export")
    @Log(title = "视频管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, VideoT videoT) {
        List<VideoT> list = videoTService.selectVideoTList(videoT);
        ExcelUtil<VideoT> util = new ExcelUtil<VideoT>(VideoT.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @RequiresPermissions("system:t:query")
    @GetMapping(value = "/{videoId}")
    public AjaxResult getInfo(@PathVariable("videoId") Long videoId) {
        return success(videoTService.selectVideoTByVideoId(videoId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @RequiresPermissions("system:t:add")
    @Log(title = "视频管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody VideoT videoT) {
        return toAjax(videoTService.insertVideoT(videoT));
    }

    /**
     * 修改【请填写功能名称】
     */
    @RequiresPermissions("system:t:edit")
    @Log(title = "视频管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody VideoT videoT) {
        return toAjax(videoTService.updateVideoT(videoT));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:t:remove")
    @Log(title = "视频管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{videoIds}")
    public AjaxResult remove(@PathVariable Long[] videoIds) {
        return toAjax(videoTService.deleteVideoTByVideoIds(videoIds));
    }
}
