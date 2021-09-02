package defpackage;

/* renamed from: ccx reason: default package */
/* compiled from: PG */
public final class ccx {
    public defpackage.bqg a;
    public defpackage.buc b;

    ccx() {
    }

    public final defpackage.ccr a(java.lang.String str, java.lang.String str2, defpackage.djo djo, defpackage.djo djo2) {
        java.lang.String str3;
        boolean z;
        try {
            defpackage.cld.a((java.lang.Object) str);
            defpackage.cld.a((java.lang.Object) djo);
            defpackage.cld.a((java.lang.Object) djo2);
            byte[] b2 = djo.b();
            java.lang.String valueOf = java.lang.String.valueOf(this.b.e().b);
            java.lang.String valueOf2 = java.lang.String.valueOf(str);
            if (valueOf2.length() != 0) {
                str3 = valueOf.concat(valueOf2);
            } else {
                str3 = new java.lang.String(valueOf);
            }
            if (this.b.k()) {
                str3 = java.lang.String.valueOf(str3).concat("?%24trace=true");
            }
            defpackage.bxe a2 = defpackage.bxd.e().a(str3);
            java.util.HashMap hashMap = new java.util.HashMap();
            if (!android.text.TextUtils.isEmpty(str2)) {
                java.lang.String str4 = "Authorization";
                java.lang.String str5 = "Bearer ";
                java.lang.String valueOf3 = java.lang.String.valueOf(this.a.a(str2, "oauth2:https://www.googleapis.com/auth/notifications"));
                hashMap.put(str4, valueOf3.length() != 0 ? str5.concat(valueOf3) : new java.lang.String(str5));
            } else if (!android.text.TextUtils.isEmpty(this.b.j())) {
                hashMap.put("X-Goog-Api-Key", this.b.j());
            } else {
                throw new java.lang.Exception("One of Account Name or API Key must be set.");
            }
            a2.c = hashMap;
            a2.a = b2;
            a2.b = "application/x-protobuf";
            defpackage.bxf a3 = defpackage.bxc.a(a2.a());
            if (a3.f()) {
                defpackage.ccs e = defpackage.ccr.e();
                e.b = a3.g();
                java.lang.Throwable g = a3.g();
                if (g == null) {
                    z = true;
                } else if (g instanceof java.net.SocketException) {
                    z = true;
                } else if (g instanceof java.net.UnknownHostException) {
                    z = true;
                } else if (g instanceof javax.net.ssl.SSLException) {
                    z = true;
                } else {
                    if (g instanceof defpackage.bxh) {
                        switch (((defpackage.bxh) g).a) {
                            case 401:
                                z = true;
                                break;
                        }
                    }
                    z = false;
                }
                return e.a(z).a();
            }
            defpackage.djo djo3 = (defpackage.djo) djo2.d().a(a3.c());
            defpackage.ccs e2 = defpackage.ccr.e();
            e2.a = djo3;
            return e2.a();
        } catch (java.lang.Exception e3) {
            defpackage.ccs e4 = defpackage.ccr.e();
            e4.b = e3;
            return e4.a(false).a();
        }
    }
}
