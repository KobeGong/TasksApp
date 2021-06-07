package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.LinearInterpolator;
import com.google.android.apps.tasks.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ard  reason: default package */
/* compiled from: PG */
public class ard {
    public static final Handler a = new Handler(Looper.getMainLooper(), new arg());
    public final ViewGroup b;
    public final Context c;
    public final arp d;
    public int e;
    public final art f = new art(this);
    private List g;
    private final AccessibilityManager h;

    public ard(ViewGroup viewGroup, View view) {
        if (viewGroup == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new IllegalArgumentException("Transient bottom bar must have non-null content");
        } else {
            this.b = viewGroup;
            this.c = viewGroup.getContext();
            this.d = (arp) LayoutInflater.from(this.c).inflate(R.layout.custom_design_layout_snackbar, this.b, false);
            this.d.addView(view);
            sn.a.q(this.d);
            sn.a((View) this.d, 1);
            sn.b((View) this.d, true);
            sn.a(this.d, new arh());
            this.h = (AccessibilityManager) this.c.getSystemService("accessibility");
        }
    }

    public final void a() {
        arr a2 = arr.a();
        int i = this.e;
        art art = this.f;
        synchronized (a2.a) {
            if (a2.e(art)) {
                a2.c.b = i;
                a2.b.removeCallbacksAndMessages(a2.c);
                a2.a(a2.c);
                return;
            }
            if (a2.f(art)) {
                a2.d.b = i;
            } else {
                a2.d = new aru(i, art);
            }
            if (a2.c == null || !a2.a(a2.c, 4)) {
                a2.c = null;
                a2.b();
            }
        }
    }

    public final void a(int i) {
        arr a2 = arr.a();
        art art = this.f;
        synchronized (a2.a) {
            if (a2.e(art)) {
                a2.a(a2.c, i);
            } else if (a2.f(art)) {
                a2.a(a2.d, i);
            }
        }
    }

    public final ard a(arl arl) {
        if (this.g == null) {
            this.g = new ArrayList();
        }
        this.g.add(arl);
        return this;
    }

    public final boolean b() {
        return arr.a().c(this.f);
    }

    /* access modifiers changed from: package-private */
    public final void c() {
        this.d.setAlpha(0.0f);
        this.d.setScaleX(0.8f);
        this.d.setScaleY(0.8f);
        DecelerateInterpolator decelerateInterpolator = new DecelerateInterpolator(0.8f);
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setFloatValues(0.0f, 1.0f);
        valueAnimator.setDuration(150L);
        valueAnimator.setInterpolator(new LinearInterpolator());
        valueAnimator.addListener(new ark(this));
        valueAnimator.addUpdateListener(new are(this, decelerateInterpolator));
        valueAnimator.start();
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        arr a2 = arr.a();
        art art = this.f;
        synchronized (a2.a) {
            if (a2.e(art)) {
                a2.a(a2.c);
            }
        }
        if (this.g != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                this.g.get(size);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void b(int i) {
        arr a2 = arr.a();
        art art = this.f;
        synchronized (a2.a) {
            if (a2.e(art)) {
                a2.c = null;
                if (a2.d != null) {
                    a2.b();
                }
            }
        }
        if (this.g != null) {
            for (int size = this.g.size() - 1; size >= 0; size--) {
                ((arl) this.g.get(size)).a(i);
            }
        }
        ViewParent parent = this.d.getParent();
        if (parent instanceof ViewGroup) {
            ((ViewGroup) parent).removeView(this.d);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean e() {
        return !this.h.isEnabled();
    }
}
