package defpackage;

/* renamed from: boz reason: default package */
/* compiled from: PG */
public abstract class boz {
    public static final java.lang.Object a = new java.lang.Object();
    public static android.content.Context b = null;
    public static java.lang.Boolean c = null;
    public final defpackage.bpa d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final java.lang.Object g;

    boz(defpackage.bpa bpa, java.lang.String str, java.lang.Object obj) {
        if (bpa.a == null && bpa.b == null) {
            throw new java.lang.IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (bpa.a == null || bpa.b == null) {
            this.d = bpa;
            java.lang.String valueOf = java.lang.String.valueOf(bpa.c);
            java.lang.String valueOf2 = java.lang.String.valueOf(str);
            this.f = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf);
            java.lang.String valueOf3 = java.lang.String.valueOf(bpa.d);
            java.lang.String valueOf4 = java.lang.String.valueOf(str);
            this.e = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new java.lang.String(valueOf3);
            this.g = obj;
        } else {
            throw new java.lang.IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    public abstract java.lang.Object a(android.content.SharedPreferences sharedPreferences);

    public abstract java.lang.Object a(java.lang.String str);

    @android.annotation.TargetApi(24)
    public final java.lang.Object a() {
        if (!b("gms:phenotype:phenotype_flag:debug_bypass_phenotype")) {
            if (this.d.b != null) {
                android.content.ContentResolver contentResolver = b.getContentResolver();
                android.net.Uri uri = this.d.b;
                defpackage.bow bow = (defpackage.bow) defpackage.bow.a.get(uri);
                if (bow == null) {
                    defpackage.bow bow2 = new defpackage.bow(contentResolver, uri);
                    bow = (defpackage.bow) defpackage.bow.a.putIfAbsent(uri, bow2);
                    if (bow == null) {
                        bow2.b.registerContentObserver(bow2.c, false, bow2.d);
                        bow = bow2;
                    }
                }
                java.lang.String str = (java.lang.String) a((defpackage.bpb) new defpackage.bpd(this, bow));
                if (str != null) {
                    return a(str);
                }
            } else if (this.d.a != null) {
                if (android.os.Build.VERSION.SDK_INT >= 24 && !b.isDeviceProtectedStorage() && !((android.os.UserManager) b.getSystemService(android.os.UserManager.class)).isUserUnlocked()) {
                    return null;
                }
                android.content.SharedPreferences sharedPreferences = b.getSharedPreferences(this.d.a, 0);
                if (sharedPreferences.contains(this.e)) {
                    return a(sharedPreferences);
                }
            }
        }
        return null;
    }

    public final java.lang.Object b() {
        if (!this.d.e && c()) {
            java.lang.String str = (java.lang.String) a((defpackage.bpb) new defpackage.bpe(this));
            if (str != null) {
                return a(str);
            }
        }
        return null;
    }

    private static java.lang.Object a(defpackage.bpb bpb) {
        long clearCallingIdentity;
        try {
            return bpb.a();
        } catch (java.lang.SecurityException e2) {
            clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            java.lang.Object a2 = bpb.a();
            android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            return a2;
        } catch (Throwable th) {
            android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    static boolean b(java.lang.String str) {
        if (c()) {
            return ((java.lang.Boolean) a((defpackage.bpb) new defpackage.bpf(str))).booleanValue();
        }
        return false;
    }

    private static boolean c() {
        boolean z;
        if (c == null) {
            if (b == null) {
                return false;
            }
            android.content.Context context = b;
            if (defpackage.jd.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", android.os.Binder.getCallingPid(), android.os.Binder.getCallingUid(), android.os.Binder.getCallingPid() == android.os.Process.myPid() ? context.getPackageName() : null) == 0) {
                z = true;
            } else {
                z = false;
            }
            c = java.lang.Boolean.valueOf(z);
        }
        return c.booleanValue();
    }

    public static /* synthetic */ defpackage.boz a(defpackage.bpa bpa, java.lang.String str) {
        return new defpackage.bpg(bpa, str, null);
    }
}
