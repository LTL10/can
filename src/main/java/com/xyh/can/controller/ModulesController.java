package com.xyh.can.controller;

import com.xyh.can.entity.Modules;
import com.xyh.can.service.ModulesService;
import com.xyh.can.vo.ModulesVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.apache.shiro.authz.annotation.RequiresAuthentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
@Api( value = "模块类",tags = "模块应用接口")

public class ModulesController {
    @Autowired
    ModulesService modulesService;
    @ApiOperation( value = "模块分页查询",notes = "根据模块扩展类ModulesVo动态查询模块信息")
    @PostMapping("/fenyeModules")
    public Map<String,Object> fenye(ModulesVo modulesvo){
        Map<String,Object> map=new HashMap<String,Object>();
        map.put("code",0);
        map.put("msg","");
        map.put("data",modulesService.fingpage(modulesvo));
        map.put("count",modulesService.Count(modulesvo));
        return map;
    }
    @ApiOperation( value = "添加模块",notes = "根据模块常用信息添加模块")
    @PostMapping("/tianjiaModules")
    public boolean addUser(Modules modules){
        int num= modulesService.addModules(modules);
        if (num>0){
            return true;
        }
        return  false;
    }
    @ApiOperation( value = "修改模块",notes = "根据模块变动信息修改模块")
    @PostMapping("/xiugaiModules")
    public boolean updateUser(Modules modules){
        int num= modulesService.updateModules(modules);
        if (num>0){
            return true;
        }
        return  false;
    }
    @ApiOperation( value = "删除模块",notes = "根据模块Id删除模块")
    @PostMapping("/shanchuModules")
    public boolean delUser(Integer m_Id){
        int num= modulesService.delModules(m_Id);
        if (num>0){
            return true;
        }
        return  false;
    }
}
