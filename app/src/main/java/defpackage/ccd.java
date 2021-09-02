package defpackage;

/* renamed from: ccd reason: default package */
/* compiled from: PG */
public final class ccd {
    public defpackage.cbx a;
    public defpackage.buc b;
    public defpackage.cac c;
    public defpackage.bup d;
    public defpackage.bqg e;
    public defpackage.byd f;
    public defpackage.bzw g;

    ccd() {
    }

    public final defpackage.btl a(java.lang.String str) {
        boolean contains;
        boolean z;
        defpackage.cld.a(!android.text.TextUtils.isEmpty(str), (java.lang.Object) "Account name must not be empty.");
        if (!this.f.a()) {
            contains = true;
        } else {
            contains = this.f.b().contains(str);
        }
        if (!contains) {
            defpackage.bty.e("RegistrationHandler", "Registration failed. Account is not available on device, %s.", str);
            return defpackage.btl.a(new java.lang.Exception("Account intended to register is not available on device."));
        }
        try {
            defpackage.bul b2 = b(str);
            try {
                int hashCode = this.g.a().hashCode();
                if (b2.f() == defpackage.btk.REGISTERED || b2.f() == defpackage.btk.PENDING_REGISTRATION) {
                    int h = b2.h();
                    if (h == 0 || h != hashCode) {
                        defpackage.bty.a("RegistrationHandler", "New request hash [%d] differs with old request hash [%d].", java.lang.Integer.valueOf(h), java.lang.Integer.valueOf(hashCode));
                        z = true;
                    } else {
                        long currentTimeMillis = java.lang.System.currentTimeMillis();
                        long longValue = b2.g().longValue();
                        long max = java.lang.Math.max(0, this.b.h().longValue());
                        if (currentTimeMillis - longValue > max) {
                            defpackage.bty.a("RegistrationHandler", "Last registration was more than [%d] ms ago, considering this as new.", java.lang.Long.valueOf(max));
                            z = true;
                        } else {
                            defpackage.bty.a("RegistrationHandler", "Not treating this register request as new. The last registration was at [%d], which is less than [%d] ms ago (current time [%d]), also the request hash [%d] doesn't differ from the old one.", java.lang.Long.valueOf(longValue), java.lang.Long.valueOf(max), java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(hashCode));
                            z = false;
                        }
                    }
                } else {
                    z = true;
                }
                if (!z) {
                    defpackage.bty.a("RegistrationHandler", "Skip registration. Target already stored for account: %s.", str);
                    return defpackage.btl.a;
                }
                defpackage.cbx cbx = this.a;
                synchronized (cbx.a) {
                    try {
                        cbx.a.b(cbx.a.a(str).i().a(hashCode).a());
                    } catch (defpackage.buo e2) {
                    }
                }
                this.a.a(str, defpackage.btk.PENDING_REGISTRATION);
                defpackage.bty.a("RegistrationHandler", "Registration scheduled for account: %s.", str);
                return this.c.a(b2, "StoreTargetCallback");
            } catch (defpackage.byl e3) {
            }
        } catch (defpackage.bun e4) {
            defpackage.bty.e("RegistrationHandler", "Registration failed. Error inserting account, %s.", str);
            return defpackage.btl.b(e4);
        }
    }

    private final defpackage.bul b(java.lang.String str) {
        defpackage.bul a2;
        try {
            a2 = this.d.a(str);
        } catch (defpackage.buo e2) {
            defpackage.bul a3 = defpackage.bul.j().a(str).a();
            long a4 = this.d.a(a3);
            defpackage.bum i = a3.i();
            i.a = java.lang.Long.valueOf(a4);
            a2 = i.a();
        }
        if (android.text.TextUtils.isEmpty(a2.c())) {
            try {
                defpackage.cbx cbx = this.a;
                java.lang.String a5 = this.e.a(str);
                synchronized (cbx.a) {
                    try {
                        defpackage.bum i2 = cbx.a.a(str).i();
                        i2.b = a5;
                        cbx.a.b(i2.a());
                    } catch (defpackage.buo e3) {
                    }
                }
            } catch (java.lang.Exception e4) {
                defpackage.bty.b("RegistrationHandler", e4, "Failed to get the obfuscated account ID for: %s", str);
            }
        }
        return a2;
    }
}
