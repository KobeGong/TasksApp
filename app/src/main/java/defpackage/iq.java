package defpackage;

/* renamed from: iq reason: default package */
/* compiled from: PG */
public final class iq extends defpackage.kj {
    public iq(int i) {
        if ((i & -4) != 0) {
            throw new java.lang.IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.l = i;
    }

    public iq() {
    }

    public final void a(defpackage.jr jrVar) {
        super.a(jrVar);
        jrVar.a.put("android:fade:transitionAlpha", java.lang.Float.valueOf(defpackage.kb.a.b(jrVar.b)));
    }

    private final android.animation.Animator a(android.view.View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        defpackage.kb.a(view, f);
        android.animation.ObjectAnimator ofFloat = android.animation.ObjectAnimator.ofFloat(view, defpackage.kb.b, new float[]{f2});
        ofFloat.addListener(new defpackage.is(view));
        a((defpackage.ji) new defpackage.ir(view));
        return ofFloat;
    }

    public final android.animation.Animator a(android.view.View view, defpackage.jr jrVar) {
        float f = 0.0f;
        float a = a(jrVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return a(view, f, 1.0f);
    }

    public final android.animation.Animator b(android.view.View view, defpackage.jr jrVar) {
        defpackage.kb.a.c(view);
        return a(view, a(jrVar, 1.0f), 0.0f);
    }

    private static float a(defpackage.jr jrVar, float f) {
        if (jrVar == null) {
            return f;
        }
        java.lang.Float f2 = (java.lang.Float) jrVar.a.get("android:fade:transitionAlpha");
        if (f2 != null) {
            return f2.floatValue();
        }
        return f;
    }
}
