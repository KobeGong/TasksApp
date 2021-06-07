package defpackage;

import java.io.Closeable;
import java.util.Collections;
import java.util.List;
import java.util.logging.Logger;

/* renamed from: drp  reason: default package */
/* compiled from: PG */
public abstract class drp implements Closeable {
    public static final dnb a = dnb.a("binarylog-calloptions-key");
    public static final dpd b = new drs();
    public static final drp c;
    public static final dnf e = new drq();
    public final dnf d = new drr(this);

    public abstract dnf a();

    /* access modifiers changed from: protected */
    public abstract int b();

    /* access modifiers changed from: protected */
    public abstract boolean c();

    static {
        Object obj;
        dns.a("binarylog-context-key");
        Logger.getLogger(drp.class.getName());
        List a2 = dtj.a(drp.class, Collections.emptyList(), drp.class.getClassLoader(), new dvh());
        if (a2.isEmpty()) {
            obj = null;
        } else {
            obj = a2.get(0);
        }
        c = (drp) obj;
        new dqc((char) 0);
        new dpt((byte) 0);
    }
}
