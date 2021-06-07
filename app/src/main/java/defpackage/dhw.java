package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: dhw  reason: default package */
/* compiled from: PG */
public class dhw {
    public static final dhw a = new dhw((byte) 0);
    private static volatile boolean b = false;
    private static volatile dhw c;
    private final Map d;

    private static Class d() {
        try {
            return Class.forName("com.google.protobuf.Extension");
        } catch (ClassNotFoundException e) {
            return null;
        }
    }

    public static dhw a() {
        return dhv.a();
    }

    public static dhw b() {
        dhw dhw = c;
        if (dhw == null) {
            synchronized (dhw.class) {
                dhw = c;
                if (dhw == null) {
                    dhw = dhv.b();
                    c = dhw;
                }
            }
        }
        return dhw;
    }

    static dhw c() {
        return dif.a(dhw.class);
    }

    public dik a(djo djo, int i) {
        return (dik) this.d.get(new dhx(djo, i));
    }

    dhw() {
        this.d = new HashMap();
    }

    dhw(byte b2) {
        this.d = Collections.emptyMap();
    }

    static {
        d();
    }
}
