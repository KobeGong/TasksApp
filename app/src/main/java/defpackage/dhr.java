package defpackage;

/* renamed from: dhr reason: default package */
/* compiled from: PG */
public final class dhr extends java.io.IOException {
    public static final long serialVersionUID = -6947486886997889499L;

    dhr() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    dhr(java.lang.String str) {
        java.lang.String valueOf = java.lang.String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
        java.lang.String valueOf2 = java.lang.String.valueOf(str);
        super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf));
    }

    dhr(java.lang.Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }

    dhr(java.lang.String str, java.lang.Throwable th) {
        java.lang.String valueOf = java.lang.String.valueOf("CodedOutputStream was writing to a flat byte array and ran out of space.: ");
        java.lang.String valueOf2 = java.lang.String.valueOf(str);
        super(valueOf2.length() != 0 ? valueOf.concat(valueOf2) : new java.lang.String(valueOf), th);
    }
}
