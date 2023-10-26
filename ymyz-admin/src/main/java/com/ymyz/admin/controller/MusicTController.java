package com.ymyz.admin.controller;

import com.ymyz.admin.entity.MusicT;
import com.ymyz.admin.service.MusicTService;
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
@RequestMapping("/music")
public class MusicTController extends BaseController {
    @Autowired
    private MusicTService musicTService;

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:t:list")
    @GetMapping("/list")
    public TableDataInfo list(MusicT musicT) {
        startPage();
        List<MusicT> list = musicTService.selectMusicTList(musicT);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:t:export")
    @Log(title = "音乐管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, MusicT musicT) {
        List<MusicT> list = musicTService.selectMusicTList(musicT);
        ExcelUtil<MusicT> util = new ExcelUtil<MusicT>(MusicT.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @RequiresPermissions("system:t:query")
    @GetMapping(value = "/{musicId}")
    public AjaxResult getInfo(@PathVariable("musicId") Long musicId) {
        return success(musicTService.selectMusicTByMusicId(musicId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @RequiresPermissions("system:t:add")
    @Log(title = "音乐管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody MusicT musicT) {
        return toAjax(musicTService.insertMusicT(musicT));
    }

    /**
     * 修改【请填写功能名称】
     */
    @RequiresPermissions("system:t:edit")
    @Log(title = "音乐管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody MusicT musicT) {
        return toAjax(musicTService.updateMusicT(musicT));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:t:remove")
    @Log(title = "音乐管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{musicIds}")
    public AjaxResult remove(@PathVariable Long[] musicIds) {
        return toAjax(musicTService.deleteMusicTByMusicIds(musicIds));
    }
}
