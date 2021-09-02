package defpackage;

/* renamed from: bnq reason: default package */
/* compiled from: PG */
public final class bnq extends defpackage.bel {
    private static volatile android.os.Bundle j;
    private static volatile android.os.Bundle k;
    private java.lang.String a;
    private java.lang.String h;
    private final java.util.HashMap i = new java.util.HashMap();

    public bnq(android.content.Context context, android.os.Looper looper, defpackage.ayr ayr, defpackage.ays ays, java.lang.String str, defpackage.bdj bdj) {
        super(context.getApplicationContext(), looper, 5, bdj, ayr, ays);
        new java.util.HashMap();
        this.a = str;
        this.h = bdj.e;
    }

    /* access modifiers changed from: protected */
    public final java.lang.String f_() {
        return "com.google.android.gms.people.service.START";
    }

    /* access modifiers changed from: protected */
    public final java.lang.String b() {
        return "com.google.android.gms.people.internal.IPeopleService";
    }

    /* access modifiers changed from: protected */
    public final android.os.Bundle m() {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("social_client_application_id", this.a);
        bundle.putString("real_client_package_name", this.h);
        bundle.putBoolean("support_new_image_callback", true);
        return bundle;
    }

    /* access modifiers changed from: protected */
    public final void a(int i2, android.os.IBinder iBinder, android.os.Bundle bundle, int i3) {
        if (i2 == 0 && bundle != null) {
            a(bundle.getBundle("post_init_configuration"));
        }
        super.a(i2, iBinder, bundle == null ? null : bundle.getBundle("post_init_resolution"), i3);
    }

    public final void e() {
        synchronized (this.i) {
            if (f()) {
                for (defpackage.bnf bnf : this.i.values()) {
                    bnf.a();
                    try {
                        ((defpackage.bnn) super.o()).a((defpackage.bnl) bnf, false, (java.lang.String) null, (java.lang.String) null, 0);
                    } catch (android.os.RemoteException e) {
                        android.util.Log.w("PeopleClient", "Failed to unregister listener", e);
                    } catch (java.lang.IllegalStateException e2) {
                        android.util.Log.w("PeopleClient", "PeopleService is in unexpected state", e2);
                    }
                }
            }
            this.i.clear();
        }
        super.e();
    }

    private final synchronized void a(android.os.Bundle bundle) {
        if (bundle != null) {
            defpackage.bne.a = bundle.getBoolean("use_contactables_api", true);
            defpackage.bjw.a.a(bundle.getStringArray("config.url_uncompress.patterns"), bundle.getStringArray("config.url_uncompress.replacements"));
            j = bundle.getBundle("config.email_type_map");
            k = bundle.getBundle("config.phone_type_map");
        }
    }

    public final defpackage.bnf a(defpackage.ayp ayp, defpackage.bly bly) {
        defpackage.bnf bnf;
        synchronized (this.i) {
            if (this.i.containsKey(bly)) {
                bnf = (defpackage.bnf) this.i.get(bly);
            } else {
                bnf = new defpackage.bnf(ayp.a((java.lang.Object) bly));
                this.i.put(bly, bnf);
            }
        }
        return bnf;
    }

    public final void a(defpackage.bnf bnf, java.lang.String str, java.lang.String str2, int i2) {
        super.n();
        synchronized (this.i) {
            ((defpackage.bnn) super.o()).a((defpackage.bnl) bnf, true, str, str2, i2);
        }
    }

    public final void a(defpackage.bly bly) {
        synchronized (this.i) {
            try {
                super.n();
                if (this.i.containsKey(bly)) {
                    defpackage.bnf bnf = (defpackage.bnf) this.i.get(bly);
                    bnf.a();
                    ((defpackage.bnn) super.o()).a((defpackage.bnl) bnf, false, (java.lang.String) null, (java.lang.String) null, 0);
                    this.i.remove(bly);
                }
            } finally {
                this.i.remove(bly);
            }
        }
    }

    public final void a(defpackage.bcb bcb, boolean z, int i2) {
        super.n();
        defpackage.bng bng = new defpackage.bng(bcb);
        try {
            ((defpackage.bnn) super.o()).a(bng, z, i2);
        } catch (android.os.RemoteException e) {
            bng.a(8, null, null);
        }
    }

    public final defpackage.bet a(defpackage.bcb bcb, java.lang.String str, java.lang.String str2, int i2, int i3) {
        defpackage.bnh bnh = new defpackage.bnh(bcb);
        try {
            return ((defpackage.bnn) super.o()).a((defpackage.bnl) bnh, str, str2, i2, i3);
        } catch (android.os.RemoteException e) {
            bnh.a(8, null, null, null);
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ android.os.IInterface a(android.os.IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        android.os.IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.people.internal.IPeopleService");
        if (queryLocalInterface instanceof defpackage.bnn) {
            return (defpackage.bnn) queryLocalInterface;
        }
        return new defpackage.bno(iBinder);
    }

    static /* synthetic */ com.google.android.gms.common.api.Status a(int i2, android.os.Bundle bundle) {
        android.app.PendingIntent pendingIntent;
        if (bundle == null) {
            pendingIntent = null;
        } else {
            pendingIntent = (android.app.PendingIntent) bundle.getParcelable("pendingIntent");
        }
        return new com.google.android.gms.common.api.Status(i2, null, pendingIntent);
    }
}
