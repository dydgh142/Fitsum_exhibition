package org.fitsum;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.miguelrochefort.fitnesscamera.R;

import org.fitsum.API.BadgeAPI;
import org.fitsum.API.ChangeAPI;
import org.fitsum.API.ProfileAPI;
import org.fitsum.Dto.BadgeDto;
import org.fitsum.Dto.CommonResult;
import org.fitsum.Dto.SingleResult;
import org.fitsum.Dto.UserDto;
import org.fitsum.FirstPart.FirstActivity;
import org.fitsum.RetrofitAPI.config.RetrofitBuilder;
import org.fitsum.config.AccessTokenSharedPreferences;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class CoinActivity extends AppCompatActivity {

    private Button back, boy, girl;
    private ImageButton ib_basic, ib_exercise, ib_training;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coin);

        ib_basic = (ImageButton) findViewById(R.id.ib_basic);
        ib_exercise = (ImageButton) findViewById(R.id.ib_exercise);
        ib_training = (ImageButton) findViewById(R.id.ib_training);

        boy = (Button) findViewById(R.id.boy);
        girl = (Button) findViewById(R.id.girl);

        back = findViewById(R.id.back);

        Integer userItem = ((AppTest) getApplication()).getUserItem();

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent();
                intent.setClass(CoinActivity.this, MainActivity.class);
                startActivity(intent);

                finish();
            }
        });

        boy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AppTest)getApplication()).setUserItem(1);
                Toast.makeText(CoinActivity.this,"변경되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        girl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AppTest)getApplication()).setUserItem(10);
                Toast.makeText(CoinActivity.this,"변경되었습니다.",Toast.LENGTH_SHORT).show();
            }
        });

        ib_basic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userItem == 1 || userItem == 2 || userItem == 3 || userItem == 10 || userItem == 11 || userItem == 12) {
                    Toast.makeText(CoinActivity.this, "이미 입고있는 옷 입니다.", Toast.LENGTH_SHORT).show();
                }

                //남자인데 다른옷을 입고있다면.
                else if (userItem == 4 || userItem == 5 || userItem == 6 || userItem == 7 || userItem == 8 || userItem == 9) {
                    ((AppTest) getApplication()).setUserItem(1);
                    Toast.makeText(CoinActivity.this, "옷을 바꿨습니다.", Toast.LENGTH_SHORT).show();
                } else if (userItem == 13 || userItem == 14 || userItem == 15 || userItem == 16 || userItem == 17 || userItem == 18) {
                    ((AppTest) getApplication()).setUserItem(10);
                    Toast.makeText(CoinActivity.this, "옷을 바꿨습니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });
        //운동복을 눌렀을때.
        ib_exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userItem == 4 || userItem == 5 || userItem == 6 || userItem == 13 || userItem == 14 || userItem == 15) {
                    Toast.makeText(CoinActivity.this, "이미 입고있는 옷 입니다.", Toast.LENGTH_SHORT).show();
                }

                //남자인데 다른옷을 입고있다면.
                else if (userItem == 1 || userItem == 2 || userItem == 3 || userItem == 7 || userItem == 8 || userItem == 9) {
                    ((AppTest)getApplication()).setUserItem(4);
                    Toast.makeText(CoinActivity.this, "옷을 바꿨습니다.", Toast.LENGTH_SHORT).show();
                }
                else if (userItem == 10 || userItem == 11 || userItem == 12 || userItem == 16 || userItem == 17 || userItem == 18){
                    ((AppTest)getApplication()).setUserItem(13);
                    Toast.makeText(CoinActivity.this, "옷을 바꿨습니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ib_training.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (userItem == 7 || userItem == 8 || userItem == 9 || userItem == 16 || userItem == 17 || userItem == 18) {
                    Toast.makeText(CoinActivity.this, "이미 입고있는 옷 입니다.", Toast.LENGTH_SHORT).show();
                }

                //남자인데 다른옷을 입고있다면.
                else if (userItem == 4 || userItem == 5 || userItem == 6 || userItem == 1 || userItem == 2 || userItem == 3) {
                    ((AppTest)getApplication()).setUserItem(7);
                    Toast.makeText(CoinActivity.this, "옷을 바꿨습니다.", Toast.LENGTH_SHORT).show();
                }
                else if (userItem == 13 || userItem == 14 || userItem == 15 || userItem == 11 || userItem == 12 || userItem == 10){
                    ((AppTest)getApplication()).setUserItem(16);
                    Toast.makeText(CoinActivity.this, "옷을 바꿨습니다.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}












