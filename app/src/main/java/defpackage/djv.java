package defpackage;

/* renamed from: djv  reason: default package */
/* compiled from: PG */
final class djv {
    public static final dju a = a();
    public static final dju b = new dju();

    private static dju a() {
        try {
            return (dju) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
