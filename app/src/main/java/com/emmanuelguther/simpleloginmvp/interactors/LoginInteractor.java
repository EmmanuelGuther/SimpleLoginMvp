package com.emmanuelguther.simpleloginmvp.interactors;

/**
 * Created by emmanuelgh on 6/8/17.
 */

public interface LoginInteractor {

    interface OnLoginFinishedListener {
        void onUserNameError();

        void onUserPasswordError();

        void onSuccess();
    }

    void login(String userName, String userPassword, OnLoginFinishedListener listener);

}