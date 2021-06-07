package defpackage;

import java.net.SocketAddress;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: dqv  reason: default package */
/* compiled from: PG */
public abstract class dqv extends dtj {
    private static final dob A = dob.a;
    private static final dnp B = dnp.a;
    public static final long a = TimeUnit.SECONDS.toMillis(1);
    private static final long x = TimeUnit.MINUTES.toMillis(30);
    private static final dxn y = dzn.a(dvc.l);
    private static final dpg z = dpi.b;
    public dxn b = y;
    public final List c = new ArrayList();
    public dpg d = z;
    public final String e;
    public String f;
    public dol g;
    public boolean h;
    public dob i = A;
    public dnp j = B;
    public long k = x;
    public int l = 5;
    public int m = 5;
    public long n = 16777216;
    public long o = 1048576;
    public boolean p = true;
    public dsp q = dsp.a;
    public dzu r = dzt.a;
    public drp s = drp.c;
    public boolean t = true;
    public boolean u = true;
    public boolean v = true;
    public boolean w = true;

    private static String a(SocketAddress socketAddress) {
        try {
            String valueOf = String.valueOf(socketAddress);
            return new URI("directaddress", "", new StringBuilder(String.valueOf(valueOf).length() + 1).append("/").append(valueOf).toString(), null).toString();
        } catch (URISyntaxException e2) {
            throw new RuntimeException(e2);
        }
    }

    public abstract dtc a();

    public dqv(SocketAddress socketAddress, String str) {
        this.e = a(socketAddress);
        this.d = new dqw(socketAddress, str);
    }

    public dmv b() {
        return dmv.b;
    }
}
