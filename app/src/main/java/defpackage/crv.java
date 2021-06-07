package defpackage;

import java.io.Serializable;

/* renamed from: crv  reason: default package */
/* compiled from: PG */
public abstract class crv implements Serializable {
    public static final long serialVersionUID = 0;

    public static crv b(Object obj) {
        return new cry(cld.a(obj));
    }

    public abstract Object a(Object obj);

    public abstract boolean a();

    public abstract Object b();

    public abstract Object c();

    public static crv c(Object obj) {
        if (obj == null) {
            return crk.a;
        }
        return new cry(obj);
    }

    crv() {
    }
}
