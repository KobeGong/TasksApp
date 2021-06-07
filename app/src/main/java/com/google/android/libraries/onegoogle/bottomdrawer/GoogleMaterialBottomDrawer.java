package com.google.android.libraries.onegoogle.bottomdrawer;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;

@gy(a = BottomDrawerBehavior.class)
/* compiled from: PG */
public class GoogleMaterialBottomDrawer extends FrameLayout {
    private static final String i = String.valueOf(GoogleMaterialBottomDrawer.class.getName()).concat(".BottomDrawerState");
    private static final String j = String.valueOf(GoogleMaterialBottomDrawer.class.getName()).concat(".superState");
    public final float a;
    public final int b;
    public BottomDrawerBehavior c;
    public ArrayList d;
    public View e;
    public boolean f;
    public View g;
    public final cgc h;
    private final int k;
    private final float[] l;
    private final GradientDrawable m;
    private int n;

    public GoogleMaterialBottomDrawer(Context context) {
        this(context, null);
    }

    public GoogleMaterialBottomDrawer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        int i2;
        this.l = new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f};
        this.h = new cgc(this);
        setFitsSystemWindows(true);
        Resources resources = context.getResources();
        this.n = resources.getColor(R.color.bottom_drawer_scrim_color);
        sn.a(this, resources.getDimension(R.dimen.og_bottom_drawer_elevation));
        setClickable(true);
        setPadding(0, 0, 0, 0);
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier != 0) {
            i2 = context.getResources().getDimensionPixelSize(identifier);
        } else {
            i2 = 0;
        }
        this.b = i2;
        this.a = resources.getDimension(R.dimen.og_round_corenr_radius);
        this.k = resources.getColor(R.color.bottom_drawer_background_color);
        this.m = new GradientDrawable();
        this.m.setShape(0);
        this.m.setColor(this.k);
        a(this.a, 250);
    }

    public void onViewAdded(View view) {
        super.onViewAdded(view);
        this.g = view;
    }

    /* access modifiers changed from: protected */
    public Parcelable onSaveInstanceState() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(j, super.onSaveInstanceState());
        bundle.putBoolean(i, b() || this.f);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof Bundle) {
            Bundle bundle = (Bundle) parcelable;
            Parcelable parcelable2 = bundle.getParcelable(j);
            if (bundle.getBoolean(i)) {
                a();
            }
            parcelable = parcelable2;
        }
        super.onRestoreInstanceState(parcelable);
    }

    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (this.e == null) {
            this.e = new View(getContext());
            this.e.setContentDescription(null);
            sn.a(this.e, 2);
            this.e.setBackgroundColor(this.n);
            this.e.setFitsSystemWindows(true);
            sn.a(this.e, sn.a.u(this));
            viewGroup.addView(this.e, ((ViewGroup) getParent()).indexOfChild(this), new ha(-1, -1));
        }
        a(5);
    }

    public final void a(int i2) {
        if (i2 == 5) {
            this.e.setVisibility(8);
            this.e.setAlpha(0.0f);
            return;
        }
        this.e.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (this.c != null) {
            this.c.h = null;
        }
    }

    public final void a() {
        if (!this.f && !b()) {
            this.f = true;
            a(new cge(this));
        }
    }

    private final void a(Runnable runnable) {
        if (this.c == null) {
            post(new cgf(this, runnable));
            requestLayout();
            return;
        }
        runnable.run();
    }

    public final boolean b() {
        return (this.c == null || this.c.c == 5) ? false : true;
    }

    public final void c() {
        a(new cgg(this));
    }

    public final void a(cgi cgi) {
        if (this.d == null) {
            this.d = new ArrayList();
        }
        this.d.add(cgi);
    }

    public final void b(cgi cgi) {
        if (this.d != null) {
            this.d.remove(cgi);
        }
    }

    public final void a(float f2, int i2) {
        float[] fArr = this.l;
        float[] fArr2 = this.l;
        float[] fArr3 = this.l;
        this.l[3] = f2;
        fArr3[2] = f2;
        fArr2[1] = f2;
        fArr[0] = f2;
        this.m.setCornerRadii(this.l);
        this.m.setColor(Color.argb(i2, Color.red(this.k), Color.green(this.k), Color.blue(this.k)));
        sn.a(this, this.m);
    }
}
