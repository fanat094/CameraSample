package camerasample.yamschikovdima.dima.ua.camerasample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.google.gson.Gson;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import camerasample.yamschikovdima.dima.ua.camerasample.model.Example;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.selectStepRv)
    RecyclerView selectStepRv;

    SelectStepAdapter selectStepAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inspector_activity_select_step);
        ButterKnife.bind(this);

        selectStepAdapter = new SelectStepAdapter(arList());
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        selectStepRv.setItemAnimator(new DefaultItemAnimator());
        selectStepRv.setLayoutManager(mLayoutManager);
        selectStepRv.setItemAnimator(new DefaultItemAnimator());
        selectStepRv.setAdapter(selectStepAdapter);

    }

    private List<SelectStepModel> arList() {

        List<SelectStepModel> selectStepModelsList = new ArrayList<>();

        SelectStepModel selectStepModel = new SelectStepModel("1.","Step1");
        selectStepModelsList.add(selectStepModel);
        selectStepModel = new SelectStepModel("2.","Step2");
        selectStepModelsList.add(selectStepModel);
        selectStepModel = new SelectStepModel("3.","Step3");
        selectStepModelsList.add(selectStepModel);

        return selectStepModelsList;
    }


    private void ff () {

        String json = null;
        try {
            InputStream is = getAssets().open("data/data.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Example exampler = new Gson().fromJson(json, Example.class);
        exampler.getData().get(0).getTaskSteps();
    }
}


