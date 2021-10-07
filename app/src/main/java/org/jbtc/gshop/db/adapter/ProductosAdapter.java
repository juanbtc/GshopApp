package org.jbtc.gshop.db.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.jbtc.gshop.R;
import org.jbtc.gshop.db.entity.Producto;

import java.util.ArrayList;
import java.util.List;

public class ProductosAdapter extends RecyclerView.Adapter<ProductosAdapter.ProductosViewHolder> {
    private List<Producto> items = new ArrayList<>();


    public void setItems(List<Producto> items) {
        this.items = items;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ProductosViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_producto,parent,false);
        ProductosViewHolder productosViewHolder = new ProductosViewHolder(v);
        return productosViewHolder;
    }

    @Override
    public void onBindViewHolder(ProductosViewHolder holder, int position) {
        holder.name.setText( items.get(position).nombre );
    }


    @Override
    public int getItemCount() {
        return items.size();
    }

    public class ProductosViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView name;
        public ProductosViewHolder(@NonNull View itemView) {
            super(itemView);
            img=itemView.findViewById(R.id.iv_cv_prod_img);
            name=itemView.findViewById(R.id.tv_cv_prod_name);
        }
    }
}
