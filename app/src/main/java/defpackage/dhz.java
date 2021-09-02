package defpackage;

/* renamed from: dhz reason: default package */
/* compiled from: PG */
final class dhz {
    public static final defpackage.dhy a = new defpackage.dhy(0);
    private static final defpackage.dhy b = b();

    private static defpackage.dhy b() {
        try {
            return (defpackage.dhy) java.lang.Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            return null;
        }
    }

    static defpackage.dhy a() {
        if (b != null) {
            return b;
        }
        throw new java.lang.IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
