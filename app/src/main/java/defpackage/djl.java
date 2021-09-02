package defpackage;

/* renamed from: djl reason: default package */
/* compiled from: PG */
final class djl {
    public static final defpackage.djk a = a();
    public static final defpackage.djk b = new defpackage.djk();

    private static defpackage.djk a() {
        try {
            return (defpackage.djk) java.lang.Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
        } catch (java.lang.Exception e) {
            return null;
        }
    }
}
