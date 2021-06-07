package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* renamed from: cag  reason: default package */
/* compiled from: PG */
public final class cag implements cac {
    public Context a;
    public cae b;
    public buu c;
    public dml d;
    public dml e;
    public dml f;
    public dml g;
    public dml h;
    public dml i;
    public dml j;
    public dml k;
    public dml l;

    cag() {
    }

    @Override // defpackage.cac
    public final btl a(bul bul, String str) {
        boolean z;
        cky.c();
        cld.a(bul != null);
        if (!TextUtils.isEmpty(str)) {
            z = true;
        } else {
            z = false;
        }
        cld.a(z);
        cld.a(((Map) this.d.a()).containsKey(str));
        String b2 = bul.b();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", b2);
        bundle.putString("com.google.android.libraries.notifications.INTENT_EXTRA_RPC_CALLBACK", str);
        cax cax = (cax) this.h.a();
        try {
            this.b.a(bul, 1, "RPC_STORE_TARGET", bundle);
            return btl.a;
        } catch (cad e2) {
            bty.b("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_STORE_TARGET");
            return cax.a(bundle);
        }
    }

    @Override // defpackage.cac
    public final void a(bul bul, long j2, String str) {
        boolean z;
        cky.c();
        cld.a(bul != null);
        if (!TextUtils.isEmpty(str)) {
            z = true;
        } else {
            z = false;
        }
        cld.a(z);
        cld.a(((Map) this.d.a()).containsKey(str));
        String b2 = bul.b();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", b2);
        bundle.putString("com.google.android.libraries.notifications.INTENT_EXTRA_RPC_CALLBACK", str);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_SYNC_VERSION", j2);
        caq caq = (caq) this.f.a();
        if (!bwj.a(this.a)) {
            bty.a("ChimeScheduledRpcHelperImpl", "App not targeting Android O. Calling [%s] RPC in the current thread.", "RPC_FETCH_UPDATED_THREADS");
            caq.a(bundle);
            return;
        }
        try {
            this.b.a(bul, 2, "RPC_FETCH_UPDATED_THREADS", bundle);
        } catch (cad e2) {
            bty.b("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_FETCH_UPDATED_THREADS");
            caq.a(bundle);
        }
    }

    @Override // defpackage.cac
    public final void b(bul bul, String str) {
        boolean z;
        cky.c();
        cld.a(bul != null);
        if (!TextUtils.isEmpty(str)) {
            z = true;
        } else {
            z = false;
        }
        cld.a(z);
        cld.a(((Map) this.d.a()).containsKey(str));
        String b2 = bul.b();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", b2);
        bundle.putString("com.google.android.libraries.notifications.INTENT_EXTRA_RPC_CALLBACK", str);
        bundle.putLong("com.google.android.libraries.notifications.INTENT_EXTRA_PAGE_VERSION", 0);
        cao cao = (cao) this.e.a();
        if (!bwj.a(this.a)) {
            bty.a("ChimeScheduledRpcHelperImpl", "App not targeting Android O. Calling [%s] RPC in the current thread.", "RPC_FETCH_LATEST_THREADS");
            cao.a(bundle);
            return;
        }
        try {
            this.b.a(bul, 2, "RPC_FETCH_LATEST_THREADS", bundle);
        } catch (cad e2) {
            bty.b("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_FETCH_LATEST_THREADS");
            cao.a(bundle);
        }
    }

    @Override // defpackage.cac
    public final void a(bul bul, int i2, List list, String str) {
        boolean z;
        boolean z2;
        cky.c();
        cld.a(bul != null);
        if (!TextUtils.isEmpty(str)) {
            z = true;
        } else {
            z = false;
        }
        cld.a(z);
        cld.a(((Map) this.d.a()).containsKey(str));
        if (list == null || list.isEmpty()) {
            z2 = false;
        } else {
            z2 = true;
        }
        cld.a(z2);
        String b2 = bul.b();
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.notifications.ACCOUNT_NAME", b2);
        bundle.putInt("com.google.android.libraries.notifications.INTENT_EXTRA_THREAD_STATE_UPDATE_BITMASK", i2);
        bundle.putString("com.google.android.libraries.notifications.INTENT_EXTRA_RPC_CALLBACK", str);
        int i3 = i2 + 100;
        Iterator it = list.iterator();
        while (it.hasNext()) {
            this.c.a(b2, i3, ((dfj) it.next()).b());
        }
        caz caz = (caz) this.i.a();
        try {
            this.b.a(bul, i3, "RPC_UPDATE_THREAD_STATE", bundle);
        } catch (cad e2) {
            bty.b("ChimeScheduledRpcHelperImpl", "Error scheduling RPC via GcoreGcmNetworkManager. Calling [%s] RPC in the current thread", "RPC_UPDATE_THREAD_STATE");
            caz.a(bundle);
        }
    }

    static {
        Charset.forName("UTF-8");
    }
}
