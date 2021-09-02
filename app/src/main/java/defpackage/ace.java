package defpackage;

/* renamed from: ace reason: default package */
/* compiled from: PG */
final class ace extends defpackage.aec {
    public java.lang.CharSequence a;
    public android.widget.ListAdapter b;
    public final android.graphics.Rect c = new android.graphics.Rect();
    public final /* synthetic */ defpackage.acb d;

    public ace(defpackage.acb acb, android.content.Context context, android.util.AttributeSet attributeSet, int i) {
        this.d = acb;
        super(context, attributeSet, i);
        this.l = acb;
        b();
        this.m = new defpackage.acf(this);
    }

    public final void a(android.widget.ListAdapter listAdapter) {
        super.a(listAdapter);
        this.b = listAdapter;
    }

    /* access modifiers changed from: 0000 */
    public final void a() {
        int i;
        int i2;
        int i3;
        android.graphics.drawable.Drawable background = this.r.getBackground();
        if (background != null) {
            background.getPadding(this.d.c);
            if (defpackage.ahr.a(this.d)) {
                i3 = this.d.c.right;
            } else {
                i3 = -this.d.c.left;
            }
            i = i3;
        } else {
            android.graphics.Rect rect = this.d.c;
            this.d.c.right = 0;
            rect.left = 0;
            i = 0;
        }
        int paddingLeft = this.d.getPaddingLeft();
        int paddingRight = this.d.getPaddingRight();
        int width = this.d.getWidth();
        if (this.d.b == -2) {
            int a2 = this.d.a((android.widget.SpinnerAdapter) this.b, this.r.getBackground());
            int i4 = (this.d.getContext().getResources().getDisplayMetrics().widthPixels - this.d.c.left) - this.d.c.right;
            if (a2 <= i4) {
                i4 = a2;
            }
            b(java.lang.Math.max(i4, (width - paddingLeft) - paddingRight));
        } else if (this.d.b == -1) {
            b((width - paddingLeft) - paddingRight);
        } else {
            b(this.d.b);
        }
        if (defpackage.ahr.a(this.d)) {
            i2 = ((width - paddingRight) - this.f) + i;
        } else {
            i2 = i + paddingLeft;
        }
        this.g = i2;
    }

    public final void d() {
        boolean isShowing = this.r.isShowing();
        a();
        h();
        super.d();
        this.e.setChoiceMode(1);
        int selectedItemPosition = this.d.getSelectedItemPosition();
        defpackage.ade ade = this.e;
        if (this.r.isShowing() && ade != null) {
            ade.a = false;
            ade.setSelection(selectedItemPosition);
            if (ade.getChoiceMode() != 0) {
                ade.setItemChecked(selectedItemPosition, true);
            }
        }
        if (!isShowing) {
            android.view.ViewTreeObserver viewTreeObserver = this.d.getViewTreeObserver();
            if (viewTreeObserver != null) {
                defpackage.acg acg = new defpackage.acg(this);
                viewTreeObserver.addOnGlobalLayoutListener(acg);
                a((android.widget.PopupWindow.OnDismissListener) new defpackage.ach(this, acg));
            }
        }
    }
}
