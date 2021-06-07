package defpackage;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;

/* renamed from: ecc  reason: default package */
/* compiled from: PG */
public abstract class ecc {
    private static final Set a = Collections.unmodifiableSet(EnumSet.noneOf(ecd.class));
    public final ecf b;

    protected ecc(ecf ecf) {
        this.b = (ecf) cld.a(ecf, "context");
        byte b2 = ecf.b.b;
        cld.a(true, (Object) "Span is sampled, but does not have RECORD_EVENTS set.");
    }

    public abstract void a();

    @Deprecated
    public void a(ebz ebz) {
        eby eby;
        ebx ebt;
        cld.a(ebz);
        if (ebz instanceof ebx) {
            ebt = (ebx) ebz;
        } else {
            ebz ebz2 = ebz;
            if (ebz2.b() == ecb.RECV) {
                eby = eby.RECEIVED;
            } else {
                eby = eby.SENT;
            }
            long c = ebz2.c();
            ejx ejx = new ejx((byte) 0);
            eby eby2 = (eby) cld.a(eby, "type");
            if (eby2 == null) {
                throw new NullPointerException("Null type");
            }
            ejx.a = eby2;
            ejx.b = Long.valueOf(c);
            ejx b2 = ejx.a(0).b(0).a(ebz2.d()).b(ebz2.e());
            String str = "";
            if (b2.a == null) {
                str = String.valueOf(str).concat(" type");
            }
            if (b2.b == null) {
                str = String.valueOf(str).concat(" messageId");
            }
            if (b2.c == null) {
                str = String.valueOf(str).concat(" uncompressedMessageSize");
            }
            if (b2.d == null) {
                str = String.valueOf(str).concat(" compressedMessageSize");
            }
            if (!str.isEmpty()) {
                String valueOf = String.valueOf(str);
                throw new IllegalStateException(valueOf.length() != 0 ? "Missing required properties:".concat(valueOf) : new String("Missing required properties:"));
            }
            ebt = new ebt(b2.a, b2.b.longValue(), b2.c.longValue(), b2.d.longValue());
        }
        a(ebt);
    }

    public void a(ebx ebx) {
        ecb ecb;
        ebz a2;
        cld.a(ebx);
        if (ebx instanceof ebz) {
            a2 = (ebz) ebx;
        } else {
            ebx ebx2 = ebx;
            if (ebx2.a() == eby.RECEIVED) {
                ecb = ecb.RECV;
            } else {
                ecb = ecb.SENT;
            }
            a2 = ebz.a(ecb, ebx2.b()).a(ebx2.c()).b(ebx2.d()).a();
        }
        a(a2);
    }

    static {
        Collections.emptyMap();
    }
}
