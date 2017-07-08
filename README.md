
#### 对工程目录的解释

* app
	* App.java（Application类）
	* Constants.java（常量类）
* data
	* entity（实体包）
	* io（网络请求包）
* service（服务）
* ui（UI相关）
	* adapter（适配器包，通用的适配器可以重构到此）
	* view（界面 Activity&Fragment）
	* widget(自定义View)
* utils（工具）
	* UserManager.java（用户管理类）

#### 用到的框架

* [xUtils3](https://github.com/wyouflf/xUtils3) 3.5.0
* [fastjson](https://github.com/alibaba/fastjson) 3.7.0
* [glide](https://github.com/bumptech/glide) 1.2.31
* [RxBinding](https://github.com/JakeWharton/RxBinding) 0.4.0
* [RxPermissions](https://github.com/tbruyelle/RxPermissions) 0.9.3
* [Android-ViewPagerIndicator](https://github.com/InkApplications/Android-ViewPagerIndicator) 2.4.3
* [ootb](https://github.com/Dean1990/ootb) 工具类集合，具体内容参看ootb的[README.md](https://github.com/Dean1990/ootb/blob/master/README.md)

#### 使用
* Activity都继承 BaseActivity,Fragment都继承 BaseFragment;
* 一般的接口请求直接继承 Request(ootb)，便于统一管理，对于构造方法的参数context，尽量传Activity;
* 实体类都继承 BaseEntity(ootb)或BaseEntity的子类;
* 日志可以使用DLogUtils(ootb) 或 xUtils的LogUtils;
* 图片加载尽量用glide，xUtils的image.load有缓存BUG...
