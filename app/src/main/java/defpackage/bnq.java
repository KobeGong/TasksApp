package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.util.HashMap;

/* renamed from: bnq  reason: default package */
/* compiled from: PG */
public final class bnq extends bel {
    private static volatile Bundle j;
    private static volatile Bundle k;
    private String a;
    private String h;
    private final HashMap i = new HashMap();

    public bnq(Context context, Looper looper, ayr ayr, ays ays, String str, bdj bdj) {
        super(context.getApplicationContext(), looper, 5, bdj, ayr, ays);
        new HashMap();
        this.a = str;
        this.h = bdj.e;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String f_() {
        return "com.google.android.gms.people.service.START";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final String b() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final Bundle m() {
        Bundle bundle = new Bundle();
        bundle.putString("social_client_application_id", this.a);
        bundle.putString("real_client_package_name", this.h);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final void a(int i2, IBinder iBinder, Bundle bundle, int i3) {
        if (i2 == 0 && bundle != null) {
            a(bundle.getBundle("post_init_configuration"));
        }
        super.a(i2, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i3);
    }

    @Override // defpackage.ayj, defpackage.bcx
    public final void e() {
        synchronized (this.i) {
            if (f()) {
                for (bnf bnf : this.i.values()) {
                    bnf.a();
                    try {
                        ((bnn) super.o()).a((bnl) bnf, false, (String) null, (String) null, 0);
                    } catch (RemoteException e) {
                        Log.w("PeopleClient", "Failed to unregister listener", e);
                    } catch (IllegalStateException e2) {
                        Log.w("PeopleClient", "PeopleService is in unexpected state", e2);
                    }
                }
            }
            this.i.clear();
        }
        super.e();
    }

    private final synchronized void a(Bundle bundle) {
        if (bundle != null) {
            bne.a = bundle.getBoolean("use_contactables_api", true);
            bjw.a.a(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
            j = bundle.getBundle("config.email_type_map");
            k = bundle.getBundle("config.phone_type_map");
        }
    }

    public final bnf a(ayp ayp, bly bly) {
        bnf bnf;
        synchronized (this.i) {
            if (this.i.containsKey(bly)) {
                bnf = (bnf) this.i.get(bly);
            } else {
                bnf = new bnf(ayp.a(bly));
                this.i.put(bly, bnf);
            }
        }
        return bnf;
    }

    public final void a(bnf bnf, String str, String str2, int i2) {
        super.n();
        synchronized (this.i) {
            ((bnn) super.o()).a((bnl) bnf, true, str, str2, i2);
        }
    }

    public final void a(bly bly) {
        synchronized (this.i) {
            try {
                super.n();
                if (this.i.containsKey(bly)) {
                    bnf bnf = (bnf) this.i.get(bly);
                    bnf.a();
                    ((bnn) super.o()).a((bnl) bnf, false, (String) null, (String) null, 0);
                    this.i.remove(bly);
                }
            } finally {
                this.i.remove(bly);
            }
        }
    }

    public final void a(bcb bcb, boolean z, int i2) {
        super.n();
        bng bng = new bng(bcb);
        try {
            ((bnn) super.o()).a(bng, z, i2);
        } catch (RemoteException e) {
            bng.a(8, null, null);
        }
    }

    public final bet a(bcb bcb, String str, String str2, int i2, int i3) {
        bnh bnh = new bnh(bcb);
        try {
            return ((bnn) super.o()).a(bnh, str, str2, i2, i3);
        } catch (RemoteException e) {
            bnh.a(8, (Bundle) null, (ParcelFileDescriptor) null, (Bundle) null);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    @Override // defpackage.bcx
    public final /* synthetic */ IInterface a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        if (queryLocalInterface instanceof bnn) {
            return (bnn) queryLocalInterface;
        }
        return new bno(iBinder);
    }

    static /* synthetic */ Status a(int i2, Bundle bundle) {
        PendingIntent pendingIntent;
        if (bundle == null) {
            pendingIntent = null;
        } else {
            pendingIntent = (PendingIntent) bundle.getParcelable("pendingIntent");
        }
        return new Status(i2, null, pendingIntent);
    }
}
