package defpackage;

import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: ckz  reason: default package */
/* compiled from: PG */
public final class ckz extends ejc {
    public ckz(Executor executor) {
        super(executor);
    }

    @Override // defpackage.ejc
    public final void a(ejb ejb) {
        int i;
        Map c;
        List list;
        int i2 = 2;
        if (!cjg.a().b()) {
            cdm.a(5, "PrimesCronetListener", "onRequestFinished is skipped as primes preconditions failed.", new Object[0]);
        } else if (ejb == null) {
            cdm.a(5, "PrimesCronetListener", "Un-expected null UrlRequestInfo from cronet's RequestFinishedListener,  skipping current NetworkEvent", new Object[0]);
        } else {
            ejd ejd = ejb.b;
            if (ejd == null) {
                cdm.a(5, "PrimesCronetListener", "un-expected null metrics from cronet's RequestFinishedListener, skipping current request", new Object[0]);
                return;
            }
            if (ejb.a() != null) {
                for (Object obj : ejb.a()) {
                    if (obj instanceof ckc) {
                        cdm.a(5, "PrimesCronetListener", "onRequestFinished is skipped due to PrimesCronetMonitorIgnoreAnnotation", new Object[0]);
                        return;
                    }
                }
            }
            cir cir = new cir(ejb.a);
            if (!(ejb.d == null || (c = ejb.d.c()) == null || (list = (List) c.get("Content-Type")) == null || list.isEmpty())) {
                cir.i = (String) list.get(0);
            }
            if (ejd.d != null) {
                cir.d = ejd.d.intValue();
            }
            if (ejd.c != null) {
                cir.e = ejd.c.intValue();
            }
            if (ejd.a != null) {
                cir.b = ejd.a.longValue();
            }
            if (ejd.b != null) {
                cir.c = ejd.b.longValue();
            }
            ejg ejg = ejb.d;
            if (ejg != null) {
                int a = ejg.a();
                if (a >= 0) {
                    cir.h = a;
                }
                String d = ejg.d();
                if (d != null && !d.isEmpty()) {
                    cir.g = d;
                }
            }
            switch (ejb.c) {
                case 0:
                    i = 1;
                    break;
                case 1:
                    i = 2;
                    break;
                case 2:
                    i = 3;
                    break;
                default:
                    i = 0;
                    break;
            }
            cir.n = i;
            if (ejb.e != null) {
                if (ejb.e instanceof eis) {
                    switch (((eis) ejb.e).a()) {
                        case 1:
                            break;
                        case 2:
                            i2 = 3;
                            break;
                        case 3:
                            i2 = 4;
                            break;
                        case 4:
                            i2 = 5;
                            break;
                        case 5:
                            i2 = 6;
                            break;
                        case 6:
                            i2 = 7;
                            break;
                        case 7:
                            i2 = 8;
                            break;
                        case 8:
                            i2 = 9;
                            break;
                        case 9:
                            i2 = 10;
                            break;
                        case 10:
                            i2 = 11;
                            break;
                        case 11:
                            i2 = 12;
                            break;
                        default:
                            i2 = 0;
                            break;
                    }
                    cir.l = i2;
                } else if (ejb.e instanceof ehs) {
                    cir.l = 1;
                } else {
                    cir.l = 0;
                }
                if (ejb.e instanceof eiy) {
                    cir.m = ((eiy) ejb.e).b();
                }
            }
            cjg.a().a.a(cir);
        }
    }
}
