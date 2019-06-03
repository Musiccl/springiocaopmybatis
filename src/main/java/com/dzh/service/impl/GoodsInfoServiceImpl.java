package com.dzh.service.impl;

import com.dzh.mapper.GoodsInfoMapper;
import com.dzh.pojo.GoodsInfo;
import com.dzh.service.GoodsInfoService;
import com.dzh.vo.SelectComditionVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsInfoServiceImpl implements GoodsInfoService {

    @Autowired
    GoodsInfoMapper goodsInfoMapper;
    public List<GoodsInfo> getAllGoodsInfo() {
        return goodsInfoMapper.getAllGoodsInfo();
    }

    public List<GoodsInfo> getGoodsInfoBy(SelectComditionVo selectComditionVo) {
        return goodsInfoMapper.getGoodsInfoBy(selectComditionVo);
    }

    public int delGoodsInfoById(int goodsId) {
        return goodsInfoMapper.delGoodsInfoById(goodsId);
    }
}
