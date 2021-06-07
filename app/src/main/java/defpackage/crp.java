package defpackage;

import java.nio.charset.Charset;

/* renamed from: crp  reason: default package */
/* compiled from: PG */
public final class crp {
    public static final Charset a = Charset.forName("US-ASCII");
    public static final Charset b = Charset.forName("UTF-8");

    static {
        Charset.forName("ISO-8859-1");
        Charset.forName("UTF-16BE");
        Charset.forName("UTF-16LE");
        Charset.forName("UTF-16");
    }
}
