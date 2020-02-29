package com.quickdeal.quickdealdemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.View;

import java.util.ArrayList;

public class ProfileSellerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_seller);

        Toolbar toolbar = (Toolbar)findViewById(R.id.toolbar1);
        setSupportActionBar(toolbar);
        toolbar.setTitle("My Profile");
        toolbar.setNavigationIcon(R.drawable.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });


        RecyclerView UsersRecyclerView = (RecyclerView)findViewById(R.id.infolistseller);
        UsersRecyclerView.setHasFixedSize(true);

        LinearLayoutManager topicLLayout;
        topicLLayout = new LinearLayoutManager(getApplicationContext());
        topicLLayout.setOrientation(LinearLayoutManager.VERTICAL);
        UsersRecyclerView.setLayoutManager(topicLLayout);

        ArrayList<CustomList> user = new ArrayList<>();

        int[] images = {R.drawable.store,R.drawable.email,R.drawable.phone,R.drawable.map,R.drawable.account,R.drawable.buffer};


        CustomList userdetail = new CustomList(images[0],"Business Name","Krishna Electronics");
        user.add(userdetail);
        userdetail = new CustomList(images[1],"Email Address","krishnaelec@gmail.com");
        user.add(userdetail);
        userdetail = new CustomList(images[2],"Phone Number","+91 9033356708");
        user.add(userdetail);
        userdetail = new CustomList(images[3],"City","Surat, Gujarat, India");
        user.add(userdetail);
        userdetail = new CustomList(images[4],"Type","Wholesaler");
        user.add(userdetail);
        userdetail = new CustomList(images[5],"Company","Electronics, Switch & switchgear");
        user.add(userdetail);

        CustomAdapter adapter = new CustomAdapter(this,user);
        UsersRecyclerView.setAdapter(adapter);





    }


    // Menu icons are inflated just as they were with actionbar
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.mainmenu, menu);
        return true;
    }

}
