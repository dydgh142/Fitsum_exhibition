package org.fitsum;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.google.android.material.navigation.NavigationBarView;
import com.miguelrochefort.fitnesscamera.R;

import org.fitsum.API.BadgeAPI;
import org.fitsum.API.ProfileAPI;
import org.fitsum.Dto.BadgeDto;
import org.fitsum.Dto.CommonResult;
import org.fitsum.Dto.SingleResult;
import org.fitsum.Dto.UserDto;
import org.fitsum.Fragment.Main1Fragment;
import org.fitsum.Fragment.Main2Fragment;
import org.fitsum.Fragment.Main3Fragment;
import org.fitsum.Fragment.Main4Fragment;
import org.fitsum.RetrofitAPI.config.RetrofitBuilder;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    Main1Fragment main1Fragment;
    Main2Fragment main2Fragment;
    Main3Fragment main3Fragment;
    Main4Fragment main4Fragment;

    public Integer userItem;
    public Integer Item;
    Contact contact;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);

        main1Fragment = new Main1Fragment();
        main2Fragment = new Main2Fragment();
        main3Fragment = new Main3Fragment();
        main4Fragment = new Main4Fragment();

        userItem = ((AppTest)getApplication()).getUserItem();

        ((AppTest)getApplication()).setUserItem(userItem);

        Log.d("userItem", String.valueOf(userItem));

        // 포즈넷 액티비티로 현재의 옷 전달하기
//        Intent intent = new Intent(this, PosenetActivity.class);
//        intent.putExtra("userItem",userItem);

        // 포즈넷 액티비티에서 값 받아오기
        Intent gintent = getIntent();
        Integer newItem = gintent.getIntExtra("userItem", userItem);

        // 현재 옷 셋팅
        ((AppTest)getApplication()).setUserItem(newItem);





        getSupportFragmentManager().beginTransaction().replace(R.id.containers, main1Fragment).commit();

        NavigationBarView navigationBarView = findViewById(R.id.main_menu);
        navigationBarView.setOnItemSelectedListener(new NavigationBarView.OnItemSelectedListener(){
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item){

                switch(item.getItemId()){
                    case R.id.main1:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, main1Fragment).commit();
                        return true;
                    case R.id.main2:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, main2Fragment).commit();
                        return true;
                    case R.id.main3:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, main3Fragment).commit();
                        return true;
                    case R.id.main4:
                        getSupportFragmentManager().beginTransaction().replace(R.id.containers, main4Fragment).commit();
                        return true;
                }
                return false;
            }
        });

    }



}