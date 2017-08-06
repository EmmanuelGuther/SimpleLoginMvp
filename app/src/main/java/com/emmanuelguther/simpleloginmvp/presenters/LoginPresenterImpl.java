package com.emmanuelguther.simpleloginmvp.presenters;

import com.emmanuelguther.simpleloginmvp.interactors.LoginInteractor;
import com.emmanuelguther.simpleloginmvp.interactors.LoginInteractorImpl;
import com.emmanuelguther.simpleloginmvp.views.LoginView;

/**
 * Created by emmanuelgh on 6/8/17.
 */

public class LoginPresenterImpl implements LoginPresenter, LoginInteractor.OnLoginFinishedListener {

    private LoginView loginView;
    private LoginInteractor loginInteractor;

    public LoginPresenterImpl(LoginView loginView) {
        this.loginView = loginView;
        this.loginInteractor = new LoginInteractorImpl();
    }

    @Override
    public void validate(String user, String userPassword) {
        loginView.showProgress();
        loginInteractor.login(user, userPassword, this);
    }

    @Override
    public void onUserNameError() {
        loginView.hideProgress();
        loginView.setUsernameError();
    }

    @Override
    public void onUserPasswordError() {
        loginView.hideProgress();
        loginView.setUserPasswordError();
    }

    @Override
    public void onSuccess() {
        loginView.hideProgress();
        loginView.goToNextActivity();
    }
}
