// Generated code from Butter Knife. Do not modify!
package com.zhicai.byteera.activity.myhome.activity;

import android.view.View;
import butterknife.ButterKnife.Finder;
import butterknife.ButterKnife.ViewBinder;

public class MyDynamicActivity$$ViewBinder<T extends com.zhicai.byteera.activity.myhome.activity.MyDynamicActivity> implements ViewBinder<T> {
  @Override public void bind(final Finder finder, final T target, Object source) {
    View view;
    view = finder.findRequiredView(source, 2131427573, "field 'mListView' and method 'itemLongClickListener'");
    target.mListView = finder.castView(view, 2131427573, "field 'mListView'");
    ((android.widget.AdapterView<?>) view).setOnItemLongClickListener(
      new android.widget.AdapterView.OnItemLongClickListener() {
        @Override public boolean onItemLongClick(
          android.widget.AdapterView<?> p0,
          android.view.View p1,
          int p2,
          long p3
        ) {
          return target.itemLongClickListener(p2);
        }
      });
    view = finder.findRequiredView(source, 2131427460, "field 'mHeadView'");
    target.mHeadView = finder.castView(view, 2131427460, "field 'mHeadView'");
  }

  @Override public void unbind(T target) {
    target.mListView = null;
    target.mHeadView = null;
  }
}
