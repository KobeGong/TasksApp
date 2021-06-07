package defpackage;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewTreeObserver;
import android.widget.ListAdapter;
import android.widget.SpinnerAdapter;

/* access modifiers changed from: package-private */
/* renamed from: ace  reason: default package */
/* compiled from: PG */
public final class ace extends aec {
    public CharSequence a;
    public ListAdapter b;
    public final Rect c = new Rect();
    public final /* synthetic */ acb d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ace(acb acb, Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.d = acb;
        this.l = acb;
        b();
        this.m = new acf(this);
    }

    @Override // defpackage.aec
    public final void a(ListAdapter listAdapter) {
        super.a(listAdapter);
        this.b = listAdapter;
    }

    /* access modifiers changed from: package-private */
    public final void a() {
        int i;
        int i2;
        int i3;
        Drawable background = this.r.getBackground();
        if (background != null) {
            background.getPadding(this.d.c);
            if (ahr.a(this.d)) {
                i3 = this.d.c.right;
            } else {
                i3 = -this.d.c.left;
            }
            i = i3;
        } else {
            Rect rect = this.d.c;
            this.d.c.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = this.d.getPaddingLeft();
        int paddingRight = this.d.getPaddingRight();
        int width = this.d.getWidth();
        if (this.d.b == -2) {
            int a2 = this.d.a((SpinnerAdapter) this.b, this.r.getBackground());
            int i4 = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.c.left) - this.d.c.right;
            if (a2 <= i4) {
                i4 = a2;
            }
            b(Math.max(i4, (width - paddingLeft) - paddingRight));
        } else if (this.d.b == -1) {
            b((width - paddingLeft) - paddingRight);
        } else {
            b(this.d.b);
        }
        if (ahr.a(this.d)) {
            i2 = ((width - paddingRight) - this.f) + i;
        } else {
            i2 = i + paddingLeft;
        }
        this.g = i2;
    }

    @Override // defpackage.zz, defpackage.aec
    public final void d() {
        ViewTreeObserver viewTreeObserver;
        boolean isShowing = this.r.isShowing();
        a();
        h();
        super.d();
        this.e.setChoiceMode(1);
        int selectedItemPosition = this.d.getSelectedItemPosition();
        ade ade = this.e;
        if (this.r.isShowing() && ade != null) {
            ade.a = false;
            ade.setSelection(selectedItemPosition);
            if (ade.getChoiceMode() != 0) {
                ade.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing && (viewTreeObserver = this.d.getViewTreeObserver()) != null) {
            acg acg = new acg(this);
            viewTreeObserver.addOnGlobalLayoutListener(acg);
            a(new ach(this, acg));
        }
    }
}
