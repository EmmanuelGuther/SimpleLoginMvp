package com.emmanuelguther.simpleloginmvp.views;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ProgressBar;

import com.emmanuelguther.simpleloginmvp.R;
import com.emmanuelguther.simpleloginmvp.presenters.LoginPresenter;
import com.emmanuelguther.simpleloginmvp.presenters.LoginPresenterImpl;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LoginActivity extends AppCompatActivity implements LoginView {

    @BindView(R.id.editText)
    EditText etUserName;
    @BindView(R.id.editText2)
    EditText etUserPassword;
    @BindView(R.id.imageButton)
    ImageButton imageButton;
    @BindView(R.id.progressBar)
    ProgressBar progressBar;
    LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ButterKnife.bind(this);
        loginPresenter = new LoginPresenterImpl(this);
    }


    @OnClick(R.id.imageButton)
    public void onViewClicked() {
        loginPresenter.validate(etUserName.getText().toString(), etUserPassword.getText().toString());

    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        etUserName.setVisibility(View.INVISIBLE);
        etUserPassword.setVisibility(View.INVISIBLE);

    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        etUserName.setVisibility(View.VISIBLE);
        etUserPassword.setVisibility(View.VISIBLE);

    }

    @Override
    public void setUsernameError() {
        etUserName.setError(getString(R.string.Error));
    }

    @Override
    public void setUserPasswordError() {
        etUserPassword.setError(getString(R.string.Error));
    }

    @Override
    public void goToNextActivity() {
        startActivity(new Intent(this, HomeActivity.class)); finish();
    }

}
