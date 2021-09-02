package defpackage;

/* renamed from: djv reason: default package */
/* compiled from: PG */
final class djv {
    public static final defpackage.dju a = a();
    public static final defpackage.dju b = new defpackage.dju();

    private static defpackage.dju a() {
        try {
            return (defpackage.dju) java.lang.Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            return null;
        }
    }
}
