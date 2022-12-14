package org.fitsum.FirstPart;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.CompositePageTransformer;
import androidx.viewpager2.widget.MarginPageTransformer;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.miguelrochefort.fitnesscamera.R;

import org.fitsum.API.AutoLoginAPI;
import org.fitsum.API.ProfileAPI;
import org.fitsum.AppTest;
import org.fitsum.Dto.BadgeDto;
import org.fitsum.Dto.CommonResult;
import org.fitsum.Dto.SingleResult;
import org.fitsum.MainActivity;
import org.fitsum.RetrofitAPI.config.RetrofitBuilder;
import org.fitsum.config.AccessTokenSharedPreferences;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class FirstActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_activity);

        ((AppTest)getApplication()).setUserItem(1);

        Intent intent=new Intent();
        intent.setClass(FirstActivity.this, MainActivity.class);
        startActivity(intent);





    }


}
