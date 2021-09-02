package defpackage;

/* renamed from: dir reason: default package */
/* compiled from: PG */
public class dir extends java.io.IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    public dir(java.lang.String str) {
        super(str);
    }

    static defpackage.dir a() {
        return new defpackage.dir("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static defpackage.dir b() {
        return new defpackage.dir("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static defpackage.dir c() {
        return new defpackage.dir("CodedInputStream encountered a malformed varint.");
    }

    static defpackage.dir d() {
        return new defpackage.dir("Protocol message contained an invalid tag (zero).");
    }

    static defpackage.dir e() {
        return new defpackage.dir("Protocol message end-group tag did not match expected tag.");
    }

    static defpackage.dis f() {
        return new defpackage.dis("Protocol message tag had invalid wire type.");
    }

    static defpackage.dir g() {
        return new defpackage.dir("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static defpackage.dir h() {
        return new defpackage.dir("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static defpackage.dir i() {
        return new defpackage.dir("Failed to parse the message.");
    }

    static defpackage.dir j() {
        return new defpackage.dir("Protocol message had invalid UTF-8.");
    }
}
