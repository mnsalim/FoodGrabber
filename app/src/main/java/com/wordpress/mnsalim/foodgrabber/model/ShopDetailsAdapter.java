package com.wordpress.mnsalim.foodgrabber.model;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import com.wordpress.mnsalim.foodgrabber.R;

import java.util.ArrayList;

/**
 * Created by abcd on 23-Jan-17.
 */

public class ShopDetailsAdapter extends ArrayAdapter<ShopDetails> {
    private ArrayList<ShopDetails> list;
    private LayoutInflater inflater;
    private boolean isDeleteDisplaybale = false;
    private boolean deleteIconClicked = false;
    private ListItemDeleteListener listener;



    /**
     * @return the isDeleteDisplaybale
     */
    public boolean isDeleteDisplaybale()
    {
        return isDeleteDisplaybale;
    }

    /**
     * @param isDeleteDisplaybale the isDeleteDisplaybale to set
     */
    public void setDeleteDisplaybale(boolean isDeleteDisplaybale)
    {
        this.isDeleteDisplaybale = isDeleteDisplaybale;
    }

    /**
     * Cnostructor for FavoriteProductListAdapter
     * @param context an active context or acitivty
     * @param list an arraylist of ShopDetails object
     */
    public ShopDetailsAdapter(Context context, ArrayList<ShopDetails> list, ListItemDeleteListener listener)
    {
        super(context, R.layout.shop_list_item);
        this.list = list;
        this.listener = listener;

        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @Override
    public int getCount()
    {
        return list.size();
    }

    @Override
    public ShopDetails getItem(int position)
    {
        return list.get(position);
    }

    @Override
    public long getItemId(int position)
    {
        return position;
    }

    @Override
    public View getView(final int position, View row, ViewGroup parent)
    {
        final ShopDetails item = getItem(position);

        if(row == null)
        {
            row = inflater.inflate(R.layout.shop_list_item, parent, false);
        }


        TextView glassType = (TextView) row.findViewById(R.id.tvFavOtherMakerTimeStamp);
        ImageButton delete = (ImageButton) row.findViewById(R.id.ivDelete);
        final Button deleteConfirm = (Button) row.findViewById(R.id.btnDeleteConfirm);

        if(isDeleteDisplaybale)
        {
            delete.setVisibility(View.VISIBLE);
        }
        else
        {
            delete.setVisibility(View.GONE);
            deleteConfirm.setVisibility(View.GONE);
        }

        delete.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                if(deleteIconClicked)
                {
                    deleteConfirm.setVisibility(View.GONE);
                    deleteIconClicked = false;
                }
                else
                {
                    deleteConfirm.setVisibility(View.VISIBLE);
                    deleteIconClicked = true;
                }
            }
        });

        deleteConfirm.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {


                //make view change
                deleteConfirm.setVisibility(View.GONE);
                list.remove(position);
                ShopDetailsAdapter.this.notifyDataSetChanged();
                if(list.size() == 0)
                {
                    listener.onEmptyList();
                }
            }
        });
        return row;
    }

    /**
     * Set data in the adapter.
     * @param itemList an arrayList of ShopDetails
     */
    public void setData(ArrayList<ShopDetails> itemList)
    {
        this.list = itemList;
        notifyDataSetChanged();
    }

    /**
     * Clear the adapter
     */
    public void clear()
    {
        this.list.clear();
        notifyDataSetChanged();
    }
}
