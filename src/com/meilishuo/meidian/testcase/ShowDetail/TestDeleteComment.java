package com.meilishuo.meidian.testcase.ShowDetail;

import android.util.Log;
import com.meilishuo.meidian.init.BaseClass;
import com.meilishuo.meidian.init.Discover;
import com.meilishuo.meidian.page.ShowDetailPage;
import com.meilishuo.meidian.page.UserShowListPage;

/**
 * Created by MLS on 15/9/28.
 */
public class TestDeleteComment extends BaseClass {
    @Discover
    public void testClickComment() {
        init();
        solo.scrollToBottom();
        solo.sleep(1000);
        //点击我的发布
        solo.clickOnText("^我的发布$");
        Log.d(TAG, "点击我的发布");
        solo.sleep(1000);

        //启动我的发布页面
        UserShowListPage.get_UserShowList(solo);
        Log.d(TAG, "启动我的发布页面");
        solo.sleep(3000);

        //点击发布
        UserShowListPage.click_Show(solo, 0);
        solo.sleep(1000);

        //进入动态详情页
        ShowDetailPage.get_showdetail(solo);
        Log.d(TAG, "启动动态详情页");
        solo.sleep(3000);

        solo.scrollToBottom();
        solo.sleep(1000);

        //删除评论
        ShowDetailPage.click_delete(solo);
        solo.sleep(1000);










    }
}
