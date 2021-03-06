package com.koma.wanandroid.contract

import android.os.Bundle
import android.support.v4.widget.SwipeRefreshLayout
import com.koma.component_base.base.BaseResponse
import com.koma.component_base.bean.w.BannerData
import com.koma.component_base.mvp.inter.IModel
import com.koma.component_base.mvp.inter.IPresenter
import com.koma.component_base.mvp.inter.IView
import com.koma.wanandroid.bean.ArticleBean
import io.reactivex.Observable
import java.util.*

/**
 * @author Koma
 * @date 2018/7/27 下午 04:31
 * @des
 */
interface HomeContract {

  interface View : IView


  interface Presenter : IPresenter<View> {
    fun loadBanner()

    fun playBanner()
    fun stopBanner()
    fun saveInstanceState(bundle: Bundle)

    fun getArticleList(isRefresh: Boolean, refreshLayout: SwipeRefreshLayout?, page: Int)
  }


  interface Model : IModel {
    val bannerData: Observable<BaseResponse<List<BannerData>>>


    fun getArticleListData(page: Int): Observable<BaseResponse<ArticleBean.DataBean>>

  }
}
