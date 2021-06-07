package defpackage;

/* renamed from: dig  reason: default package */
/* compiled from: PG */
final class dig implements djn {
    public static final dig a = new dig();

    private dig() {
    }

    @Override // defpackage.djn
    public final boolean a(Class cls) {
        return dih.class.isAssignableFrom(cls);
    }

    @Override // defpackage.djn
    public final djm b(Class cls) {
        if (!dih.class.isAssignableFrom(cls)) {
            String valueOf = String.valueOf(cls.getName());
            throw new IllegalArgumentException(valueOf.length() != 0 ? "Unsupported message type: ".concat(valueOf) : new String("Unsupported message type: "));
        }
        try {
            return (djm) dih.a(cls.asSubclass(dih.class)).a(bg.am);
        } catch (Exception e) {
            String valueOf2 = String.valueOf(cls.getName());
            throw new RuntimeException(valueOf2.length() != 0 ? "Unable to get message info for ".concat(valueOf2) : new String("Unable to get message info for "), e);
        }
    }
}
