package com.cellnine.android;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.AbsListView;
import android.widget.ListAdapter;

public class HorizontalListView extends AbsListView {

    public HorizontalListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    @Override
    public ListAdapter getAdapter() {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void setSelection(int i) {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
