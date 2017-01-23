package com.wordpress.mnsalim.foodgrabber.View;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.wordpress.mnsalim.foodgrabber.R;

import java.util.ArrayList;

import com.wordpress.mnsalim.foodgrabber.model.ListItemDeleteListener;
import com.wordpress.mnsalim.foodgrabber.model.ShopDetails;
import com.wordpress.mnsalim.foodgrabber.model.ShopDetailsAdapter;

public class ShopListActivity extends AppCompatActivity {

    private ListView lvShopList;
    private TextView noDataView;

    //controle variable
    private ArrayList<ShopDetails> list;
    private ShopDetailsAdapter adapter;
    private boolean isEditClicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shop_list);

        initView();
    }



    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        if(item.getItemId() == R.id.ivAppMainLogo)
        {
            if(!isEditClicked) //if edit button cliked
            {
                if(adapter != null)
                {
                    adapter.setDeleteDisplaybale(true);
                    adapter.notifyDataSetChanged();
                }
                isEditClicked = true;
                item.setTitle(getString(R.string.app_name));
            }
            else
            {
                if(adapter != null)
                {
                    adapter.setDeleteDisplaybale(false);
                    adapter.notifyDataSetChanged();
                }

                item.setTitle(getString(R.string.app_name));
                isEditClicked = false;
            }

            return true;
        }

        return false;
    }

    @Override
    public void onStart()
    {
        list = new ArrayList<>();

        if(list.size() > 0)  //check is there any data in the list
        {
            setNoDataView(false);

            ListItemDeleteListener deleteListener = new ListItemDeleteListener()
            {
                @Override
                public void onEmptyList()
                {
                    setNoDataView(true);
                }
            };
            adapter = new ShopDetailsAdapter(this, list, deleteListener);
            lvShopList.setAdapter(adapter);
        }
        else
        {
            setNoDataView(true);
        }
        super.onStart();
    }
    

    @Override
    public void onResume()
    {
        if(isEditClicked)
        {
            if(adapter != null)
            {
                adapter.setDeleteDisplaybale(true);
                adapter.notifyDataSetChanged();
            }
        }
        super.onResume();
    }
    

    /**
     * Initiate View object and some primary functions.
     */
    private void initView()
    {
        lvShopList = (ListView) findViewById(R.id.lvShopList);
        noDataView = (TextView) findViewById(R.id.tvNoDataFound);

        lvShopList.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parentView, View view, int position, long paramLong)
            {
                ShopDetails item = (ShopDetails) parentView.getItemAtPosition(position);
            }
        });
    }
    /**
     * retrieve favorite product list from the database
     * @return an array list of details of ShopDetails
     */
    private ArrayList<ShopDetails> getShopList()
    {
        ArrayList<ShopDetails> list = new ArrayList<ShopDetails>();

        return list;
    }

    /**
     * Set a view when no data is available to show as list.
     * @param show a boolean reflact no data view is shown or not
     */
    private void setNoDataView(boolean show)
    {
        if(show)
        {
            lvShopList.setVisibility(View.GONE);
            noDataView.setVisibility(View.VISIBLE);
        }
        else
        {
            lvShopList.setVisibility(View.VISIBLE);
            noDataView.setVisibility(View.GONE);
        }
    }
}
