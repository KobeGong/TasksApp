package defpackage;

import android.content.Context;
import android.view.KeyEvent;

/* renamed from: wa  reason: default package */
/* compiled from: PG */
public abstract class wa {
    public abstract void a();

    public abstract void a(CharSequence charSequence);

    public abstract void a(boolean z);

    public abstract void b();

    public abstract int c();

    public Context d() {
        return null;
    }

    public void e() {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    public void a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }

    public void b(boolean z) {
    }

    public void c(boolean z) {
    }

    public void f() {
    }

    public void d(boolean z) {
    }

    public yc a(yd ydVar) {
        return null;
    }

    public boolean g() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public boolean i() {
        return false;
    }

    public boolean j() {
        return false;
    }

    public boolean a(int i, KeyEvent keyEvent) {
        return false;
    }

    public boolean k() {
        return false;
    }

    public void b(CharSequence charSequence) {
    }

    /* access modifiers changed from: package-private */
    public void l() {
    }
}
