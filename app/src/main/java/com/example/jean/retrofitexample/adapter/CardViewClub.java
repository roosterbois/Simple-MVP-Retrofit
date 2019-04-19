package com.example.jean.retrofitexample.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.example.jean.retrofitexample.R;
import com.example.jean.retrofitexample.model.Club;

import java.util.List;

public class CardViewClub extends RecyclerView.Adapter<CardViewClub.CardViewHolder> {
    private List<Club> clubList;
    private Context context;

    public CardViewClub(List<Club> clubList , Context context) {
        this.clubList = clubList;
        this.context = context;
    }

    public void addItem(int position) {notifyItemInserted(position);}
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int i) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_view_adapter,parent , false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CardViewHolder holder, int i) {
        Club club = clubList.get(i);

        Glide.with(context)
                .load(club.getIkon())
                .into(holder.mImageIcoc);

        Log.i("xxxx" , "cek :" + club.getId());
            holder.mTextDeskripsi.setText(club.getDeskripsi());
            holder.mTextNama.setText(club.getNama());
            holder.mTextUmur.setText(club.getAge());
            holder.mTextPosisi.setText(club.getPosisi());

    }
    @Override
    public int getItemViewType(int position){
        return position;

    }

    @Override
    public int getItemCount() {
        return clubList.size();
    }

    @Override
    public long getItemId(int position){return position;}

    public class CardViewHolder extends RecyclerView.ViewHolder {

        private ImageView mImageIcoc;
        private TextView mTextNama;
        private TextView mTextUmur;
        private TextView mTextPosisi;
        private TextView mTextDeskripsi;

        public CardViewHolder(@NonNull final View itemView) {
            super(itemView);

            mImageIcoc = (ImageView) itemView.findViewById(R.id.imgIcon);
            mTextNama = (TextView) itemView.findViewById(R.id.tv_nama);
            mTextUmur = (TextView) itemView.findViewById(R.id.tv_umur);
            mTextPosisi = (TextView) itemView.findViewById(R.id.tv_posisi);
            mTextDeskripsi = (TextView) itemView.findViewById(R.id.tv_deskripsi);




        }
    }
}
