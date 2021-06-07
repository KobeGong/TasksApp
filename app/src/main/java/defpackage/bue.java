package defpackage;

/* renamed from: bue  reason: default package */
/* compiled from: PG */
public enum bue {
    PRODUCTION("https://notifications-pa.googleapis.com:443"),
    AUTOPUSH("https://autopush-notifications-pa.sandbox.googleapis.com:443");
    
    public final String b;

    private bue(String str) {
        this.b = str;
    }
}
