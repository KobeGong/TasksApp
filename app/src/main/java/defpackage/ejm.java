package defpackage;

import android.annotation.SuppressLint;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.Executor;

/* renamed from: ejm  reason: default package */
/* compiled from: PG */
public final class ejm extends ehq {
    private final ehy a;
    private final String b;
    private final ehr c;
    private final Executor d;
    private final ArrayList e = new ArrayList();
    private String f = "POST";
    private int g = 3;
    private boolean h;
    private Collection i;
    private boolean j;
    private int k;
    private boolean l;
    private int m;

    public ejm(String str, ehr ehr, Executor executor, ehy ehy) {
        super((byte) 0);
        if (str == null) {
            throw new NullPointerException("URL is required.");
        } else if (ehr == null) {
            throw new NullPointerException("Callback is required.");
        } else if (executor == null) {
            throw new NullPointerException("Executor is required.");
        } else if (ehy == null) {
            throw new NullPointerException("CronetEngine is required.");
        } else {
            this.b = str;
            this.c = ehr;
            this.d = executor;
            this.a = ehy;
        }
    }

    @Override // defpackage.ehq
    public final ehq a(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Invalid metrics annotation.");
        }
        if (this.i == null) {
            this.i = new ArrayList();
        }
        this.i.add(obj);
        return this;
    }

    @Override // defpackage.ehq
    @SuppressLint({"WrongConstant"})
    public final ehp d() {
        return this.a.a(this.b, this.c, this.d, this.f, this.e, this.g, this.h, this.i, this.j, this.k, this.l, this.m);
    }

    @Override // defpackage.ehq
    public final /* synthetic */ ehq c() {
        this.h = true;
        return this;
    }

    @Override // defpackage.ehq
    public final /* synthetic */ ehq b(String str, String str2) {
        return (ejm) a(str, str2);
    }

    @Override // defpackage.ehq
    public final /* synthetic */ ehq b(String str) {
        return (ejm) a(str);
    }

    @Override // defpackage.ehq
    @SuppressLint({"WrongConstant"})
    public final /* synthetic */ ehp b() {
        return b();
    }

    @Override // defpackage.ehq
    public final /* synthetic */ ehq a() {
        return (ejm) a();
    }

    @Override // defpackage.ehq
    public final /* synthetic */ ehq a(String str, String str2) {
        if (str == null) {
            throw new NullPointerException("Invalid header name.");
        } else if (str2 == null) {
            throw new NullPointerException("Invalid header value.");
        } else {
            this.e.add(new AbstractMap.SimpleImmutableEntry(str, str2));
            return this;
        }
    }

    @Override // defpackage.ehq
    public final /* synthetic */ ehq a(String str) {
        if (str == null) {
            throw new NullPointerException("Method is required.");
        }
        this.f = str;
        return this;
    }
}
