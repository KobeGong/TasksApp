package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.Property;
import android.view.View;
import android.view.ViewGroup;
import java.util.Map;

/* renamed from: ig  reason: default package */
/* compiled from: PG */
public final class ig extends je {
    private static final String[] l = {"android:changeBounds:bounds", "android:changeBounds:clip", "android:changeBounds:parent", "android:changeBounds:windowX", "android:changeBounds:windowY"};
    private static final Property m = new ii(PointF.class, "topLeft");
    private static final Property n = new ij(PointF.class, "bottomRight");
    private static final Property o = new ik(PointF.class, "bottomRight");
    private static final Property p = new il(PointF.class, "topLeft");
    private static final Property q = new im(PointF.class, "position");

    @Override // defpackage.je
    public final String[] a() {
        return l;
    }

    private static void d(jr jrVar) {
        View view = jrVar.b;
        if (sn.a.r(view) || view.getWidth() != 0 || view.getHeight() != 0) {
            jrVar.a.put("android:changeBounds:bounds", new Rect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom()));
            jrVar.a.put("android:changeBounds:parent", jrVar.b.getParent());
        }
    }

    @Override // defpackage.je
    public final void a(jr jrVar) {
        d(jrVar);
    }

    @Override // defpackage.je
    public final void b(jr jrVar) {
        d(jrVar);
    }

    /* JADX DEBUG: Multi-variable search result rejected for r1v21, resolved type: android.animation.AnimatorSet */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.je
    public final Animator a(ViewGroup viewGroup, jr jrVar, jr jrVar2) {
        int i;
        ObjectAnimator a;
        if (jrVar == null || jrVar2 == null) {
            return null;
        }
        Map map = jrVar.a;
        Map map2 = jrVar2.a;
        ViewGroup viewGroup2 = (ViewGroup) map.get("android:changeBounds:parent");
        ViewGroup viewGroup3 = (ViewGroup) map2.get("android:changeBounds:parent");
        if (viewGroup2 == null || viewGroup3 == null) {
            return null;
        }
        View view = jrVar2.b;
        Rect rect = (Rect) jrVar.a.get("android:changeBounds:bounds");
        Rect rect2 = (Rect) jrVar2.a.get("android:changeBounds:bounds");
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
        Rect rect3 = (Rect) jrVar.a.get("android:changeBounds:clip");
        Rect rect4 = (Rect) jrVar2.a.get("android:changeBounds:clip");
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
        kb.a(view, i2, i4, i6, i8);
        if (i == 2) {
            if (i10 == i12 && i11 == i13) {
                a = iw.a(view, q, ja.a((float) i2, (float) i4, (float) i3, (float) i5));
            } else {
                ip ipVar = new ip(view);
                ObjectAnimator a2 = iw.a(ipVar, m, ja.a((float) i2, (float) i4, (float) i3, (float) i5));
                ObjectAnimator a3 = iw.a(ipVar, n, ja.a((float) i6, (float) i8, (float) i7, (float) i9));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(a2, a3);
                animatorSet.addListener(new in());
                a = animatorSet;
            }
        } else if (i2 == i3 && i4 == i5) {
            a = iw.a(view, o, ja.a((float) i6, (float) i8, (float) i7, (float) i9));
        } else {
            a = iw.a(view, p, ja.a((float) i2, (float) i4, (float) i3, (float) i5));
        }
        if (!(view.getParent() instanceof ViewGroup)) {
            return a;
        }
        ViewGroup viewGroup4 = (ViewGroup) view.getParent();
        jv.a(viewGroup4, true);
        a(new io(viewGroup4));
        return a;
    }

    static {
        new ih(PointF.class, "boundsOrigin");
        new jc();
    }
}
