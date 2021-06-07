package defpackage;

import android.content.Context;
import android.os.Looper;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: ayp  reason: default package */
/* compiled from: PG */
public abstract class ayp {
    public static final Set a = Collections.newSetFromMap(new WeakHashMap());

    public abstract void a(ayr ayr);

    public abstract void a(ays ays);

    public abstract void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr);

    public abstract void b(ayr ayr);

    public abstract void b(ays ays);

    public abstract void e();

    public abstract axq f();

    public abstract void g();

    public abstract void h();

    public abstract ayt i();

    public abstract boolean j();

    public abstract boolean k();

    public static Set a() {
        Set set;
        synchronized (a) {
            set = a;
        }
        return set;
    }

    public bca a(bca bca) {
        throw new UnsupportedOperationException();
    }

    public bca b(bca bca) {
        throw new UnsupportedOperationException();
    }

    public bba a(Object obj) {
        throw new UnsupportedOperationException();
    }

    public ayj a(ayh ayh) {
        throw new UnsupportedOperationException();
    }

    public Context b() {
        throw new UnsupportedOperationException();
    }

    public Looper c() {
        throw new UnsupportedOperationException();
    }

    public boolean a(bbh bbh) {
        throw new UnsupportedOperationException();
    }

    public void d() {
        throw new UnsupportedOperationException();
    }

    public void a(int i) {
        throw new UnsupportedOperationException();
    }
}
