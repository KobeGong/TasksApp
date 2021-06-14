package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.design.internal.NavigationMenuView;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.google.android.apps.tasks.R;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* renamed from: fr  reason: default package */
/* compiled from: PG */
public class fr extends fn {
    private static final int[] f = {16842912};
    private static final int[] g = {-16842910};
    public final ez c;
    public final fb d;
    public ft e;
    private final int h;
    private MenuInflater i;

    public fr(Context context) {
        this(context, null);
    }

    public fr(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.navigationViewStyle);
    }

    public fr(Context context, AttributeSet attributeSet, int i2) {
        super(context, attributeSet, i2);
        ColorStateList b;
        int i3;
        boolean z;
        this.d = new fb();
        this.c = new ez(context);
        agw a = fp.a(context, attributeSet, fw.a, i2);
        sn.a(this, a.a(fw.b));
        if (a.f(fw.e)) {
            sn.a(this, (float) a.e(fw.e, 0));
        }
        sn.b(this, a.a(fw.c, false));
        this.h = a.e(fw.d, 0);
        if (a.f(fw.j)) {
            b = a.e(fw.j);
        } else {
            b = b(16842808);
        }
        if (a.f(fw.k)) {
            i3 = a.g(fw.k, 0);
            z = true;
        } else {
            i3 = 0;
            z = false;
        }
        ColorStateList colorStateList = a.f(fw.l) ? a.e(fw.l) : null;
        if (!z && colorStateList == null) {
            colorStateList = b(16842806);
        }
        Drawable a2 = a.a(fw.g);
        if (a.f(fw.h)) {
            this.d.b(a.e(fw.h, 0));
        }
        int e2 = a.e(fw.i, 0);
        this.c.a(new fs(this));
        this.d.d = 1;
        this.d.a(context, this.c);
        this.d.a(b);
        if (z) {
            this.d.a(i3);
        }
        this.d.b(colorStateList);
        this.d.a(a2);
        this.d.c(e2);
        this.c.a(this.d);
        fb fbVar = this.d;
        if (fbVar.a == null) {
            fbVar.a = (NavigationMenuView) fbVar.f.inflate(R.layout.design_navigation_menu, (ViewGroup) this, false);
            if (fbVar.e == null) {
                fbVar.e = new fd(fbVar);
            }
            fbVar.b = (LinearLayout) fbVar.f.inflate(R.layout.design_navigation_item_header, (ViewGroup) fbVar.a, false);
            fbVar.a.setAdapter(fbVar.e);
        }
        addView(fbVar.a);
        if (a.f(fw.m)) {
            int g2 = a.g(fw.m, 0);
            this.d.b(true);
            if (this.i == null) {
                this.i = new yj(getContext());
            }
            this.i.inflate(g2, this.c);
            this.d.b(false);
            this.d.a(false);
        }
        if (a.f(fw.f)) {
            int g3 = a.g(fw.f, 0);
            fb fbVar2 = this.d;
            fbVar2.a(fbVar2.f.inflate(g3, (ViewGroup) fbVar2.b, false));
        }
        a.b.recycle();
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Parcelable c2;
        fu fuVar = new fu(super.onSaveInstanceState());
        fuVar.a = new Bundle();
        ez ezVar = this.c;
        Bundle bundle = fuVar.a;
        if (!ezVar.i.isEmpty()) {
            SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
            Iterator it = ezVar.i.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zt ztVar = (zt) weakReference.get();
                if (ztVar == null) {
                    ezVar.i.remove(weakReference);
                } else {
                    int b = ztVar.b();
                    if (b > 0 && (c2 = ztVar.c()) != null) {
                        sparseArray.put(b, c2);
                    }
                }
            }
            bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        }
        return fuVar;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof fu)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        fu fuVar = (fu) parcelable;
        super.onRestoreInstanceState(fuVar.e);
        ez ezVar = this.c;
        SparseArray sparseParcelableArray = fuVar.a.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null && !ezVar.i.isEmpty()) {
            Iterator it = ezVar.i.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                zt ztVar = (zt) weakReference.get();
                if (ztVar == null) {
                    ezVar.i.remove(weakReference);
                } else {
                    int b = ztVar.b();
                    if (b > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(b)) != null) {
                        ztVar.a(parcelable2);
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i2, int i3) {
        switch (View.MeasureSpec.getMode(i2)) {
            case Integer.MIN_VALUE:
                i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), this.h), 1073741824);
                break;
            case 0:
                i2 = View.MeasureSpec.makeMeasureSpec(this.h, 1073741824);
                break;
        }
        super.onMeasure(i2, i3);
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.fn
    public final void a(tk tkVar) {
        fb fbVar = this.d;
        int b = tkVar.b();
        if (fbVar.n != b) {
            fbVar.n = b;
            if (fbVar.b.getChildCount() == 0) {
                fbVar.a.setPadding(0, fbVar.n, 0, fbVar.a.getPaddingBottom());
            }
        }
        sn.a.b(fbVar.b, tkVar);
    }

    public final void a(int i2) {
        MenuItem findItem = this.c.findItem(i2);
        if (findItem != null) {
            this.d.e.a((zi) findItem);
        }
    }

    private final ColorStateList b(int i2) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i2, typedValue, true)) {
            return null;
        }
        ColorStateList a = xw.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i3 = typedValue.data;
        int defaultColor = a.getDefaultColor();
        return new ColorStateList(new int[][]{g, f, EMPTY_STATE_SET}, new int[]{a.getColorForState(g, defaultColor), i3, defaultColor});
    }
}
