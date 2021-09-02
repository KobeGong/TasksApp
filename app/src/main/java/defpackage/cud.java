package defpackage;

/* renamed from: cud reason: default package */
/* compiled from: PG */
public enum cud {
    SMALL(10),
    MEDIUM(20),
    LARGE(50),
    FULL(-1);
    
    public final int a;

    private cud(int i) {
        this.a = i;
    }
}
