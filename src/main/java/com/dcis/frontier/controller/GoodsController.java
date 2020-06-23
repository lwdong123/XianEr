package com.dcis.frontier.controller;

import com.dcis.frontier.models.ClientMember;
import com.dcis.frontier.models.Goods;
import com.dcis.frontier.service.GoodsService;
import com.dcis.frontier.until.ResultObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:16
 */
@Controller
@CrossOrigin
@RequestMapping("/GoodsController")
@ResponseBody
public class GoodsController {
    @Autowired
    GoodsService goodsService;
    @RequestMapping("/getDname")
    @ResponseBody
    public ResultObject getDname(@RequestBody Map map){
        return goodsService.getDname(map);
    }

    @RequestMapping("/insertGoods")
    @ResponseBody
    public ResultObject insertClientInfo(@RequestBody Goods goods){
        return goodsService.insertGoods(goods);
    }

    @RequestMapping("/deleteGoods")
    @ResponseBody
    public ResultObject deleteClientInfo(@RequestBody Goods goods){
        return goodsService.deleteGoods(goods);
    }

    @RequestMapping("/updateGoods")
    @ResponseBody
    public ResultObject updateClientInfo(@RequestBody Goods goods){
        return goodsService.updateGoods(goods);
    }

    @RequestMapping("/getGoodsKey")
    @ResponseBody
    public ResultObject getGoodsKey(@RequestBody Goods goods){
        return goodsService.getMemberKey(goods);
    }
    @RequestMapping("/getGoodsInfoByName")
    @ResponseBody
    public ResultObject getGoodsInfoByName(@RequestBody Goods goods){
        return goodsService.getGoodsInfoByName(goods);
    }
}
