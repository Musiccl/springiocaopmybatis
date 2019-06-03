package com.dzh.control;

import com.dzh.pojo.GoodsInfo;
import com.dzh.service.GoodsInfoService;
import com.dzh.vo.SelectComditionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GoodsInfoController {
    @Autowired
    GoodsInfoService goodsInfoService;

    @RequestMapping("getAllGoodsInfo")
    public Object getAllGoodsInfo() {
        return goodsInfoService.getAllGoodsInfo();
    }

    @RequestMapping("getGoodsInfoBy")
    public Object getGoodsInfoBy(@RequestBody SelectComditionVo selectComditionVo) {
        if (selectComditionVo==null) {
            return goodsInfoService.getAllGoodsInfo();
        }
        System.out.println(selectComditionVo);
        List<GoodsInfo> goodsInfoBy = goodsInfoService.getGoodsInfoBy(selectComditionVo);
        for (GoodsInfo goodsInfo : goodsInfoBy) {
            System.out.println(goodsInfo);
        }

        return goodsInfoService.getGoodsInfoBy(selectComditionVo);
    }

    @RequestMapping("delGoodsInfoByGoodsId")
    public Object getGoodsInfoBy(@RequestParam int goodsId) {
        return goodsInfoService.delGoodsInfoById(goodsId);
    }

}
