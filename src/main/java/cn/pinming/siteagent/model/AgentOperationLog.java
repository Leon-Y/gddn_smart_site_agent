package cn.pinming.siteagent.model;

import java.util.Date;

public class AgentOperationLog {
    private Integer id;

    private Integer operationUserId;

    private Integer operationCompanyId;

    private Integer operationProjectId;

    private String operationUserName;

    private String operationCompanyName;

    private String operationProjectName;

    private Byte operationType;

    private Byte operationTypeDetail;

    private String operationRemark;

    private Date timestampCreate;

    private Date timestampModify;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOperationUserId() {
        return operationUserId;
    }

    public void setOperationUserId(Integer operationUserId) {
        this.operationUserId = operationUserId;
    }

    public Integer getOperationCompanyId() {
        return operationCompanyId;
    }

    public void setOperationCompanyId(Integer operationCompanyId) {
        this.operationCompanyId = operationCompanyId;
    }

    public Integer getOperationProjectId() {
        return operationProjectId;
    }

    public void setOperationProjectId(Integer operationProjectId) {
        this.operationProjectId = operationProjectId;
    }

    public String getOperationUserName() {
        return operationUserName;
    }

    public void setOperationUserName(String operationUserName) {
        this.operationUserName = operationUserName == null ? null : operationUserName.trim();
    }

    public String getOperationCompanyName() {
        return operationCompanyName;
    }

    public void setOperationCompanyName(String operationCompanyName) {
        this.operationCompanyName = operationCompanyName == null ? null : operationCompanyName.trim();
    }

    public String getOperationProjectName() {
        return operationProjectName;
    }

    public void setOperationProjectName(String operationProjectName) {
        this.operationProjectName = operationProjectName == null ? null : operationProjectName.trim();
    }

    public Byte getOperationType() {
        return operationType;
    }

    public void setOperationType(Byte operationType) {
        this.operationType = operationType;
    }

    public Byte getOperationTypeDetail() {
        return operationTypeDetail;
    }

    public void setOperationTypeDetail(Byte operationTypeDetail) {
        this.operationTypeDetail = operationTypeDetail;
    }

    public String getOperationRemark() {
        return operationRemark;
    }

    public void setOperationRemark(String operationRemark) {
        this.operationRemark = operationRemark == null ? null : operationRemark.trim();
    }

    public Date getTimestampCreate() {
        return timestampCreate;
    }

    public void setTimestampCreate(Date timestampCreate) {
        this.timestampCreate = timestampCreate;
    }

    public Date getTimestampModify() {
        return timestampModify;
    }

    public void setTimestampModify(Date timestampModify) {
        this.timestampModify = timestampModify;
    }
}