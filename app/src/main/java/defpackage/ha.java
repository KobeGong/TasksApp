package defpackage;

/* renamed from: ha reason: default package */
/* compiled from: PG */
public final class ha extends android.view.ViewGroup.MarginLayoutParams {
    public defpackage.gx a;
    public boolean b = false;
    public int c = 0;
    public int d = 0;
    public int e = -1;
    public int f = -1;
    public int g = 0;
    public int h = 0;
    public int i;
    public int j;
    public android.view.View k;
    public android.view.View l;
    public boolean m;
    public boolean n;
    public final android.graphics.Rect o = new android.graphics.Rect();
    private boolean p;
    private boolean q;

    public ha(int i2, int i3) {
        super(i2, i3);
    }

    public ha(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        android.content.res.TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, defpackage.co.b);
        this.c = obtainStyledAttributes.getInteger(defpackage.co.c, 0);
        this.f = obtainStyledAttributes.getResourceId(defpackage.co.d, -1);
        this.d = obtainStyledAttributes.getInteger(defpackage.co.e, 0);
        this.e = obtainStyledAttributes.getInteger(defpackage.co.i, -1);
        this.g = obtainStyledAttributes.getInt(defpackage.co.h, 0);
        this.h = obtainStyledAttributes.getInt(defpackage.co.g, 0);
        this.b = obtainStyledAttributes.hasValue(defpackage.co.f);
        if (this.b) {
            this.a = android.support.design.widget.CoordinatorLayout.a(context, attributeSet, obtainStyledAttributes.getString(defpackage.co.f));
        }
        obtainStyledAttributes.recycle();
        if (this.a != null) {
            this.a.a(this);
        }
    }

    public ha(defpackage.ha haVar) {
        super(haVar);
    }

    public ha(android.view.ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
    }

    public ha(android.view.ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
    }

    public final void a(defpackage.gx gxVar) {
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
