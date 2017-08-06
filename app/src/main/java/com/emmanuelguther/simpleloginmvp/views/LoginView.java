package com.emmanuelguther.simpleloginmvp.views;

/**
 * Created by emmanuelgh on 6/8/17.
 */

public interface LoginView{

    void showProgress();

    void hideProgress();

    void setUsernameError();

    void setPasswordError();

    void goToNextActivity();
}
