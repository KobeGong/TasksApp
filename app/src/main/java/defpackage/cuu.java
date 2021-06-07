package defpackage;

/* access modifiers changed from: package-private */
/* renamed from: cuu  reason: default package */
/* compiled from: PG */
public final class cuu {
    public static final cut a = a(cut.d);

    private static cut a(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        cut cut = null;
        try {
            cut = cub.a();
        } catch (NoClassDefFoundError e) {
        }
        if (cut == null) {
            for (String str : strArr) {
                try {
                    cut = (cut) Class.forName(str).getConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable th) {
                    sb.append('\n').append(str).append(": ").append(th);
                }
            }
            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
        }
        return cut;
    }
}
