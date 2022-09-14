package com.ruoyi.project.pugg.controller;

import java.util.List;
import java.util.Map;

import com.ruoyi.project.pugg.domain.Thing;
import com.ruoyi.project.pugg.service.IThingService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.ruoyi.framework.aspectj.lang.annotation.Log;
import com.ruoyi.framework.aspectj.lang.enums.BusinessType;
import com.ruoyi.framework.web.controller.BaseController;
import com.ruoyi.framework.web.domain.AjaxResult;
import com.ruoyi.common.utils.poi.ExcelUtil;
import com.ruoyi.framework.web.page.TableDataInfo;

/**
 * 【请填写功能名称】Controller
 * 
 * @author ruoyi
 * @date 2022-09-14
 */
@Controller
@RequestMapping("/pugg/thing")
public class ThingController extends BaseController
{
    private String prefix = "pugg";

    @Autowired
    private IThingService thingService;

    @GetMapping()
    public String thing()
    {
        return prefix + "/thingList";
    }

    /**
     * 查询【请填写功能名称】列表
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
     * 新增【请填写功能名称】
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存【请填写功能名称】
     */

    @Log(title = "【请填写功能名称】", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(Thing thing)
    {
        return toAjax(thingService.insertThing(thing));
    }

    /**
     * 修改【请填写功能名称】
     */

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Long id, ModelMap mmap)
    {
        Thing thing = thingService.selectThingById(id);
        mmap.put("thing", thing);
        return prefix + "/edit";
    }

    /**
     * 修改保存【请填写功能名称】
     */

    @Log(title = "【请填写功能名称】", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(Thing thing)
    {
        return toAjax(thingService.updateThing(thing));
    }

    /**
     * 删除【请填写功能名称】
     */

    @Log(title = "【请填写功能名称】", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(thingService.deleteThingByIds(ids));
    }
}
