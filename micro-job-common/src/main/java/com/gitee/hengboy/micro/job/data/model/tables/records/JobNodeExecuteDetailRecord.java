/*
 * This file is generated by jOOQ.
 */
package com.gitee.hengboy.micro.job.data.model.tables.records;


import com.gitee.hengboy.micro.job.data.model.tables.JobNodeExecuteDetail;
import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record10;
import org.jooq.Row10;
import org.jooq.impl.UpdatableRecordImpl;

import javax.annotation.Generated;
import java.sql.Timestamp;


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
public class JobNodeExecuteDetailRecord extends UpdatableRecordImpl<JobNodeExecuteDetailRecord> implements Record10<Integer, String, String, String, String, Timestamp, Integer, Timestamp, String, String> {

    private static final long serialVersionUID = -949910423;

    /**
     * Setter for <code>fission.job_node_execute_detail.NED_ID</code>. 主键自增
     */
    public void setNedId(Integer value) {
        set(0, value);
    }

    /**
     * Getter for <code>fission.job_node_execute_detail.NED_ID</code>. 主键自增
     */
    public Integer getNedId() {
        return (Integer) get(0);
    }

    /**
     * Setter for <code>fission.job_node_execute_detail.NED_TRIGGER_KEY</code>. 任务触发器key
     */
    public void setNedTriggerKey(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>fission.job_node_execute_detail.NED_TRIGGER_KEY</code>. 任务触发器key
     */
    public String getNedTriggerKey() {
        return (String) get(1);
    }

    /**
     * Setter for <code>fission.job_node_execute_detail.NED_NODE_ADDRESS</code>. 任务节点地址
     */
    public void setNedNodeAddress(String value) {
        set(2, value);
    }

    /**
     * Getter for <code>fission.job_node_execute_detail.NED_NODE_ADDRESS</code>. 任务节点地址
     */
    public String getNedNodeAddress() {
        return (String) get(2);
    }

    /**
     * Setter for <code>fission.job_node_execute_detail.NED_LD_STRATEGY</code>. 任务负载策略
     */
    public void setNedLdStrategy(String value) {
        set(3, value);
    }

    /**
     * Getter for <code>fission.job_node_execute_detail.NED_LD_STRATEGY</code>. 任务负载策略
     */
    public String getNedLdStrategy() {
        return (String) get(3);
    }

    /**
     * Setter for <code>fission.job_node_execute_detail.NED_PARAM</code>. 任务执行参数
     */
    public void setNedParam(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>fission.job_node_execute_detail.NED_PARAM</code>. 任务执行参数
     */
    public String getNedParam() {
        return (String) get(4);
    }

    /**
     * Setter for <code>fission.job_node_execute_detail.NED_START_TIME</code>. 任务开始时间
     */
    public void setNedStartTime(Timestamp value) {
        set(5, value);
    }

    /**
     * Getter for <code>fission.job_node_execute_detail.NED_START_TIME</code>. 任务开始时间
     */
    public Timestamp getNedStartTime() {
        return (Timestamp) get(5);
    }

    /**
     * Setter for <code>fission.job_node_execute_detail.NED_RETRY_COUNT</code>. 重试次数
     */
    public void setNedRetryCount(Integer value) {
        set(6, value);
    }

    /**
     * Getter for <code>fission.job_node_execute_detail.NED_RETRY_COUNT</code>. 重试次数
     */
    public Integer getNedRetryCount() {
        return (Integer) get(6);
    }

    /**
     * Setter for <code>fission.job_node_execute_detail.NED_SUCCESS_TIME</code>. 执行完成时间
     */
    public void setNedSuccessTime(Timestamp value) {
        set(7, value);
    }

    /**
     * Getter for <code>fission.job_node_execute_detail.NED_SUCCESS_TIME</code>. 执行完成时间
     */
    public Timestamp getNedSuccessTime() {
        return (Timestamp) get(7);
    }

    /**
     * Setter for <code>fission.job_node_execute_detail.NED_STATUS</code>. 任务执行状态，SUCCESS：执行成功,ERROR：执行失败,RETRY：重试，WAIT：等待执行
     */
    public void setNedStatus(String value) {
        set(8, value);
    }

    /**
     * Getter for <code>fission.job_node_execute_detail.NED_STATUS</code>. 任务执行状态，SUCCESS：执行成功,ERROR：执行失败,RETRY：重试，WAIT：等待执行
     */
    public String getNedStatus() {
        return (String) get(8);
    }

    /**
     * Setter for <code>fission.job_node_execute_detail.NED_MARK</code>. 备注信息
     */
    public void setNedMark(String value) {
        set(9, value);
    }

    /**
     * Getter for <code>fission.job_node_execute_detail.NED_MARK</code>. 备注信息
     */
    public String getNedMark() {
        return (String) get(9);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<Integer> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record10 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Timestamp, Integer, Timestamp, String, String> fieldsRow() {
        return (Row10) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row10<Integer, String, String, String, String, Timestamp, Integer, Timestamp, String, String> valuesRow() {
        return (Row10) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field1() {
        return JobNodeExecuteDetail.NED_ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return JobNodeExecuteDetail.NED_TRIGGER_KEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field3() {
        return JobNodeExecuteDetail.NED_NODE_ADDRESS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field4() {
        return JobNodeExecuteDetail.NED_LD_STRATEGY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return JobNodeExecuteDetail.NED_PARAM;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field6() {
        return JobNodeExecuteDetail.NED_START_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Integer> field7() {
        return JobNodeExecuteDetail.NED_RETRY_COUNT;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field8() {
        return JobNodeExecuteDetail.NED_SUCCESS_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field9() {
        return JobNodeExecuteDetail.NED_STATUS;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field10() {
        return JobNodeExecuteDetail.NED_MARK;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component1() {
        return getNedId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component2() {
        return getNedTriggerKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component3() {
        return getNedNodeAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component4() {
        return getNedLdStrategy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component5() {
        return getNedParam();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component6() {
        return getNedStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer component7() {
        return getNedRetryCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp component8() {
        return getNedSuccessTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component9() {
        return getNedStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String component10() {
        return getNedMark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value1() {
        return getNedId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getNedTriggerKey();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value3() {
        return getNedNodeAddress();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value4() {
        return getNedLdStrategy();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getNedParam();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value6() {
        return getNedStartTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Integer value7() {
        return getNedRetryCount();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value8() {
        return getNedSuccessTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value9() {
        return getNedStatus();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value10() {
        return getNedMark();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobNodeExecuteDetailRecord value1(Integer value) {
        setNedId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobNodeExecuteDetailRecord value2(String value) {
        setNedTriggerKey(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobNodeExecuteDetailRecord value3(String value) {
        setNedNodeAddress(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobNodeExecuteDetailRecord value4(String value) {
        setNedLdStrategy(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobNodeExecuteDetailRecord value5(String value) {
        setNedParam(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobNodeExecuteDetailRecord value6(Timestamp value) {
        setNedStartTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobNodeExecuteDetailRecord value7(Integer value) {
        setNedRetryCount(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobNodeExecuteDetailRecord value8(Timestamp value) {
        setNedSuccessTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobNodeExecuteDetailRecord value9(String value) {
        setNedStatus(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobNodeExecuteDetailRecord value10(String value) {
        setNedMark(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public JobNodeExecuteDetailRecord values(Integer value1, String value2, String value3, String value4, String value5, Timestamp value6, Integer value7, Timestamp value8, String value9, String value10) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        value10(value10);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached JobNodeExecuteDetailRecord
     */
    public JobNodeExecuteDetailRecord() {
        super(JobNodeExecuteDetail.JOB_NODE_EXECUTE_DETAIL);
    }

    /**
     * Create a detached, initialised JobNodeExecuteDetailRecord
     */
    public JobNodeExecuteDetailRecord(Integer nedId, String nedTriggerKey, String nedNodeAddress, String nedLdStrategy, String nedParam, Timestamp nedStartTime, Integer nedRetryCount, Timestamp nedSuccessTime, String nedStatus, String nedMark) {
        super(JobNodeExecuteDetail.JOB_NODE_EXECUTE_DETAIL);

        set(0, nedId);
        set(1, nedTriggerKey);
        set(2, nedNodeAddress);
        set(3, nedLdStrategy);
        set(4, nedParam);
        set(5, nedStartTime);
        set(6, nedRetryCount);
        set(7, nedSuccessTime);
        set(8, nedStatus);
        set(9, nedMark);
    }
}
