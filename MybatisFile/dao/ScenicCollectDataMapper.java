package com.project.dao;

import com.project.model.ScenicCollectData;
import com.project.model.ScenicCollectDataExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicCollectDataMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sceniccollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int countByExample(ScenicCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sceniccollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int deleteByExample(ScenicCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sceniccollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sceniccollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insert(ScenicCollectData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sceniccollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int insertSelective(ScenicCollectData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sceniccollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    List<ScenicCollectData> selectByExample(ScenicCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sceniccollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    ScenicCollectData selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sceniccollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExampleSelective(@Param("record") ScenicCollectData record, @Param("example") ScenicCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sceniccollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByExample(@Param("record") ScenicCollectData record, @Param("example") ScenicCollectDataExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sceniccollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByPrimaryKeySelective(ScenicCollectData record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table sceniccollect_
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    int updateByPrimaryKey(ScenicCollectData record);
}