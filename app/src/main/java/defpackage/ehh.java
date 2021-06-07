package defpackage;

import org.chromium.base.CommandLine;

/* renamed from: ehh  reason: default package */
/* compiled from: PG */
public final class ehh {
    public static final ehf a;

    static {
        ehf ehf;
        if (CommandLine.c().a()) {
            ehf = new ehg();
        } else {
            ehf = new ehf();
        }
        a = ehf;
    }
}
