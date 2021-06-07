package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Binder;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;

/* renamed from: boz */
public abstract class boz {
    public static final Object a = new Object();
    public static Context b = null;
    public static Boolean c = null;
    public final bpa d;
    public final String e;
    public final String f;
    public final Object g;

    boz(bpa bpa, String str, Object obj) {
        if (bpa.a == null && bpa.b == null) {
            throw new IllegalArgumentException("Must pass a valid SharedPreferences file name or ContentProvider URI");
        } else if (bpa.a == null || bpa.b == null) {
            this.d = bpa;
            String valueOf = String.valueOf(bpa.c);
            String valueOf2 = String.valueOf(str);
            this.f = valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new String(valueOf);
            String valueOf3 = String.valueOf(bpa.d);
            String valueOf4 = String.valueOf(str);
            this.e = valueOf4.length() != 0 ? valueOf3.concat(valueOf4) : new String(valueOf3);
            this.g = obj;
        } else {
            throw new IllegalArgumentException("Must pass one of SharedPreferences file name or ContentProvider URI");
        }
    }

    public abstract Object a(SharedPreferences sharedPreferences);

    public abstract Object a(String str);

    public final Object a() {
        if (!b("gms:phenotype:phenotype_flag:debug_bypass_phenotype")) {
            if (this.d.b != null) {
                ContentResolver contentResolver = b.getContentResolver();
                Uri uri = this.d.b;
                bow bow = (bow) bow.a.get(uri);
                if (bow == null) {
                    bow bow2 = new bow(contentResolver, uri);
                    bow = (bow) bow.a.putIfAbsent(uri, bow2);
                    if (bow == null) {
                        bow2.b.registerContentObserver(bow2.c, false, bow2.d);
                        bow = bow2;
                    }
                }
                String str = (String) a(new bpd(this, bow));
                if (str != null) {
                    return a(str);
                }
            } else if (this.d.a != null) {
                if (Build.VERSION.SDK_INT >= 24 && !b.isDeviceProtectedStorage() && !((UserManager) b.getSystemService(UserManager.class)).isUserUnlocked()) {
                    return null;
                }
                SharedPreferences sharedPreferences = b.getSharedPreferences(this.d.a, 0);
                if (sharedPreferences.contains(this.e)) {
                    return a(sharedPreferences);
                }
            }
        }
        return null;
    }

    public final Object b() {
        String str;
        if (this.d.e || !c() || (str = (String) a(new bpe(this))) == null) {
            return null;
        }
        return a(str);
    }

    private static Object a(bpb bpb) {
        long clearCallingIdentity;
        try {
            return bpb.a();
        } catch (SecurityException e2) {
            clearCallingIdentity = Binder.clearCallingIdentity();
            Object a2 = bpb.a();
            Binder.restoreCallingIdentity(clearCallingIdentity);
            return a2;
        } catch (Throwable th) {
            Binder.restoreCallingIdentity(clearCallingIdentity);
            throw th;
        }
    }

    static boolean b(String str) {
        if (c()) {
            return ((Boolean) a(new bpf(str))).booleanValue();
        }
        return false;
    }

    private static boolean c() {
        boolean z;
        if (c == null) {
            if (b == null) {
                return false;
            }
            Context context = b;
            if (jd.a(context, "com.google.android.providers.gsf.permission.READ_GSERVICES", Binder.getCallingPid(), Binder.getCallingUid(), Binder.getCallingPid() == Process.myPid() ? context.getPackageName() : null) == 0) {
                z = true;
            } else {
                z = false;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }

    public static /* synthetic */ boz a(bpa bpa, String str) {
        return new bpg(bpa, str, null);
    }
}
