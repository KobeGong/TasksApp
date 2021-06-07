package defpackage;

import android.content.res.Resources;
import android.graphics.Rect;
import android.support.v7.widget.SearchView;
import android.view.View;
import com.google.android.apps.tasks.R;

/* renamed from: age  reason: default package */
/* compiled from: PG */
public final class age implements View.OnLayoutChangeListener {
    private final /* synthetic */ SearchView a;

    public age(SearchView searchView) {
        this.a = searchView;
    }

    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        SearchView searchView = this.a;
        if (searchView.g.getWidth() > 1) {
            Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.b.getPaddingLeft();
            Rect rect = new Rect();
            boolean a2 = ahr.a(searchView);
            if (searchView.m) {
                i9 = resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_text_padding_left) + resources.getDimensionPixelSize(R.dimen.abc_dropdownitem_icon_width);
            } else {
                i9 = 0;
            }
            searchView.a.getDropDownBackground().getPadding(rect);
            if (a2) {
                i10 = -rect.left;
            } else {
                i10 = paddingLeft - (rect.left + i9);
            }
            searchView.a.setDropDownHorizontalOffset(i10);
            searchView.a.setDropDownWidth((i9 + ((searchView.g.getWidth() + rect.left) + rect.right)) - paddingLeft);
        }
    }
}
