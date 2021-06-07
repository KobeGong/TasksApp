package defpackage;

/* renamed from: djl  reason: default package */
/* compiled from: PG */
final class djl {
    public static final djk a = a();
    public static final djk b = new djk();

    private static djk a() {
        try {
            return (djk) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception e) {
            return null;
        }
    }
}
