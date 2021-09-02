package defpackage;

/* renamed from: ard reason: default package */
/* compiled from: PG */
public class ard {
    public static final android.os.Handler a = new android.os.Handler(android.os.Looper.getMainLooper(), new defpackage.arg());
    public final android.view.ViewGroup b;
    public final android.content.Context c;
    public final defpackage.arp d;
    public int e;
    public final defpackage.art f = new defpackage.art(this);
    private java.util.List g;
    private final android.view.accessibility.AccessibilityManager h;

    public ard(android.view.ViewGroup viewGroup, android.view.View view) {
        if (viewGroup == null) {
            throw new java.lang.IllegalArgumentException("Transient bottom bar must have non-null parent");
        } else if (view == null) {
            throw new java.lang.IllegalArgumentException("Transient bottom bar must have non-null content");
        } else {
            this.b = viewGroup;
            this.c = viewGroup.getContext();
            this.d = (defpackage.arp) android.view.LayoutInflater.from(this.c).inflate(2131034153, this.b, false);
            this.d.addView(view);
            defpackage.sn.a.q(this.d);
            defpackage.sn.a((android.view.View) this.d, 1);
            defpackage.sn.b((android.view.View) this.d, true);
            defpackage.sn.a((android.view.View) this.d, (defpackage.sl) new defpackage.arh());
            this.h = (android.view.accessibility.AccessibilityManager) this.c.getSystemService("accessibility");
        }
    }

    public final void a() {
        defpackage.arr a2 = defpackage.arr.a();
        int i = this.e;
        defpackage.art art = this.f;
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
                a2.d = new defpackage.aru(i, art);
            }
            if (a2.c == null || !a2.a(a2.c, 4)) {
                a2.c = null;
                a2.b();
            }
        }
    }

    public final void a(int i) {
        defpackage.arr a2 = defpackage.arr.a();
        defpackage.art art = this.f;
        synchronized (a2.a) {
            if (a2.e(art)) {
                a2.a(a2.c, i);
            } else if (a2.f(art)) {
                a2.a(a2.d, i);
            }
        }
    }

    public final defpackage.ard a(defpackage.arl arl) {
        if (this.g == null) {
            this.g = new java.util.ArrayList();
        }
        this.g.add(arl);
        return this;
    }

    public final boolean b() {
        return defpackage.arr.a().c(this.f);
    }

    /* access modifiers changed from: 0000 */
    public final void c() {
        this.d.setAlpha(0.0f);
        this.d.setScaleX(0.8f);
        this.d.setScaleY(0.8f);
        android.view.animation.DecelerateInterpolator decelerateInterpolator = new android.view.animation.DecelerateInterpolator(0.8f);
        android.animation.ValueAnimator valueAnimator = new android.animation.ValueAnimator();
        valueAnimator.setFloatValues(new float[]{0.0f, 1.0f});
        valueAnimator.setDuration(150);
        valueAnimator.setInterpolator(new android.view.animation.LinearInterpolator());
        valueAnimator.addListener(new defpackage.ark(this));
        valueAnimator.addUpdateListener(new defpackage.are(this, decelerateInterpolator));
        valueAnimator.start();
    }

    /* access modifiers changed from: 0000 */
    public final void d() {
        defpackage.arr a2 = defpackage.arr.a();
        defpackage.art art = this.f;
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

    /* access modifiers changed from: 0000 */
    public final void b(int i) {
        defpackage.arr a2 = defpackage.arr.a();
        defpackage.art art = this.f;
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
                ((defpackage.arl) this.g.get(size)).a(i);
            }
        }
        android.view.ViewParent parent = this.d.getParent();
        if (parent instanceof android.view.ViewGroup) {
            ((android.view.ViewGroup) parent).removeView(this.d);
        }
    }

    /* access modifiers changed from: 0000 */
    public final boolean e() {
        return !this.h.isEnabled();
    }
}
