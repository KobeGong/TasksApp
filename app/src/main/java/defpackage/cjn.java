package defpackage;

import android.app.Application;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: cjn  reason: default package */
/* compiled from: PG */
public final class cjn {
    public static cgk a(Application application, cjw cjw) {
        cli cli;
        cli a = new clk().a();
        Application application2 = (Application) cky.a((Object) application);
        cjo cjo = new cjo(application2);
        cjo.c = new cmr();
        cjo.b = new cgo();
        cjo.c = new cms(application2);
        cjo.f = (cjw) cky.a(cjw);
        cjo.g = (cli) cky.a(a);
        cky.a(cjo.b);
        Application application3 = (Application) cky.a((Object) cjo.a);
        cjw cjw2 = (cjw) cky.a(cjo.f);
        clt clt = (clt) cky.a(cjo.c);
        clt clt2 = cjo.d;
        cjp cjp = new cjp(cjo);
        if (cjo.g == null) {
            cli = new clk().a();
        } else {
            cli = cjo.g;
        }
        clt clt3 = cjo.e;
        cjq cjq = new cjq();
        cji.a();
        return new cgm(application3, cli, cjw2, clt, cjp, cjq);
    }

    static {
        new AtomicInteger();
    }
}
