package com.dcis.frontier.service;

import com.dcis.frontier.models.Record;
import com.dcis.frontier.until.ResultObject;

import java.util.Map;

/**
 * @author 你的名字
 * @date 2019\10\6 0006 19:57
 */
public interface RecordService {
    ResultObject getRecord(Map map);

    ResultObject insertRecord(Record record);

    ResultObject deleteRecord(Record record);

    ResultObject updateRecord(Record record);

    ResultObject getRecordKey(Record record);

    ResultObject reviewRecord(Record record);

    ResultObject getRecordName();
}
