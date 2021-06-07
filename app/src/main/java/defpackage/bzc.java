package defpackage;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: bzc  reason: default package */
/* compiled from: PG */
public final class bzc {
    public Context a;
    public buc b;
    public byk c;

    public final dfh a() {
        dih dih;
        dih dih2;
        dih dih3;
        dii dii = (dii) dec.f.a(bg.ao);
        String packageName = this.a.getApplicationContext().getPackageName();
        dii.b();
        dec dec = (dec) dii.a;
        if (packageName == null) {
            throw new NullPointerException();
        }
        dec.a |= 4;
        dec.d = packageName;
        String a2 = this.c.a();
        dii.b();
        dec dec2 = (dec) dii.a;
        if (a2 == null) {
            throw new NullPointerException();
        }
        dec2.a |= 1;
        dec2.b = a2;
        long b2 = b(this.a);
        if (b2 != -1) {
            dii.b();
            dec dec3 = (dec) dii.a;
            dec3.a |= 2;
            dec3.c = b2;
        }
        long a3 = a(this.a);
        if (a3 != -1) {
            dii.b();
            dec dec4 = (dec) dii.a;
            dec4.a |= 8;
            dec4.e = a3;
        }
        dii dii2 = (dii) dfh.d.a(bg.ao);
        ddw ddw = ddw.GCM_DEVICE_PUSH;
        dii2.b();
        dfh dfh = (dfh) dii2.a;
        if (ddw == null) {
            throw new NullPointerException();
        }
        dfh.a |= 1;
        dfh.b = ddw.c;
        dii dii3 = (dii) ddz.d.a(bg.ao);
        if (dii.b) {
            dih = dii.a;
        } else {
            dih dih4 = dii.a;
            djz.a.a(dih4).c(dih4);
            dii.b = true;
            dih = dii.a;
        }
        dih dih5 = dih;
        if (!dih.a(dih5, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        dec dec5 = (dec) dih5;
        dii3.b();
        ddz ddz = (ddz) dii3.a;
        if (dec5 == null) {
            throw new NullPointerException();
        }
        ddz.c = dec5;
        ddz.b = 1;
        if (dii3.b) {
            dih2 = dii3.a;
        } else {
            dih dih6 = dii3.a;
            djz.a.a(dih6).c(dih6);
            dii3.b = true;
            dih2 = dii3.a;
        }
        dih dih7 = dih2;
        if (!dih.a(dih7, Boolean.TRUE.booleanValue())) {
            throw new dkw();
        }
        ddz ddz2 = (ddz) dih7;
        dii2.b();
        dfh dfh2 = (dfh) dii2.a;
        if (ddz2 == null) {
            throw new NullPointerException();
        }
        dfh2.c = ddz2;
        dfh2.a |= 2;
        if (dii2.b) {
            dih3 = dii2.a;
        } else {
            dih dih8 = dii2.a;
            djz.a.a(dih8).c(dih8);
            dii2.b = true;
            dih3 = dii2.a;
        }
        dih dih9 = dih3;
        if (dih.a(dih9, Boolean.TRUE.booleanValue())) {
            return (dfh) dih9;
        }
        throw new dkw();
    }

    public final dfi b() {
        dih dih;
        dii dii = (dii) dfi.f.a(bg.ao);
        String packageName = this.a.getApplicationContext().getPackageName();
        dii.b();
        dfi dfi = (dfi) dii.a;
        if (packageName == null) {
            throw new NullPointerException();
        }
        dfi.a |= 4;
        dfi.d = packageName;
        dfh a2 = a();
        dii.b();
        dfi dfi2 = (dfi) dii.a;
        if (a2 == null) {
            throw new NullPointerException();
        }
        dfi2.c = a2;
        dfi2.b = 1;
        if (this.b.b() != null && !this.b.b().isEmpty()) {
            List b2 = this.b.b();
            dii.b();
            dfi dfi3 = (dfi) dii.a;
            if (!dfi3.e.a()) {
                diq diq = dfi3.e;
                int size = diq.size();
                dfi3.e = diq.a(size == 0 ? 10 : size << 1);
            }
            diq diq2 = dfi3.e;
            dim.a(b2);
            if (b2 instanceof diz) {
                List d = ((diz) b2).d();
                diz diz = (diz) diq2;
                int size2 = diq2.size();
                for (Object obj : d) {
                    if (obj == null) {
                        String sb = new StringBuilder(37).append("Element at index ").append(diz.size() - size2).append(" is null.").toString();
                        for (int size3 = diz.size() - 1; size3 >= size2; size3--) {
                            diz.remove(size3);
                        }
                        throw new NullPointerException(sb);
                    } else if (obj instanceof dha) {
                        diz.a((dha) obj);
                    } else {
                        diz.add((String) obj);
                    }
                }
            } else if (b2 instanceof djy) {
                diq2.addAll(b2);
            } else {
                if ((diq2 instanceof ArrayList) && (b2 instanceof Collection)) {
                    ((ArrayList) diq2).ensureCapacity(b2.size() + diq2.size());
                }
                int size4 = diq2.size();
                for (Object obj2 : b2) {
                    if (obj2 == null) {
                        String sb2 = new StringBuilder(37).append("Element at index ").append(diq2.size() - size4).append(" is null.").toString();
                        for (int size5 = diq2.size() - 1; size5 >= size4; size5--) {
                            diq2.remove(size5);
                        }
                        throw new NullPointerException(sb2);
                    }
                    diq2.add(obj2);
                }
            }
        }
        if (dii.b) {
            dih = dii.a;
        } else {
            dih dih2 = dii.a;
            djz.a.a(dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        dih dih3 = dih;
        if (dih.a(dih3, Boolean.TRUE.booleanValue())) {
            return (dfi) dih3;
        }
        throw new dkw();
    }

    public final ddo c() {
        dih dih;
        dih dih2;
        dih dih3;
        dii dii = (dii) ddd.f.a(bg.ao);
        String packageName = this.a.getApplicationContext().getPackageName();
        dii.b();
        ddd ddd = (ddd) dii.a;
        if (packageName == null) {
            throw new NullPointerException();
        }
        ddd.a |= 4;
        ddd.d = packageName;
        try {
            String a2 = this.c.a();
            dii.b();
            ddd ddd2 = (ddd) dii.a;
            if (a2 == null) {
                throw new NullPointerException();
            }
            ddd2.a |= 1;
            ddd2.b = a2;
            long b2 = b(this.a);
            if (b2 != -1) {
                dii.b();
                ddd ddd3 = (ddd) dii.a;
                ddd3.a |= 2;
                ddd3.c = b2;
            }
            long a3 = a(this.a);
            if (a3 != -1) {
                dii.b();
                ddd ddd4 = (ddd) dii.a;
                ddd4.a |= 8;
                ddd4.e = a3;
            }
            dii dii2 = (dii) ddo.d.a(bg.ao);
            dcl dcl = dcl.GCM_DEVICE_PUSH;
            dii2.b();
            ddo ddo = (ddo) dii2.a;
            if (dcl == null) {
                throw new NullPointerException();
            }
            ddo.a |= 1;
            ddo.b = dcl.c;
            dii dii3 = (dii) ddb.d.a(bg.ao);
            if (dii.b) {
                dih = dii.a;
            } else {
                dih dih4 = dii.a;
                djz.a.a(dih4).c(dih4);
                dii.b = true;
                dih = dii.a;
            }
            dih dih5 = dih;
            if (!dih.a(dih5, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            ddd ddd5 = (ddd) dih5;
            dii3.b();
            ddb ddb = (ddb) dii3.a;
            if (ddd5 == null) {
                throw new NullPointerException();
            }
            ddb.c = ddd5;
            ddb.b = 2;
            if (dii3.b) {
                dih2 = dii3.a;
            } else {
                dih dih6 = dii3.a;
                djz.a.a(dih6).c(dih6);
                dii3.b = true;
                dih2 = dii3.a;
            }
            dih dih7 = dih2;
            if (!dih.a(dih7, Boolean.TRUE.booleanValue())) {
                throw new dkw();
            }
            ddb ddb2 = (ddb) dih7;
            dii2.b();
            ddo ddo2 = (ddo) dii2.a;
            if (ddb2 == null) {
                throw new NullPointerException();
            }
            ddo2.c = ddb2;
            ddo2.a |= 2;
            if (dii2.b) {
                dih3 = dii2.a;
            } else {
                dih dih8 = dii2.a;
                djz.a.a(dih8).c(dih8);
                dii2.b = true;
                dih3 = dii2.a;
            }
            dih dih9 = dih3;
            if (dih.a(dih9, Boolean.TRUE.booleanValue())) {
                return (ddo) dih9;
            }
            throw new dkw();
        } catch (byl e) {
            bty.b("TargetCreatorHelperImpl", e, "Failed to get registraiton ID.", new Object[0]);
        }
    }

    private static long a(Context context) {
        if (bwj.f()) {
            return ((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle());
        }
        return -1;
    }

    private static long b(Context context) {
        SecurityException e;
        long j;
        try {
            j = bqb.a(context.getContentResolver(), "android_id");
            if (j == -1) {
                try {
                    bty.e("TargetCreatorHelperImpl", "Failed to get android ID.", new Object[0]);
                } catch (SecurityException e2) {
                    e = e2;
                    bty.b("TargetCreatorHelperImpl", e, "Exception reading GServices key.", new Object[0]);
                    return j;
                }
            }
        } catch (SecurityException e3) {
            j = -1;
            e = e3;
            bty.b("TargetCreatorHelperImpl", e, "Exception reading GServices key.", new Object[0]);
            return j;
        }
        return j;
    }
}
