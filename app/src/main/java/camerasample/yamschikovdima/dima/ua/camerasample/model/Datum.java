
package camerasample.yamschikovdima.dima.ua.camerasample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Datum {

    @SerializedName("task_id")
    @Expose
    private Integer taskId;
    @SerializedName("task_code")
    @Expose
    private String taskCode;
    @SerializedName("task_name")
    @Expose
    private String taskName;
    @SerializedName("task_desc")
    @Expose
    private String taskDesc;
    @SerializedName("object_obj")
    @Expose
    private ObjectObj objectObj;
    @SerializedName("technik_obj")
    @Expose
    private TechnikObj technikObj;
    @SerializedName("task_status_name")
    @Expose
    private String taskStatusName;
    @SerializedName("task_steps")
    @Expose
    private List<TaskStep> taskSteps = null;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;

    public Integer getTaskId() {
        return taskId;
    }

    public void setTaskId(Integer taskId) {
        this.taskId = taskId;
    }

    public String getTaskCode() {
        return taskCode;
    }

    public void setTaskCode(String taskCode) {
        this.taskCode = taskCode;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskDesc() {
        return taskDesc;
    }

    public void setTaskDesc(String taskDesc) {
        this.taskDesc = taskDesc;
    }

    public ObjectObj getObjectObj() {
        return objectObj;
    }

    public void setObjectObj(ObjectObj objectObj) {
        this.objectObj = objectObj;
    }

    public TechnikObj getTechnikObj() {
        return technikObj;
    }

    public void setTechnikObj(TechnikObj technikObj) {
        this.technikObj = technikObj;
    }

    public String getTaskStatusName() {
        return taskStatusName;
    }

    public void setTaskStatusName(String taskStatusName) {
        this.taskStatusName = taskStatusName;
    }

    public List<TaskStep> getTaskSteps() {
        return taskSteps;
    }

    public void setTaskSteps(List<TaskStep> taskSteps) {
        this.taskSteps = taskSteps;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

}
