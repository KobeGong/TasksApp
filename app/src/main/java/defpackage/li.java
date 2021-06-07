package defpackage;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import java.io.PrintWriter;

/* access modifiers changed from: package-private */
/* renamed from: li  reason: default package */
/* compiled from: PG */
public final class li extends lm {
    private final /* synthetic */ lg e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public li(lg lgVar) {
        super(lgVar);
        this.e = lgVar;
    }

    @Override // defpackage.lm
    public final void a(String str, PrintWriter printWriter, String[] strArr) {
        this.e.dump(str, null, printWriter, strArr);
    }

    @Override // defpackage.lm
    public final boolean b() {
        return !this.e.isFinishing();
    }

    @Override // defpackage.lm
    public final LayoutInflater c() {
        return this.e.getLayoutInflater().cloneInContext(this.e);
    }

    @Override // defpackage.lm
    public final void a(lc lcVar, Intent intent, int i) {
        lg lgVar = this.e;
        lgVar.a = true;
        if (i == -1) {
            try {
                kq.a(lgVar, intent, -1, null);
            } finally {
                lgVar.a = false;
            }
        } else {
            lg.a(i);
            if (lgVar.f.b() >= 65534) {
                throw new IllegalStateException("Too many pending Fragment activity results.");
            }
            while (true) {
                rj rjVar = lgVar.f;
                int i2 = lgVar.e;
                if (rjVar.b) {
                    rjVar.a();
                }
                if (qv.a(rjVar.c, rjVar.e, i2) >= 0) {
                    lgVar.e = (lgVar.e + 1) % 65534;
                } else {
                    int i3 = lgVar.e;
                    lgVar.f.a(i3, lcVar.h);
                    lgVar.e = (lgVar.e + 1) % 65534;
                    kq.a(lgVar, intent, ((i3 + 1) << 16) + (65535 & i), null);
                    lgVar.a = false;
                    return;
                }
            }
        }
    }

    @Override // defpackage.lm
    public final boolean d() {
        return this.e.getWindow() != null;
    }

    @Override // defpackage.lm
    public final int e() {
        Window window = this.e.getWindow();
        if (window == null) {
            return 0;
        }
        return window.getAttributes().windowAnimations;
    }

    @Override // defpackage.lm, defpackage.lk
    public final View a(int i) {
        return this.e.findViewById(i);
    }

    @Override // defpackage.lm, defpackage.lk
    public final boolean a() {
        Window window = this.e.getWindow();
        return (window == null || window.peekDecorView() == null) ? false : true;
    }
}
