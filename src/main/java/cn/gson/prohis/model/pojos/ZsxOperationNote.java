package cn.gson.prohis.model.pojos;

import javax.persistence.*;
import java.util.Objects;

public class ZsxOperationNote {
    private int operationNoteId;
    private Integer operationId;

    public int getOperationNoteId() {
        return operationNoteId;
    }

    public void setOperationNoteId(int operationNoteId) {
        this.operationNoteId = operationNoteId;
    }

    public Integer getOperationId() {
        return operationId;
    }

    public void setOperationId(Integer operationId) {
        this.operationId = operationId;
    }

}
