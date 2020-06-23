package com.dcis.frontier.dao;

import com.dcis.frontier.models.Goods;
import com.dcis.frontier.models.Record;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
import java.util.Map;

public interface RecordMapper extends Mapper<Record> {
    List<Map> getRecord(Map map);

    int reviewRecord(Record record);

    List<Map> getRecordName();

    Goods getGoodsInfoByName(Goods goods);

}