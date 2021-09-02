package defpackage;

/* renamed from: age reason: default package */
/* compiled from: PG */
public final class age implements android.view.View.OnLayoutChangeListener {
    private final /* synthetic */ android.support.v7.widget.SearchView a;

    public age(android.support.v7.widget.SearchView searchView) {
        this.a = searchView;
    }

    public final void onLayoutChange(android.view.View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int i9;
        int i10;
        android.support.v7.widget.SearchView searchView = this.a;
        if (searchView.g.getWidth() > 1) {
            android.content.res.Resources resources = searchView.getContext().getResources();
            int paddingLeft = searchView.b.getPaddingLeft();
            android.graphics.Rect rect = new android.graphics.Rect();
            boolean a2 = defpackage.ahr.a(searchView);
            if (searchView.m) {
                i9 = resources.getDimensionPixelSize(2131689514) + resources.getDimensionPixelSize(2131689513);
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
