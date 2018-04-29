
package camerasample.yamschikovdima.dima.ua.camerasample.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ObjectObj {

    @SerializedName("object_type_id")
    @Expose
    private Integer objectTypeId;
    @SerializedName("object_type_code")
    @Expose
    private String objectTypeCode;
    @SerializedName("object_type_name")
    @Expose
    private String objectTypeName;

    public Integer getObjectTypeId() {
        return objectTypeId;
    }

    public void setObjectTypeId(Integer objectTypeId) {
        this.objectTypeId = objectTypeId;
    }

    public String getObjectTypeCode() {
        return objectTypeCode;
    }

    public void setObjectTypeCode(String objectTypeCode) {
        this.objectTypeCode = objectTypeCode;
    }

    public String getObjectTypeName() {
        return objectTypeName;
    }

    public void setObjectTypeName(String objectTypeName) {
        this.objectTypeName = objectTypeName;
    }

}
