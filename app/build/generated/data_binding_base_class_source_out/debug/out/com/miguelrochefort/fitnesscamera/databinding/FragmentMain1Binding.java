// Generated by view binder compiler. Do not edit!
package com.miguelrochefort.fitnesscamera.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.miguelrochefort.fitnesscamera.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentMain1Binding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final ImageView character;

  @NonNull
  public final ImageButton coinImage;

  @NonNull
  public final TextView coinNum;

  @NonNull
  public final ImageButton ibExercise;

  private FragmentMain1Binding(@NonNull LinearLayout rootView, @NonNull ImageView character,
      @NonNull ImageButton coinImage, @NonNull TextView coinNum, @NonNull ImageButton ibExercise) {
    this.rootView = rootView;
    this.character = character;
    this.coinImage = coinImage;
    this.coinNum = coinNum;
    this.ibExercise = ibExercise;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentMain1Binding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentMain1Binding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_main1, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentMain1Binding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.character;
      ImageView character = ViewBindings.findChildViewById(rootView, id);
      if (character == null) {
        break missingId;
      }

      id = R.id.coin_image;
      ImageButton coinImage = ViewBindings.findChildViewById(rootView, id);
      if (coinImage == null) {
        break missingId;
      }

      id = R.id.coin_num;
      TextView coinNum = ViewBindings.findChildViewById(rootView, id);
      if (coinNum == null) {
        break missingId;
      }

      id = R.id.ib_exercise;
      ImageButton ibExercise = ViewBindings.findChildViewById(rootView, id);
      if (ibExercise == null) {
        break missingId;
      }

      return new FragmentMain1Binding((LinearLayout) rootView, character, coinImage, coinNum,
          ibExercise);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
