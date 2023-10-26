package com.ymyz.admin.controller;

import com.ymyz.admin.entity.TextT;
import com.ymyz.admin.service.TextTService;
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
@RequestMapping("/text")
public class TextTController extends BaseController {
    @Autowired
    private TextTService textTService;

    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("system:t:list")
    @GetMapping("/list")
    public TableDataInfo list(TextT textT) {
        startPage();
        List<TextT> list = textTService.selectTextTList(textT);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("system:t:export")
    @Log(title = "文本管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, TextT textT) {
        List<TextT> list = textTService.selectTextTList(textT);
        ExcelUtil<TextT> util = new ExcelUtil<TextT>(TextT.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @RequiresPermissions("system:t:query")
    @GetMapping(value = "/{textId}")
    public AjaxResult getInfo(@PathVariable("textId") Long textId) {
        return success(textTService.selectTextTByTextId(textId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @RequiresPermissions("system:t:add")
    @Log(title = "文本管理", businessType = BusinessType.INSERT)
    @PostMapping
    public AjaxResult add(@RequestBody TextT textT) {
        return toAjax(textTService.insertTextT(textT));
    }

    /**
     * 修改【请填写功能名称】
     */
    @RequiresPermissions("system:t:edit")
    @Log(title = "文本管理", businessType = BusinessType.UPDATE)
    @PutMapping
    public AjaxResult edit(@RequestBody TextT textT) {
        return toAjax(textTService.updateTextT(textT));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("system:t:remove")
    @Log(title = "文本管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{textIds}")
    public AjaxResult remove(@PathVariable Long[] textIds) {
        return toAjax(textTService.deleteTextTByTextIds(textIds));
    }
}
