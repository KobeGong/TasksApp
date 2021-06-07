package defpackage;

import java.io.IOException;

/* renamed from: dme  reason: default package */
/* compiled from: PG */
public final class dme extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    public dme(String str) {
        super(str);
    }

    static dme a() {
        return new dme("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static dme b() {
        return new dme("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static dme c() {
        return new dme("CodedInputStream encountered a malformed varint.");
    }
}
