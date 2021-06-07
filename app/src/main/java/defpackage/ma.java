package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.Transformation;

/* access modifiers changed from: package-private */
/* renamed from: ma  reason: default package */
/* compiled from: PG */
public final class ma extends AnimationSet implements Runnable {
    private final ViewGroup a;
    private final View b;
    private boolean c;
    private boolean d;

    ma(Animation animation, ViewGroup viewGroup, View view) {
        super(false);
        this.a = viewGroup;
        this.b = view;
        addAnimation(animation);
    }

    public final boolean getTransformation(long j, Transformation transformation) {
        if (this.c) {
            if (!this.d) {
                return true;
            }
            return false;
        } else if (super.getTransformation(j, transformation)) {
            return true;
        } else {
            this.c = true;
            nt.a(this.a, this);
            return true;
        }
    }

    public final boolean getTransformation(long j, Transformation transformation, float f) {
        if (this.c) {
            if (!this.d) {
                return true;
            }
            return false;
        } else if (super.getTransformation(j, transformation, f)) {
            return true;
        } else {
            this.c = true;
            nt.a(this.a, this);
            return true;
        }
    }

    public final void run() {
        this.a.endViewTransition(this.b);
        this.d = true;
    }
}
