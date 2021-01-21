package com.webank.webase.data.collect.dao.mapper;

import com.webank.webase.data.collect.dao.entity.TbEventExportTask;
import com.webank.webase.data.collect.dao.entity.TbEventExportTaskExample;
import com.webank.webase.data.collect.dao.entity.TbEventExportTaskExample.Criteria;
import com.webank.webase.data.collect.dao.entity.TbEventExportTaskExample.Criterion;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.jdbc.SQL;

public class TbEventExportTaskSqlProvider {

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    public static final String ALL_COLUMN_FIELDS = "id,chain_id,group_id,contract_name,contract_address,event_name,block_number,task_status,create_time,modify_time";

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    public String countByExample(TbEventExportTaskExample example) {
        SQL sql = new SQL();
        sql.SELECT("count(*)").FROM("tb_event_export_task");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    public String deleteByExample(TbEventExportTaskExample example) {
        SQL sql = new SQL();
        sql.DELETE_FROM("tb_event_export_task");
        applyWhere(sql, example, false);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    public String insertSelective(TbEventExportTask record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("tb_event_export_task");
        if (record.getChainId() != null) {
            sql.VALUES("chain_id", "#{chainId,jdbcType=INTEGER}");
        }
        if (record.getGroupId() != null) {
            sql.VALUES("group_id", "#{groupId,jdbcType=INTEGER}");
        }
        if (record.getContractName() != null) {
            sql.VALUES("contract_name", "#{contractName,jdbcType=VARCHAR}");
        }
        if (record.getContractAddress() != null) {
            sql.VALUES("contract_address", "#{contractAddress,jdbcType=VARCHAR}");
        }
        if (record.getEventName() != null) {
            sql.VALUES("event_name", "#{eventName,jdbcType=VARCHAR}");
        }
        if (record.getBlockNumber() != null) {
            sql.VALUES("block_number", "#{blockNumber,jdbcType=BIGINT}");
        }
        if (record.getTaskStatus() != null) {
            sql.VALUES("task_status", "#{taskStatus,jdbcType=TINYINT}");
        }
        if (record.getCreateTime() != null) {
            sql.VALUES("create_time", "#{createTime,jdbcType=TIMESTAMP}");
        }
        if (record.getModifyTime() != null) {
            sql.VALUES("modify_time", "#{modifyTime,jdbcType=TIMESTAMP}");
        }
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    public String selectByExample(TbEventExportTaskExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("chain_id");
        sql.SELECT("group_id");
        sql.SELECT("contract_name");
        sql.SELECT("contract_address");
        sql.SELECT("event_name");
        sql.SELECT("block_number");
        sql.SELECT("task_status");
        sql.SELECT("create_time");
        sql.SELECT("modify_time");
        sql.FROM("tb_event_export_task");
        applyWhere(sql, example, false);
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        // add pagination for mysql with limit clause 
        StringBuilder sqlBuilder = new StringBuilder(sql.toString());
        if (example != null && (example.getStart() > -1 || example.getCount() > -1)) {
            sqlBuilder.append(" limit ");
            if (example.getStart() > -1 && example.getCount() > -1) {
                sqlBuilder.append(example.getStart()).append(",").append(example.getCount());
            } else if (example.getStart() > -1) {
                sqlBuilder.append(example.getStart());
            } else if (example.getCount() > -1) {
                sqlBuilder.append(example.getCount());
            }
        }
        return sqlBuilder.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        TbEventExportTask record = (TbEventExportTask) parameter.get("record");
        TbEventExportTaskExample example = (TbEventExportTaskExample) parameter.get("example");
        SQL sql = new SQL();
        sql.UPDATE("tb_event_export_task");
        if (record.getId() != null) {
            sql.SET("id = #{record.id,jdbcType=INTEGER}");
        }
        if (record.getChainId() != null) {
            sql.SET("chain_id = #{record.chainId,jdbcType=INTEGER}");
        }
        if (record.getGroupId() != null) {
            sql.SET("group_id = #{record.groupId,jdbcType=INTEGER}");
        }
        if (record.getContractName() != null) {
            sql.SET("contract_name = #{record.contractName,jdbcType=VARCHAR}");
        }
        if (record.getContractAddress() != null) {
            sql.SET("contract_address = #{record.contractAddress,jdbcType=VARCHAR}");
        }
        if (record.getEventName() != null) {
            sql.SET("event_name = #{record.eventName,jdbcType=VARCHAR}");
        }
        if (record.getBlockNumber() != null) {
            sql.SET("block_number = #{record.blockNumber,jdbcType=BIGINT}");
        }
        if (record.getTaskStatus() != null) {
            sql.SET("task_status = #{record.taskStatus,jdbcType=TINYINT}");
        }
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        }
        if (record.getModifyTime() != null) {
            sql.SET("modify_time = #{record.modifyTime,jdbcType=TIMESTAMP}");
        }
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    public String updateByExample(Map<String, Object> parameter) {
        SQL sql = new SQL();
        sql.UPDATE("tb_event_export_task");
        sql.SET("id = #{record.id,jdbcType=INTEGER}");
        sql.SET("chain_id = #{record.chainId,jdbcType=INTEGER}");
        sql.SET("group_id = #{record.groupId,jdbcType=INTEGER}");
        sql.SET("contract_name = #{record.contractName,jdbcType=VARCHAR}");
        sql.SET("contract_address = #{record.contractAddress,jdbcType=VARCHAR}");
        sql.SET("event_name = #{record.eventName,jdbcType=VARCHAR}");
        sql.SET("block_number = #{record.blockNumber,jdbcType=BIGINT}");
        sql.SET("task_status = #{record.taskStatus,jdbcType=TINYINT}");
        sql.SET("create_time = #{record.createTime,jdbcType=TIMESTAMP}");
        sql.SET("modify_time = #{record.modifyTime,jdbcType=TIMESTAMP}");
        TbEventExportTaskExample example = (TbEventExportTaskExample) parameter.get("example");
        applyWhere(sql, example, true);
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    public String updateByPrimaryKeySelective(TbEventExportTask record) {
        SQL sql = new SQL();
        sql.UPDATE("tb_event_export_task");
        if (record.getChainId() != null) {
            sql.SET("chain_id = #{chainId,jdbcType=INTEGER}");
        }
        if (record.getGroupId() != null) {
            sql.SET("group_id = #{groupId,jdbcType=INTEGER}");
        }
        if (record.getContractName() != null) {
            sql.SET("contract_name = #{contractName,jdbcType=VARCHAR}");
        }
        if (record.getContractAddress() != null) {
            sql.SET("contract_address = #{contractAddress,jdbcType=VARCHAR}");
        }
        if (record.getEventName() != null) {
            sql.SET("event_name = #{eventName,jdbcType=VARCHAR}");
        }
        if (record.getBlockNumber() != null) {
            sql.SET("block_number = #{blockNumber,jdbcType=BIGINT}");
        }
        if (record.getTaskStatus() != null) {
            sql.SET("task_status = #{taskStatus,jdbcType=TINYINT}");
        }
        if (record.getCreateTime() != null) {
            sql.SET("create_time = #{createTime,jdbcType=TIMESTAMP}");
        }
        if (record.getModifyTime() != null) {
            sql.SET("modify_time = #{modifyTime,jdbcType=TIMESTAMP}");
        }
        sql.WHERE("id = #{id,jdbcType=INTEGER}");
        return sql.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    protected void applyWhere(SQL sql, TbEventExportTaskExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        if (sb.length() > 0) {
            sql.WHERE(sb.toString());
        }
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table tb_event_export_task
     *
     * @mbg.generated
     */
    public String getOneByExample(TbEventExportTaskExample example) {
        SQL sql = new SQL();
        if (example != null && example.isDistinct()) {
            sql.SELECT_DISTINCT("id");
        } else {
            sql.SELECT("id");
        }
        sql.SELECT("chain_id");
        sql.SELECT("group_id");
        sql.SELECT("contract_name");
        sql.SELECT("contract_address");
        sql.SELECT("event_name");
        sql.SELECT("block_number");
        sql.SELECT("task_status");
        sql.SELECT("create_time");
        sql.SELECT("modify_time");
        sql.FROM("tb_event_export_task");
        applyWhere(sql, example, false);
        if (example != null && example.getOrderByClause() != null) {
            sql.ORDER_BY(example.getOrderByClause());
        }
        StringBuilder sqlBuilder = new StringBuilder(sql.toString());
        sqlBuilder.append(" limit 1 ");
        return sqlBuilder.toString();
    }
}