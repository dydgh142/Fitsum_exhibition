package org.fitsum.Fragment;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import com.miguelrochefort.fitnesscamera.R;

import org.fitsum.API.ProfileAPI;
import org.fitsum.AppTest;
import org.fitsum.CoinActivity;
import org.fitsum.Dto.UserDto;
import org.fitsum.PosenetActivity;
import org.fitsum.RetrofitAPI.config.RetrofitBuilder;
import org.fitsum.CameraActivity;

public class Main1Fragment extends Fragment {

    private ImageButton ib_exercise;
    ImageView character;

    private TextView coin_num;
    private Integer Item;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main1, container, false);

        character = (ImageView) view.findViewById(R.id.character);
        coin_num = (TextView) view.findViewById(R.id.coin_num);

        //유저의 옷상태에 맞춰 이미지를 띄어주기
        //메인 1번에 올때마다 실행해야함.
        change_item();

        coin_num.setText("999");

        Item = ((AppTest) getActivity().getApplication()).getUserItem();
        Log.d("Item", String.valueOf(Item));

        //운동하러 가기
        ib_exercise = (ImageButton) view.findViewById(R.id.ib_exercise);
        ib_exercise.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(), PosenetActivity.class);
                intent.putExtra("userItem", Item);

                getActivity().startActivity(new Intent(getActivity(), CameraActivity.class));
            }
        });

        //상점
        coin_num = (TextView) view.findViewById(R.id.coin_num);
        coin_num.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), CoinActivity.class));
            }
        });


        return view;

    }

    //처음화면의 캐릭터 설정
    private void change_item() {
        //현재 유저의 옷 정보를 받아와서 그에 맞는 이미지 대입.
        Integer userItem = ((AppTest) getActivity().getApplication()).getUserItem();

        //아이템
        if (userItem == 1) {
            character.setImageResource(R.drawable.man_1);
        } else if (userItem == 2) {
            character.setImageResource(R.drawable.man_2);
        } else if (userItem == 3) {
            character.setImageResource(R.drawable.man_3);
        } else if (userItem == 4) {
            character.setImageResource(R.drawable.man_4);
        } else if (userItem == 5) {
            character.setImageResource(R.drawable.man_5);
        } else if (userItem == 6) {
            character.setImageResource(R.drawable.man_6);
        } else if (userItem == 7) {
            character.setImageResource(R.drawable.man_7);
        } else if (userItem == 8) {
            character.setImageResource(R.drawable.man_8);
        } else if (userItem == 9) {
            character.setImageResource(R.drawable.man_9);
        } else if (userItem == 10) {
            character.setImageResource(R.drawable.woman_10);
        } else if (userItem == 11) {
            character.setImageResource(R.drawable.woman_11);
        } else if (userItem == 12) {
            character.setImageResource(R.drawable.woman_12);
        } else if (userItem == 13) {
            character.setImageResource(R.drawable.woman_13);
        } else if (userItem == 14) {
            character.setImageResource(R.drawable.woman_14);
        } else if (userItem == 15) {
            character.setImageResource(R.drawable.woman_15);
        } else if (userItem == 16) {
            character.setImageResource(R.drawable.woman_16);
        } else if (userItem == 17) {
            character.setImageResource(R.drawable.woman_17);
        } else if (userItem == 18) {
            character.setImageResource(R.drawable.woman_18);
        }

    }



}

