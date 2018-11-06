package com.example.emidiomorais.sociomatico.controler.adapter;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.emidiomorais.sociomatico.R;

import java.util.List;




public class PostAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {
    private final static int FADE_DURATION = 1000;
    private static final int TYPE_HEADER = 0;
    private static final int TYPE_ITEM = 1;
    private static final int TYPE_FOOTER = 2;
    private String TAG="LoadImage";
    private Context context;
    Bundle bundle=new Bundle();
    private List<Post> questionList;
    private boolean mWithHeader;
    private boolean mWithFooter;
    private View.OnClickListener mOnClickListener;
    public PostAdapter(List<Post> posts, Context context, boolean withHeader, boolean withFooter) {
        this.questionList = posts;
        this.context=context;
        this.mWithHeader=withHeader;
        this.mWithFooter=withFooter;
    }
    @Override
    public int getItemViewType(int position) {
        if (mWithHeader && isPositionHeader(position))
            return TYPE_HEADER;
        if (mWithFooter && isPositionFooter(position))
            return TYPE_FOOTER;
        return TYPE_ITEM;
    }
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int viewType) {
        View itemView = LayoutInflater.
                from(viewGroup.getContext()).
                inflate(R.layout.postitem, viewGroup, false);
        VideoViewHolder holder = new VideoViewHolder(itemView);
        itemView.setTag(holder);
        itemView.setOnClickListener(mOnClickListener);
        return holder;
    }
    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        if(holder instanceof  header){
        }
        else if(holder instanceof  footer){
            ((footer) holder).context = context;
        }
    }
    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }
    @Override
    public int getItemCount() {
        int itemCount=0;
        if(questionList!=null) {
            itemCount = questionList.size();
            if (mWithHeader)
                itemCount = itemCount + 1;
            if (mWithFooter)
                itemCount = itemCount + 1;
// return itemCount;
        }
        return itemCount;
    }
    private boolean isPositionHeader(int position) {
        return position == 0;
    }
    private boolean isPositionFooter(int position) {
        return position == getItemCount() - 1;
    }
    public void setOnClickListener(View.OnClickListener lis) {
        mOnClickListener = lis;
    }
    protected Post getItem(int position) {
        return mWithHeader ? questionList.get(position - 1) : questionList.get(position);
    }
    private int getItemPosition(int position){
        return mWithHeader ? position - 1 : position;
    }
    public void setData(List<Post> questionList) {
        this.questionList=questionList;
    }
    public class VideoViewHolder extends RecyclerView.ViewHolder {
        ImageView vImage;
        protected TextView vName;
        TextView vDetails,vTitle,vExcerpt;
        String content;
        Context context;
        VideoViewHolder(View v) {
            super(v);
            vImage = (ImageView)  v.findViewById(R.id.blog_image);
            vTitle = (TextView) v.findViewById(R.id.title);
            vExcerpt=(TextView) v.findViewById(R.id.excerpt);
            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                }
            });
        }
        public void clearAnimation() {
            this.clearAnimation();
        }
    }
    public class header extends RecyclerView.ViewHolder {
        protected  Context context;
        protected int position;
        public header(View v) {
            super(v);
        }
    }
    public class footer extends RecyclerView.ViewHolder {
        protected  Context context;
        protected int position;
        public footer(View v) {
            super(v);
        }
    }

    private class Post {
    }
}