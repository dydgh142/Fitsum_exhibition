// Generated by view binder compiler. Do not edit!
package com.miguelrochefort.fitnesscamera.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.miguelrochefort.fitnesscamera.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySidemenuBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final Button back;

  @NonNull
  public final TextView logout;

  @NonNull
  public final ConstraintLayout title;

  @NonNull
  public final TextView version;

  @NonNull
  public final TextView withdrawal;

  private ActivitySidemenuBinding(@NonNull LinearLayout rootView, @NonNull Button back,
      @NonNull TextView logout, @NonNull ConstraintLayout title, @NonNull TextView version,
      @NonNull TextView withdrawal) {
    this.rootView = rootView;
    this.back = back;
    this.logout = logout;
    this.title = title;
    this.version = version;
    this.withdrawal = withdrawal;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySidemenuBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySidemenuBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sidemenu, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySidemenuBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.back;
      Button back = ViewBindings.findChildViewById(rootView, id);
      if (back == null) {
        break missingId;
      }

      id = R.id.logout;
      TextView logout = ViewBindings.findChildViewById(rootView, id);
      if (logout == null) {
        break missingId;
      }

      id = R.id.title;
      ConstraintLayout title = ViewBindings.findChildViewById(rootView, id);
      if (title == null) {
        break missingId;
      }

      id = R.id.version;
      TextView version = ViewBindings.findChildViewById(rootView, id);
      if (version == null) {
        break missingId;
      }

      id = R.id.withdrawal;
      TextView withdrawal = ViewBindings.findChildViewById(rootView, id);
      if (withdrawal == null) {
        break missingId;
      }

      return new ActivitySidemenuBinding((LinearLayout) rootView, back, logout, title, version,
          withdrawal);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
