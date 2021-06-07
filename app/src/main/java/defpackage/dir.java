package defpackage;

import java.io.IOException;

/* renamed from: dir  reason: default package */
/* compiled from: PG */
public class dir extends IOException {
    public static final long serialVersionUID = -1616151763072450476L;

    public dir(String str) {
        super(str);
    }

    static dir a() {
        return new dir("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    static dir b() {
        return new dir("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
    }

    static dir c() {
        return new dir("CodedInputStream encountered a malformed varint.");
    }

    static dir d() {
        return new dir("Protocol message contained an invalid tag (zero).");
    }

    static dir e() {
        return new dir("Protocol message end-group tag did not match expected tag.");
    }

    static dis f() {
        return new dis("Protocol message tag had invalid wire type.");
    }

    static dir g() {
        return new dir("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
    }

    static dir h() {
        return new dir("Protocol message was too large.  May be malicious.  Use CodedInputStream.setSizeLimit() to increase the size limit.");
    }

    static dir i() {
        return new dir("Failed to parse the message.");
    }

    static dir j() {
        return new dir("Protocol message had invalid UTF-8.");
    }
}
