package defpackage;

/* renamed from: dg reason: default package */
/* compiled from: PG */
public abstract class dg extends defpackage.di {
    public final android.graphics.Rect a = new android.graphics.Rect();
    public int b = 0;
    public int c;
    private final android.graphics.Rect d = new android.graphics.Rect();

    public dg() {
    }

    public abstract android.view.View a(java.util.List list);

    public dg(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public boolean a(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = view.getLayoutParams().height;
        if (i6 == -1 || i6 == -2) {
            android.view.View a2 = a(coordinatorLayout.a(view));
            if (a2 != null) {
                if (defpackage.sn.a.h(a2) && !defpackage.sn.a.h(view)) {
                    defpackage.sn.b(view, true);
                    if (defpackage.sn.a.h(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = android.view.View.MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                int c2 = c(a2) + (size - a2.getMeasuredHeight());
                if (i6 == -1) {
                    i5 = 1073741824;
                } else {
                    i5 = Integer.MIN_VALUE;
                }
                coordinatorLayout.a(view, i, i2, android.view.View.MeasureSpec.makeMeasureSpec(c2, i5), i4);
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    public final void b(android.support.design.widget.CoordinatorLayout coordinatorLayout, android.view.View view, int i) {
        android.view.View a2 = a(coordinatorLayout.a(view));
        if (a2 != null) {
            defpackage.ha haVar = (defpackage.ha) view.getLayoutParams();
            android.graphics.Rect rect = this.a;
            rect.set(coordinatorLayout.getPaddingLeft() + haVar.leftMargin, a2.getBottom() + haVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - haVar.rightMargin, ((coordinatorLayout.getHeight() + a2.getBottom()) - coordinatorLayout.getPaddingBottom()) - haVar.bottomMargin);
            defpackage.tk tkVar = coordinatorLayout.b;
            if (tkVar != null && defpackage.sn.a.h(coordinatorLayout) && !defpackage.sn.a.h(view)) {
                rect.left += tkVar.a();
                rect.right -= tkVar.c();
            }
            android.graphics.Rect rect2 = this.d;
            int i2 = haVar.c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            defpackage.jd.a(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int d2 = d(a2);
            view.layout(rect2.left, rect2.top - d2, rect2.right, rect2.bottom - d2);
            this.b = rect2.top - a2.getBottom();
            return;
        }
        super.b(coordinatorLayout, view, i);
        this.b = 0;
    }

    public float b(android.view.View view) {
        return 1.0f;
    }

    public final int d(android.view.View view) {
        if (this.c == 0) {
            return 0;
        }
        return defpackage.gm.a((int) (b(view) * ((float) this.c)), 0, this.c);
    }

    public int c(android.view.View view) {
        return view.getMeasuredHeight();
    }
}
