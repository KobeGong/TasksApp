package defpackage;

/* renamed from: ejv reason: default package */
/* compiled from: PG */
public abstract class ejv extends defpackage.eie {
    public final android.content.Context a;
    public final java.util.List b = new java.util.LinkedList();
    public final java.util.List c = new java.util.LinkedList();
    public boolean d;
    public java.lang.String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public long k;
    public boolean l;
    private int m = 20;

    public ejv(android.content.Context context) {
        this.a = context.getApplicationContext();
        this.f = false;
        this.g = true;
        this.h = false;
        this.i = true;
        this.k = 0;
        this.j = 0;
        this.l = false;
        this.d = true;
    }

    public defpackage.ehw b() {
        return null;
    }

    public final int a(int i2) {
        return this.m == 20 ? i2 : this.m;
    }

    static {
        java.util.regex.Pattern.compile("^[0-9\\.]*$");
    }
}
