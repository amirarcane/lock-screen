package com.amirarcane.lockscreen.andrognito.pinlockview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by aritraroy on 31/05/16.
 */
public class ItemSpaceDecoration extends RecyclerView.ItemDecoration {

    private final int mHorizontalSpaceWidth;
    private final int mVerticalSpaceHeight;
    private final int mSpanCount;
    private final boolean mIncludeEdge;

    public ItemSpaceDecoration(int horizontalSpaceWidth, int verticalSpaceHeight, int spanCount, boolean includeEdge) {
        this.mHorizontalSpaceWidth = horizontalSpaceWidth;
        this.mVerticalSpaceHeight = verticalSpaceHeight;
        this.mSpanCount = spanCount;
        this.mIncludeEdge = includeEdge;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {

        int position = parent.getChildAdapterPosition(view);
        int column = position % mSpanCount;

        if (mIncludeEdge) {
            outRect.right = mHorizontalSpaceWidth - column * mHorizontalSpaceWidth / mSpanCount;
            outRect.left = (column + 1) * mHorizontalSpaceWidth / mSpanCount;

            if (position < mSpanCount) {
                outRect.top = mVerticalSpaceHeight;
            }
            outRect.bottom = mVerticalSpaceHeight;
        } else {
            outRect.right = column * mHorizontalSpaceWidth / mSpanCount;
            outRect.left = mHorizontalSpaceWidth - (column + 1) * mHorizontalSpaceWidth / mSpanCount;
            if (position >= mSpanCount) {
                outRect.top = mVerticalSpaceHeight;
            }
        }
    }
}
