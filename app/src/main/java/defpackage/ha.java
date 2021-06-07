package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: ha  reason: default package */
/* compiled from: PG */
public final class ha extends ViewGroup.MarginLayoutParams {
    public gx a;
    public boolean b = false;
    public int c = 0;
    public int d = 0;
    public int e = -1;
    public int f = -1;
    public int g = 0;
    public int h = 0;
    public int i;
    public int j;
    public View k;
    public View l;
    public boolean m;
    public boolean n;
    public final Rect o = new Rect();
    private boolean p;
    private boolean q;

    public ha(int i2, int i3) {
        super(i2, i3);
    }

    public ha(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, co.b);
        this.c = obtainStyledAttributes.getInteger(co.c, 0);
        this.f = obtainStyledAttributes.getResourceId(co.d, -1);
        this.d = obtainStyledAttributes.getInteger(co.e, 0);
        this.e = obtainStyledAttributes.getInteger(co.i, -1);
        this.g = obtainStyledAttributes.getInt(co.h, 0);
        this.h = obtainStyledAttributes.getInt(co.g, 0);
        this.b = obtainStyledAttributes.hasValue(co.f);
        if (this.b) {
            this.a = CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(co.f));
        }
        obtainStyledAttributes.recycle();
        if (this.a != null) {
            this.a.a(this);
        }
    }

    public ha(ha haVar) {
        super((ViewGroup.MarginLayoutParams) haVar);
    }

    public ha(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public ha(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public final void a(gx gxVar) {
        if (this.a != gxVar) {
            this.a = gxVar;
            this.b = true;
            if (gxVar != null) {
                gxVar.a(this);
            }
        }
    }

    public final void a(int i2, boolean z) {
        switch (i2) {
            case 0:
                this.p = z;
                return;
            case 1:
                this.q = z;
                return;
            default:
                return;
        }
    }

    public final boolean a(int i2) {
        switch (i2) {
            case 0:
                return this.p;
            case 1:
                return this.q;
            default:
                return false;
        }
    }
}
