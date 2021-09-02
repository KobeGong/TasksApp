package defpackage;

/* renamed from: dme reason: default package */
/* compiled from: PG */
public final class dme extends java.io.IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    public dme(java.lang.String str) {
        super(str);
    }

    static defpackage.dme a() {
        return new defpackage.dme("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either than the input has been truncated or that an embedded message misreported its own length.");
    }

    static defpackage.dme b() {
        return new defpackage.dme("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    public static defpackage.dme c() {
        return new defpackage.dme("CodedInputStream encountered a malformed varint.");
    }
}
