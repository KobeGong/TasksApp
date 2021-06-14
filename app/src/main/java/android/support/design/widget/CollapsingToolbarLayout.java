package android.support.design.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import defpackage.db;
import defpackage.dd;

@Deprecated
/* compiled from: PG */
public class CollapsingToolbarLayout extends db {
    public CollapsingToolbarLayout(Context context) {
        super(context);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public CollapsingToolbarLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    @Override // android.widget.FrameLayout, android.widget.FrameLayout, defpackage.db, defpackage.db, android.view.ViewGroup
    public FrameLayout.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new dd(getContext(), attributeSet, (byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.db
    public final FrameLayout.LayoutParams a(ViewGroup.LayoutParams layoutParams) {
        return new dd(layoutParams, (byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.db
    public final /* synthetic */ dd a() {
        return new dd((byte) 0);
    }

    /* access modifiers changed from: protected */
    @Override // android.widget.FrameLayout, defpackage.db, android.view.ViewGroup
    public /* synthetic */ ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateLayoutParams(layoutParams);
    }
}
