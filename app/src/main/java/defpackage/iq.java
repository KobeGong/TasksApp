package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.view.View;

/* renamed from: iq  reason: default package */
/* compiled from: PG */
public final class iq extends kj {
    public iq(int i) {
        if ((i & -4) != 0) {
            throw new IllegalArgumentException("Only MODE_IN and MODE_OUT flags are allowed");
        }
        this.l = i;
    }

    public iq() {
    }

    @Override // defpackage.je, defpackage.kj
    public final void a(jr jrVar) {
        super.a(jrVar);
        jrVar.a.put("android:fade:transitionAlpha", Float.valueOf(kb.a.b(jrVar.b)));
    }

    private final Animator a(View view, float f, float f2) {
        if (f == f2) {
            return null;
        }
        kb.a(view, f);
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, kb.b, f2);
        ofFloat.addListener(new is(view));
        a(new ir(view));
        return ofFloat;
    }

    @Override // defpackage.kj
    public final Animator a(View view, jr jrVar) {
        float f = 0.0f;
        float a = a(jrVar, 0.0f);
        if (a != 1.0f) {
            f = a;
        }
        return a(view, f, 1.0f);
    }

    @Override // defpackage.kj
    public final Animator b(View view, jr jrVar) {
        kb.a.c(view);
        return a(view, a(jrVar, 1.0f), 0.0f);
    }

    private static float a(jr jrVar, float f) {
        Float f2;
        if (jrVar == null || (f2 = (Float) jrVar.a.get("android:fade:transitionAlpha")) == null) {
            return f;
        }
        return f2.floatValue();
    }
}
