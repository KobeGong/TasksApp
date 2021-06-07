package defpackage;

import android.text.TextUtils;

/* renamed from: ccd  reason: default package */
/* compiled from: PG */
public final class ccd {
    public cbx a;
    public buc b;
    public cac c;
    public bup d;
    public bqg e;
    public byd f;
    public bzw g;

    ccd() {
    }

    public final btl a(String str) {
        boolean contains;
        boolean z;
        cld.a(!TextUtils.isEmpty(str), "Account name must not be empty.");
        if (!this.f.a()) {
            contains = true;
        } else {
            contains = this.f.b().contains(str);
        }
        if (!contains) {
            bty.e("RegistrationHandler", "Registration failed. Account is not available on device, %s.", str);
            return btl.a(new Exception("Account intended to register is not available on device."));
        }
        try {
            bul b2 = b(str);
            try {
                int hashCode = this.g.a().hashCode();
                if (b2.f() == btk.REGISTERED || b2.f() == btk.PENDING_REGISTRATION) {
                    int h = b2.h();
                    if (h == 0 || h != hashCode) {
                        bty.a("RegistrationHandler", "New request hash [%d] differs with old request hash [%d].", Integer.valueOf(h), Integer.valueOf(hashCode));
                        z = true;
                    } else {
                        long currentTimeMillis = System.currentTimeMillis();
                        long longValue = b2.g().longValue();
                        long max = Math.max(0L, this.b.h().longValue());
                        if (currentTimeMillis - longValue > max) {
                            bty.a("RegistrationHandler", "Last registration was more than [%d] ms ago, considering this as new.", Long.valueOf(max));
                            z = true;
                        } else {
                            bty.a("RegistrationHandler", "Not treating this register request as new. The last registration was at [%d], which is less than [%d] ms ago (current time [%d]), also the request hash [%d] doesn't differ from the old one.", Long.valueOf(longValue), Long.valueOf(max), Long.valueOf(currentTimeMillis), Integer.valueOf(hashCode));
                            z = false;
                        }
                    }
                } else {
                    z = true;
                }
                if (!z) {
                    bty.a("RegistrationHandler", "Skip registration. Target already stored for account: %s.", str);
                    return btl.a;
                }
                cbx cbx = this.a;
                synchronized (cbx.a) {
                    try {
                        cbx.a.b(cbx.a.a(str).i().a(hashCode).a());
                    } catch (buo e2) {
                    }
                }
                this.a.a(str, btk.PENDING_REGISTRATION);
                bty.a("RegistrationHandler", "Registration scheduled for account: %s.", str);
                return this.c.a(b2, "StoreTargetCallback");
            } catch (byl e3) {
            }
        } catch (bun e4) {
            bty.e("RegistrationHandler", "Registration failed. Error inserting account, %s.", str);
            return btl.b(e4);
        }
    }

    private final bul b(String str) {
        bul a2;
        try {
            a2 = this.d.a(str);
        } catch (buo e2) {
            bul a3 = bul.j().a(str).a();
            long a4 = this.d.a(a3);
            bum i = a3.i();
            i.a = Long.valueOf(a4);
            a2 = i.a();
        }
        if (TextUtils.isEmpty(a2.c())) {
            try {
                cbx cbx = this.a;
                String a5 = this.e.a(str);
                synchronized (cbx.a) {
                    try {
                        bum i2 = cbx.a.a(str).i();
                        i2.b = a5;
                        cbx.a.b(i2.a());
                    } catch (buo e3) {
                    }
                }
            } catch (Exception e4) {
                bty.b("RegistrationHandler", e4, "Failed to get the obfuscated account ID for: %s", str);
            }
        }
        return a2;
    }
}
