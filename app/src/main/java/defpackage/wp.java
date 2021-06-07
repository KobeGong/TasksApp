package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MenuInflater;
import android.view.Window;

/* renamed from: wp  reason: default package */
/* compiled from: PG */
public abstract class wp extends wo {
    private static boolean n = true;
    private static final int[] o = {16842836};
    public final Context b;
    public final Window c;
    public final Window.Callback d = this.c.getCallback();
    public final wn e;
    public wa f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public boolean k;
    public CharSequence l;
    public boolean m;
    private final Window.Callback p;
    private MenuInflater q;

    wp(Context context, Window window, wn wnVar) {
        this.b = context;
        this.c = window;
        this.e = wnVar;
        if (this.d instanceof wr) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        this.p = a(this.d);
        this.c.setCallback(this.p);
        agw a = agw.a(context, (AttributeSet) null, o);
        Drawable b2 = a.b(0);
        if (b2 != null) {
            this.c.setBackgroundDrawable(b2);
        }
        a.b.recycle();
    }

    /* access modifiers changed from: package-private */
    public abstract yc a(yd ydVar);

    /* access modifiers changed from: package-private */
    public abstract boolean a(int i2, KeyEvent keyEvent);

    /* access modifiers changed from: package-private */
    public abstract boolean a(KeyEvent keyEvent);

    /* access modifiers changed from: package-private */
    public abstract void b(CharSequence charSequence);

    /* access modifiers changed from: package-private */
    public abstract void d(int i2);

    /* access modifiers changed from: package-private */
    public abstract boolean e(int i2);

    /* access modifiers changed from: package-private */
    public abstract void l();

    /* access modifiers changed from: package-private */
    public Window.Callback a(Window.Callback callback) {
        return new wr(this, callback);
    }

    @Override // defpackage.wo
    public final wa a() {
        l();
        return this.f;
    }

    @Override // defpackage.wo
    public final MenuInflater b() {
        if (this.q == null) {
            l();
            this.q = new yj(this.f != null ? this.f.d() : this.b);
        }
        return this.q;
    }

    /* access modifiers changed from: package-private */
    public final Context m() {
        Context context = null;
        wa a = a();
        if (a != null) {
            context = a.d();
        }
        if (context == null) {
            return this.b;
        }
        return context;
    }

    @Override // defpackage.wo
    public void e() {
    }

    @Override // defpackage.wo
    public void f() {
    }

    @Override // defpackage.wo
    public void i() {
        this.m = true;
    }

    public boolean n() {
        return false;
    }

    @Override // defpackage.wo
    public boolean k() {
        return false;
    }

    @Override // defpackage.wo
    public final void a(CharSequence charSequence) {
        this.l = charSequence;
        b(charSequence);
    }

    @Override // defpackage.wo
    public void b(Bundle bundle) {
    }

    static {
        if (Build.VERSION.SDK_INT < 21 && !n) {
            Thread.setDefaultUncaughtExceptionHandler(new wq(Thread.getDefaultUncaughtExceptionHandler()));
        }
    }
}
