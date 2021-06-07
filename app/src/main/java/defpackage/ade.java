package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.ListAdapter;
import android.widget.ListView;
import com.google.android.apps.tasks.R;
import java.lang.reflect.Field;

/* access modifiers changed from: package-private */
/* renamed from: ade  reason: default package */
/* compiled from: PG */
public class ade extends ListView {
    public boolean a;
    public adg b;
    private final Rect c = new Rect();
    private int d = 0;
    private int e = 0;
    private int f = 0;
    private int g = 0;
    private int h;
    private Field i;
    private adf j;
    private boolean k;
    private boolean l;
    private uw m;

    ade(Context context, boolean z) {
        super(context, null, R.attr.dropDownListViewStyle);
        this.k = z;
        setCacheColorHint(0);
        try {
            this.i = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
            this.i.setAccessible(true);
        } catch (NoSuchFieldException e2) {
            cza.a.a(e2);
        }
    }

    public boolean isInTouchMode() {
        return (this.k && this.a) || super.isInTouchMode();
    }

    public boolean hasWindowFocus() {
        return this.k || super.hasWindowFocus();
    }

    public boolean isFocused() {
        return this.k || super.isFocused();
    }

    public boolean hasFocus() {
        return this.k || super.hasFocus();
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        this.j = drawable != null ? new adf(drawable) : null;
        super.setSelector(this.j);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.d = rect.left;
        this.e = rect.top;
        this.f = rect.right;
        this.g = rect.bottom;
    }

    /* access modifiers changed from: protected */
    public void drawableStateChanged() {
        if (this.b == null) {
            super.drawableStateChanged();
            a(true);
            a();
        }
    }

    /* access modifiers changed from: protected */
    public void dispatchDraw(Canvas canvas) {
        Drawable selector;
        if (!this.c.isEmpty() && (selector = getSelector()) != null) {
            selector.setBounds(this.c);
            selector.draw(canvas);
        }
        super.dispatchDraw(canvas);
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        switch (motionEvent.getAction()) {
            case 0:
                this.h = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
                break;
        }
        if (this.b != null) {
            adg adg = this.b;
            adg.a.b = null;
            adg.a.removeCallbacks(adg);
        }
        return super.onTouchEvent(motionEvent);
    }

    public int a(int i2, int i3, int i4, int i5, int i6) {
        View view;
        int makeMeasureSpec;
        int i7;
        int i8;
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        getListPaddingLeft();
        getListPaddingRight();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int i9 = listPaddingBottom + listPaddingTop;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int i10 = 0;
        View view2 = null;
        int i11 = 0;
        int count = adapter.getCount();
        int i12 = 0;
        while (i12 < count) {
            int itemViewType = adapter.getItemViewType(i12);
            if (itemViewType != i11) {
                view = null;
                i11 = itemViewType;
            } else {
                view = view2;
            }
            view2 = adapter.getView(i12, view, this);
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view2.setLayoutParams(layoutParams);
            }
            if (layoutParams.height > 0) {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
            } else {
                makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            }
            view2.measure(i2, makeMeasureSpec);
            view2.forceLayout();
            if (i12 > 0) {
                i7 = i9 + dividerHeight;
            } else {
                i7 = i9;
            }
            i9 = view2.getMeasuredHeight() + i7;
            if (i9 >= i5) {
                return (i6 < 0 || i12 <= i6 || i10 <= 0 || i9 == i5) ? i5 : i10;
            }
            if (i6 < 0 || i12 < i6) {
                i8 = i10;
            } else {
                i8 = i9;
            }
            i12++;
            i10 = i8;
        }
        return i9;
    }

    private final void a(boolean z) {
        if (this.j != null) {
            this.j.b = z;
        }
    }

    public boolean onHoverEvent(MotionEvent motionEvent) {
        if (Build.VERSION.SDK_INT < 26) {
            return super.onHoverEvent(motionEvent);
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.b == null) {
            this.b = new adg(this);
            adg adg = this.b;
            adg.a.post(adg);
        }
        boolean onHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked == 9 || actionMasked == 7) {
            int pointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
            if (pointToPosition == -1 || pointToPosition == getSelectedItemPosition()) {
                return onHoverEvent;
            }
            View childAt = getChildAt(pointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                setSelectionFromTop(pointToPosition, childAt.getTop() - getTop());
            }
            a();
            return onHoverEvent;
        }
        setSelection(-1);
        return onHoverEvent;
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        this.b = null;
        super.onDetachedFromWindow();
    }

    /* JADX INFO: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0055  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.view.MotionEvent r15, int r16) {
        /*
        // Method dump skipped, instructions count: 402
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ade.a(android.view.MotionEvent, int):boolean");
    }

    private final void a() {
        Drawable selector = getSelector();
        if (selector != null && this.l && isPressed()) {
            selector.setState(getDrawableState());
        }
    }
}
