package com.project.model;

public class NoReadComplaintData {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column noreadcomplaintinfo_.complaintUserID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private Long complaintuserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column noreadcomplaintinfo_.complaintedUserID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private Long complainteduserid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column noreadcomplaintinfo_.complaintReason
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private String complaintreason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column noreadcomplaintinfo_.informationID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private Long informationid;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column noreadcomplaintinfo_.complaintUserID
     *
     * @return the value of noreadcomplaintinfo_.complaintUserID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Long getComplaintuserid() {
        return complaintuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column noreadcomplaintinfo_.complaintUserID
     *
     * @param complaintuserid the value for noreadcomplaintinfo_.complaintUserID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setComplaintuserid(Long complaintuserid) {
        this.complaintuserid = complaintuserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column noreadcomplaintinfo_.complaintedUserID
     *
     * @return the value of noreadcomplaintinfo_.complaintedUserID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Long getComplainteduserid() {
        return complainteduserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column noreadcomplaintinfo_.complaintedUserID
     *
     * @param complainteduserid the value for noreadcomplaintinfo_.complaintedUserID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setComplainteduserid(Long complainteduserid) {
        this.complainteduserid = complainteduserid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column noreadcomplaintinfo_.complaintReason
     *
     * @return the value of noreadcomplaintinfo_.complaintReason
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public String getComplaintreason() {
        return complaintreason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column noreadcomplaintinfo_.complaintReason
     *
     * @param complaintreason the value for noreadcomplaintinfo_.complaintReason
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setComplaintreason(String complaintreason) {
        this.complaintreason = complaintreason == null ? null : complaintreason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column noreadcomplaintinfo_.informationID
     *
     * @return the value of noreadcomplaintinfo_.informationID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Long getInformationid() {
        return informationid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column noreadcomplaintinfo_.informationID
     *
     * @param informationid the value for noreadcomplaintinfo_.informationID
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setInformationid(Long informationid) {
        this.informationid = informationid;
    }
}