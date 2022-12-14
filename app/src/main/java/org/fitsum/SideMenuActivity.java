package org.fitsum;

import androidx.appcompat.app.AppCompatActivity;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.miguelrochefort.fitnesscamera.R;

import org.fitsum.API.WithdrawalAPI;
import org.fitsum.Dto.CommonResult;
import org.fitsum.FirstPart.FirstActivity;
import org.fitsum.RetrofitAPI.config.RetrofitBuilder;
import org.fitsum.config.AccessTokenSharedPreferences;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class SideMenuActivity extends AppCompatActivity {

   Button back;
   TextView version, logout, withdrawal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sidemenu);

        back = (Button) findViewById(R.id.back);                        //뒤로가기
        version = (TextView) findViewById(R.id.version);                //버전
        logout = (TextView) findViewById(R.id.logout);                  //로그아웃
        withdrawal = (TextView) findViewById(R.id.withdrawal);          //회원탈퇴


        //뒤로가기 버튼
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        //로그아웃 버튼
        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogLogout();
            }
        });

        //회원탈퇴 버튼
        withdrawal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showDialogWithdrawal();
            }
        });
    }


    //로그아웃 다이얼로그
    private void showDialogLogout() {
        AlertDialog.Builder builder = new AlertDialog.Builder(SideMenuActivity.this);
        builder.setMessage("로그아웃 하시겠습니까?")
                .setTitle("Logout")
                .setPositiveButton("로그아웃", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(SideMenuActivity.this,"여기서 사용할 수 없습니다.",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).create().show();
    }

    //회원탈퇴 버튼 show dialog
    private void showDialogWithdrawal() {

        AlertDialog.Builder builder = new AlertDialog.Builder(SideMenuActivity.this);
        builder.setMessage("회원탈퇴 하시겠습니까?")
                .setTitle("회원탈퇴")
                .setPositiveButton("회원탈퇴", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Toast.makeText(SideMenuActivity.this,"여기서 사용할 수 없습니다.",Toast.LENGTH_SHORT).show();
                    }
                })
                .setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                }).create().show();
    }


}