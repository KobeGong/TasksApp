package defpackage;

/* renamed from: bzc reason: default package */
/* compiled from: PG */
public final class bzc {
    public android.content.Context a;
    public defpackage.buc b;
    public defpackage.byk c;

    public final defpackage.dfh a() {
        defpackage.dih dih;
        defpackage.dih dih2;
        defpackage.dih dih3;
        defpackage.dii dii = (defpackage.dii) defpackage.dec.f.a(defpackage.bg.ao);
        java.lang.String packageName = this.a.getApplicationContext().getPackageName();
        dii.b();
        defpackage.dec dec = (defpackage.dec) dii.a;
        if (packageName == null) {
            throw new java.lang.NullPointerException();
        }
        dec.a |= 4;
        dec.d = packageName;
        java.lang.String a2 = this.c.a();
        dii.b();
        defpackage.dec dec2 = (defpackage.dec) dii.a;
        if (a2 == null) {
            throw new java.lang.NullPointerException();
        }
        dec2.a |= 1;
        dec2.b = a2;
        long b2 = b(this.a);
        if (b2 != -1) {
            dii.b();
            defpackage.dec dec3 = (defpackage.dec) dii.a;
            dec3.a |= 2;
            dec3.c = b2;
        }
        long a3 = a(this.a);
        if (a3 != -1) {
            dii.b();
            defpackage.dec dec4 = (defpackage.dec) dii.a;
            dec4.a |= 8;
            dec4.e = a3;
        }
        defpackage.dii dii2 = (defpackage.dii) defpackage.dfh.d.a(defpackage.bg.ao);
        defpackage.ddw ddw = defpackage.ddw.GCM_DEVICE_PUSH;
        dii2.b();
        defpackage.dfh dfh = (defpackage.dfh) dii2.a;
        if (ddw == null) {
            throw new java.lang.NullPointerException();
        }
        dfh.a |= 1;
        dfh.b = ddw.c;
        defpackage.dii dii3 = (defpackage.dii) defpackage.ddz.d.a(defpackage.bg.ao);
        if (dii.b) {
            dih = dii.a;
        } else {
            defpackage.dih dih4 = dii.a;
            defpackage.djz.a.a((java.lang.Object) dih4).c(dih4);
            dii.b = true;
            dih = dii.a;
        }
        defpackage.dih dih5 = dih;
        if (!defpackage.dih.a(dih5, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        defpackage.dec dec5 = (defpackage.dec) dih5;
        dii3.b();
        defpackage.ddz ddz = (defpackage.ddz) dii3.a;
        if (dec5 == null) {
            throw new java.lang.NullPointerException();
        }
        ddz.c = dec5;
        ddz.b = 1;
        if (dii3.b) {
            dih2 = dii3.a;
        } else {
            defpackage.dih dih6 = dii3.a;
            defpackage.djz.a.a((java.lang.Object) dih6).c(dih6);
            dii3.b = true;
            dih2 = dii3.a;
        }
        defpackage.dih dih7 = dih2;
        if (!defpackage.dih.a(dih7, java.lang.Boolean.TRUE.booleanValue())) {
            throw new defpackage.dkw();
        }
        defpackage.ddz ddz2 = (defpackage.ddz) dih7;
        dii2.b();
        defpackage.dfh dfh2 = (defpackage.dfh) dii2.a;
        if (ddz2 == null) {
            throw new java.lang.NullPointerException();
        }
        dfh2.c = ddz2;
        dfh2.a |= 2;
        if (dii2.b) {
            dih3 = dii2.a;
        } else {
            defpackage.dih dih8 = dii2.a;
            defpackage.djz.a.a((java.lang.Object) dih8).c(dih8);
            dii2.b = true;
            dih3 = dii2.a;
        }
        defpackage.dih dih9 = dih3;
        if (defpackage.dih.a(dih9, java.lang.Boolean.TRUE.booleanValue())) {
            return (defpackage.dfh) dih9;
        }
        throw new defpackage.dkw();
    }

    public final defpackage.dfi b() {
        defpackage.dih dih;
        defpackage.dii dii = (defpackage.dii) defpackage.dfi.f.a(defpackage.bg.ao);
        java.lang.String packageName = this.a.getApplicationContext().getPackageName();
        dii.b();
        defpackage.dfi dfi = (defpackage.dfi) dii.a;
        if (packageName == null) {
            throw new java.lang.NullPointerException();
        }
        dfi.a |= 4;
        dfi.d = packageName;
        defpackage.dfh a2 = a();
        dii.b();
        defpackage.dfi dfi2 = (defpackage.dfi) dii.a;
        if (a2 == null) {
            throw new java.lang.NullPointerException();
        }
        dfi2.c = a2;
        dfi2.b = 1;
        if (this.b.b() != null && !this.b.b().isEmpty()) {
            java.util.List b2 = this.b.b();
            dii.b();
            defpackage.dfi dfi3 = (defpackage.dfi) dii.a;
            if (!dfi3.e.a()) {
                defpackage.diq diq = dfi3.e;
                int size = diq.size();
                dfi3.e = diq.a(size == 0 ? 10 : size << 1);
            }
            defpackage.diq diq2 = dfi3.e;
            defpackage.dim.a((java.lang.Object) b2);
            if (b2 instanceof defpackage.diz) {
                java.util.List d = ((defpackage.diz) b2).d();
                defpackage.diz diz = (defpackage.diz) diq2;
                int size2 = diq2.size();
                for (java.lang.Object next : d) {
                    if (next == null) {
                        java.lang.String str = "Element at index " + (diz.size() - size2) + " is null.";
                        for (int size3 = diz.size() - 1; size3 >= size2; size3--) {
                            diz.remove(size3);
                        }
                        throw new java.lang.NullPointerException(str);
                    } else if (next instanceof defpackage.dha) {
                        diz.a((defpackage.dha) next);
                    } else {
                        diz.add((java.lang.String) next);
                    }
                }
            } else if (b2 instanceof defpackage.djy) {
                diq2.addAll(b2);
            } else {
                if ((diq2 instanceof java.util.ArrayList) && (b2 instanceof java.util.Collection)) {
                    ((java.util.ArrayList) diq2).ensureCapacity(b2.size() + diq2.size());
                }
                int size4 = diq2.size();
                for (java.lang.Object next2 : b2) {
                    if (next2 == null) {
                        java.lang.String str2 = "Element at index " + (diq2.size() - size4) + " is null.";
                        for (int size5 = diq2.size() - 1; size5 >= size4; size5--) {
                            diq2.remove(size5);
                        }
                        throw new java.lang.NullPointerException(str2);
                    }
                    diq2.add(next2);
                }
            }
        }
        if (dii.b) {
            dih = dii.a;
        } else {
            defpackage.dih dih2 = dii.a;
            defpackage.djz.a.a((java.lang.Object) dih2).c(dih2);
            dii.b = true;
            dih = dii.a;
        }
        defpackage.dih dih3 = dih;
        if (defpackage.dih.a(dih3, java.lang.Boolean.TRUE.booleanValue())) {
            return (defpackage.dfi) dih3;
        }
        throw new defpackage.dkw();
    }

    public final defpackage.ddo c() {
        defpackage.dih dih;
        defpackage.dih dih2;
        defpackage.dih dih3;
        defpackage.dii dii = (defpackage.dii) defpackage.ddd.f.a(defpackage.bg.ao);
        java.lang.String packageName = this.a.getApplicationContext().getPackageName();
        dii.b();
        defpackage.ddd ddd = (defpackage.ddd) dii.a;
        if (packageName == null) {
            throw new java.lang.NullPointerException();
        }
        ddd.a |= 4;
        ddd.d = packageName;
        try {
            java.lang.String a2 = this.c.a();
            dii.b();
            defpackage.ddd ddd2 = (defpackage.ddd) dii.a;
            if (a2 == null) {
                throw new java.lang.NullPointerException();
            }
            ddd2.a |= 1;
            ddd2.b = a2;
            long b2 = b(this.a);
            if (b2 != -1) {
                dii.b();
                defpackage.ddd ddd3 = (defpackage.ddd) dii.a;
                ddd3.a |= 2;
                ddd3.c = b2;
            }
            long a3 = a(this.a);
            if (a3 != -1) {
                dii.b();
                defpackage.ddd ddd4 = (defpackage.ddd) dii.a;
                ddd4.a |= 8;
                ddd4.e = a3;
            }
            defpackage.dii dii2 = (defpackage.dii) defpackage.ddo.d.a(defpackage.bg.ao);
            defpackage.dcl dcl = defpackage.dcl.GCM_DEVICE_PUSH;
            dii2.b();
            defpackage.ddo ddo = (defpackage.ddo) dii2.a;
            if (dcl == null) {
                throw new java.lang.NullPointerException();
            }
            ddo.a |= 1;
            ddo.b = dcl.c;
            defpackage.dii dii3 = (defpackage.dii) defpackage.ddb.d.a(defpackage.bg.ao);
            if (dii.b) {
                dih = dii.a;
            } else {
                defpackage.dih dih4 = dii.a;
                defpackage.djz.a.a((java.lang.Object) dih4).c(dih4);
                dii.b = true;
                dih = dii.a;
            }
            defpackage.dih dih5 = dih;
            if (!defpackage.dih.a(dih5, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            defpackage.ddd ddd5 = (defpackage.ddd) dih5;
            dii3.b();
            defpackage.ddb ddb = (defpackage.ddb) dii3.a;
            if (ddd5 == null) {
                throw new java.lang.NullPointerException();
            }
            ddb.c = ddd5;
            ddb.b = 2;
            if (dii3.b) {
                dih2 = dii3.a;
            } else {
                defpackage.dih dih6 = dii3.a;
                defpackage.djz.a.a((java.lang.Object) dih6).c(dih6);
                dii3.b = true;
                dih2 = dii3.a;
            }
            defpackage.dih dih7 = dih2;
            if (!defpackage.dih.a(dih7, java.lang.Boolean.TRUE.booleanValue())) {
                throw new defpackage.dkw();
            }
            defpackage.ddb ddb2 = (defpackage.ddb) dih7;
            dii2.b();
            defpackage.ddo ddo2 = (defpackage.ddo) dii2.a;
            if (ddb2 == null) {
                throw new java.lang.NullPointerException();
            }
            ddo2.c = ddb2;
            ddo2.a |= 2;
            if (dii2.b) {
                dih3 = dii2.a;
            } else {
                defpackage.dih dih8 = dii2.a;
                defpackage.djz.a.a((java.lang.Object) dih8).c(dih8);
                dii2.b = true;
                dih3 = dii2.a;
            }
            defpackage.dih dih9 = dih3;
            if (defpackage.dih.a(dih9, java.lang.Boolean.TRUE.booleanValue())) {
                return (defpackage.ddo) dih9;
            }
            throw new defpackage.dkw();
        } catch (defpackage.byl e) {
            defpackage.bty.b("TargetCreatorHelperImpl", e, "Failed to get registraiton ID.", new java.lang.Object[0]);
        }
    }

    private static long a(android.content.Context context) {
        if (defpackage.bwj.f()) {
            return ((android.os.UserManager) context.getSystemService("user")).getSerialNumberForUser(android.os.Process.myUserHandle());
        }
        return -1;
    }

    private static long b(android.content.Context context) {
        java.lang.Throwable e;
        long j;
        try {
            j = defpackage.bqb.a(context.getContentResolver(), "android_id");
            if (j == -1) {
                try {
                    defpackage.bty.e("TargetCreatorHelperImpl", "Failed to get android ID.", new java.lang.Object[0]);
                } catch (java.lang.SecurityException e2) {
                    e = e2;
                    defpackage.bty.b("TargetCreatorHelperImpl", e, "Exception reading GServices key.", new java.lang.Object[0]);
                    return j;
                }
            }
        } catch (java.lang.SecurityException e3) {
            java.lang.Throwable th = e3;
            j = -1;
            e = th;
            defpackage.bty.b("TargetCreatorHelperImpl", e, "Exception reading GServices key.", new java.lang.Object[0]);
            return j;
        }
        return j;
    }
}
