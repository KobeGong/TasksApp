package defpackage;

/* renamed from: dhz  reason: default package */
/* compiled from: PG */
final class dhz {
    public static final dhy a = new dhy((byte) 0);
    private static final dhy b = b();

    private static dhy b() {
        try {
            return (dhy) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }

    static dhy a() {
        if (b != null) {
            return b;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
