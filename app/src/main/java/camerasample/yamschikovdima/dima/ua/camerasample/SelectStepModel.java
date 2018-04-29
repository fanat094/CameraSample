package camerasample.yamschikovdima.dima.ua.camerasample;

/**
 * Created by 1 on 28.04.2018.
 */

class SelectStepModel {

    String numSelect;
    String stepSelect;

    public SelectStepModel(String numSelect, String stepSelect) {
        this.numSelect = numSelect;
        this.stepSelect = stepSelect;
    }

    public String getNumSelect() {
        return numSelect;
    }

    public void setNumSelect(String numSelect) {
        this.numSelect = numSelect;
    }

    public String getStepSelect() {
        return stepSelect;
    }

    public void setStepSelect(String stepSelect) {
        this.stepSelect = stepSelect;
    }
}
