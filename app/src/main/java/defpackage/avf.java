package defpackage;

/* renamed from: avf reason: default package */
/* compiled from: PG */
public class avf extends defpackage.ava {
    private final android.content.Intent a;

    public avf(java.lang.String str, android.content.Intent intent) {
        super(str);
        this.a = intent;
    }

    public final android.content.Intent a() {
        if (this.a == null) {
            return null;
        }
        return new android.content.Intent(this.a);
    }
}
