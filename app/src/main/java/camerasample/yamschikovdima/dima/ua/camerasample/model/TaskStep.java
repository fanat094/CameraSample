
package camerasample.yamschikovdima.dima.ua.camerasample.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TaskStep {

    @SerializedName("row_type")
    @Expose
    private String rowType;
    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("order_num")
    @Expose
    private String orderNum;
    @SerializedName("group_name")
    @Expose
    private String groupName;
    @SerializedName("code")
    @Expose
    private String code;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("object_type")
    @Expose
    private Integer objectType;
    @SerializedName("take_measure")
    @Expose
    private Boolean takeMeasure;
    @SerializedName("answers")
    @Expose
    private List<Answer> answers = null;
    @SerializedName("make_photo")
    @Expose
    private Boolean makePhoto;
    @SerializedName("make_video")
    @Expose
    private Boolean makeVideo;

    public String getRowType() {
        return rowType;
    }

    public void setRowType(String rowType) {
        this.rowType = rowType;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(String orderNum) {
        this.orderNum = orderNum;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getObjectType() {
        return objectType;
    }

    public void setObjectType(Integer objectType) {
        this.objectType = objectType;
    }

    public Boolean getTakeMeasure() {
        return takeMeasure;
    }

    public void setTakeMeasure(Boolean takeMeasure) {
        this.takeMeasure = takeMeasure;
    }

    public List<Answer> getAnswers() {
        return answers;
    }

    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Boolean getMakePhoto() {
        return makePhoto;
    }

    public void setMakePhoto(Boolean makePhoto) {
        this.makePhoto = makePhoto;
    }

    public Boolean getMakeVideo() {
        return makeVideo;
    }

    public void setMakeVideo(Boolean makeVideo) {
        this.makeVideo = makeVideo;
    }

}
