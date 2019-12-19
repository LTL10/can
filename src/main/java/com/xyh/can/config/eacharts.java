package com.xyh.can.config;

import com.xyh.can.service.Consumption_PageVoService;
import com.xyh.can.vo.Consumption_PageVo;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
@Api(value = "图表")
@RestController
public class eacharts {

    @Resource
    private Consumption_PageVoService consumption_pageVoService;


    @PostMapping("/GetFive")
    @ResponseBody
    public List<Map<String, Object>> GetFive() {
        List<Consumption_PageVo> list = consumption_pageVoService.eacharts();
        List<Map<String, Object>> maps = new ArrayList<Map<String, Object>>();
        for (int i = 0; i < list.size(); i++) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("Sun", list.get(i).getSumPrice());
            map.put("getS_name", list.get(i).getO_CreateTime());
            maps.add(map);
        }
        return maps;
    }
}
