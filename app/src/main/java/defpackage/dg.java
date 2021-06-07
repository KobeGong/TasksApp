package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import java.util.List;

/* renamed from: dg  reason: default package */
/* compiled from: PG */
public abstract class dg extends di {
    public final Rect a = new Rect();
    public int b = 0;
    public int c;
    private final Rect d = new Rect();

    public dg() {
    }

    public abstract View a(List list);

    public dg(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.gx
    public boolean a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        View a2;
        int i5;
        int i6 = view.getLayoutParams().height;
        if ((i6 != -1 && i6 != -2) || (a2 = a(coordinatorLayout.a(view))) == null) {
            return false;
        }
        if (sn.a.h(a2) && !sn.a.h(view)) {
            sn.b(view, true);
            if (sn.a.h(view)) {
                view.requestLayout();
                return true;
            }
        }
        int size = View.MeasureSpec.getSize(i3);
        if (size == 0) {
            size = coordinatorLayout.getHeight();
        }
        int c2 = c(a2) + (size - a2.getMeasuredHeight());
        if (i6 == -1) {
            i5 = 1073741824;
        } else {
            i5 = Integer.MIN_VALUE;
        }
        coordinatorLayout.a(view, i, i2, View.MeasureSpec.makeMeasureSpec(c2, i5), i4);
        return true;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.di
    public final void b(CoordinatorLayout coordinatorLayout, View view, int i) {
        View a2 = a(coordinatorLayout.a(view));
        if (a2 != null) {
            ha haVar = (ha) view.getLayoutParams();
            Rect rect = this.a;
            rect.set(coordinatorLayout.getPaddingLeft() + haVar.leftMargin, a2.getBottom() + haVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - haVar.rightMargin, ((coordinatorLayout.getHeight() + a2.getBottom()) - coordinatorLayout.getPaddingBottom()) - haVar.bottomMargin);
            tk tkVar = coordinatorLayout.b;
            if (tkVar != null && sn.a.h(coordinatorLayout) && !sn.a.h(view)) {
                rect.left += tkVar.a();
                rect.right -= tkVar.c();
            }
            Rect rect2 = this.d;
            int i2 = haVar.c;
            if (i2 == 0) {
                i2 = 8388659;
            }
            jd.a(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int d2 = d(a2);
            view.layout(rect2.left, rect2.top - d2, rect2.right, rect2.bottom - d2);
            this.b = rect2.top - a2.getBottom();
            return;
        }
        super.b(coordinatorLayout, view, i);
        this.b = 0;
    }

    public float b(View view) {
        return 1.0f;
    }

    public final int d(View view) {
        if (this.c == 0) {
            return 0;
        }
        return gm.a((int) (b(view) * ((float) this.c)), 0, this.c);
    }

    public int c(View view) {
        return view.getMeasuredHeight();
    }
}
