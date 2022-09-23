// Generated by data binding compiler. Do not edit!
package com.example.lab3.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import com.example.lab3.R;
import java.lang.Deprecated;
import java.lang.Object;

public abstract class ActivityMultipleChoiceQuestionBinding extends ViewDataBinding {
  @NonNull
  public final Button button;

  @NonNull
  public final TextView questionText;

  @NonNull
  public final RadioButton radioButton2;

  @NonNull
  public final RadioButton radioButton3;

  @NonNull
  public final RadioButton radioButton4;

  @NonNull
  public final RadioButton radioButton5;

  @NonNull
  public final RadioGroup radioGroup;

  protected ActivityMultipleChoiceQuestionBinding(Object _bindingComponent, View _root,
      int _localFieldCount, Button button, TextView questionText, RadioButton radioButton2,
      RadioButton radioButton3, RadioButton radioButton4, RadioButton radioButton5,
      RadioGroup radioGroup) {
    super(_bindingComponent, _root, _localFieldCount);
    this.button = button;
    this.questionText = questionText;
    this.radioButton2 = radioButton2;
    this.radioButton3 = radioButton3;
    this.radioButton4 = radioButton4;
    this.radioButton5 = radioButton5;
    this.radioGroup = radioGroup;
  }

  @NonNull
  public static ActivityMultipleChoiceQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot) {
    return inflate(inflater, root, attachToRoot, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_multiple_choice_question, root, attachToRoot, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMultipleChoiceQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup root, boolean attachToRoot, @Nullable Object component) {
    return ViewDataBinding.<ActivityMultipleChoiceQuestionBinding>inflateInternal(inflater, R.layout.activity_multiple_choice_question, root, attachToRoot, component);
  }

  @NonNull
  public static ActivityMultipleChoiceQuestionBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.inflate(inflater, R.layout.activity_multiple_choice_question, null, false, component)
   */
  @NonNull
  @Deprecated
  public static ActivityMultipleChoiceQuestionBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable Object component) {
    return ViewDataBinding.<ActivityMultipleChoiceQuestionBinding>inflateInternal(inflater, R.layout.activity_multiple_choice_question, null, false, component);
  }

  public static ActivityMultipleChoiceQuestionBinding bind(@NonNull View view) {
    return bind(view, DataBindingUtil.getDefaultComponent());
  }

  /**
   * This method receives DataBindingComponent instance as type Object instead of
   * type DataBindingComponent to avoid causing too many compilation errors if
   * compilation fails for another reason.
   * https://issuetracker.google.com/issues/116541301
   * @Deprecated Use DataBindingUtil.bind(view, component)
   */
  @Deprecated
  public static ActivityMultipleChoiceQuestionBinding bind(@NonNull View view,
      @Nullable Object component) {
    return (ActivityMultipleChoiceQuestionBinding)bind(component, view, R.layout.activity_multiple_choice_question);
  }
}
