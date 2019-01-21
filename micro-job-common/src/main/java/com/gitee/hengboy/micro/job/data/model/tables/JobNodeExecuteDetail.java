/*
 * This file is generated by jOOQ.
 */
package com.gitee.hengboy.micro.job.data.model.tables;


import com.gitee.hengboy.micro.job.data.model.Indexes;
import com.gitee.hengboy.micro.job.data.model.Keys;
import com.gitee.hengboy.micro.job.data.model.tables.records.JobNodeExecuteDetailRecord;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.jooq.impl.TableImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;


/**
 * 任务执行详情信息表
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.11.7"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class JobNodeExecuteDetail extends TableImpl<JobNodeExecuteDetailRecord> {

    private static final long serialVersionUID = 2143977185;

    /**
     * The reference instance of <code>fission.job_node_execute_detail</code>
     */
    public static final JobNodeExecuteDetail JOB_NODE_EXECUTE_DETAIL = new JobNodeExecuteDetail();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<JobNodeExecuteDetailRecord> getRecordType() {
        return JobNodeExecuteDetailRecord.class;
    }

    /**
     * The column <code>fission.job_node_execute_detail.NED_ID</code>. 主键自增
     */
    public static final TableField<JobNodeExecuteDetailRecord, Integer> NED_ID = createField("NED_ID", org.jooq.impl.SQLDataType.INTEGER.nullable(false).identity(true), JOB_NODE_EXECUTE_DETAIL, "主键自增");

    /**
     * The column <code>fission.job_node_execute_detail.NED_TRIGGER_KEY</code>. 任务触发器key
     */
    public static final TableField<JobNodeExecuteDetailRecord, String> NED_TRIGGER_KEY = createField("NED_TRIGGER_KEY", org.jooq.impl.SQLDataType.VARCHAR(100), JOB_NODE_EXECUTE_DETAIL, "任务触发器key");

    /**
     * The column <code>fission.job_node_execute_detail.NED_NODE_ADDRESS</code>. 任务节点地址
     */
    public static final TableField<JobNodeExecuteDetailRecord, String> NED_NODE_ADDRESS = createField("NED_NODE_ADDRESS", org.jooq.impl.SQLDataType.VARCHAR(30), JOB_NODE_EXECUTE_DETAIL, "任务节点地址");

    /**
     * The column <code>fission.job_node_execute_detail.NED_LD_STRATEGY</code>. 任务负载策略
     */
    public static final TableField<JobNodeExecuteDetailRecord, String> NED_LD_STRATEGY = createField("NED_LD_STRATEGY", org.jooq.impl.SQLDataType.VARCHAR(30), JOB_NODE_EXECUTE_DETAIL, "任务负载策略");

    /**
     * The column <code>fission.job_node_execute_detail.NED_PARAM</code>. 任务执行参数
     */
    public static final TableField<JobNodeExecuteDetailRecord, String> NED_PARAM = createField("NED_PARAM", org.jooq.impl.SQLDataType.CLOB, JOB_NODE_EXECUTE_DETAIL, "任务执行参数");

    /**
     * The column <code>fission.job_node_execute_detail.NED_START_TIME</code>. 任务开始时间
     */
    public static final TableField<JobNodeExecuteDetailRecord, Timestamp> NED_START_TIME = createField("NED_START_TIME", org.jooq.impl.SQLDataType.TIMESTAMP.defaultValue(DSL.field("CURRENT_TIMESTAMP", org.jooq.impl.SQLDataType.TIMESTAMP)), JOB_NODE_EXECUTE_DETAIL, "任务开始时间");

    /**
     * The column <code>fission.job_node_execute_detail.NED_RETRY_COUNT</code>. 重试次数
     */
    public static final TableField<JobNodeExecuteDetailRecord, Integer> NED_RETRY_COUNT = createField("NED_RETRY_COUNT", org.jooq.impl.SQLDataType.INTEGER.defaultValue(DSL.inline("0", org.jooq.impl.SQLDataType.INTEGER)), JOB_NODE_EXECUTE_DETAIL, "重试次数");

    /**
     * The column <code>fission.job_node_execute_detail.NED_SUCCESS_TIME</code>. 执行完成时间
     */
    public static final TableField<JobNodeExecuteDetailRecord, Timestamp> NED_SUCCESS_TIME = createField("NED_SUCCESS_TIME", org.jooq.impl.SQLDataType.TIMESTAMP, JOB_NODE_EXECUTE_DETAIL, "执行完成时间");

    /**
     * The column <code>fission.job_node_execute_detail.NED_STATUS</code>. 任务执行状态，SUCCESS：执行成功,ERROR：执行失败,RETRY：重试，WAIT：等待执行
     */
    public static final TableField<JobNodeExecuteDetailRecord, String> NED_STATUS = createField("NED_STATUS", org.jooq.impl.SQLDataType.VARCHAR(20).defaultValue(DSL.inline("WAIT", org.jooq.impl.SQLDataType.VARCHAR)), JOB_NODE_EXECUTE_DETAIL, "任务执行状态，SUCCESS：执行成功,ERROR：执行失败,RETRY：重试，WAIT：等待执行");

    /**
     * The column <code>fission.job_node_execute_detail.NED_MARK</code>. 备注信息
     */
    public static final TableField<JobNodeExecuteDetailRecord, String> NED_MARK = createField("NED_MARK", org.jooq.impl.SQLDataType.VARCHAR(200), JOB_NODE_EXECUTE_DETAIL, "备注信息");

    /**
     * No further instances allowed
     */
    private JobNodeExecuteDetail() {
        this(DSL.name("job_node_execute_detail"), null);
    }

    private JobNodeExecuteDetail(Name alias, Table<JobNodeExecuteDetailRecord> aliased) {
        this(alias, aliased, null);
    }

    private JobNodeExecuteDetail(Name alias, Table<JobNodeExecuteDetailRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, DSL.comment("任务执行详情信息表"));
    }

    public <O extends Record> JobNodeExecuteDetail(Table<O> child, ForeignKey<O, JobNodeExecuteDetailRecord> key) {
        super(child, key, JOB_NODE_EXECUTE_DETAIL);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public List<Index> getIndexes() {
        return Arrays.<Index>asList(Indexes.JOB_NODE_EXECUTE_DETAIL_PRIMARY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Identity<JobNodeExecuteDetailRecord, Integer> getIdentity() {
        return Keys.IDENTITY_JOB_NODE_EXECUTE_DETAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<JobNodeExecuteDetailRecord> getPrimaryKey() {
        return Keys.KEY_JOB_NODE_EXECUTE_DETAIL_PRIMARY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<JobNodeExecuteDetailRecord>> getKeys() {
        return Arrays.<UniqueKey<JobNodeExecuteDetailRecord>>asList(Keys.KEY_JOB_NODE_EXECUTE_DETAIL_PRIMARY);
    }
}