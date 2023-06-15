package com.example.quizapp;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import org.w3c.dom.Text;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

public class CatagoryAdaptar extends RecyclerView.Adapter<CatagoryAdaptar.viewholder>
{
    private List<CatagoryModel> catagoryModelList;

    public CatagoryAdaptar(List<CatagoryModel> catagoryModelList) {
        this.catagoryModelList = catagoryModelList;
    }

    @NonNull
    @Override
    public viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.catagort_item,parent,false);
        return new viewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull viewholder holder, int position)
    {

        holder.setData(catagoryModelList.get(position).getImageUrl(),catagoryModelList.get(position).getTitle());

    }

    @Override
    public int getItemCount() {
        return catagoryModelList.size();
    }

    class viewholder extends RecyclerView.ViewHolder{
        private CircleImageView imageView;
        private TextView title;

        public viewholder(@NonNull View itemView) {
            super(itemView);

            imageView=itemView.findViewById(R.id.image_view);
            title=itemView.findViewById(R.id.title);
        }

        private void setData(String url,String title)
        {
            Glide.with(imageView.getContext()).load(url).into(imageView);
            this.title.setText(title);
        }
    }
}
