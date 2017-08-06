package com.emmanuelguther.simpleloginmvp.interactors;

/**
 * Created by emmanuelgh on 6/8/17.
 */

public interface LoginInteractor {

    interface OnLoginFinishedListener {
        void onUsernameError();

        void onPasswordError();

        void onSuccess();
    }

    void login(String user, String userPassword, OnLoginFinishedListener listener);

}