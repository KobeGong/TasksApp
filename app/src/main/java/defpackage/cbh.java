package defpackage;

/* renamed from: cbh reason: default package */
/* compiled from: PG */
public final class cbh implements defpackage.caf {
    cbh() {
    }

    public final void a(java.lang.String str, defpackage.djo djo) {
        defpackage.bty.a("UpdateThreadStateCallback", "Successfully updated thread state for account: %s.", str);
    }

    public final void a(java.lang.String str) {
        defpackage.bty.b("UpdateThreadStateCallback", "Failed to updated thread state for account: %s.", str);
    }
}
