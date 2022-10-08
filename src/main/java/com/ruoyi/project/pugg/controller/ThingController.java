package com.ruoyi.project.pugg.controller;

import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.framework.web.page.TableDataInfo;
import com.ruoyi.project.pugg.domain.Thing;
import com.ruoyi.project.pugg.service.IThingService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * thingController
 * 
 * @author ruoyi
 * @date 2022-10-08
 */
@Controller
@RequestMapping("/pugg/thing")
public class ThingController extends BaseController
{
    private String prefix = "pugg/thing";

    @Autowired
    private IThingService thingService;


    @GetMapping()
    public String thing()
    {
        return prefix + "/thing";
    }

    /**
     * 查询thing列表
     */

    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(Thing thing)
    {
        startPage();
        List<Thing> list = thingService.selectThingList(thing);
        return getDataTable(list);
    }

    /**
     * 导出thing列表
     */
    @RequiresPermissions("system:thing:export")
    @Log(title = "thing", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(Thing thing)
    {
        List<Thing> list = thingService.selectThingList(thing);
        ExcelUtil<Thing> util = new ExcelUtil<Thing>(Thing.class);
        return util.exportExcel(list, "thing数据");
    }

    /**
     * 新增thing
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存thing
     */
    @RequiresPermissions("system:thing:add")
    @Log(title = "thing", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Thing thing)
    {
        return toAjax(thingService.insertThing(thing));
    }

    /**
     * 修改thing
     */

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Thing thing = thingService.selectThingById(id);
        mmap.put("thing", thing);
        return prefix + "/edit";
    }

    /**
     * 修改保存thing
     */
    @RequiresPermissions("system:thing:edit")
    @Log(title = "thing", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Thing thing)
    {
        return toAjax(thingService.updateThing(thing));
    }

    /**
     * 删除thing
     */
    @RequiresPermissions("system:thing:remove")
    @Log(title = "thing", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(thingService.deleteThingByIds(ids));
    }
}
