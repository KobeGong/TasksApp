package defpackage;

/* renamed from: dig reason: default package */
/* compiled from: PG */
final class dig implements defpackage.djn {
    public static final defpackage.dig a = new defpackage.dig();

    private dig() {
    }

    public final boolean a(java.lang.Class cls) {
        return defpackage.dih.class.isAssignableFrom(cls);
    }

    public final defpackage.djm b(java.lang.Class cls) {
        if (!defpackage.dih.class.isAssignableFrom(cls)) {
            java.lang.String str = "Unsupported message type: ";
            java.lang.String valueOf = java.lang.String.valueOf(cls.getName());
            throw new java.lang.IllegalArgumentException(valueOf.length() != 0 ? str.concat(valueOf) : new java.lang.String(str));
        }
        try {
            return (defpackage.djm) defpackage.dih.a(cls.asSubclass(defpackage.dih.class)).a(defpackage.bg.am);
        } catch (java.lang.Exception e) {
            java.lang.Exception exc = e;
            java.lang.String str2 = "Unable to get message info for ";
            java.lang.String valueOf2 = java.lang.String.valueOf(cls.getName());
            throw new java.lang.RuntimeException(valueOf2.length() != 0 ? str2.concat(valueOf2) : new java.lang.String(str2), exc);
        }
    }
}
