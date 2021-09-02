package defpackage;

/* renamed from: ka reason: default package */
/* compiled from: PG */
final class ka extends android.view.ViewGroup {
    public defpackage.jz a;
    private android.view.ViewGroup b;
    private android.view.View c;

    ka(android.content.Context context, android.view.ViewGroup viewGroup, android.view.View view, defpackage.jz jzVar) {
        super(context);
        this.b = viewGroup;
        this.c = view;
        setRight(viewGroup.getWidth());
        setBottom(viewGroup.getHeight());
        viewGroup.addView(this);
        this.a = jzVar;
    }

    public final boolean dispatchTouchEvent(android.view.MotionEvent motionEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(android.graphics.drawable.Drawable drawable) {
        return super.verifyDrawable(drawable);
    }

    public final void a(android.view.View view) {
        if (view.getParent() instanceof android.view.ViewGroup) {
            android.view.ViewGroup viewGroup = (android.view.ViewGroup) view.getParent();
            if (!(viewGroup == this.b || viewGroup.getParent() == null || !defpackage.sn.a.s(viewGroup))) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                this.b.getLocationOnScreen(iArr2);
                defpackage.sn.c(view, iArr[0] - iArr2[0]);
                defpackage.sn.b(view, iArr[1] - iArr2[1]);
            }
            viewGroup.removeView(view);
            if (view.getParent() != null) {
                viewGroup.removeView(view);
            }
        }
        super.addView(view, getChildCount() - 1);
    }

    public final void b(android.view.View view) {
        super.removeView(view);
        if (getChildCount() == 0) {
            this.b.removeView(this);
        }
    }

    public final void invalidateDrawable(android.graphics.drawable.Drawable drawable) {
        invalidate(drawable.getBounds());
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(android.graphics.Canvas canvas) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.b.getLocationOnScreen(iArr);
        this.c.getLocationOnScreen(iArr2);
        canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
        canvas.clipRect(new android.graphics.Rect(0, 0, this.c.getWidth(), this.c.getHeight()));
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final android.view.ViewParent invalidateChildInParent(int[] iArr, android.graphics.Rect rect) {
        if (this.b != null) {
            rect.offset(iArr[0], iArr[1]);
            if (this.b instanceof android.view.ViewGroup) {
                iArr[0] = 0;
                iArr[1] = 0;
                int[] iArr2 = new int[2];
                int[] iArr3 = new int[2];
                this.b.getLocationOnScreen(iArr2);
                this.c.getLocationOnScreen(iArr3);
                int[] iArr4 = {iArr3[0] - iArr2[0], iArr3[1] - iArr2[1]};
                rect.offset(iArr4[0], iArr4[1]);
                return super.invalidateChildInParent(iArr, rect);
            }
            invalidate(rect);
        }
        return null;
    }

    static {
        try {
            android.view.ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", new java.lang.Class[]{java.lang.Integer.TYPE, java.lang.Integer.TYPE, android.graphics.Rect.class});
        } catch (java.lang.NoSuchMethodException e) {
        }
    }
}
