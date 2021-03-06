package com.project.dao;

import com.project.model.AnswerCollectData;
import com.project.model.AnswerCollectDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AnswerCollectDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answercollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int countByExample(AnswerCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answercollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int deleteByExample(AnswerCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answercollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answercollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insert(AnswerCollectData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answercollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insertSelective(AnswerCollectData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answercollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    List<AnswerCollectData> selectByExample(AnswerCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answercollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    AnswerCollectData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answercollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") AnswerCollectData record, @Param("example") AnswerCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answercollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExample(@Param("record") AnswerCollectData record, @Param("example") AnswerCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answercollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByPrimaryKeySelective(AnswerCollectData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table answercollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByPrimaryKey(AnswerCollectData record);
}