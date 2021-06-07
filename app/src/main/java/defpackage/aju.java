package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: aju  reason: default package */
/* compiled from: PG */
public final class aju implements ajy {
    public static String a;
    private static crv b;

    @Override // defpackage.ajy
    public final void a(Application application, Executor executor) {
        coq.a(application, new ajv(this, new coz(new aiu(new bqp(application, "TASKS", null, (byte) 0), executor))));
    }

    @Override // defpackage.ajy
    public final void a(String str) {
        a = str;
    }

    public static synchronized akm a() {
        akm akn;
        synchronized (aju.class) {
            if (b == null) {
                b = akj.a();
            }
            if (b.a()) {
                akn = (akm) b.b();
            } else {
                akn = new akn();
            }
        }
        return akn;
    }

    public static void b() {
        crv a2 = akq.a();
        if (a2.a()) {
            ((akr) a2.b()).a();
        }
    }

    public static void a(Collection collection) {
        if (akq.a().a()) {
            ArrayList b2 = cky.b(collection.size());
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                b2.add(((dby) it.next()).d);
            }
            c();
        }
    }

    public static void c() {
        crv a2 = akq.a();
        if (a2.a()) {
            ((akr) a2.b()).b();
        }
    }

    public static aoe a(Context context, Intent intent) {
        boolean z;
        List<String> pathSegments;
        String action = intent.getAction();
        if ("android.intent.action.SEARCH".equals(action)) {
            return new aot(intent);
        }
        if ("android.intent.action.VIEW".equals(action)) {
            Uri data = intent.getData();
            if (data == null || (pathSegments = data.getPathSegments()) == null || pathSegments.size() != 4 || !pathSegments.get(0).equals("task")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return new aos(intent);
            }
            return new aoq((byte) 0);
        } else if (!"android.intent.action.SEND".equals(action) || !"text/plain".equals(intent.getType())) {
            return new aoq((byte) 0);
        } else {
            return new aor(context, intent);
        }
    }
}
