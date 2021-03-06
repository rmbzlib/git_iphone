package com.meilishuo.meidian.testcase.my;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.MiaoHomePage;
import com.meilishuo.meidian.page.SearchPersonPage;

/**
 * Created by MLS on 15/9/16.
 */
public class TestFollowPageClickCancel extends BaseClass {
    @Discover
    public void testFollowPageClickCancel() {
        //初始化
        init();
        //点击关注
        MiaoHomePage.getClickFollow(solo);
        solo.sleep(2000);

        //启动关注页面
        SearchPersonPage.get_SearchPerson(solo);
        Log.d(TAG, "启动关注页面");
        solo.sleep(1000);

        //点击搜索框
        SearchPersonPage.clickSearch(solo);
        solo.sleep(1000);


        //点击取消按钮
        SearchPersonPage.clickCancel(solo);
        solo.sleep(1000);

    }
}
