package com.dzh.mapper;

import com.dzh.pojo.GoodsInfo;
import com.dzh.vo.SelectComditionVo;

import java.util.List;

public interface GoodsInfoMapper {

    List<GoodsInfo> getAllGoodsInfo();

    List<GoodsInfo> getGoodsInfoBy(SelectComditionVo selectComditionVo);

    int delGoodsInfoById(int goodsId);
}
