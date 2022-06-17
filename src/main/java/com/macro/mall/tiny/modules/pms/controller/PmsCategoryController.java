package com.macro.mall.tiny.modules.pms.controller;


import com.macro.mall.tiny.common.api.CommonResult;
import com.macro.mall.tiny.modules.pms.model.PmsCategory;
import com.macro.mall.tiny.modules.pms.service.PmsCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * <p>
 * 类目表 前端控制器
 * </p>
 *
 * @author macro
 * @since 2022-06-17
 */
@RestController
@Api(tags = "PmsCategoryController", description = "商品类目管理")
@RequestMapping("/pmsCategory")
public class PmsCategoryController {

    @Autowired
    PmsCategoryService categoryService;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ApiOperation("查看所有类目")
    public CommonResult<List<PmsCategory>> list() {
        List<PmsCategory> list = categoryService.list();
        return CommonResult.success(list);
    }

}

