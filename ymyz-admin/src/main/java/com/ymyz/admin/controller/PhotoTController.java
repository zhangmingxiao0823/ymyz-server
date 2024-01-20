package com.ymyz.admin.controller;

import com.ymyz.admin.entity.PhotoT;
import com.ymyz.admin.model.dto.PhotoDTO;
import com.ymyz.admin.service.PhotoTService;
import com.ymyz.common.core.domain.R;
import com.ymyz.common.core.utils.StringUtils;
import com.ymyz.common.core.utils.file.FileTypeUtils;
import com.ymyz.common.core.utils.file.MimeTypeUtils;
import com.ymyz.common.core.utils.poi.ExcelUtil;
import com.ymyz.common.core.web.controller.BaseController;
import com.ymyz.common.core.web.domain.AjaxResult;
import com.ymyz.common.core.web.page.TableDataInfo;
import com.ymyz.common.log.annotation.Log;
import com.ymyz.common.log.enums.BusinessType;
import com.ymyz.common.security.annotation.RequiresPermissions;
import com.ymyz.system.api.RemoteFileService;
import com.ymyz.system.api.domain.SysFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.List;

/**
 * 【请填写功能名称】Controller
 *
 * @author zhangmingxiao
 * @date 2023-10-25
 */
@RestController
@RequestMapping("/photo")
public class PhotoTController extends BaseController {
    @Autowired
    private PhotoTService photoService;

    @Resource
    private RemoteFileService remoteFileService;
    /**
     * 查询【请填写功能名称】列表
     */
    @RequiresPermissions("admin:photo:list")
    @GetMapping("/list")
    public TableDataInfo list(PhotoDTO photoDTO) {
        startPage();
        List<PhotoT> list = photoService.selectPhotoTList(photoDTO);
        return getDataTable(list);
    }

    /**
     * 导出【请填写功能名称】列表
     */
    @RequiresPermissions("admin:photo:export")
    @Log(title = "图片管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(HttpServletResponse response, PhotoDTO photoDTO) {
        List<PhotoT> list = photoService.selectPhotoTList(photoDTO);
        ExcelUtil<PhotoT> util = new ExcelUtil<PhotoT>(PhotoT.class);
        util.exportExcel(response, list, "【请填写功能名称】数据");
    }

    /**
     * 获取【请填写功能名称】详细信息
     */
    @RequiresPermissions("admin:photo:query")
    @GetMapping(value = "/{photoId}")
    public AjaxResult getInfo(@PathVariable("photoId") Long photoId) {
        return success(photoService.selectPhotoTByphotoId(photoId));
    }

    /**
     * 新增【请填写功能名称】
     */
    @RequiresPermissions("admin:photo:add")
    @Log(title = "图片管理", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    public AjaxResult add(@RequestBody PhotoT PhotoT) {
        return toAjax(photoService.insertPhotoT(PhotoT));
    }

    /**
     * 修改【请填写功能名称】
     */
    @RequiresPermissions("admin:photo:edit")
    @Log(title = "图片管理", businessType = BusinessType.UPDATE)
    @PostMapping("/update")
    public AjaxResult edit(@RequestBody PhotoT PhotoT) {
        return toAjax(photoService.updatePhotoT(PhotoT));
    }

    /**
     * 删除【请填写功能名称】
     */
    @RequiresPermissions("admin:photo:remove")
    @Log(title = "图片管理", businessType = BusinessType.DELETE)
    @PostMapping("/{photoIds}")
    public AjaxResult remove(@PathVariable Long[] photoIds) {
        return toAjax(photoService.deletePhotoTByphotoIds(photoIds));
    }

    @Log(title = "图片上传", businessType = BusinessType.UPDATE)
    @PostMapping("/upload")
    public AjaxResult photoUpload(@RequestParam("photoFile") MultipartFile photoFile,@RequestParam("photoName") String photoName) {
        System.out.println(photoName);
        if (!photoFile.isEmpty()) {
            String extension = FileTypeUtils.getExtension(photoFile);
            if (!StringUtils.equalsAnyIgnoreCase(extension, MimeTypeUtils.IMAGE_EXTENSION)) {
                return error("文件格式不正确，请上传" + Arrays.toString(MimeTypeUtils.IMAGE_EXTENSION) + "格式");
            }
            R<SysFile> fileResult = remoteFileService.upload(photoFile);
            if (StringUtils.isNull(fileResult) || StringUtils.isNull(fileResult.getData())) {
                return error("文件服务异常，请联系管理员");
            }
            String url = fileResult.getData().getUrl();
            AjaxResult ajax = AjaxResult.success();
            ajax.put("imgUrl", url);
            return ajax;
        }
        return error("上传图片异常，请联系管理员");
    }
}
