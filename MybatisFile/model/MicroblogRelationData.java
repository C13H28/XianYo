package com.project.model;

public class MicroblogRelationData {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column microblogrelation_.id
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column microblogrelation_.userid
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private Long userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column microblogrelation_.microblogid
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private Long microblogid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column microblogrelation_.id
     *
     * @return the value of microblogrelation_.id
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column microblogrelation_.id
     *
     * @param id the value for microblogrelation_.id
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column microblogrelation_.userid
     *
     * @return the value of microblogrelation_.userid
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Long getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column microblogrelation_.userid
     *
     * @param userid the value for microblogrelation_.userid
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setUserid(Long userid) {
        this.userid = userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column microblogrelation_.microblogid
     *
     * @return the value of microblogrelation_.microblogid
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Long getMicroblogid() {
        return microblogid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column microblogrelation_.microblogid
     *
     * @param microblogid the value for microblogrelation_.microblogid
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setMicroblogid(Long microblogid) {
        this.microblogid = microblogid;
    }
}