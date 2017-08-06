package com.emmanuelguther.simpleloginmvp.interactors;

import android.os.Handler;
import com.emmanuelguther.simpleloginmvp.utils.TextHelper;


/**
 * Created by emmanuelgh on 6/8/17.
 */

public class LoginInteractorImpl implements LoginInteractor {
    @Override
    public void login(final String userName, final String userPassword, final LoginInteractor.OnLoginFinishedListener listener) {
        //FAKE
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                boolean isError = false;
                if (TextHelper.isTextEmpty(userName)) {
                    listener.onUserNameError();
                    isError = true;
                }
                if (TextHelper.isTextEmpty(userPassword)) {
                    listener.onUserPasswordError();
                    isError = true;
                }
                if (!isError) {
                    //Here, we should send to validate to our backend, we must have a repository class that will make life easier and be responsible for making the decision to choose if we validate against a repository or another
                    listener.onSuccess();
                }
            }
        }, 2000);
    }
}
