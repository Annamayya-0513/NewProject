package com.example.newproject;

import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.newproject.Fragments.BrowseFragment;
import com.example.newproject.Fragments.MyProfileFragment;
import com.example.newproject.Fragments.MyReviewsFragment;
import com.example.newproject.Fragments.NotificationFragment;
import com.example.newproject.Fragments.PostAReviewFragment;

public class BottomNavigation extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        
        initialize();
        onClick();
    }



    private void initialize() {

        bottomNavigationView =(BottomNavigationView)findViewById(R.id.BottomNavigation);

        getSupportFragmentManager().beginTransaction().replace(R.id.Fragment,new BrowseFragment()).commit();
        return;

    }

    private void onClick() {

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
                Fragment selectedFragment = null;

                switch (menuItem.getItemId()){
                    case R.id.Browse:
                        selectedFragment = new BrowseFragment();
                        break;
                    case R.id.MyReviews:
                        selectedFragment = new MyReviewsFragment();
                        break;
                    case R.id.PostAReview:
                        selectedFragment = new PostAReviewFragment();
                        break;
                    case R.id.Notification:
                        selectedFragment = new NotificationFragment();
                        break;
                    case R.id.MyProfile:
                        selectedFragment = new MyProfileFragment();
                        break;

                }
                getSupportFragmentManager().beginTransaction().replace(R.id.Fragment,selectedFragment).commit();

                return true;
            }
        });

    }
}
