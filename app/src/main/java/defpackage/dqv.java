package defpackage;

/* renamed from: dqv reason: default package */
/* compiled from: PG */
public abstract class dqv extends defpackage.dtj {
    private static final defpackage.dob A = defpackage.dob.a;
    private static final defpackage.dnp B = defpackage.dnp.a;
    public static final long a = java.util.concurrent.TimeUnit.SECONDS.toMillis(1);
    private static final long x = java.util.concurrent.TimeUnit.MINUTES.toMillis(30);
    private static final defpackage.dxn y = defpackage.dzn.a(defpackage.dvc.l);
    private static final defpackage.dpg z = defpackage.dpi.b;
    public defpackage.dxn b = y;
    public final java.util.List c = new java.util.ArrayList();
    public defpackage.dpg d = z;
    public final java.lang.String e;
    public java.lang.String f;
    public defpackage.dol g;
    public boolean h;
    public defpackage.dob i = A;
    public defpackage.dnp j = B;
    public long k = x;
    public int l = 5;
    public int m = 5;
    public long n = 16777216;
    public long o = 1048576;
    public boolean p = true;
    public defpackage.dsp q = defpackage.dsp.a;
    public defpackage.dzu r = defpackage.dzt.a;
    public defpackage.drp s = defpackage.drp.c;
    public boolean t = true;
    public boolean u = true;
    public boolean v = true;
    public boolean w = true;

    private static java.lang.String a(java.net.SocketAddress socketAddress) {
        try {
            java.lang.String valueOf = java.lang.String.valueOf(socketAddress);
            return new java.net.URI("directaddress", "", new java.lang.StringBuilder(java.lang.String.valueOf(valueOf).length() + 1).append("/").append(valueOf).toString(), null).toString();
        } catch (java.net.URISyntaxException e2) {
            throw new java.lang.RuntimeException(e2);
        }
    }

    public abstract defpackage.dtc a();

    public dqv(java.net.SocketAddress socketAddress, java.lang.String str) {
        this.e = a(socketAddress);
        this.d = new defpackage.dqw(socketAddress, str);
    }

    public defpackage.dmv b() {
        return defpackage.dmv.b;
    }
}
