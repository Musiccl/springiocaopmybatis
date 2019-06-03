package com.dzh.service;

import com.dzh.pojo.GoodsInfo;
import com.dzh.vo.SelectComditionVo;

import java.util.List;

public interface GoodsInfoService {

    List<GoodsInfo> getAllGoodsInfo();

    List<GoodsInfo> getGoodsInfoBy(SelectComditionVo selectComditionVo);

    int delGoodsInfoById(int goodsId);
}
