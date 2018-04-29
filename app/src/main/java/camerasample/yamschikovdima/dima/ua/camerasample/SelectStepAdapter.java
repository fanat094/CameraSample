package camerasample.yamschikovdima.dima.ua.camerasample;

import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SelectStepAdapter extends RecyclerView.Adapter<SelectStepAdapter.SelectStepViewHolder> {

    List<SelectStepModel> selectStepList;


    public SelectStepAdapter(List<SelectStepModel> selectStepList) {
        this.selectStepList = selectStepList;
    }

    @Override
    public SelectStepViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {


        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item, parent, false);

        return new SelectStepViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(SelectStepViewHolder holder, int position) {

        SelectStepModel selectSteps = selectStepList.get(position);

        holder.numSelectStepTv.setText(selectSteps.getNumSelect());
        holder.numSelectStepTextTv.setText(selectSteps.getStepSelect());

    }

    @Override
    public int getItemCount() {
        return selectStepList.size();
    }

    public class SelectStepViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        @BindView(R.id.numSelectStepTv)
        TextView numSelectStepTv;
        @BindView(R.id.numSelectStepTextTv)
        TextView numSelectStepTextTv;


        public SelectStepViewHolder(View itemView) {
            super(itemView);

            ButterKnife.bind(this, itemView);
            itemView.setOnClickListener(this);
            itemView.setClickable(true);
        }

        @Override
        public void onClick(View view) {
            Intent putintent = new Intent(view.getContext(), StepsHostActivity.class);
            putintent.putExtra("frag", 1);

            view.getContext().startActivity(putintent);
        }
    }
}
