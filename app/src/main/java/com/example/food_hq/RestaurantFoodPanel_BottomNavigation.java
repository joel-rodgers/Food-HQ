package com.example.food_hq;

import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.example.food_hq.restaurantFoodPanel.RestaurantHomeFragment;
import com.example.food_hq.restaurantFoodPanel.RestaurantOrderFragment;
import com.example.food_hq.restaurantFoodPanel.RestaurantPendingOrderFragment;
import com.example.food_hq.restaurantFoodPanel.RestaurantProfileFragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class RestaurantFoodPanel_BottomNavigation extends AppCompatActivity implements BottomNavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurant_food_panel_bottom_navigation);

        BottomNavigationView navigationView = findViewById(R.id.restaurant_bottom_navigation);
        navigationView.setOnNavigationItemSelectedListener(this);
        //UpdateToken();
        String name = getIntent().getStringExtra("PAGE");
        if (name != null) {
            if (name.equalsIgnoreCase("Orderpage")) {
                loadrestaurantfragment(new RestaurantPendingOrderFragment());
            } else if (name.equalsIgnoreCase("Confirmpage")) {
                loadrestaurantfragment(new RestaurantOrderFragment());
            } else if (name.equalsIgnoreCase("AcceptOrderpage")) {
                loadrestaurantfragment(new RestaurantHomeFragment());
            } else if (name.equalsIgnoreCase("Deliveredpage")) {
                loadrestaurantfragment(new RestaurantHomeFragment());
            }
        } else {
            loadrestaurantfragment(new RestaurantHomeFragment());
        }
    }

    private boolean loadrestaurantfragment(Fragment fragment) {
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container, fragment).commit();
            return true;
        }

        return false;
    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        Fragment fragment = null;
        switch (item.getItemId()) {
            case R.id.restaurantHome:
                fragment = new RestaurantHomeFragment();
                break;

            case R.id.PendingOrders:
                fragment = new RestaurantPendingOrderFragment();
                break;

            case R.id.Orders:
                fragment = new RestaurantOrderFragment();
                break;
            case R.id.restaurantProfile:
                fragment = new RestaurantProfileFragment();
                break;
        }
        return loadrestaurantfragment(fragment);
    }
}