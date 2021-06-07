package android.support.v7.view.menu;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

/* compiled from: PG */
public final class ExpandedMenuView extends ListView implements AdapterView.OnItemClickListener, zg, zv {
    private static final int[] a = {16842964, 16843049};
    private ze b;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 16842868);
    }

    public ExpandedMenuView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        agw a2 = agw.a(context, attributeSet, a, i, 0);
        if (a2.f(0)) {
            setBackgroundDrawable(a2.a(0));
        }
        if (a2.f(1)) {
            setDivider(a2.a(1));
        }
        a2.b.recycle();
    }

    @Override // defpackage.zv
    public final void a(ze zeVar) {
        this.b = zeVar;
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // defpackage.zg
    public final boolean a(zi ziVar) {
        return this.b.a(ziVar, (zt) null, 0);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((zi) getAdapter().getItem(i));
    }
}
