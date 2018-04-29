
package camerasample.yamschikovdima.dima.ua.camerasample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Answer {

    @SerializedName("answer_id")
    @Expose
    private Integer answerId;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("serial_number")
    @Expose
    private Integer serialNumber;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("type")
    @Expose
    private Boolean type;
    @SerializedName("need_comment")
    @Expose
    private Boolean needComment;
    @SerializedName("comment")
    @Expose
    private Object comment;

    public Integer getAnswerId() {
        return answerId;
    }

    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(Integer serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Boolean getType() {
        return type;
    }

    public void setType(Boolean type) {
        this.type = type;
    }

    public Boolean getNeedComment() {
        return needComment;
    }

    public void setNeedComment(Boolean needComment) {
        this.needComment = needComment;
    }

    public Object getComment() {
        return comment;
    }

    public void setComment(Object comment) {
        this.comment = comment;
    }

}
