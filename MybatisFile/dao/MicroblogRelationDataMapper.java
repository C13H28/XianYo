package com.project.dao;

import com.project.model.MicroblogRelationData;
import com.project.model.MicroblogRelationDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MicroblogRelationDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microblogrelation_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int countByExample(MicroblogRelationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microblogrelation_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int deleteByExample(MicroblogRelationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microblogrelation_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microblogrelation_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insert(MicroblogRelationData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microblogrelation_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insertSelective(MicroblogRelationData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microblogrelation_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    List<MicroblogRelationData> selectByExample(MicroblogRelationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microblogrelation_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    MicroblogRelationData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microblogrelation_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") MicroblogRelationData record, @Param("example") MicroblogRelationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microblogrelation_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExample(@Param("record") MicroblogRelationData record, @Param("example") MicroblogRelationDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microblogrelation_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByPrimaryKeySelective(MicroblogRelationData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table microblogrelation_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByPrimaryKey(MicroblogRelationData record);
}