package defpackage;

/* renamed from: ig reason: default package */
/* compiled from: PG */
public final class ig extends defpackage.je {
    private static final java.lang.String[] l = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final android.util.Property m = new defpackage.ii(android.graphics.PointF.class, "topLeft");
    private static final android.util.Property n = new defpackage.ij(android.graphics.PointF.class, "bottomRight");
    private static final android.util.Property o = new defpackage.ik(android.graphics.PointF.class, "bottomRight");
    private static final android.util.Property p = new defpackage.il(android.graphics.PointF.class, "topLeft");
    private static final android.util.Property q = new defpackage.im(android.graphics.PointF.class, "position");

    public final java.lang.String[] a() {
        return l;
    }

    private static void d(defpackage.jr jrVar) {
        android.view.View view = jrVar.b;
        if (ViewCompat.a.r(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            jrVar.a.put("android:changeBounds:bounds", new android.graphics.Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            jrVar.a.put("android:changeBounds:parent", jrVar.b.getParent());
        }
    }

    public final void a(defpackage.jr jrVar) {
        d(jrVar);
    }

    public final void b(defpackage.jr jrVar) {
        d(jrVar);
    }

    public final android.animation.Animator a(android.view.ViewGroup viewGroup, defpackage.jr jrVar, defpackage.jr jrVar2) {
        int i;
        android.animation.Animator a;
        if (jrVar == null || jrVar2 == null) {
            return null;
        }
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) jrVar2.a.get("android:changeBounds:parent");
        if (((android.view.ViewGroup) jrVar.a.get("android:changeBounds:parent")) == null || viewGroup2 == null) {
            return null;
        }
        android.view.View view = jrVar2.b;
        android.graphics.Rect rect = (android.graphics.Rect) jrVar.a.get("android:changeBounds:bounds");
        android.graphics.Rect rect2 = (android.graphics.Rect) jrVar2.a.get("android:changeBounds:bounds");
        int i2 = rect.left;
        int i3 = rect2.left;
        int i4 = rect.top;
        int i5 = rect2.top;
        int i6 = rect.right;
        int i7 = rect2.right;
        int i8 = rect.bottom;
        int i9 = rect2.bottom;
        int i10 = i6 - i2;
        int i11 = i8 - i4;
        int i12 = i7 - i3;
        int i13 = i9 - i5;
        android.graphics.Rect rect3 = (android.graphics.Rect) jrVar.a.get("android:changeBounds:clip");
        android.graphics.Rect rect4 = (android.graphics.Rect) jrVar2.a.get("android:changeBounds:clip");
        int i14 = 0;
        if (!((i10 == 0 || i11 == 0) && (i12 == 0 || i13 == 0))) {
            if (!(i2 == i3 && i4 == i5)) {
                i14 = 1;
            }
            if (!(i6 == i7 && i8 == i9)) {
                i14++;
            }
        }
        if ((rect3 == null || rect3.equals(rect4)) && (rect3 != null || rect4 == null)) {
            i = i14;
        } else {
            i = i14 + 1;
        }
        if (i <= 0) {
            return null;
        }
        defpackage.kb.a(view, i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                a = defpackage.iw.a(view, q, defpackage.ja.a((float) i2, (float) i4, (float) i3, (float) i5));
            } else {
                defpackage.ip ipVar = new defpackage.ip(view);
                android.animation.ObjectAnimator a2 = defpackage.iw.a(ipVar, m, defpackage.ja.a((float) i2, (float) i4, (float) i3, (float) i5));
                android.animation.ObjectAnimator a3 = defpackage.iw.a(ipVar, n, defpackage.ja.a((float) i6, (float) i8, (float) i7, (float) i9));
                android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
                animatorSet.playTogether(new android.animation.Animator[]{a2, a3});
                animatorSet.addListener(new defpackage.in());
                a = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            a = defpackage.iw.a(view, o, defpackage.ja.a((float) i6, (float) i8, (float) i7, (float) i9));
        } else {
            a = defpackage.iw.a(view, p, defpackage.ja.a((float) i2, (float) i4, (float) i3, (float) i5));
        }
        if (!(view.getParent() instanceof android.view.ViewGroup)) {
            return a;
        }
        android.view.ViewGroup viewGroup3 = (android.view.ViewGroup) view.getParent();
        defpackage.jv.a(viewGroup3, true);
        a((defpackage.ji) new defpackage.io(viewGroup3));
        return a;
    }

    static {
        new defpackage.ih(android.graphics.PointF.class, "boundsOrigin");
        new defpackage.jc();
    }
}
