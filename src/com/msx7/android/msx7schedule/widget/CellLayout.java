package com.msx7.android.msx7schedule.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public class CellLayout extends ViewGroup {

    public CellLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public CellLayout(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
    }

    public CellLayout(Context context) {
        super(context);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    public static  class CellLayoutParams extends ViewGroup.LayoutParams{

        public CellLayoutParams(LayoutParams arg0) {
            super(arg0);
        }

     

        public CellLayoutParams(int arg0, int arg1) {
            super(arg0, arg1);
        }
    }
}
