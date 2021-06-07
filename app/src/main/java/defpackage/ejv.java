package defpackage;

import android.content.Context;
import java.util.LinkedList;
import java.util.List;
import java.util.regex.Pattern;

/* renamed from: ejv  reason: default package */
/* compiled from: PG */
public abstract class ejv extends eie {
    public final Context a;
    public final List b = new LinkedList();
    public final List c = new LinkedList();
    public boolean d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public int j;
    public long k;
    public boolean l;
    private int m = 20;

    public ejv(Context context) {
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

    public ehw b() {
        return null;
    }

    public final int a(int i2) {
        return this.m == 20 ? i2 : this.m;
    }

    static {
        Pattern.compile("^[0-9\\.]*$");
    }
}
