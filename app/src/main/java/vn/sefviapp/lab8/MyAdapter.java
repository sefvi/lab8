package vn.sefviapp.lab8;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Muc> mucs;
    private LayoutInflater mLayoutInflater;
    private Context mContext;

    View v;
    public MyAdapter(Context context,List<Muc> mucs) {
        this.mucs = mucs;
        this.mContext = context;
        mLayoutInflater = LayoutInflater.from(context);
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView text;
        ImageView img, cuoi, share;

        public MyViewHolder(View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            text = itemView.findViewById(R.id.textHihi);
            cuoi = itemView.findViewById(R.id.cuoi);
            share = itemView.findViewById(R.id.share);
        }
    }


    @Override
    public MyAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View item = mLayoutInflater.inflate(R.layout.item,parent,false);
        v = item;
        return new MyAdapter.MyViewHolder(item);
    }

    @Override
    public void onBindViewHolder(final MyAdapter.MyViewHolder holder, int position) {
        final Muc muc = mucs.get(position);
        holder.text.setText(muc.getChuoi());
        holder.img.setImageResource(muc.getHinh());
        holder.cuoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.cuoi.setColorFilter(Color.RED);
            }
        });
        holder.share.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                holder.share.setColorFilter(Color.BLUE);
            }
        });

    }

    @Override
    public int getItemCount() {
        return mucs.size();
    }
}
