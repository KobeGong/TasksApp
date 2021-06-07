package defpackage;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;

/* renamed from: di  reason: default package */
/* compiled from: PG */
public class di extends gx {
    private dj a;
    private int b = 0;

    public di() {
    }

    public di(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.gx
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i) {
        b(coordinatorLayout, view, i);
        if (this.a == null) {
            this.a = new dj(view);
        }
        this.a.a();
        if (this.b == 0) {
            return true;
        }
        this.a.a(this.b);
        this.b = 0;
        return true;
    }

    /* access modifiers changed from: protected */
    public void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        coordinatorLayout.a(view, i);
    }

    public final boolean a_(int i) {
        if (this.a != null) {
            return this.a.a(i);
        }
        this.b = i;
        return false;
    }

    public final int c() {
        if (this.a != null) {
            return this.a.b;
        }
        return 0;
    }
}
