package org.sld.cmdfile.file_item;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;
import org.sld.cmdfile.R;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {

    private List<Item> items;
    private Context context;

    public MyAdapter(Context context, List<Item> items) {
        this.context = context;
        this.items = items;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.item_file_list, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Item item = items.get(position);
        holder.text.setText(item.getFile().getName());
        if (item.getType() == ItemType.FILE) {
            holder.image.setBackground(context.getResources().getDrawable(R.drawable.ic_file));
        } else if (item.getType() == ItemType.FOLDER) {
            holder.image.setBackground(context.getResources().getDrawable(R.drawable.ic_folder));
        }
    }

    @Override
    public int getItemCount() {
        return items.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView text;
        public ImageView image;

        public ViewHolder(View view) {
            super(view);
            text = view.findViewById(R.id.file_name);
            image = view.findViewById(R.id.file_icon);
        }
    }
}
