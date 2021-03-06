package com.supershopowner.app.ui.base;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.supershopowner.app.data.entity.User;
import com.supershopowner.app.utils.UserManager;

import org.xutils.common.Callback;
import org.xutils.x;

/**
 * Created by wyouflf on 15/11/4.
 */
public class BaseFragment extends Fragment implements UserManager.OnUserActionListener{

    private boolean injected = false;

    public Callback.Cancelable httpCallback;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        injected = true;
        return x.view().inject(this, inflater, container);


    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
//        super.onSaveInstanceState(outState);
    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        if (!injected) {
            x.view().inject(this, this.getView());

            UserManager.setOnUserActionListener(this);
        }
    }

    public void reload(){

    }


    @Override
    public void onDestroy() {
        super.onDestroy();

        if(httpCallback!=null){

            httpCallback.cancel();

        }
    }

    @Override
    public void onLogin(User user) {

    }

    @Override
    public void onLogout() {

    }


}
