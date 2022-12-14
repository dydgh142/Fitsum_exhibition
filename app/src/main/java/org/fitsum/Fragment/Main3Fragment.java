package org.fitsum.Fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import androidx.annotation.NonNull;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.core.content.ContextCompat;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.miguelrochefort.fitnesscamera.R;

import org.fitsum.API.BoardAPI;
import org.fitsum.API.BoardListAPI;
import org.fitsum.BoardActivity;
import org.fitsum.Dto.BoardDto;
import org.fitsum.Dto.CommonResult;
import org.fitsum.Dto.SingleResult;
import org.fitsum.RetrofitAPI.config.RetrofitBuilder;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Main3Fragment extends Fragment {

    private ImageButton write;


    @Override
    public void onCreate(Bundle savedlnstanceState) {
        super.onCreate(savedlnstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_main3, container, false);
        //글 쓰러 가는 버튼 (BoardAcitivty)
        write = (ImageButton) view.findViewById(R.id.write);

        //게시판 쓰러가기 버튼 누르면 게시판 액티비티 열기
        write.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startActivity(new Intent(getActivity(), BoardActivity.class));
            }
        });


        return view;
    }


}