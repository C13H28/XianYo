package com.project.model;

public class SensitiveData {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensitiveinfo_.id
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensitiveinfo_.sensitiveWord
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private String sensitiveword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column sensitiveinfo_.sensitiveDegree
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    private Boolean sensitivedegree;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensitiveinfo_.id
     *
     * @return the value of sensitiveinfo_.id
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensitiveinfo_.id
     *
     * @param id the value for sensitiveinfo_.id
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensitiveinfo_.sensitiveWord
     *
     * @return the value of sensitiveinfo_.sensitiveWord
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public String getSensitiveword() {
        return sensitiveword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensitiveinfo_.sensitiveWord
     *
     * @param sensitiveword the value for sensitiveinfo_.sensitiveWord
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setSensitiveword(String sensitiveword) {
        this.sensitiveword = sensitiveword == null ? null : sensitiveword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column sensitiveinfo_.sensitiveDegree
     *
     * @return the value of sensitiveinfo_.sensitiveDegree
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public Boolean getSensitivedegree() {
        return sensitivedegree;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column sensitiveinfo_.sensitiveDegree
     *
     * @param sensitivedegree the value for sensitiveinfo_.sensitiveDegree
     *
     * @mbggenerated Fri Sep 08 10:01:11 CST 2017
     */
    public void setSensitivedegree(Boolean sensitivedegree) {
        this.sensitivedegree = sensitivedegree;
    }
}