package com.supershopowner.app.ui.base;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.deanlib.ootb.manager.NetworkManager;
import com.supershopowner.app.data.entity.User;
import com.supershopowner.app.utils.UserManager;

import org.xutils.x;

/**
 * 
 * @author dean
 * @date 2016年4月26日
 */
public class BaseActivity extends AppCompatActivity implements UserManager.OnUserActionListener, NetworkManager.NetworkListener {



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		x.view().inject(this);

		UserManager.setOnUserActionListener(this);

		// 设置网络状态监听器
		NetworkManager.getInstance().addOnNetworkListener(this);
		
	}


	@Override
	protected void onSaveInstanceState(Bundle outState) {
//		super.onSaveInstanceState(outState);
	}

	@Override
	protected void onResume() {
		super.onResume();

//		MobclickAgent.onResume(this);
	}

	@Override
	protected void onPause() {
		super.onPause();

//		cancelAllRequestCancelable();

//		MobclickAgent.onPause(this);
	}

	@Override
	public void onLogin(User user) {

	}

	@Override
	public void onLogout() {

	}

	@Override
	public void onNetworkDisconnect() {

	}

	@Override
	public void onNetworkConnected(int type) {

	}

	public interface OnClickAppbarListener{

		public void onClick(View v);

	}

//	ArrayList<RequestCancelable> mRequestCancelableList;//页面网络请求的句柄
//
//
//	public void addRequestCancelable(RequestCancelable requestCancelable){
//
//		if(mRequestCancelableList==null&&requestCancelable!=null){
//
//			mRequestCancelableList = new ArrayList<RequestCancelable>();
//
//			mRequestCancelableList.add(requestCancelable);
//
//		}
//
//	}
//
//	public boolean removeRequestCancelable(RequestCancelable requestCancelable){
//
//		if(mRequestCancelableList!=null&&requestCancelable!=null){
//
//			requestCancelable.cancelable.cancel();
//
//			return mRequestCancelableList.remove(requestCancelable);
//
//		}
//
//		return false;
//
//	}
//
//	public void cancelAllRequestCancelable(){
//
//		if(mRequestCancelableList!=null){
//
//			for (RequestCancelable requestCancelable : mRequestCancelableList) {
//
//				requestCancelable.cancelable.cancel();
//
//			}
//
//			mRequestCancelableList.clear();
//
//		}
//
//	}
}
