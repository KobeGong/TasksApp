package defpackage;

import android.text.TextUtils;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.HashMap;
import javax.net.ssl.SSLException;

/* renamed from: ccx  reason: default package */
/* compiled from: PG */
public final class ccx {
    public bqg a;
    public buc b;

    ccx() {
    }

    public final ccr a(String str, String str2, djo djo, djo djo2) {
        String str3;
        boolean z;
        try {
            cld.a(str);
            cld.a(djo);
            cld.a(djo2);
            byte[] b2 = djo.b();
            String valueOf = String.valueOf(this.b.e().b);
            String valueOf2 = String.valueOf(str);
            if (valueOf2.length() != 0) {
                str3 = valueOf.concat(valueOf2);
            } else {
                str3 = new String(valueOf);
            }
            if (this.b.k()) {
                str3 = String.valueOf(str3).concat("?%24trace=true");
            }
            bxe a2 = bxd.e().a(str3);
            HashMap hashMap = new HashMap();
            if (!TextUtils.isEmpty(str2)) {
                String valueOf3 = String.valueOf(this.a.a(str2, "oauth2:https://www.googleapis.com/auth/notifications"));
                hashMap.put("Authorization", valueOf3.length() != 0 ? "Bearer ".concat(valueOf3) : new String("Bearer "));
            } else if (!TextUtils.isEmpty(this.b.j())) {
                hashMap.put("X-Goog-Api-Key", this.b.j());
            } else {
                throw new Exception("One of Account Name or API Key must be set.");
            }
            a2.c = hashMap;
            a2.a = b2;
            a2.b = "application/x-protobuf";
            bxf a3 = bxc.a(a2.a());
            if (a3.f()) {
                ccs e = ccr.e();
                e.b = a3.g();
                Throwable g = a3.g();
                if (g == null) {
                    z = true;
                } else if (g instanceof SocketException) {
                    z = true;
                } else if (g instanceof UnknownHostException) {
                    z = true;
                } else if (g instanceof SSLException) {
                    z = true;
                } else {
                    if (g instanceof bxh) {
                        switch (((bxh) g).a) {
                            case 401:
                                z = true;
                                break;
                        }
                    }
                    z = false;
                }
                return e.a(z).a();
            }
            ccs e2 = ccr.e();
            e2.a = (djo) djo2.d().a(a3.c());
            return e2.a();
        } catch (Exception e3) {
            ccs e4 = ccr.e();
            e4.b = e3;
            return e4.a(false).a();
        }
    }
}
