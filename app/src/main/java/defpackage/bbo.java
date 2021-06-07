package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.common.api.internal.LifecycleCallback;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: bbo  reason: default package */
/* compiled from: PG */
public final class bbo extends lc implements bax {
    private static WeakHashMap a = new WeakHashMap();
    private int U = 0;
    private Bundle V;
    private Map b = new qr();

    public static bbo a(lg lgVar) {
        bbo bbo;
        WeakReference weakReference = (WeakReference) a.get(lgVar);
        if (weakReference == null || (bbo = (bbo) weakReference.get()) == null) {
            try {
                bbo = (bbo) lgVar.c().a("SupportLifecycleFragmentImpl");
                if (bbo == null || bbo.n) {
                    bbo = new bbo();
                    lgVar.c().a().a(bbo, "SupportLifecycleFragmentImpl").c();
                }
                a.put(lgVar, new WeakReference(bbo));
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            }
        }
        return bbo;
    }

    @Override // defpackage.bax
    public final LifecycleCallback a(String str, Class cls) {
        return (LifecycleCallback) cls.cast(this.b.get(str));
    }

    @Override // defpackage.bax
    public final void a(String str, LifecycleCallback lifecycleCallback) {
        if (!this.b.containsKey(str)) {
            this.b.put(str, lifecycleCallback);
            if (this.U > 0) {
                new Handler(Looper.getMainLooper()).post(new bbp(this, lifecycleCallback, str));
                return;
            }
            return;
        }
        throw new IllegalArgumentException(new StringBuilder(String.valueOf(str).length() + 59).append("LifecycleCallback with tag ").append(str).append(" already added to this fragment.").toString());
    }

    @Override // defpackage.lc
    public final void a(Bundle bundle) {
        super.a(bundle);
        this.U = 1;
        this.V = bundle;
        for (Map.Entry entry : this.b.entrySet()) {
            ((LifecycleCallback) entry.getValue()).a(bundle != null ? bundle.getBundle((String) entry.getKey()) : null);
        }
    }

    @Override // defpackage.lc
    public final void e() {
        super.e();
        this.U = 2;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.b();
        }
    }

    @Override // defpackage.lc
    public final void s() {
        super.s();
        this.U = 3;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.c();
        }
    }

    @Override // defpackage.lc
    public final void a(int i, int i2, Intent intent) {
        super.a(i, i2, intent);
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.a(i, i2, intent);
        }
    }

    @Override // defpackage.lc
    public final void d(Bundle bundle) {
        super.d(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.b.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).b(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        }
    }

    @Override // defpackage.lc
    public final void f() {
        super.f();
        this.U = 4;
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.d();
        }
    }

    @Override // defpackage.lc
    public final void u() {
        super.u();
        this.U = 5;
        Iterator it = this.b.values().iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    @Override // defpackage.lc
    public final void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.a(str, fileDescriptor, printWriter, strArr);
        for (LifecycleCallback lifecycleCallback : this.b.values()) {
            lifecycleCallback.a(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // defpackage.bax
    public final /* synthetic */ Activity g_() {
        return j();
    }
}
