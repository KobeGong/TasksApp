package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;

/* access modifiers changed from: package-private */
/* renamed from: ka  reason: default package */
/* compiled from: PG */
public final class ka extends ViewGroup {
    public jz a;
    private ViewGroup b;
    private View c;

    ka(Context context, ViewGroup viewGroup, View view, jz jzVar) {
        super(context);
        this.b = viewGroup;
        this.c = view;
        setRight(viewGroup.getWidth());
        setBottom(viewGroup.getHeight());
        viewGroup.addView(this);
        this.a = jzVar;
    }

    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return false;
    }

    /* access modifiers changed from: protected */
    public final boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable);
    }

    public final void a(View view) {
        if (view.getParent() instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view.getParent();
            if (!(viewGroup == this.b || viewGroup.getParent() == null || !sn.a.s(viewGroup))) {
                int[] iArr = new int[2];
                int[] iArr2 = new int[2];
                viewGroup.getLocationOnScreen(iArr);
                this.b.getLocationOnScreen(iArr2);
                sn.c(view, iArr[0] - iArr2[0]);
                sn.b(view, iArr[1] - iArr2[1]);
            }
            viewGroup.removeView(view);
            if (view.getParent() != null) {
                viewGroup.removeView(view);
            }
        }
        super.addView(view, getChildCount() - 1);
    }

    public final void b(View view) {
        super.removeView(view);
        if (getChildCount() == 0) {
            this.b.removeView(this);
        }
    }

    public final void invalidateDrawable(Drawable drawable) {
        invalidate(drawable.getBounds());
    }

    /* access modifiers changed from: protected */
    public final void dispatchDraw(Canvas canvas) {
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        this.b.getLocationOnScreen(iArr);
        this.c.getLocationOnScreen(iArr2);
        canvas.translate((float) (iArr2[0] - iArr[0]), (float) (iArr2[1] - iArr[1]));
        canvas.clipRect(new Rect(0, 0, this.c.getWidth(), this.c.getHeight()));
        super.dispatchDraw(canvas);
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }

    public final ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        if (this.b != null) {
            rect.offset(iArr[0], iArr[1]);
            if (this.b instanceof ViewGroup) {
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
            ViewGroup.class.getDeclaredMethod("invalidateChildInParentFast", Integer.TYPE, Integer.TYPE, Rect.class);
        } catch (NoSuchMethodException e) {
        }
    }
}
